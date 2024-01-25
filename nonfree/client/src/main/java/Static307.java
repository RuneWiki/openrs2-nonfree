import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_44 = new Class359(32);

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_94 = new Class322(11, 3);

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)V")
	public static void method4889(@OriginalArg(0) int arg0) {
		if (Static37.anInt498 == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static482.method7185();
		}
		if (arg0 != 14 && Static491.aClass141_2 != null) {
			Static491.aClass141_2.method7615();
			Static491.aClass141_2 = null;
		}
		if (arg0 == 3) {
			Static283.method4692(Static94.anInt1386 != Static635.anInt9910);
		}
		if (arg0 == 7) {
			Static255.method4446(Static635.anInt9910 != Static370.anInt3440);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static334.method5175();
		} else if (arg0 == 6 || arg0 == 9) {
			Static482.method7185();
		}
		if (Static206.method3811(Static37.anInt498)) {
			Static460.aClass223_93.anInt5858 = 2;
			Static57.aClass223_11.anInt5858 = 2;
			Static531.aClass223_103.anInt5858 = 2;
			Static74.aClass223_16.anInt5858 = 2;
			Static479.aClass223_94.anInt5858 = 2;
			Static84.aClass223_19.anInt5858 = 2;
			Static317.aClass223_71.anInt5858 = 2;
		}
		if (Static206.method3811(arg0)) {
			Static492.anInt3481 = 0;
			Static551.anInt8913 = 0;
			Static225.anInt4394 = 1;
			Static655.anInt10163 = 1;
			Static593.anInt9435 = 0;
			Static159.method3128(true);
			Static460.aClass223_93.anInt5858 = 1;
			Static57.aClass223_11.anInt5858 = 1;
			Static531.aClass223_103.anInt5858 = 1;
			Static74.aClass223_16.anInt5858 = 1;
			Static479.aClass223_94.anInt5858 = 1;
			Static84.aClass223_19.anInt5858 = 1;
			Static317.aClass223_71.anInt5858 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static542.method7712();
		}
		@Pc(222) boolean local222 = arg0 == 2 || Static233.method4127(arg0) || Static188.method3527(arg0);
		@Pc(244) boolean local244 = Static37.anInt498 == 2 || Static233.method4127(Static37.anInt498) || Static188.method3527(Static37.anInt498);
		if (local244 != local222) {
			if (local222) {
				Static478.anInt8119 = Static141.anInt8739;
				if (Static687.aClass6_Sub44_33.aClass7_Sub13_4.method3338() == 0) {
					Static476.method7131();
				} else {
					Static356.method5434(Static141.anInt8739, Static209.aClass223_41, Static687.aClass6_Sub44_33.aClass7_Sub13_4.method3338());
					Static666.method8844();
				}
				Static116.aClass189_2.method4683(false);
			} else {
				Static476.method7131();
				Static116.aClass189_2.method4683(true);
			}
		}
		if (Static206.method3811(arg0) || arg0 == 14 || arg0 == 15) {
			Static202.aClass75_5.method6717();
		}
		Static37.anInt498 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZIBI)Lclient!in;")
	public static Class6_Sub25 method4890(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub25 local7 = new Class6_Sub25();
		local7.anInt5007 = arg2;
		local7.anInt5008 = arg3;
		Static477.aClass74_31.method1399(local7, (long) arg0);
		Static276.method4638(arg2);
		@Pc(26) Class381 local26 = Static69.method899(arg0);
		if (local26 != null) {
			Static168.method3312(local26);
		}
		if (Static339.aClass381_8 != null) {
			Static168.method3312(Static339.aClass381_8);
			Static339.aClass381_8 = null;
		}
		Static367.method5557(-56);
		if (local26 != null) {
			Static518.method7497(!arg1, local26);
		}
		if (!arg1) {
			Static301.method4834(arg2);
		}
		if (!arg1 && Static635.anInt9910 != -1) {
			Static490.method7251(1, Static635.anInt9910);
		}
		return local7;
	}
}
