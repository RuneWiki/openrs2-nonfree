import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_13;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	public static int anInt3173;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public static int anInt3171 = 0;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString185 = "rating: ";

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
	public static void method2565() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static272.aBooleanArray50[local3] = true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	public static void method2566() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static140.aClass1_Sub26ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static140.aClass1_Sub26ArrayArrayArray2.length; local3++) {
				for (local9 = 0; local9 < Static158.anInt3404; local9++) {
					for (local14 = 0; local14 < Static209.anInt4179; local14++) {
						Static140.aClass1_Sub26ArrayArrayArray2[local3][local9][local14] = null;
					}
				}
			}
		}
		Static192.aClass1_Sub32ArrayArray2 = null;
		if (Static273.aClass1_Sub26ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static273.aClass1_Sub26ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static158.anInt3404; local9++) {
					for (local14 = 0; local14 < Static209.anInt4179; local14++) {
						Static273.aClass1_Sub26ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static44.aClass1_Sub32ArrayArray1 = null;
		Static154.anInt3331 = 0;
		if (Static126.aClass165Array3 != null) {
			for (local3 = 0; local3 < Static154.anInt3331; local3++) {
				Static126.aClass165Array3[local3] = null;
			}
		}
		if (Static82.aClass25Array2 != null) {
			for (local3 = 0; local3 < Static199.anInt4060; local3++) {
				Static82.aClass25Array2[local3] = null;
			}
			Static199.anInt4060 = 0;
		}
		if (Static35.aClass25Array3 != null) {
			for (local3 = 0; local3 < Static35.aClass25Array3.length; local3++) {
				Static35.aClass25Array3[local3] = null;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIBI)V")
	public static void method2567(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static108.method1987(arg3)) {
			Static178.method3185(arg0, Static77.aClass71ArrayArray1[arg3], -1, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lclient!qk;")
	public static Class140 method2568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class140 local5 = new Class140();
		for (@Pc(16) Class1_Sub2_Sub21 local16 = (Class1_Sub2_Sub21) Static241.aClass70_16.method2074(); local16 != null; local16 = (Class1_Sub2_Sub21) Static241.aClass70_16.method2079()) {
			if (local16.aBoolean427 && local16.method4286(arg1, arg0)) {
				local5.method3414(local16);
			}
		}
		return local5;
	}
}
