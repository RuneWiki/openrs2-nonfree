import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public static int anInt2589;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_31;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] aClass4_Sub1_Sub7_Sub3Array11;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_63;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_935 = Static177.method3050("slide:");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_933 = aClass46_935;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_934 = Static177.method3050("Nehmen");

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
	public static final int[] anIntArray241 = new int[128];

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public static int anInt2590 = 20;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_937 = Static177.method3050("Drop");

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!jd;")
	public static Class46 aClass46_936 = aClass46_937;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!jd;")
	public static Class46 aClass46_938 = aClass46_935;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_939 = Static177.method3050("headicons_prayer");

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_940 = Static177.method3050("(U1");

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_941 = Static177.method3050("<col=ffff00>");

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method1953() {
		while (true) {
			if (Static162.aClass4_Sub11_Sub1_3.method1280(Static132.anInt3166) >= 11) {
				@Pc(14) int local14 = Static162.aClass4_Sub11_Sub1_3.method1288(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local14] == null) {
						local21 = true;
						Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local14] = new Class4_Sub1_Sub1_Sub1_Sub1();
						if (Static50.aClass4_Sub11Array1[local14] != null) {
							Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local14].method1638(Static50.aClass4_Sub11Array1[local14]);
						}
					}
					Static167.anIntArray369[Static126.anInt3006++] = local14;
					@Pc(57) Class4_Sub1_Sub1_Sub1_Sub1 local57 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local14];
					local57.anInt2830 = Static142.anInt3325;
					@Pc(65) int local65 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
					@Pc(72) int local72 = Static100.anIntArray238[Static162.aClass4_Sub11_Sub1_3.method1288(3)];
					if (local21) {
						local57.anInt2829 = local57.anInt2822 = local72;
					}
					@Pc(85) int local85 = Static162.aClass4_Sub11_Sub1_3.method1288(5);
					if (local85 > 15) {
						local85 -= 32;
					}
					@Pc(96) int local96 = Static162.aClass4_Sub11_Sub1_3.method1288(5);
					@Pc(101) int local101 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
					if (local96 > 15) {
						local96 -= 32;
					}
					if (local101 == 1) {
						Static121.anIntArray276[Static182.anInt4082++] = local14;
					}
					local57.method2116(local96 + Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], local65 == 1, local85 + Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0]);
					continue;
				}
			}
			Static162.aClass4_Sub11_Sub1_3.method1286();
			return;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!a;)I")
	public static int method1954(@OriginalArg(1) Class1 arg0) {
		@Pc(25) Class4_Sub18 local25 = (Class4_Sub18) Static129.aClass20_8.method505((long) arg0.anInt48 + ((long) arg0.anInt53 << 32));
		return local25 == null ? arg0.anInt44 : local25.anInt2869;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIILclient!tg;IJ)Z")
	public static boolean method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static106.method2001(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
	public static void method1957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg3 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = 2048 - arg2 & 0x7FF;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg5;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(52) int local52;
		if (local10 != 0) {
			local37 = Class4_Sub1_Sub7_Sub4.anIntArray412[local10];
			local41 = Class4_Sub1_Sub7_Sub4.anIntArray416[local10];
			local52 = local41 * 0 - local37 * arg5 >> 16;
			local28 = local37 * 0 + arg5 * local41 >> 16;
			local26 = local52;
		}
		if (local24 != 0) {
			local41 = Class4_Sub1_Sub7_Sub4.anIntArray416[local24];
			local37 = Class4_Sub1_Sub7_Sub4.anIntArray412[local24];
			local52 = local37 * local28 + local41 * 0 >> 16;
			local28 = local28 * local41 - local37 * 0 >> 16;
			local17 = local52;
		}
		Static119.anInt2886 = arg4 - local17;
		Static135.anInt3214 = arg0 - local28;
		Static111.anInt2724 = arg1 - local26;
		Static15.anInt456 = arg3;
		Static4.anInt2849 = arg2;
	}
}
