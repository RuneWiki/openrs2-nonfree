import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!be", name = "k", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_2 = new Class357();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILclient!ha;III)V")
	public static void method600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static547.aClass9_29 == null || Static325.aClass9_17 == null || Static640.aClass9_33 == null) && Static403.aClass221_115.method5068(Static212.anInt3810) && Static403.aClass221_115.method5068(Static607.anInt9853) && Static403.aClass221_115.method5068(Static197.anInt3480)) {
			@Pc(54) Class194 local54 = Static728.method4757(Static403.aClass221_115, Static607.anInt9853, 0);
			Static325.aClass9_17 = arg2.method7659(local54, true);
			local54.method4760();
			Static720.aClass9_36 = arg2.method7659(local54, true);
			Static547.aClass9_29 = arg2.method7659(Static728.method4757(Static403.aClass221_115, Static212.anInt3810, 0), true);
			@Pc(79) Class194 local79 = Static728.method4757(Static403.aClass221_115, Static197.anInt3480, 0);
			Static640.aClass9_33 = arg2.method7659(local79, true);
			local79.method4760();
			Static343.aClass9_18 = arg2.method7659(local79, true);
		}
		if (Static547.aClass9_29 == null || Static325.aClass9_17 == null || Static640.aClass9_33 == null) {
			return;
		}
		@Pc(112) int local112 = (arg1 - Static640.aClass9_33.method8602() * 2) / Static547.aClass9_29.method8602();
		for (@Pc(114) int local114 = 0; local114 < local112; local114++) {
			Static547.aClass9_29.method8617(arg4 + Static640.aClass9_33.method8602() + Static547.aClass9_29.method8602() * local114, arg3 - -arg0 - Static547.aClass9_29.method8611());
		}
		@Pc(155) int local155 = (arg0 - Static640.aClass9_33.method8611() - 20) / Static325.aClass9_17.method8611();
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static325.aClass9_17.method8617(arg4, local157 * Static325.aClass9_17.method8611() + arg3 + 20);
			Static720.aClass9_36.method8617(arg1 + arg4 - Static720.aClass9_36.method8602(), arg3 + (20 - -(Static325.aClass9_17.method8611() * local157)));
		}
		Static640.aClass9_33.method8617(arg4, arg3 + arg0 - Static640.aClass9_33.method8611());
		Static343.aClass9_18.method8617(arg1 + arg4 - Static640.aClass9_33.method8602(), arg3 - (-arg0 - -Static640.aClass9_33.method8611()));
	}
}
