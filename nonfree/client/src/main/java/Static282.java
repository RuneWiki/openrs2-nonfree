import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	public static int anInt4972;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_131 = new Class12(46, 3);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fo;B)V")
	public static void method3893(@OriginalArg(0) Class82 arg0) {
		Static378.anInt2799 = arg0.method1835("p11_full");
		Static364.anInt3532 = arg0.method1835("p12_full");
		Static179.anInt3130 = arg0.method1835("b12_full");
		Static408.anInt6717 = arg0.method1835("hitmarks");
		Static373.anInt6277 = arg0.method1835("hitbar_default");
		Static261.anInt4687 = arg0.method1835("timerbar_default");
		Static335.anInt5712 = arg0.method1835("headicons_pk");
		Static277.anInt5516 = arg0.method1835("headicons_prayer");
		Static67.anInt1247 = arg0.method1835("hint_headicons");
		Static21.anInt412 = arg0.method1835("hint_mapmarkers");
		anInt4972 = arg0.method1835("mapflag");
		Static257.anInt4672 = arg0.method1835("cross");
		Static71.anInt1312 = arg0.method1835("mapdots");
		Static299.anInt7359 = arg0.method1835("scrollbar");
		Static444.anInt7377 = arg0.method1835("name_icons");
		Static174.anInt2861 = arg0.method1835("floorshadows");
		Static158.anInt2207 = arg0.method1835("compass");
		Static97.anInt1745 = arg0.method1835("otherlevel");
		Static337.anInt5761 = arg0.method1835("hint_mapedge");
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZZ)V")
	public static void method3895(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class1_Sub10 local6 = (Class1_Sub10) Static448.aClass227_54.method4967(); local6 != null; local6 = (Class1_Sub10) Static448.aClass227_54.method4973()) {
			if (local6.aClass1_Sub6_Sub3_1 != null) {
				Static355.aClass1_Sub6_Sub4_2.method5179(local6.aClass1_Sub6_Sub3_1);
				local6.aClass1_Sub6_Sub3_1 = null;
			}
			if (local6.aClass1_Sub6_Sub3_2 != null) {
				Static355.aClass1_Sub6_Sub4_2.method5179(local6.aClass1_Sub6_Sub3_2);
				local6.aClass1_Sub6_Sub3_2 = null;
			}
			local6.method5915();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class1_Sub10 local53 = (Class1_Sub10) Static361.aClass227_37.method4967(); local53 != null; local53 = (Class1_Sub10) Static361.aClass227_37.method4973()) {
			if (local53.aClass1_Sub6_Sub3_1 != null) {
				Static355.aClass1_Sub6_Sub4_2.method5179(local53.aClass1_Sub6_Sub3_1);
				local53.aClass1_Sub6_Sub3_1 = null;
			}
			local53.method5915();
		}
		for (@Pc(80) Class1_Sub10 local80 = (Class1_Sub10) Static38.aClass199_25.method4392(); local80 != null; local80 = (Class1_Sub10) Static38.aClass199_25.method4393()) {
			if (local80.aClass1_Sub6_Sub3_1 != null) {
				Static355.aClass1_Sub6_Sub4_2.method5179(local80.aClass1_Sub6_Sub3_1);
				local80.aClass1_Sub6_Sub3_1 = null;
			}
			local80.method5915();
		}
	}
}
