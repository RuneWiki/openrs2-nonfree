import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "Lclient!fc;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
	public static int anInt486;

	@OriginalMember(owner = "client!c", name = "R", descriptor = "Lclient!cd;")
	public static Class10 aClass10_220 = Static51.method932("::fpsoff");

	@OriginalMember(owner = "client!c", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_221 = Static51.method932("<img=1>");

	@OriginalMember(owner = "client!c", name = "T", descriptor = "Lclient!sa;")
	public static Class72 aClass72_2 = new Class72(100);

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	public static void method317() {
		@Pc(3) Class84 local3 = Static156.aClass84_1;
		synchronized (Static156.aClass84_1) {
			Static60.anInt1492 = Static66.anInt1601;
			@Pc(18) int local18;
			if (Static63.anInt1566 >= 0) {
				while (Static63.anInt1566 != Static100.anInt2340) {
					local18 = Static115.anIntArray274[Static100.anInt2340];
					Static100.anInt2340 = Static100.anInt2340 + 1 & 0x7F;
					if (local18 < 0) {
						Static99.aBooleanArray9[~local18] = false;
					} else {
						Static99.aBooleanArray9[local18] = true;
					}
				}
			} else {
				for (local18 = 0; local18 < 112; local18++) {
					Static99.aBooleanArray9[local18] = false;
				}
				Static63.anInt1566 = Static100.anInt2340;
			}
			Static66.anInt1601 = Static91.anInt2154;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!kh;I)Lclient!bd;")
	public static Class2_Sub3 method318(@OriginalArg(1) Class29 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1032(arg1);
		return local13 == null ? null : new Class2_Sub3(local13);
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	public static void method319() {
		aClass10_221 = null;
		aClass72_2 = null;
		aClass10_220 = null;
		anIntArrayArray5 = null;
		aClass24_1 = null;
	}
}
