import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!be;")
	public static Class4_Sub3_Sub1_Sub2_Sub1 aClass4_Sub3_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	public static int anInt1635;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient!c;")
	public static Class10 aClass10_20;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
	public static int anInt1642;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "[Lclient!tf;")
	public static Class4_Sub9[] aClass4_Sub9Array1 = new Class4_Sub9[2048];

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_627 = Static41.method597("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_628 = Static41.method597(":chalreq:");

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "Lclient!od;")
	public static Class60 aClass60_629 = Static41.method597("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lclient!od;")
	public static Class60 method1051(@OriginalArg(1) int arg0) {
		return Static102.method1692(arg0, false);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public static void method1053() {
		aClass60_627 = null;
		aClass4_Sub9Array1 = null;
		aClass60_629 = null;
		aClass60_628 = null;
		aClass10_20 = null;
		aClass4_Sub3_Sub1_Sub2_Sub1_1 = null;
		Class49.anIntArray190 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1055(@OriginalArg(1) Component arg0) {
		@Pc(9) Method local9 = Static126.aMethod1;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static108.aClass40_1);
		arg0.addFocusListener(Static108.aClass40_1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBI)V")
	public static void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static99.anInt611 = -1;
			Static125.anInt2827 = -1;
			return;
		}
		@Pc(34) int local34 = Static55.method882(arg1, arg2, Static77.anInt1866) - arg0;
		@Pc(46) int local46 = arg2 - Static98.anInt2286;
		@Pc(50) int local50 = Class4_Sub3_Sub6_Sub4.anIntArray301[Static108.anInt2581];
		@Pc(54) int local54 = Class4_Sub3_Sub6_Sub4.anIntArray304[Static23.anInt806];
		@Pc(58) int local58 = local34 - Static23.anInt816;
		@Pc(62) int local62 = Class4_Sub3_Sub6_Sub4.anIntArray301[Static23.anInt806];
		@Pc(66) int local66 = Class4_Sub3_Sub6_Sub4.anIntArray304[Static108.anInt2581];
		@Pc(70) int local70 = arg1 - Static109.anInt2592;
		@Pc(80) int local80 = local46 * local66 + local70 * local50 >> 16;
		@Pc(91) int local91 = local70 * local66 - local50 * local46 >> 16;
		@Pc(93) int local93 = local80;
		@Pc(104) int local104 = local54 * local58 - local62 * local91 >> 16;
		@Pc(115) int local115 = local58 * local62 + local91 * local54 >> 16;
		if (local115 < 50) {
			Static99.anInt611 = -1;
			Static125.anInt2827 = -1;
		} else {
			Static99.anInt611 = (local93 << 9) / local115 + 256;
			Static125.anInt2827 = (local104 << 9) / local115 + 167;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method1063(@OriginalArg(0) Class4_Sub3_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt1400 * 128 + arg0.anInt1434 * 64;
		@Pc(19) int local19 = arg0.anInt1425 - Static118.anInt2741;
		arg0.anInt1440 += (local13 - arg0.anInt1440) / local19;
		if (arg0.anInt1441 == 0) {
			arg0.anInt1414 = 1024;
		}
		@Pc(51) int local51 = arg0.anInt1404 * 128 + arg0.anInt1434 * 64;
		if (arg0.anInt1441 == 1) {
			arg0.anInt1414 = 1536;
		}
		if (arg0.anInt1441 == 2) {
			arg0.anInt1414 = 0;
		}
		if (arg0.anInt1441 == 3) {
			arg0.anInt1414 = 512;
		}
		arg0.anInt1387 = 0;
		arg0.anInt1407 += (local51 - arg0.anInt1407) / local19;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!c;Lclient!od;Lclient!c;Lclient!od;)Lclient!me;")
	public static Class4_Sub3_Sub6_Sub1_Sub1 method1064(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class60 arg3) {
		@Pc(10) int local10 = arg0.method1770(arg1);
		@Pc(21) int local21 = arg0.method1785(arg3, local10);
		return Static74.method1241(arg2, local10, arg0, local21);
	}
}
