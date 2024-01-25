import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "[I")
	public static int[] anIntArray707;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public static int anInt8227 = 0;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_52 = new Class125(64);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZBZ)V")
	public static void method6820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static201.method3753(arg0, arg2, Static527.aClass68_Sub1Array2.length - 1, arg1, arg3, 0);
		Static280.aClass3_Sub40_1 = null;
		Static18.anInt677 = 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!bd;)V")
	public static void method6822(@OriginalArg(1) Class3_Sub8 arg0) {
		if (Static279.aClass290ArrayArrayArray7 == null) {
			return;
		}
		@Pc(8) Interface15 local8 = null;
		if (arg0.anInt796 == 0) {
			local8 = (Interface15) Static542.method7740(arg0.anInt795, arg0.anInt789, arg0.anInt791);
		}
		if (arg0.anInt796 == 1) {
			local8 = (Interface15) Static183.method4959(arg0.anInt795, arg0.anInt789, arg0.anInt791);
		}
		if (arg0.anInt796 == 2) {
			local8 = (Interface15) Static420.method6482(arg0.anInt795, arg0.anInt789, arg0.anInt791, qn.class);
		}
		if (arg0.anInt796 == 3) {
			local8 = (Interface15) Static72.method1464(arg0.anInt795, arg0.anInt789, arg0.anInt791);
		}
		if (local8 == null) {
			arg0.anInt790 = -1;
			arg0.anInt787 = 0;
			arg0.anInt793 = 0;
		} else {
			arg0.anInt790 = local8.method7758();
			arg0.anInt793 = local8.method7761();
			arg0.anInt787 = local8.method7764();
		}
	}
}
