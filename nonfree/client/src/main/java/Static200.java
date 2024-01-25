import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!go", name = "C", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	public static int anInt9878 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!haa;[Lclient!rfa;)V")
	public static void method8474(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class14_Sub18[] arg1) {
		@Pc(6) int local6;
		if (Static157.aBoolean165) {
			local6 = arg0.method9488(arg1);
			Static554.aClass144_12.method6970(local6, arg1);
		}
		if (Static346.aClass159Array2 == Static258.aClass159Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class4_Sub3_Sub3) {
				local6 = ((Class4_Sub3_Sub3) arg0).aShort108;
				local28 = ((Class4_Sub3_Sub3) arg0).aShort109;
			} else {
				local6 = arg0.anInt11184 >> Static110.anInt1858;
				local28 = arg0.anInt11178 >> Static110.anInt1858;
			}
			Static554.aClass144_12.EA(Static445.aClass159Array3[0].method8209(arg0.anInt11184, arg0.anInt11178), Static602.method8510(local6, local28), Static684.method9447(local6, local28), Static510.method7641(local6, local28));
		}
		@Pc(64) Class4_Sub9 local64 = arg0.method9491(Static554.aClass144_12);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean779) {
			@Pc(74) Class4_Sub1[] local74 = local64.aClass4_Sub1Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class4_Sub1 local81 = local74[local76];
				if (local81.aBoolean3) {
					Static140.method2127(local81.anInt31 + local81.anInt30, local81.anInt28 - local81.anInt30, local81.anInt32 + local81.anInt30, local81.anInt29 - local81.anInt30);
				}
			}
		}
		if (local64.aBoolean748) {
			local64.aClass4_Sub3_24 = arg0;
			if (Static326.aBoolean408) {
				@Pc(127) Class307 local127 = Static603.aClass307_3;
				synchronized (Static603.aClass307_3) {
					Static603.aClass307_3.method7675(local64);
					return;
				}
			}
			Static603.aClass307_3.method7675(local64);
			return;
		}
		Static51.method942(local64);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	public static void method8475(@OriginalArg(1) int arg0) {
		@Pc(14) Class14_Sub2_Sub9 local14 = Static499.method7527((long) arg0, 6);
		local14.method4001();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V")
	public static void method8478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static468.anInt7895 && Static382.anInt6719 >= arg3) {
			@Pc(25) int local25 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg0);
			@Pc(31) int local31 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg2);
			Static332.method5146(arg1, local31, local25, arg3);
		}
	}
}
