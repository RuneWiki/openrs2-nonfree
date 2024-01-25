import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kh", name = "Tb", descriptor = "Lclient!uv;")
	public static Class253 aClass253_153;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
	public static final int anInt7039 = 328;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "Lclient!dr;")
	public static final Class7_Sub14_Sub1 aClass7_Sub14_Sub1_4 = new Class7_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIIII)V")
	public static void method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg1 >= Static293.anInt4886 && Static137.anInt2576 >= arg3 + arg1 && Static316.anInt5188 <= arg2 - arg1 && Static82.anInt1667 >= arg2 + arg1) {
			Static453.method5752(arg1, arg2, arg0, arg3);
		} else {
			Static105.method1837(arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILclient!ok;)Lclient!hv;")
	public static Class7_Sub4_Sub9 method5513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class178 arg2) {
		@Pc(14) Class7_Sub14 local14 = new Class7_Sub14(arg2.method3838(arg1, arg0));
		@Pc(53) Class7_Sub4_Sub9 local53 = new Class7_Sub4_Sub9(arg1, local14.method3986(), local14.method3986(), local14.method3938(), local14.method3938(), local14.method3981() == 1, local14.method3981(), local14.method3981());
		@Pc(57) int local57 = local14.method3981();
		for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
			local53.aClass85_15.method2011(new Class7_Sub20(local14.method3981(), local14.method3943(), local14.method3943(), local14.method3943(), local14.method3943(), local14.method3943(), local14.method3943(), local14.method3943(), local14.method3943()));
		}
		local53.method2407();
		return local53;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V")
	public static void method5515(@OriginalArg(0) int arg0) {
		Static345.anInt5550 = arg0;
		Static303.aClass126_42.method2827();
	}
}
