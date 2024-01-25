import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array10;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
	public static boolean aBoolean262 = true;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "F")
	public static float aFloat41 = 0.0F;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(JB)V")
	public static void method2866(@OriginalArg(0) long arg0) {
		Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
		Static74.aClass2_Sub10_Sub1_2.method4430(21);
		Static74.aClass2_Sub10_Sub1_2.method4462(arg0);
		Static345.anInt664 = 1;
		Static341.anInt6833 = 0;
		Static32.anInt582 = -3;
		Static59.anInt1289 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!tq;Lclient!tq;Z)V")
	public static void method2867(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1) {
		Static164.aClass191_102 = arg1;
		Static194.aClass191_124 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ce;ZZB)V")
	public static void method2868(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt694;
		@Pc(12) int local12 = (int) arg0.aLong213;
		arg0.method5945();
		if (arg1) {
			Static331.method2991(local8);
		}
		Static82.method2661(local8);
		@Pc(27) Class146 local27 = Static1.method16(local12);
		if (local27 != null) {
			Static152.method2932(local27);
		}
		Static231.method5240();
		if (!arg2 && Static111.anInt2471 != -1) {
			Static103.method2286(1, Static111.anInt2471);
		}
		@Pc(54) Class21 local54 = new Class21(Static273.aClass199_25);
		for (@Pc(59) Class2_Sub8 local59 = (Class2_Sub8) local54.method740(); local59 != null; local59 = (Class2_Sub8) local54.method743()) {
			if (!local59.method5949()) {
				local59 = (Class2_Sub8) local54.method740();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt699 == 3) {
				@Pc(83) int local83 = (int) local59.aLong213;
				if (local83 >>> 16 == local8) {
					method2868(local59, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2869(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < Static214.anInt4133; local9++) {
			@Pc(17) Class62_Sub1_Sub2_Sub2 local17 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local9]];
			if (local17 != null && local17.aString48 != null && local17.aString48.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static74.aClass2_Sub10_Sub1_2.method2049(2);
					Static74.aClass2_Sub10_Sub1_2.method4404(0);
					Static74.aClass2_Sub10_Sub1_2.method4459(Static103.anIntArray218[local9]);
				} else if (arg0 == 4) {
					Static74.aClass2_Sub10_Sub1_2.method2049(59);
					Static74.aClass2_Sub10_Sub1_2.method4452(Static103.anIntArray218[local9]);
					Static74.aClass2_Sub10_Sub1_2.method4458(0);
				} else if (arg0 == 5) {
					Static74.aClass2_Sub10_Sub1_2.method2049(33);
					Static74.aClass2_Sub10_Sub1_2.method4459(Static103.anIntArray218[local9]);
					Static74.aClass2_Sub10_Sub1_2.method4430(0);
				} else if (arg0 == 6) {
					Static74.aClass2_Sub10_Sub1_2.method2049(169);
					Static74.aClass2_Sub10_Sub1_2.method4410(Static103.anIntArray218[local9]);
					Static74.aClass2_Sub10_Sub1_2.method4458(0);
				} else if (arg0 == 7) {
					Static74.aClass2_Sub10_Sub1_2.method2049(40);
					Static74.aClass2_Sub10_Sub1_2.method4410(Static103.anIntArray218[local9]);
					Static74.aClass2_Sub10_Sub1_2.method4430(0);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static198.method3549(Static215.aClass93_83.method2819(Static21.anInt455) + arg1);
		}
	}
}
