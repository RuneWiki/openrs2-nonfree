import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Z")
	public static boolean aBoolean663 = false;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!qo;)V")
	public static void method7754(@OriginalArg(1) Class20_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static112.anObject11 == null) {
			@Pc(9) Class74_Sub2_Sub2 local9 = new Class74_Sub2_Sub2();
			local16 = local9.method7988();
			Static112.anObject11 = Static51.method1759(local16);
		}
		if (Static78.anObject9 == null) {
			@Pc(27) Class74_Sub1_Sub1 local27 = new Class74_Sub1_Sub1();
			local16 = local27.method2648();
			Static78.anObject9 = Static51.method1759(local16);
		}
		@Pc(49) Class279 local49 = arg0.aClass279_1;
		if (local49.method7175() && Static410.anObject14 == null) {
			local16 = Static327.method5622(0.6F, 4.0F, 4.0F, 0.5F, 16.0F, new Class185_Sub1(419684));
			Static410.anObject14 = Static51.method1759(local16);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!cea;)Lclient!tf;")
	public static Class2_Sub3 method7755(@OriginalArg(1) Class2_Sub11 arg0) {
		arg0.method8383();
		@Pc(13) int local13 = arg0.method8383();
		@Pc(17) Class2_Sub3 local17 = Static211.method4172(local13);
		local17.anInt10959 = arg0.method8383();
		@Pc(26) int local26 = arg0.method8383();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method8383();
			local17.method9157(arg0, local39);
		}
		local17.method9152();
		return local17;
	}
}
