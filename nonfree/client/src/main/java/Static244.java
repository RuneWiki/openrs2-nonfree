import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ica", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray82;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILclient!uf;)I")
	public static int method9717(@OriginalArg(0) int arg0, @OriginalArg(2) Class357 arg1) {
		if (!Static85.method1469(arg1).method1135(arg0) && arg1.anObjectArray5 == null) {
			return -1;
		} else if (arg1.anIntArray546 == null || arg0 >= arg1.anIntArray546.length) {
			return -1;
		} else {
			return arg1.anIntArray546[arg0];
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!nfa;[Lclient!mfa;)V")
	public static void method9721(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class2_Sub13[] arg1) {
		@Pc(6) int local6;
		if (Static583.aBoolean738) {
			local6 = arg0.method9428(arg1);
			Static64.aClass101_1.method8094(local6, arg1);
		}
		if (Static93.aClass18Array33 == Static245.aClass18Array14) {
			@Pc(28) int local28;
			if (arg0 instanceof Class15_Sub3_Sub3) {
				local6 = ((Class15_Sub3_Sub3) arg0).aShort62;
				local28 = ((Class15_Sub3_Sub3) arg0).aShort64;
			} else {
				local6 = arg0.anInt11022 >> Static170.anInt3602;
				local28 = arg0.anInt11024 >> Static170.anInt3602;
			}
			Static64.aClass101_1.EA(Static549.aClass18Array30[0].method8542(arg0.anInt11024, arg0.anInt11022), Static432.method7061(local6, local28), Static249.method4412(local6, local28), Static394.method7229(local6, local28));
		}
		@Pc(64) Class15_Sub9 local64 = arg0.method9427(Static64.aClass101_1);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean789) {
			@Pc(72) Class15_Sub6[] local72 = local64.aClass15_Sub6Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class15_Sub6 local79 = local72[local74];
				if (local79.aBoolean200) {
					Static220.method4070(local79.anInt2725 + local79.anInt2724, local79.anInt2728 - local79.anInt2724, local79.anInt2727 - local79.anInt2724, local79.anInt2726 + local79.anInt2724);
				}
			}
		}
		if (local64.aBoolean770) {
			local64.aClass15_Sub3_22 = arg0;
			if (Static27.aBoolean27) {
				@Pc(119) Class217 local119 = Static212.aClass217_1;
				synchronized (Static212.aClass217_1) {
					Static212.aClass217_1.method5980(local64);
					return;
				}
			}
			Static212.aClass217_1.method5980(local64);
			return;
		}
		Static137.method2402(local64);
	}
}
