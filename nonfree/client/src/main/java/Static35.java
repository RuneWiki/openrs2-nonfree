import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_303 = Static177.method3050("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_306 = Static177.method3050("Prepared visibility map");

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "Lclient!jd;")
	public static Class46 aClass46_304 = aClass46_306;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "Lclient!jd;")
	public static Class46 aClass46_307 = aClass46_303;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_308 = Static177.method3050("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!dh", name = "O", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_314 = Static177.method3050("flash1:");

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "Lclient!jd;")
	public static Class46 aClass46_309 = aClass46_314;

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_310 = Static177.method3050("<br>(X100(U(Y");

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_312 = aClass46_314;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
	public static int anInt924 = 0;

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_313 = Static177.method3050("<img=1>");

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "[I")
	public static final int[] anIntArray82 = new int[32768];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BILclient!ac;)V")
	public static void method612(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub1 arg1) {
		Static94.method1841(arg0, arg1.anInt2832, arg1.anInt2803);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lclient!a;II)V")
	public static void method613(@OriginalArg(0) Class1[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class1 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt7 == 0) {
					if (local13.aClass1Array1 != null) {
						method613(local13.aClass1Array1, arg1);
					}
					@Pc(37) Class4_Sub14 local37 = (Class4_Sub14) Static106.aClass20_5.method505((long) local13.anInt53);
					if (local37 != null) {
						Static73.method1504(local37.anInt2450, arg1);
					}
				}
				@Pc(53) Class4_Sub21 local53;
				if (arg1 == 0 && local13.anObjectArray2 != null) {
					local53 = new Class4_Sub21();
					local53.anObjectArray28 = local13.anObjectArray2;
					local53.aClass1_40 = local13;
					Static2.method18(local53);
				}
				if (arg1 == 1 && local13.anObjectArray11 != null) {
					if (local13.anInt48 >= 0) {
						@Pc(77) Class1 local77 = Static154.method3136(local13.anInt53);
						if (local77 == null || local77.aClass1Array1 == null || local13.anInt48 >= local77.aClass1Array1.length || local77.aClass1Array1[local13.anInt48] != local13) {
							continue;
						}
					}
					local53 = new Class4_Sub21();
					local53.aClass1_40 = local13;
					local53.anObjectArray28 = local13.anObjectArray11;
					Static2.method18(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
	public static void method615() {
		while (true) {
			if (Static162.aClass4_Sub11_Sub1_3.method1280(Static132.anInt3166) >= 27) {
				@Pc(12) int local12 = Static162.aClass4_Sub11_Sub1_3.method1288(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
						Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class4_Sub1_Sub1_Sub1_Sub2();
						local17 = true;
					}
					@Pc(33) Class4_Sub1_Sub1_Sub1_Sub2 local33 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local12];
					anIntArray82[Static87.anInt2219++] = local12;
					local33.anInt2830 = Static142.anInt3325;
					local33.aClass4_Sub1_Sub11_1 = Static105.method1980(Static162.aClass4_Sub11_Sub1_3.method1288(14));
					@Pc(57) int local57 = Static162.aClass4_Sub11_Sub1_3.method1288(5);
					@Pc(62) int local62 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
					@Pc(69) int local69 = Static100.anIntArray238[Static162.aClass4_Sub11_Sub1_3.method1288(3)];
					if (local17) {
						local33.anInt2829 = local33.anInt2822 = local69;
					}
					if (local57 > 15) {
						local57 -= 32;
					}
					@Pc(86) int local86 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
					if (local86 == 1) {
						Static121.anIntArray276[Static182.anInt4082++] = local12;
					}
					@Pc(102) int local102 = Static162.aClass4_Sub11_Sub1_3.method1288(5);
					local33.anInt2805 = local33.aClass4_Sub1_Sub11_1.anInt2251;
					local33.anInt2789 = local33.aClass4_Sub1_Sub11_1.anInt2247;
					local33.anInt2816 = local33.aClass4_Sub1_Sub11_1.anInt2264;
					local33.anInt2796 = local33.aClass4_Sub1_Sub11_1.anInt2239;
					local33.anInt2810 = local33.aClass4_Sub1_Sub11_1.anInt2235;
					local33.anInt2792 = local33.aClass4_Sub1_Sub11_1.anInt2259;
					local33.anInt2800 = local33.aClass4_Sub1_Sub11_1.anInt2265;
					if (local102 > 15) {
						local102 -= 32;
					}
					if (local33.anInt2792 == 0) {
						local33.anInt2822 = 0;
					}
					local33.anInt2833 = local33.aClass4_Sub1_Sub11_1.anInt2237;
					local33.anInt2794 = local33.aClass4_Sub1_Sub11_1.anInt2243;
					local33.method2116(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0] + local57, local62 == 1, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0] + local102);
					continue;
				}
			}
			Static162.aClass4_Sub11_Sub1_3.method1286();
			return;
		}
	}
}
