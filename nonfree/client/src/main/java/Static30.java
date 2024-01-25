import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_9 = new Class179(45, 3);

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "[I")
	public static final int[] anIntArray66 = new int[1];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method551() {
		Static437.anInt7040 = Static228.aClass256_7.anInt6420 + Static228.aClass256_7.anInt6414 + 2;
		Static318.anInt5061 = Static389.aClass256_13.anInt6420 + Static389.aClass256_13.anInt6414 + 2;
		Static397.aStringArray34 = new String[500];
		for (@Pc(34) int local34 = 0; local34 < Static397.aStringArray34.length; local34++) {
			Static397.aStringArray34[local34] = "";
		}
		Static338.method4547(Static434.aClass271_1.method5972(Static483.anInt7694));
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(21) int local21 = arg0 + arg1;
		while (local21 > local12) {
			@Pc(30) int local30 = arg2[local12++] & 0xFF;
			@Pc(40) int local40;
			if (local30 >= 128) {
				if (local30 < 192) {
					local40 = 65533;
				} else if (local30 < 224) {
					if (local12 < local21 && (arg2[local12] & 0xC0) == 128) {
						local40 = (local30 & 0x1F) << 6 | arg2[local12++] & 0x3F;
						if (local40 < 128) {
							local40 = 65533;
						}
					} else {
						local40 = 65533;
					}
				} else if (local30 >= 240) {
					if (local30 >= 248) {
						local40 = 65533;
					} else if (local21 > local12 + 2 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128 && (arg2[local12 + 2] & 0xC0) == 128) {
						local40 = (arg2[local12++] & 0x3F) << 12 | (local30 & 0x7) << 18 | (arg2[local12++] & 0x3F) << 6 | arg2[local12++] & 0x3F;
						if (local40 >= 65536 && local40 <= 1114111) {
							local40 = 65533;
						} else {
							local40 = 65533;
						}
					} else {
						local40 = 65533;
					}
				} else if (local21 > local12 + 1 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128) {
					local40 = (arg2[local12++] & 0x3F) << 6 | (local30 & 0xF) << 12 | arg2[local12++] & 0x3F;
					if (local40 < 2048) {
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
