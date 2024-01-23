import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_26;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_811 = Static186.method3527("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_812 = Static186.method3527("");

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "[Lclient!pg;")
	public static Class1_Sub17[] aClass1_Sub17Array1 = new Class1_Sub17[2048];

	@OriginalMember(owner = "client!ld", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_813 = Static186.method3527("");

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)I")
	public static int method1891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZII)V")
	public static void method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub16 local10 = (Class1_Sub16) Static198.aClass75_20.method2239(); local10 != null; local10 = (Class1_Sub16) Static198.aClass75_20.method2238()) {
			Static172.method2828(local10, arg0, arg1, arg2, arg3);
		}
		for (@Pc(31) Class1_Sub16 local31 = (Class1_Sub16) Static158.aClass75_17.method2239(); local31 != null; local31 = (Class1_Sub16) Static158.aClass75_17.method2238()) {
			@Pc(35) byte local35 = 1;
			if (local31.aClass20_Sub3_Sub2_1.anInt3057 == local31.aClass20_Sub3_Sub2_1.anInt3051) {
				local35 = 0;
			} else if (local31.aClass20_Sub3_Sub2_1.anInt3027 == local31.aClass20_Sub3_Sub2_1.anInt3051) {
				local35 = 2;
			}
			if (local35 != local31.anInt1891) {
				@Pc(68) int local68 = Static118.method1868(local31.aClass20_Sub3_Sub2_1);
				if (local68 != local31.anInt1906) {
					if (local31.aClass1_Sub12_Sub4_2 != null) {
						Static226.aClass1_Sub12_Sub1_2.method894(local31.aClass1_Sub12_Sub4_2);
						local31.aClass1_Sub12_Sub4_2 = null;
					}
					local31.anInt1906 = local68;
				}
				local31.anInt1891 = local35;
			}
			local31.anInt1901 = local31.aClass20_Sub3_Sub2_1.anInt3022;
			local31.anInt1908 = local31.aClass20_Sub3_Sub2_1.anInt3008;
			local31.anInt1897 = local31.aClass20_Sub3_Sub2_1.anInt3022 + local31.aClass20_Sub3_Sub2_1.anInt3034 * 64;
			local31.anInt1903 = local31.aClass20_Sub3_Sub2_1.anInt3008 + local31.aClass20_Sub3_Sub2_1.anInt3034 * 64;
			Static172.method2828(local31, arg0, arg1, arg2, arg3);
		}
		for (@Pc(145) Class1_Sub16 local145 = (Class1_Sub16) Static153.aClass90_16.method2823(); local145 != null; local145 = (Class1_Sub16) Static153.aClass90_16.method2821()) {
			@Pc(149) byte local149 = 1;
			if (local145.aClass20_Sub3_Sub1_1.anInt3051 == local145.aClass20_Sub3_Sub1_1.anInt3057) {
				local149 = 0;
			} else if (local145.aClass20_Sub3_Sub1_1.anInt3027 == local145.aClass20_Sub3_Sub1_1.anInt3051) {
				local149 = 2;
			}
			if (local149 != local145.anInt1891) {
				@Pc(186) int local186 = Static191.method3133(local145.aClass20_Sub3_Sub1_1);
				if (local145.anInt1906 != local186) {
					if (local145.aClass1_Sub12_Sub4_2 != null) {
						Static226.aClass1_Sub12_Sub1_2.method894(local145.aClass1_Sub12_Sub4_2);
						local145.aClass1_Sub12_Sub4_2 = null;
					}
					local145.anInt1906 = local186;
				}
				local145.anInt1891 = local149;
			}
			local145.anInt1903 = local145.aClass20_Sub3_Sub1_1.anInt3008 + local145.aClass20_Sub3_Sub1_1.anInt3034 * 64;
			local145.anInt1901 = local145.aClass20_Sub3_Sub1_1.anInt3022;
			local145.anInt1908 = local145.aClass20_Sub3_Sub1_1.anInt3008;
			local145.anInt1897 = local145.aClass20_Sub3_Sub1_1.anInt3022 + local145.aClass20_Sub3_Sub1_1.anInt3034 * 64;
			Static172.method2828(local145, arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
	public static void method1894() {
		try {
			if (Static19.anInt400 == 1) {
				@Pc(12) int local12 = Static203.aClass1_Sub12_Sub3_2.method2614();
				if (local12 > 0 && Static203.aClass1_Sub12_Sub3_2.method2609()) {
					local12 -= Static109.anInt2171;
					if (local12 < 0) {
						local12 = 0;
					}
					Static203.aClass1_Sub12_Sub3_2.method2610(local12);
					return;
				}
				Static203.aClass1_Sub12_Sub3_2.method2626();
				Static203.aClass1_Sub12_Sub3_2.method2611();
				Static17.aClass66_1 = null;
				if (Static218.aClass86_68 == null) {
					Static19.anInt400 = 0;
				} else {
					Static19.anInt400 = 2;
				}
				Static74.aClass1_Sub24_1 = null;
			}
		} catch (@Pc(51) Exception local51) {
			local51.printStackTrace();
			Static203.aClass1_Sub12_Sub3_2.method2626();
			Static218.aClass86_68 = null;
			Static74.aClass1_Sub24_1 = null;
			Static19.anInt400 = 0;
			Static17.aClass66_1 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!sa;Lclient!sa;B)V")
	public static void method1895(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_204 != null) {
			arg1.method3525();
		}
		arg1.aClass1_204 = arg0.aClass1_204;
		arg1.aClass1_203 = arg0;
		arg1.aClass1_204.aClass1_203 = arg1;
		arg1.aClass1_203.aClass1_204 = arg1;
	}
}
