import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt914 = -1;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
	public static int[] anIntArray77 = new int[32];

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public static int anInt922 = -1;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!hh;")
	public static Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt925 = -1;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt926 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)V")
	public static void method585() {
		@Pc(7) byte[][] local7 = Static240.aByteArrayArray11;
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static98.method2086();
			for (@Pc(22) int local22 = 0; local22 < 13; local22++) {
				for (@Pc(26) int local26 = 0; local26 < 13; local26++) {
					@Pc(36) int local36 = Static127.anIntArrayArrayArray8[local16][local22][local26];
					if (local36 != -1) {
						@Pc(45) int local45 = local36 >> 24 & 0x3;
						@Pc(58) int local58 = local36 >> 1 & 0x3;
						@Pc(64) int local64 = local36 >> 14 & 0x3FF;
						@Pc(70) int local70 = local36 >> 3 & 0x7FF;
						@Pc(81) int local81 = (local64 / 8 << 8) + (local70 / 8);
						for (@Pc(83) int local83 = 0; local83 < Static169.anIntArray298.length; local83++) {
							if (local81 == Static169.anIntArray298[local83] && local7[local83] != null) {
								Static137.method2501(local58, local16, Static47.aClass65Array1, (local70 & 0x7) * 8, local26 * 8, local7[local83], local45, local22 * 8, (local64 & 0x7) * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)V")
	public static void method587(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static144.method2614(arg0 - 1L);
			Static144.method2614(1L);
		} else {
			Static144.method2614(arg0);
		}
	}
}
