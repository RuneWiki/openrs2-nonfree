import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[S")
	public static final short[] aShortArray116 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "[S")
	private static final short[] aShortArray117 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "[S")
	public static final short[] aShortArray118 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!ub", name = "jb", descriptor = "[S")
	public static short[] aShortArray119 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!ub", name = "ob", descriptor = "Z")
	public static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!ub", name = "pb", descriptor = "[[S")
	public static final short[][] aShortArrayArray18 = new short[][] { aShortArray117, aShortArray118, aShortArray119, aShortArray116 };

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "(I)[Lclient!go;")
	public static Class121[] method7234() {
		return new Class121[] { Static226.aClass121_5, Static259.aClass121_7, Static303.aClass121_8, Static136.aClass121_3, Static455.aClass121_13, Static253.aClass121_6, Static312.aClass121_9, Static134.aClass121_2, Static324.aClass121_11, Static388.aClass121_12, Static314.aClass121_10, Static75.aClass121_1, Static537.aClass121_14, Static199.aClass121_4 };
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method7235(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg0 + arg1;
		while (local17 < local21) {
			@Pc(30) int local30 = arg2[local17++] & 0xFF;
			@Pc(40) int local40;
			if (local30 >= 128) {
				if (local30 < 192) {
					local40 = 65533;
				} else if (local30 >= 224) {
					if (local30 < 240) {
						if (local17 + 1 < local21 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128) {
							local40 = (arg2[local17++] & 0x3F) << 6 | (local30 & 0xF) << 12 | arg2[local17++] & 0x3F;
							if (local40 < 2048) {
								local40 = 65533;
							}
						} else {
							local40 = 65533;
						}
					} else if (local30 >= 248) {
						local40 = 65533;
					} else if (local21 > local17 + 2 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128 && (arg2[local17 + 2] & 0xC0) == 128) {
						local40 = (local30 & 0x7) << 18 | (arg2[local17++] & 0x3F) << 12 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
						if (local40 >= 65536 && local40 <= 1114111) {
							local40 = 65533;
						} else {
							local40 = 65533;
						}
					} else {
						local40 = 65533;
					}
				} else if (local21 > local17 && (arg2[local17] & 0xC0) == 128) {
					local40 = (local30 & 0x1F) << 6 | arg2[local17++] & 0x3F;
					if (local40 < 128) {
						local40 = 65533;
					}
				} else {
					local40 = 65533;
				}
			} else if (local30 == 0) {
				local40 = 65533;
			} else {
				local40 = local30;
			}
			local8[local10++] = (char) local40;
		}
		return new String(local8, 0, local10);
	}
}
