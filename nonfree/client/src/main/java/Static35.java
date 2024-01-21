import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lclient!wa;")
	public static Class23 aClass23_21;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
	public static int anInt759;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!be;")
	public static final Class5_Sub2_Sub5 aClass5_Sub2_Sub5_1 = new Class5_Sub2_Sub5();

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_261 = Static161.method2452("(U3");

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_262 = Static161.method2452("Login");

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_263 = aClass20_262;

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_5 = new Class91();

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_264 = Static161.method2452(":assistreq:");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method550() {
		Static184.method2779(Static48.aClass69_4);
		Static37.anInt1355++;
		if (Static217.aBoolean190 && Static143.aBoolean128) {
			@Pc(26) int local26 = Static207.anInt4069;
			local26 -= Static140.anInt2922;
			if (local26 < Static119.anInt2513) {
				local26 = Static119.anInt2513;
			}
			@Pc(37) int local37 = Static70.anInt1549;
			if (Static48.aClass69_4.anInt2471 + local26 > Static119.anInt2513 + Static119.aClass69_9.anInt2471) {
				local26 = Static119.anInt2513 + Static119.aClass69_9.anInt2471 - Static48.aClass69_4.anInt2471;
			}
			@Pc(64) int local64 = local26 - Static207.anInt4074;
			local37 -= Static65.anInt1420;
			@Pc(71) int local71 = Static48.aClass69_4.anInt2490;
			if (local37 < Static95.anInt2011) {
				local37 = Static95.anInt2011;
			}
			if (local37 + Static48.aClass69_4.anInt2541 > Static95.anInt2011 - -Static119.aClass69_9.anInt2541) {
				local37 = Static119.aClass69_9.anInt2541 + Static95.anInt2011 - Static48.aClass69_4.anInt2541;
			}
			@Pc(103) int local103 = local37 - Static38.anInt831;
			if (Static48.aClass69_4.anInt2483 < Static37.anInt1355 && (local71 < local103 || local103 < -local71 || local71 < local64 || local64 < -local71)) {
				Static11.aBoolean11 = true;
			}
			@Pc(131) int local131 = Static119.aClass69_9.anInt2478 + local37 - Static95.anInt2011;
			@Pc(140) int local140 = local26 + Static119.aClass69_9.anInt2514 - Static119.anInt2513;
			@Pc(149) Class5_Sub10 local149;
			if (Static48.aClass69_4.anObjectArray18 != null && Static11.aBoolean11) {
				local149 = new Class5_Sub10();
				local149.aClass69_3 = Static48.aClass69_4;
				local149.anObjectArray3 = Static48.aClass69_4.anObjectArray18;
				local149.anInt1026 = local140;
				local149.anInt1028 = local131;
				Static184.method2781(local149);
			}
			if (Static18.anInt352 == 0) {
				if (Static11.aBoolean11) {
					if (Static48.aClass69_4.anObjectArray20 != null) {
						local149 = new Class5_Sub10();
						local149.aClass69_2 = Static175.aClass69_13;
						local149.anObjectArray3 = Static48.aClass69_4.anObjectArray20;
						local149.aClass69_3 = Static48.aClass69_4;
						local149.anInt1026 = local140;
						local149.anInt1028 = local131;
						Static184.method2781(local149);
					}
					if (Static175.aClass69_13 != null && Static8.method191(Static48.aClass69_4) != null) {
						Static43.aClass5_Sub6_Sub1_2.method3087(234);
						Static43.aClass5_Sub6_Sub1_2.method3044(Static175.aClass69_13.anInt2475);
						Static43.aClass5_Sub6_Sub1_2.method3046(Static48.aClass69_4.anInt2523);
						Static43.aClass5_Sub6_Sub1_2.method3082(Static175.aClass69_13.anInt2523);
						Static43.aClass5_Sub6_Sub1_2.method3064(Static48.aClass69_4.anInt2475);
					}
				} else if ((Static189.anInt3754 == 1 || Static183.method2774(Static85.anInt1879 - 1)) && Static85.anInt1879 > 2) {
					Static75.method1218();
				} else if (Static85.anInt1879 > 0) {
					Static136.method2111(Static85.anInt1879 - 1);
				}
				Static48.aClass69_4 = null;
			}
		} else if (Static37.anInt1355 > 1) {
			Static48.aClass69_4 = null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
	public static int method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static168.aByteArrayArrayArray13[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static168.aByteArrayArrayArray13[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!wd;")
	public static RuntimeException_Sub1 method571(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString6 = local9.aString6 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)I")
	public static int method593() {
		return Static82.anInt1814;
	}
}
