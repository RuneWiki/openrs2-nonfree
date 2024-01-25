import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!un;I)Lclient!fs;")
	public static Class108 method8026(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(10) Class258 local10 = Static240.method7436()[arg0.method4905()];
		@Pc(19) Class250 local19 = Static215.method3573()[arg0.method4905()];
		@Pc(23) int local23 = arg0.method4946();
		@Pc(27) int local27 = arg0.method4946();
		@Pc(33) int local33 = arg0.method4936();
		@Pc(43) int local43 = arg0.method4936();
		@Pc(47) int local47 = arg0.method4946();
		@Pc(51) int local51 = arg0.method4931();
		@Pc(55) int local55 = arg0.method4931();
		return new Class108(local10, local19, local23, local27, local33, local43, local47, local51, local55);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!n;B)V")
	public static void method8027(@OriginalArg(0) Class225 arg0) {
		if (!Static418.aBoolean541) {
			return;
		}
		if (arg0.anObjectArray25 != null) {
			@Pc(14) Class225 local14 = Static24.method318(Static7.anInt173, Static317.anInt10281);
			if (local14 != null) {
				@Pc(20) Class4_Sub25 local20 = new Class4_Sub25();
				local20.anObjectArray1 = arg0.anObjectArray25;
				local20.aClass225_20 = local14;
				local20.aClass225_21 = arg0;
				Static388.method6121(local20);
			}
		}
		@Pc(41) Class4_Sub14 local41 = Static196.method3380(Static17.aClass159_1, Static198.aClass173_64);
		local41.aClass4_Sub11_Sub1_3.method4909(arg0.anInt6555);
		local41.aClass4_Sub11_Sub1_3.method4932(Static592.anInt10215);
		local41.aClass4_Sub11_Sub1_3.method4902(Static317.anInt10281);
		local41.aClass4_Sub11_Sub1_3.method4932(arg0.anInt6527);
		local41.aClass4_Sub11_Sub1_3.method4898(arg0.anInt6565);
		local41.aClass4_Sub11_Sub1_3.method4943(Static7.anInt173);
		Static353.method5712(local41);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)V")
	public static void method8028(@OriginalArg(1) int arg0) {
		Static529.anInt9422 = arg0;
		Static189.anInt3714 = -1;
		Class1_Sub4_Sub4_Sub2.lb = -1;
		Static484.method7227();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIIZ)I")
	public static int method8029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class4_Sub18 local8 = Static72.method6564(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray144.length > arg1) {
			return local8.anIntArray144[arg1];
		} else {
			return -1;
		}
	}
}
