import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
	public static int anInt7400;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method5749() {
		@Pc(10) Class3_Sub23 local10 = (Class3_Sub23) Static79.aClass243_34.method5208();
		@Pc(18) boolean local18 = Static238.aClass156_9 != null || Static31.anInt6062 > 0;
		if (local18) {
			Static292.anInt5273 = 1;
		}
		if (Static348.aBoolean510 && Static263.aClass10_1.method301(81) && Static158.anInt3162 > 2) {
			if (local18) {
				Static191.aClass3_Sub14_1 = (Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262.aClass3_262;
			} else {
				Static68.method1329(local10.method3475(), (Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262.aClass3_262, local10.method3474());
			}
		} else if (local18) {
			Static191.aClass3_Sub14_1 = (Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262;
		} else {
			Static68.method1329(local10.method3475(), (Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262, local10.method3474());
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZIIIIIZII)Z")
	public static boolean method5750(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0];
		@Pc(13) int local13 = Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0];
		if (local8 < 0 || Static40.anInt1089 <= local8 || local13 < 0 || Static44.anInt7276 <= local13) {
			return false;
		} else if (arg6 >= 0 && arg6 < Static40.anInt1089 && arg1 >= 0 && arg1 < Static44.anInt7276) {
			@Pc(73) int local73 = Static140.method2190(arg5, local8, arg0, arg6, arg3, Static382.aClass29Array3[Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77], arg4, local13, arg1, Static379.aClass7_Sub2_Sub3_Sub2_2.method3499(), arg7, Static92.anIntArray129, Static102.anIntArray136, arg2);
			if (local73 < 1) {
				return false;
			}
			Static78.anInt1944 = Static102.anIntArray136[local73 - 1];
			Static312.anInt5522 = Static92.anIntArray129[local73 - 1];
			Static246.aBoolean407 = false;
			Static39.method761();
			return true;
		} else {
			return false;
		}
	}
}
