import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public static int anInt6300;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!lg;")
	public static Class119 aClass119_189 = new Class119(64);

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public static int anInt6295 = 2;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public static void method5478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(16, arg1);
		local8.method5537();
		local8.anInt6362 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method5479() {
		@Pc(6) Class119 local6 = Static32.aClass119_18;
		synchronized (Static32.aClass119_18) {
			Static32.aClass119_18.method3312();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5481(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static355.anInt6969; local16++) {
			if (arg0.equalsIgnoreCase(Static34.aStringArray2[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static336.aStringArray62[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public static void method5482() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static163.aClass8ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static163.aClass8ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static223.anInt4280; local6++) {
					for (local9 = 0; local9 < Static160.anInt3244; local9++) {
						if (Static163.aClass8ArrayArrayArray2[local3][local6][local9] != null) {
							Static163.aClass8ArrayArrayArray2[local3][local6][local9].method372();
						}
						Static163.aClass8ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static163.aClass8ArrayArrayArray2 = null;
		Static265.aClass73Array44 = null;
		if (Static227.aClass8ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static227.aClass8ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static223.anInt4280; local6++) {
					for (local9 = 0; local9 < Static160.anInt3244; local9++) {
						if (Static227.aClass8ArrayArrayArray3[local3][local6][local9] != null) {
							Static227.aClass8ArrayArrayArray3[local3][local6][local9].method372();
						}
						Static227.aClass8ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static227.aClass8ArrayArrayArray3 = null;
		Static313.aClass73Array39 = null;
		Static275.aClass8ArrayArrayArray4 = null;
		Static301.aClass73Array31 = null;
		Static69.anInt1500 = 0;
		if (Static234.aClass184Array1 != null) {
			for (local3 = 0; local3 < Static69.anInt1500; local3++) {
				Static234.aClass184Array1[local3] = null;
			}
		}
		if (Static355.aClass62_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static346.anInt6897; local3++) {
				Static355.aClass62_Sub1Array3[local3] = null;
			}
			Static346.anInt6897 = 0;
		}
		if (Static288.aClass2_Sub36_Sub1Array7 != null) {
			for (local3 = 0; local3 < Static350.anInt6740; local3++) {
				Static288.aClass2_Sub36_Sub1Array7[local3] = null;
			}
			for (local6 = 0; local6 < Static37.anInt696; local6++) {
				for (local9 = 0; local9 < Static223.anInt4280; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static160.anInt3244; local160++) {
						Static99.anIntArrayArrayArray2[local6][local9][local160] = 0;
					}
				}
			}
			Static350.anInt6740 = 0;
		}
		Static26.anIntArrayArrayArray1 = null;
		Static252.method4566();
		Static5.aClass67_7.method2097();
		Static42.aClass101_1 = null;
		Static126.anIntArrayArray82 = null;
		Static293.aClass133_5 = null;
		Static50.aClass4_5 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method5483() {
		Static74.aClass2_Sub10_Sub1_2.method2049(166);
		Static74.aClass2_Sub10_Sub1_2.method4452(Static352.anInt6926);
	}
}
