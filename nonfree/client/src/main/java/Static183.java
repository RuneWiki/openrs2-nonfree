import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gha", name = "j", descriptor = "Ljava/lang/Class;")
	private static Class aClass13;

	@OriginalMember(owner = "client!gha", name = "q", descriptor = "Lclient!wh;")
	public static final Class392 aClass392_2 = new Class392(4, 1);

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIII)Z")
	public static boolean method3160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface9 local9 = (Interface9) Static142.method6599(arg0, arg1, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static638.method8820(local9) & true;
		}
		local9 = (Interface9) Static367.method5340(arg0, arg1, arg2, aClass13 == null ? (aClass13 = Class17_Sub8.a("dp")) : aClass13);
		if (local9 != null) {
			local11 &= Static638.method8820(local9);
		}
		local9 = (Interface9) Static254.method4181(arg0, arg1, arg2);
		if (local9 != null) {
			local11 &= Static638.method8820(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLclient!rba;Lclient!rba;)V")
	public static void method3162(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0.aClass5_Sub1_64 != null) {
			arg0.method8955();
		}
		arg0.aClass5_Sub1_64 = arg1;
		arg0.aClass5_Sub1_65 = arg1.aClass5_Sub1_65;
		arg0.aClass5_Sub1_64.aClass5_Sub1_65 = arg0;
		arg0.aClass5_Sub1_65.aClass5_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!ha;Lclient!jc;I)I")
	public static int method3165(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class181 arg1) {
		if (arg1.anInt4677 != -1) {
			return arg1.anInt4677;
		}
		if (arg1.anInt4676 != -1) {
			@Pc(22) Class44 local22 = arg0.anInterface7_12.method7423(arg1.anInt4676);
			if (!local22.aBoolean56) {
				return local22.aShort26;
			}
		}
		return arg1.anInt4663;
	}
}
