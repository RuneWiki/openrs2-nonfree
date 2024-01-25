import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "Lclient!pp;")
	public static Class275 aClass275_2;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Lclient!en;")
	public static Class93 aClass93_5;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!uw;Lclient!uw;)V")
	public static void method9015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub4 arg3, @OriginalArg(4) Class4_Sub2_Sub4 arg4) {
		@Pc(4) Class217 local4 = Static411.method6333(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub2_Sub4_1 = arg3;
		local4.aClass4_Sub2_Sub4_2 = arg4;
		@Pc(19) int local19 = Static11.aClass61Array1 == Static456.aClass61Array3 ? 1 : 0;
		if (!arg3.method8733()) {
			arg3.aClass4_Sub2_23 = Static243.aClass4_Sub2Array2[local19];
			Static243.aClass4_Sub2Array2[local19] = arg3;
		} else if (arg3.method8727()) {
			arg3.aClass4_Sub2_23 = Static457.aClass4_Sub2Array4[local19];
			Static457.aClass4_Sub2Array4[local19] = arg3;
		} else {
			arg3.aClass4_Sub2_23 = Static79.aClass4_Sub2Array1[local19];
			Static79.aClass4_Sub2Array1[local19] = arg3;
			Static28.aBoolean15 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8733()) {
			if (arg4.method8727()) {
				arg4.aClass4_Sub2_23 = Static457.aClass4_Sub2Array4[local19];
				Static457.aClass4_Sub2Array4[local19] = arg4;
				return;
			}
			arg4.aClass4_Sub2_23 = Static79.aClass4_Sub2Array1[local19];
			Static79.aClass4_Sub2Array1[local19] = arg4;
			Static28.aBoolean15 = true;
			return;
		}
		arg4.aClass4_Sub2_23 = Static243.aClass4_Sub2Array2[local19];
		Static243.aClass4_Sub2Array2[local19] = arg4;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Z")
	public static boolean method9016(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!raa;IB)V")
	public static void method9017(@OriginalArg(0) int arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class1 local13 = arg1.method6998(Static213.aClass133_5);
		if (local13 == null) {
			return;
		}
		Static213.aClass133_5.KA(arg2, arg0, arg1.anInt7957 + arg2, arg1.anInt7985 + arg0);
		if (Static606.anInt10177 >= 3) {
			Static213.aClass133_5.A(-16777216, local13, arg2, arg0);
		} else {
			Static477.aClass28_28.method4054((float) arg1.anInt7957 / 2.0F + (float) arg2, (float) arg0 + (float) arg1.anInt7985 / 2.0F, ((int) -Static311.aFloat95 & 0x3FFF) << 2, local13, arg2, arg0);
		}
	}
}
