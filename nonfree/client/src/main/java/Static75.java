import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ek", name = "E", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
	public static final int anInt3285 = 1405;

	@OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
	public static int anInt3288 = 0;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "Lclient!eb;")
	public static Class42 aClass42_19 = new Class42();

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
	public static void method3008() {
		@Pc(5) Class21 local5 = Static21.aClass21_20;
		synchronized (Static21.aClass21_20) {
			Static21.aClass21_20.method851();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
	public static void method3011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub40 local6 = (Class1_Sub40) Static99.aClass42_13.method1543(); local6 != null; local6 = (Class1_Sub40) Static99.aClass42_13.method1551()) {
			Static119.method2536(arg3, arg1, local6, arg0, arg2);
		}
		for (@Pc(31) Class1_Sub40 local31 = (Class1_Sub40) Static136.aClass42_40.method1543(); local31 != null; local31 = (Class1_Sub40) Static136.aClass42_40.method1551()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class67 local40 = local31.aClass11_Sub2_Sub6_Sub2_1.method5898();
			if (local31.aClass11_Sub2_Sub6_Sub2_1.aBoolean499) {
				local35 = 0;
			} else if (local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733 == local40.anInt2097 || local40.anInt2099 == local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733 || local40.anInt2110 == local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733 || local40.anInt2143 == local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733) {
				local35 = 2;
			} else if (local40.anInt2114 == local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733 || local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733 == local40.anInt2109 || local40.anInt2113 == local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733 || local31.aClass11_Sub2_Sub6_Sub2_1.anInt6733 == local40.anInt2115) {
				local35 = 3;
			}
			if (local35 != local31.anInt6091) {
				@Pc(123) int local123 = Static53.method1331(local31.aClass11_Sub2_Sub6_Sub2_1);
				if (local123 != local31.anInt6099) {
					if (local31.aClass1_Sub6_Sub2_2 != null) {
						Static324.aClass1_Sub6_Sub3_2.method3786(local31.aClass1_Sub6_Sub2_2);
						local31.aClass1_Sub6_Sub2_2 = null;
					}
					local31.anInt6099 = local123;
				}
				local31.anInt6091 = local35;
			}
			local31.anInt6096 = local31.aClass11_Sub2_Sub6_Sub2_1.anInt6729;
			local31.anInt6092 = local31.aClass11_Sub2_Sub6_Sub2_1.anInt6729 + local31.aClass11_Sub2_Sub6_Sub2_1.method5894() * 64;
			local31.anInt6098 = local31.aClass11_Sub2_Sub6_Sub2_1.anInt6726;
			local31.anInt6089 = local31.aClass11_Sub2_Sub6_Sub2_1.anInt6726 + local31.aClass11_Sub2_Sub6_Sub2_1.method5894() * 64;
			Static119.method2536(arg3, arg1, local31, arg0, arg2);
		}
		for (@Pc(202) Class1_Sub40 local202 = (Class1_Sub40) Static367.aClass38_33.method1474(); local202 != null; local202 = (Class1_Sub40) Static367.aClass38_33.method1470()) {
			@Pc(208) byte local208 = 1;
			@Pc(213) Class67 local213 = local202.aClass11_Sub2_Sub6_Sub1_3.method5898();
			if (local202.aClass11_Sub2_Sub6_Sub1_3.aBoolean499) {
				local208 = 0;
			} else if (local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733 == local213.anInt2097 || local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733 == local213.anInt2099 || local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733 == local213.anInt2110 || local213.anInt2143 == local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733) {
				local208 = 2;
			} else if (local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733 == local213.anInt2114 || local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733 == local213.anInt2109 || local213.anInt2113 == local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733 || local213.anInt2115 == local202.aClass11_Sub2_Sub6_Sub1_3.anInt6733) {
				local208 = 3;
			}
			if (local208 != local202.anInt6091) {
				@Pc(308) int local308 = Static143.method2853(local202.aClass11_Sub2_Sub6_Sub1_3);
				if (local308 != local202.anInt6099) {
					if (local202.aClass1_Sub6_Sub2_2 != null) {
						Static324.aClass1_Sub6_Sub3_2.method3786(local202.aClass1_Sub6_Sub2_2);
						local202.aClass1_Sub6_Sub2_2 = null;
					}
					local202.anInt6099 = local308;
				}
				local202.anInt6091 = local208;
			}
			local202.anInt6096 = local202.aClass11_Sub2_Sub6_Sub1_3.anInt6729;
			local202.anInt6092 = local202.aClass11_Sub2_Sub6_Sub1_3.anInt6729 + local202.aClass11_Sub2_Sub6_Sub1_3.method5894() * 64;
			local202.anInt6098 = local202.aClass11_Sub2_Sub6_Sub1_3.anInt6726;
			local202.anInt6089 = local202.aClass11_Sub2_Sub6_Sub1_3.anInt6726 + local202.aClass11_Sub2_Sub6_Sub1_3.method5894() * 64;
			Static119.method2536(arg3, arg1, local202, arg0, arg2);
		}
	}
}
