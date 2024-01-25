import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "Lclient!la;")
	public static Class196 aClass196_121;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
	public static int anInt9562 = 0;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "Z")
	public static boolean aBoolean687 = false;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
	public static int anInt9564 = 0;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_138 = new Class200(46, 0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)I")
	public static int method8236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[BIZ)Ljava/lang/String;")
	public static String method8237(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg0 + arg2;
		while (local21 > local17) {
			@Pc(30) int local30 = arg1[local17++] & 0xFF;
			@Pc(120) int local120;
			if (local30 >= 128) {
				if (local30 < 192) {
					local120 = 65533;
				} else if (local30 >= 224) {
					if (local30 >= 240) {
						if (local30 >= 248) {
							local120 = 65533;
						} else if (local17 + 2 < local21 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128 && (arg1[local17 + 2] & 0xC0) == 128) {
							local120 = (arg1[local17++] & 0x3F) << 12 | local30 << 18 & 0x1C0000 | (arg1[local17++] & 0x3F) << 6 | arg1[local17++] & 0x3F;
							if (local120 >= 65536 && local120 <= 1114111) {
								local120 = 65533;
							} else {
								local120 = 65533;
							}
						} else {
							local120 = 65533;
						}
					} else if (local21 > local17 + 1 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128) {
						local120 = (local30 & 0xF) << 12 | (arg1[local17++] & 0x3F) << 6 | arg1[local17++] & 0x3F;
						if (local120 < 2048) {
							local120 = 65533;
						}
					} else {
						local120 = 65533;
					}
				} else if (local21 > local17 && (arg1[local17] & 0xC0) == 128) {
					local120 = arg1[local17++] & 0x3F | (local30 & 0x1F) << 6;
					if (local120 < 128) {
						local120 = 65533;
					}
				} else {
					local120 = 65533;
				}
			} else if (local30 == 0) {
				local120 = 65533;
			} else {
				local120 = local30;
			}
			local13[local15++] = (char) local120;
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(III)Lclient!aca;")
	public static Class4_Sub1_Sub1 method8239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class4_Sub1_Sub1 local14 = local7.aClass4_Sub1_Sub1_1;
			local7.aClass4_Sub1_Sub1_1 = null;
			Static475.method7133(local14);
			return local14;
		}
	}
}
