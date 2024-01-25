import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
	public static boolean aBoolean90;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString55 = "flash1:";

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public static int anInt1379 = -2;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()V")
	public static void method1296() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static82.aClass213ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static82.aClass213ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static233.anInt4556; local6++) {
					for (local9 = 0; local9 < Static180.anInt3712; local9++) {
						if (Static82.aClass213ArrayArrayArray1[local3][local6][local9] != null) {
							Static82.aClass213ArrayArrayArray1[local3][local6][local9].method5873();
						}
						Static82.aClass213ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static82.aClass213ArrayArrayArray1 = null;
		Static18.aClass114Array1 = null;
		if (Static342.aClass213ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static342.aClass213ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static233.anInt4556; local6++) {
					for (local9 = 0; local9 < Static180.anInt3712; local9++) {
						if (Static342.aClass213ArrayArrayArray3[local3][local6][local9] != null) {
							Static342.aClass213ArrayArrayArray3[local3][local6][local9].method5873();
						}
						Static342.aClass213ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static342.aClass213ArrayArrayArray3 = null;
		Static341.aClass114Array3 = null;
		Static98.aClass213ArrayArrayArray2 = null;
		Static158.aClass114Array2 = null;
		Static63.anInt1526 = 0;
		if (Static43.aClass193Array1 != null) {
			for (local3 = 0; local3 < Static63.anInt1526; local3++) {
				Static43.aClass193Array1[local3] = null;
			}
		}
		if (Static352.aClass10_Sub3Array3 != null) {
			for (local3 = 0; local3 < Static165.anInt5082; local3++) {
				Static352.aClass10_Sub3Array3[local3] = null;
			}
			Static165.anInt5082 = 0;
		}
		if (Static127.aClass14_Sub13_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static4.anInt118; local3++) {
				Static127.aClass14_Sub13_Sub1Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static125.anInt2719; local6++) {
				for (local9 = 0; local9 < Static233.anInt4556; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static180.anInt3712; local160++) {
						Static118.anIntArrayArrayArray3[local6][local9][local160] = 0;
					}
				}
			}
			Static4.anInt118 = 0;
		}
		Static346.anIntArrayArrayArray13 = null;
		Static106.method2291();
		Static184.aClass126_4.method3398();
		Static295.aClass57_1 = null;
		Static238.anIntArrayArray77 = null;
		Static336.aClass51_6 = null;
		Static160.aClass46_4 = null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public static void method1297(@OriginalArg(0) int arg0) {
		@Pc(18) Class14_Sub37 local18 = (Class14_Sub37) Static316.aClass25_15.method691((long) arg0);
		if (local18 != null) {
			for (@Pc(23) int local23 = 0; local23 < local18.anIntArray614.length; local23++) {
				local18.anIntArray614[local23] = -1;
				local18.anIntArray612[local23] = 0;
			}
		}
	}
}
