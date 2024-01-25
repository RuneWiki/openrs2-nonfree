import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
	public static int anInt4681;

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_65 = new Class171(96, 4);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lclient!pja;")
	public static Class3_Sub37 method4014() {
		@Pc(11) Class3_Sub37 local11 = Static577.method7590();
		local11.anInt7403 = 0;
		local11.aClass240_78 = null;
		local11.aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(5000);
		return local11;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	public static void method4015() {
		@Pc(12) Class3_Sub37 local12 = Static90.method1509(Static268.aClass240_46, Static226.aClass144_2);
		local12.aClass3_Sub4_Sub1_2.method7956(Static147.anInt2707);
		Static301.method2678(local12);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!via;ILclient!via;)V")
	public static void method4016(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class34 arg1) {
		if (arg1.aClass34_67 != null) {
			arg1.method8764();
		}
		arg1.aClass34_68 = arg0;
		arg1.aClass34_67 = arg0.aClass34_67;
		arg1.aClass34_67.aClass34_68 = arg1;
		arg1.aClass34_68.aClass34_67 = arg1;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!sia;I)I")
	public static int method4017(@OriginalArg(0) Class323 arg0) {
		if (arg0 == Static189.aClass323_3) {
			return 9216;
		} else if (Static117.aClass323_2 == arg0) {
			return 34065;
		} else if (arg0 == Static44.aClass323_1) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method4018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class265 local16 = Static212.method3145(arg1, arg0);
		if (local16 == null) {
			return;
		}
		if (local16.anObjectArray13 != null) {
			@Pc(26) Class3_Sub53 local26 = new Class3_Sub53();
			local26.anInt10766 = arg3;
			local26.aString118 = arg2;
			local26.aClass265_16 = local16;
			local26.anObjectArray35 = local16.anObjectArray13;
			Static250.method3767(local26);
		}
		if (Static221.anInt3831 != 10 || !Static86.method1383(local16).method6486(arg3 - 1)) {
			return;
		}
		@Pc(68) Class3_Sub37 local68;
		if (arg3 == 1) {
			local68 = Static90.method1509(Static166.aClass240_30, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 2) {
			local68 = Static90.method1509(Static43.aClass240_17, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 3) {
			local68 = Static90.method1509(Static42.aClass240_15, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 4) {
			local68 = Static90.method1509(Static538.aClass240_92, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 5) {
			local68 = Static90.method1509(Static335.aClass240_56, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 6) {
			local68 = Static90.method1509(Static89.aClass240_23, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 7) {
			local68 = Static90.method1509(Static295.aClass240_50, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 8) {
			local68 = Static90.method1509(Static427.aClass240_72, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 9) {
			local68 = Static90.method1509(Static20.aClass240_5, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
		if (arg3 == 10) {
			local68 = Static90.method1509(Static520.aClass240_89, Static226.aClass144_2);
			Static668.method8918(arg0, local68, arg1, local16.anInt7005);
			Static301.method2678(local68);
		}
	}
}
