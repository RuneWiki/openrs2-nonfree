import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
	public static int anInt3366;

	@OriginalMember(owner = "client!ks", name = "N", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_91 = new Class77(52, 8);

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
	public static int anInt3365 = -1;

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
	public static int anInt3367 = 0;

	@OriginalMember(owner = "client!ks", name = "P", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BII)V")
	public static void method3058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub1_Sub2 local13 = Static323.method4982(arg1, 12);
		local13.method410();
		local13.anInt348 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Lclient!wm;")
	public static Class12_Sub3 method3059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class12_Sub3 local14 = local7.aClass12_Sub3_1;
			local7.aClass12_Sub3_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIBZ)V")
	public static void method3062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			Static386.method1336();
		}
		if (Static363.aFrame4 != null && (arg3 != 3 || Static123.anInt2360 != arg2 || arg1 != Static11.anInt3910)) {
			Static64.method1167(Static92.aClass53_2, Static363.aFrame4);
			Static363.aFrame4 = null;
		}
		if (arg3 == 3 && Static363.aFrame4 == null) {
			Static363.aFrame4 = Static130.method2302(arg1, arg2, Static92.aClass53_2, 0);
			if (Static363.aFrame4 != null) {
				Static123.anInt2360 = arg2;
				Static11.anInt3910 = arg1;
				Static30.method724(Static92.aClass53_2);
			}
		}
		if (arg3 == 3 && Static363.aFrame4 == null) {
			method3062(arg0, -1, -1, Static365.anInt2296, true);
			return;
		}
		@Pc(73) Container local73;
		@Pc(80) Insets local80;
		if (Static363.aFrame4 != null) {
			Static388.anInt4032 = arg1;
			Static269.anInt4774 = arg2;
			local73 = Static363.aFrame4;
		} else if (Static154.aFrame1 == null) {
			local73 = Static92.aClass53_2.anApplet1;
			Static269.anInt4774 = local73.getSize().width;
			Static388.anInt4032 = local73.getSize().height;
		} else {
			local80 = Static154.aFrame1.getInsets();
			@Pc(86) int local86 = -local80.left;
			Static269.anInt4774 = Static154.aFrame1.getSize().width + local86 - local80.right;
			Static388.anInt4032 = Static154.aFrame1.getSize().height - local80.top - local80.bottom;
			local73 = Static154.aFrame1;
		}
		@Pc(161) int local161;
		if (arg3 == 1) {
			Static263.anInt4662 = Static15.anInt364;
			Static335.anInt5875 = Static155.anInt2779;
			Static125.anInt2378 = (Static269.anInt4774 - Static155.anInt2779) / 2;
			Static284.anInt5038 = 0;
		} else if (Static314.anInt5576 < 96 && Static123.anInt2363 == 0) {
			local161 = Static269.anInt4774 <= 1024 ? Static269.anInt4774 : 1024;
			Static335.anInt5875 = local161;
			@Pc(170) int local170 = Static388.anInt4032 > 768 ? 768 : Static388.anInt4032;
			Static125.anInt2378 = (Static269.anInt4774 - local161) / 2;
			Static284.anInt5038 = 0;
			Static263.anInt4662 = local170;
		} else {
			Static125.anInt2378 = 0;
			Static284.anInt5038 = 0;
			Static335.anInt5875 = Static269.anInt4774;
			Static263.anInt4662 = Static388.anInt4032;
		}
		if (Static337.aClass143_27 != Static91.aClass143_12) {
			@Pc(192) boolean local192;
			if (Static335.anInt5875 < 1024 && Static263.anInt4662 < 768) {
				local192 = true;
			} else {
				local192 = false;
			}
		}
		if (arg4) {
			Static200.method3348(Static123.anInt2363);
		} else {
			Static170.aCanvas4.setSize(Static335.anInt5875, Static263.anInt4662);
			if (Static304.aClass82_4 != null) {
				Static304.aClass82_4.method4526();
			}
			if (Static154.aFrame1 == local73) {
				local80 = Static154.aFrame1.getInsets();
				Static170.aCanvas4.setLocation(local80.left + Static125.anInt2378, Static284.anInt5038 + local80.top);
			} else {
				Static170.aCanvas4.setLocation(Static125.anInt2378, Static284.anInt5038);
			}
		}
		if (arg3 < 2) {
			Static375.aBoolean328 = false;
		} else {
			Static375.aBoolean328 = true;
		}
		if (Static226.anInt4223 != -1) {
			Static260.method4054(true);
		}
		if (Static169.aClass124_3 != null && (Static344.anInt6327 == 30 || Static344.anInt6327 == 25)) {
			Static360.method5472();
		}
		for (local161 = 0; local161 < 100; local161++) {
			Static370.aBooleanArray143[local161] = true;
		}
		Static186.aBoolean473 = true;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIILclient!cj;I)V")
	public static void method3064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class2_Sub42 local17 = (Class2_Sub42) Static181.aClass210_23.method5035(); local17 != null; local17 = (Class2_Sub42) Static181.aClass210_23.method5037()) {
			if (local17.anInt6534 == arg0 && local17.anInt6542 == arg1 * 128 && arg3 * 128 == local17.anInt6536 && local17.aClass34_1.anInt802 == arg2.anInt802) {
				if (local17.aClass2_Sub2_Sub2_2 != null) {
					Static339.aClass2_Sub2_Sub1_2.method110(local17.aClass2_Sub2_Sub2_2);
					local17.aClass2_Sub2_Sub2_2 = null;
				}
				if (local17.aClass2_Sub2_Sub2_3 != null) {
					Static339.aClass2_Sub2_Sub1_2.method110(local17.aClass2_Sub2_Sub2_3);
					local17.aClass2_Sub2_Sub2_3 = null;
				}
				local17.method5745();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!lk;I)Lclient!ng;")
	public static Class104_Sub2 method3066(@OriginalArg(0) Class2_Sub13 arg0) {
		return new Class104_Sub2(arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4235(), arg0.method4240());
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(B)V")
	public static void method3068() {
		Static347.aClass5_14 = null;
		Static196.aClass5Array10 = null;
		Static82.aClass5Array5 = null;
		Static356.aClass5Array17 = null;
		Static314.aClass5Array16 = null;
		Static372.aClass5_16 = null;
		Static252.aClass5Array12 = null;
		Static61.aClass5Array4 = null;
		Static190.aClass5Array9 = null;
		Static246.aClass13_4 = null;
		Static85.aClass5Array6 = null;
		Static34.aClass13_1 = null;
		Static314.aClass5Array15 = null;
		Static357.aClass5Array2 = null;
		Static124.aClass5Array18 = null;
		Static275.aClass5Array14 = null;
		Static91.aClass13_2 = null;
		Static380.aClass5Array19 = null;
	}
}
