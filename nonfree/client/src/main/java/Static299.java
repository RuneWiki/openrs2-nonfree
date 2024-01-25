import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!br;")
	public static final Class27 aClass27_6 = new Class27();

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_98 = new Class36(6, 7);

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
	public static int anInt5399 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method4152(@OriginalArg(0) int arg0) {
		if (!Static413.method5427(arg0)) {
			return;
		}
		@Pc(14) Class126[] local14 = Static320.aClass126ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class126 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt3384 = 0;
				local26.anInt3455 = 0;
				local26.anInt3414 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method4153(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static58.anInt4352;
		@Pc(9) int[] local9 = Static144.anIntArray186;
		@Pc(11) boolean local11 = false;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(28) Class6_Sub2_Sub1_Sub1 local28 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local9[local20]];
			if (local28 != null && Static375.aClass6_Sub2_Sub1_Sub1_3 != local28 && local28.aString11 != null && local28.aString11.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static209.method2982(Static4.aClass36_3);
					Static116.aClass4_Sub30_Sub1_1.method4881(0);
					Static116.aClass4_Sub30_Sub1_1.method4835(local9[local20]);
				} else if (arg0 == 4) {
					Static209.method2982(Static343.aClass36_110);
					Static116.aClass4_Sub30_Sub1_1.method4846(local9[local20]);
					Static116.aClass4_Sub30_Sub1_1.method4875(0);
				} else if (arg0 == 5) {
					Static209.method2982(Static305.aClass36_99);
					Static116.aClass4_Sub30_Sub1_1.method4883(local9[local20]);
					Static116.aClass4_Sub30_Sub1_1.method4881(0);
				} else if (arg0 == 6) {
					Static209.method2982(Static283.aClass36_92);
					Static116.aClass4_Sub30_Sub1_1.method4883(local9[local20]);
					Static116.aClass4_Sub30_Sub1_1.method4875(0);
				} else if (arg0 == 7) {
					Static209.method2982(Static82.aClass36_41);
					Static116.aClass4_Sub30_Sub1_1.method4835(local9[local20]);
					Static116.aClass4_Sub30_Sub1_1.method4848(0);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static196.method2835(Static217.aClass242_55.method5320(Static139.anInt2670) + arg1);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZI)Lclient!jb;")
	public static Class126 method4154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class126 local12 = Static53.method1056(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass126Array3 == null || local12.aClass126Array3.length <= arg1) {
			return null;
		} else {
			return local12.aClass126Array3[arg1];
		}
	}
}
