import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "[[[Lclient!ve;")
	public static Class351[][][] aClass351ArrayArrayArray3;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!da;")
	public static Class63 aClass63_13;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!oia;")
	public static Class251 aClass251_4;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
	public static int anInt8405 = 1;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Z")
	public static boolean aBoolean610 = false;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
	public static int anInt8406 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
	public static boolean method7243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static253.aBoolean362) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static319.aClass344ArrayArray2[local13] == null || Static319.aClass344ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class344 local35 = Static319.aClass344ArrayArray2[local13][local17];
		@Pc(49) Class3_Sub7_Sub19 local49;
		if (arg1 == -1 && local35.anInt9554 == 0) {
			for (local49 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5457(); local49 != null; local49 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5458()) {
				if (local49.anInt8564 == 5 || local49.anInt8564 == 1002 || local49.anInt8564 == 21 || local49.anInt8564 == 44 || local49.anInt8564 == 2) {
					for (@Pc(141) Class344 local141 = Static324.method5363(local49.anInt8563); local141 != null; local141 = Static565.method6923(local141)) {
						if (local35.anInt9571 == local141.anInt9571) {
							return true;
						}
					}
				}
			}
		} else {
			for (local49 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5457(); local49 != null; local49 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5458()) {
				if (arg1 == local49.anInt8565 && local35.anInt9571 == local49.anInt8563 && (local49.anInt8564 == 5 || local49.anInt8564 == 1002 || local49.anInt8564 == 21 || local49.anInt8564 == 44 || local49.anInt8564 == 2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public static void method7244() {
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub13_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub13_2);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub8_1);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub8_2);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub29_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub1_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub18_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub16_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub10_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub28_1);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub2_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub6_1);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub27_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub7_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_2);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub3_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub11_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub25_1);
		Static578.method8094();
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub20_1);
		Static32.aClass3_Sub41_3.method6773(4, Static32.aClass3_Sub41_3.aClass7_Sub14_1);
		Static408.method6354();
		Static183.method2986();
		Static264.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public static void method7247() {
		Static525.method7636();
		Static253.aBoolean362 = false;
		Static283.method4602(Static355.anInt10008, Static388.anInt6963, Static415.anInt7312, Static491.anInt8355);
	}
}
