import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "Lclient!ew;")
	public static Class101 aClass101_2;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "Lclient!th;")
	public static Class322 aClass322_3;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	public static void method6689() {
		while (true) {
			if (Static313.aClass2_Sub34_Sub2_1.method6922(Static44.anInt971) >= 15) {
				@Pc(18) int local18 = Static313.aClass2_Sub34_Sub2_1.method6925(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class2_Sub51 local30 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local18);
					@Pc(36) Class11_Sub1_Sub1_Sub2_Sub2 local36;
					if (local30 == null) {
						local36 = new Class11_Sub1_Sub1_Sub2_Sub2();
						local36.anInt3246 = local18;
						local30 = new Class2_Sub51(local36);
						Static357.aClass222_23.method5476(local30, (long) local18);
						local23 = true;
						Static86.aClass2_Sub51Array1[Static225.anInt4616++] = local30;
					}
					local36 = local30.aClass11_Sub1_Sub1_Sub2_Sub2_2;
					Static160.anIntArray256[Static228.anInt4647++] = local18;
					local36.anInt3248 = Static224.anInt4611;
					if (local36.aClass236_1 != null && local36.aClass236_1.method5781()) {
						Static206.method3598(local36);
					}
					@Pc(90) int local90 = Static313.aClass2_Sub34_Sub2_1.method6925(1);
					if (local90 == 1) {
						Static105.anIntArray190[Static549.anInt9102++] = local18;
					}
					@Pc(108) int local108 = Static313.aClass2_Sub34_Sub2_1.method6925(2);
					@Pc(113) int local113 = Static313.aClass2_Sub34_Sub2_1.method6925(5);
					if (local113 > 15) {
						local113 -= 32;
					}
					@Pc(124) int local124 = Static313.aClass2_Sub34_Sub2_1.method6925(1);
					@Pc(135) int local135 = (Static313.aClass2_Sub34_Sub2_1.method6925(3) + 4 & 0x64E00007) << 11;
					@Pc(140) int local140 = Static313.aClass2_Sub34_Sub2_1.method6925(5);
					local36.method2785(Static341.aClass76_1.method1676(Static313.aClass2_Sub34_Sub2_1.method6925(14)));
					if (local140 > 15) {
						local140 -= 32;
					}
					local36.method2767(local36.aClass236_1.anInt6892);
					local36.anInt3206 = local36.aClass236_1.anInt6901 << 3;
					if (local23) {
						local36.method2759(local135, true);
					}
					local36.method2781(local108, local113 + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0], local36.method2778(), local124 == 1, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] + local140);
					if (local36.aClass236_1.method5781()) {
						Static541.method7595(local36.aByte124, local36, null, null, 0, local36.anIntArray233[0], local36.anIntArray232[0]);
					}
					continue;
				}
			}
			Static313.aClass2_Sub34_Sub2_1.method6923();
			return;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!gs;[Lclient!bh;)V")
	public static void method6690(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
		@Pc(6) int local6;
		if (Static148.aBoolean298) {
			local6 = arg0.method8318(arg1);
			Static328.aClass87_6.method7926(local6, arg1);
		}
		if (Static164.aClass112Array1 == Static331.aClass112Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class11_Sub1_Sub1) {
				local6 = ((Class11_Sub1_Sub1) arg0).aShort95;
				local28 = ((Class11_Sub1_Sub1) arg0).aShort97;
			} else {
				local6 = arg0.anInt9925 >> Static415.anInt7579;
				local28 = arg0.anInt9929 >> Static415.anInt7579;
			}
			Static328.aClass87_6.EA(Static178.aClass112Array2[0].method7826(arg0.anInt9925, arg0.anInt9929), Static165.method3055(local6, local28), Static501.method7135(local6, local28), Static230.method7150(local6, local28));
		}
		@Pc(64) Class11_Sub10 local64 = arg0.method8307(Static328.aClass87_6);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean731) {
			@Pc(72) Class11_Sub7[] local72 = local64.aClass11_Sub7Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class11_Sub7 local79 = local72[local74];
				if (local79.aBoolean391) {
					Static233.method3884(local79.anInt4697 + local79.anInt4700, local79.anInt4696 - local79.anInt4700, local79.anInt4698 - local79.anInt4700, local79.anInt4699 + local79.anInt4700);
				}
			}
		}
		if (local64.aBoolean737) {
			local64.aClass11_Sub1_3 = arg0;
			if (Static501.aBoolean631) {
				@Pc(119) Class329 local119 = Static98.aClass329_2;
				synchronized (Static98.aClass329_2) {
					Static98.aClass329_2.method7693(local64);
					return;
				}
			}
			Static98.aClass329_2.method7693(local64);
			return;
		}
		Static186.method3340(local64);
	}
}
