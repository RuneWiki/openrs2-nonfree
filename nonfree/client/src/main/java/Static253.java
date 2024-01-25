import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
	public static int anInt3964;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_29 = new Class85(8);

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)V")
	public static void method3572() {
		Static78.anInt1358 = 0;
		@Pc(17) int local17 = Static243.anInt3820 + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >> 9);
		@Pc(25) int local25 = (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >> 9) + Static224.anInt11062;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static78.anInt1358 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static78.anInt1358 = 1;
		}
		if (Static78.anInt1358 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static78.anInt1358 = 0;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!tl;[Lclient!bba;)V")
	public static void method3573(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
		@Pc(6) int local6;
		if (Static400.aBoolean558) {
			local6 = arg0.method8969(arg1);
			Static689.aClass145_16.method9655(local6, arg1);
		}
		if (Static685.aClass133Array5 == Static158.aClass133Array4) {
			@Pc(28) int local28;
			if (arg0 instanceof Class4_Sub2_Sub1) {
				local6 = ((Class4_Sub2_Sub1) arg0).aShort130;
				local28 = ((Class4_Sub2_Sub1) arg0).aShort127;
			} else {
				local6 = arg0.anInt10229 >> Static260.anInt4053;
				local28 = arg0.anInt10228 >> Static260.anInt4053;
			}
			Static689.aClass145_16.EA(Static126.aClass133Array1[0].method8214(arg0.anInt10229, arg0.anInt10228), Static308.method4294(local6, local28), Static112.method1642(local6, local28), Static53.method748(local6, local28));
		}
		@Pc(64) Class4_Sub8 local64 = arg0.method8966(Static689.aClass145_16);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean887) {
			@Pc(74) Class4_Sub6[] local74 = local64.aClass4_Sub6Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class4_Sub6 local81 = local74[local76];
				if (local81.aBoolean269) {
					Static5.method72(local81.anInt2726 + local81.anInt2723, local81.anInt2725 - local81.anInt2723, local81.anInt2722 + local81.anInt2723, local81.anInt2724 - local81.anInt2723);
				}
			}
		}
		if (local64.aBoolean360) {
			local64.aClass4_Sub2_13 = arg0;
			if (Static4.aBoolean8) {
				@Pc(127) Class52 local127 = Static655.aClass52_3;
				synchronized (Static655.aClass52_3) {
					Static655.aClass52_3.method1068(local64);
					return;
				}
			}
			Static655.aClass52_3.method1068(local64);
			return;
		}
		Static525.method7392(local64);
	}
}
