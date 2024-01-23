import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[[Lclient!ok;")
	public static Class116[][] aClass116ArrayArray1;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "C")
	public static char aChar1;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!kn;")
	public static Class1_Sub16_Sub1 aClass1_Sub16_Sub1_1 = new Class1_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Lclient!ui;")
	public static Class1_Sub2_Sub20 method1454(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub20 local6 = (Class1_Sub2_Sub20) Static48.aClass125_2.method3669((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(35) byte[] local35;
		if (arg0 >= 32768) {
			local35 = Static298.aClass83_204.method2306(1, arg0 & 0x7FFF);
		} else {
			local35 = Static251.aClass83_173.method2306(1, arg0);
		}
		local6 = new Class1_Sub2_Sub20();
		if (local35 != null) {
			local6.method4534(new Class1_Sub16(local35));
		}
		if (arg0 >= 32768) {
			local6.method4523();
		}
		Static48.aClass125_2.method3671(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method1456() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static111.anInt2398 - 1; local18++) {
				if (Static213.aShortArray71[local18] < 1000 && Static213.aShortArray71[local18 + 1] > 1000) {
					local12 = false;
					@Pc(41) String local41 = Static24.aStringArray3[local18];
					Static24.aStringArray3[local18] = Static24.aStringArray3[local18 + 1];
					Static24.aStringArray3[local18 + 1] = local41;
					@Pc(59) String local59 = Static165.aStringArray17[local18];
					Static165.aStringArray17[local18] = Static165.aStringArray17[local18 + 1];
					Static165.aStringArray17[local18 + 1] = local59;
					@Pc(77) int local77 = Static218.anIntArray494[local18];
					Static218.anIntArray494[local18] = Static218.anIntArray494[local18 + 1];
					Static218.anIntArray494[local18 + 1] = local77;
					@Pc(95) int local95 = Static52.anIntArray147[local18];
					Static52.anIntArray147[local18] = Static52.anIntArray147[local18 + 1];
					Static52.anIntArray147[local18 + 1] = local95;
					@Pc(113) int local113 = Static153.anIntArray326[local18];
					Static153.anIntArray326[local18] = Static153.anIntArray326[local18 + 1];
					Static153.anIntArray326[local18 + 1] = local113;
					@Pc(131) short local131 = Static213.aShortArray71[local18];
					Static213.aShortArray71[local18] = Static213.aShortArray71[local18 + 1];
					Static213.aShortArray71[local18 + 1] = local131;
					@Pc(149) long local149 = Static34.aLongArray6[local18];
					Static34.aLongArray6[local18] = Static34.aLongArray6[local18 + 1];
					Static34.aLongArray6[local18 + 1] = local149;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method1457() {
		Static250.aClass1_Sub2_Sub14Array8 = null;
		Static208.aClass1_Sub2_Sub14Array14 = null;
		Static119.aClass7Array1 = null;
		Static156.aClass1_Sub2_Sub16_3 = null;
		Static215.aClass1_Sub2_Sub14Array15 = null;
		Static181.aClass1_Sub2_Sub14_Sub1Array2 = null;
		Static40.aClass1_Sub2_Sub14Array10 = null;
		Static14.aClass1_Sub2_Sub16_1 = null;
		Static238.aClass1_Sub2_Sub14_8 = null;
		Static282.aClass1_Sub2_Sub14Array17 = null;
		Static99.aClass1_Sub2_Sub14Array11 = null;
		Static222.aClass1_Sub2_Sub14Array16 = null;
		Static9.aClass1_Sub2_Sub14Array1 = null;
		Static216.aClass7Array3 = null;
		Static174.aClass1_Sub2_Sub16_Sub2_1 = null;
		Static11.aClass1_Sub2_Sub14Array13 = null;
		Static58.aClass1_Sub2_Sub16_2 = null;
		Static212.aClass1_Sub2_Sub14_5 = null;
		Static33.aClass1_Sub2_Sub14Array5 = null;
	}
}
