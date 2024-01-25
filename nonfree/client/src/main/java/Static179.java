import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!pca;I)V")
	public static void method3184(@OriginalArg(0) Class251 arg0) {
		if (!Static253.aBoolean325) {
			return;
		}
		if (arg0.anObjectArray24 != null) {
			@Pc(14) Class251 local14 = Static137.method2669(Static164.anInt3670, Static149.anInt3464);
			if (local14 != null) {
				@Pc(20) Class3_Sub36 local20 = new Class3_Sub36();
				local20.aClass251_7 = local14;
				local20.anObjectArray1 = arg0.anObjectArray24;
				local20.aClass251_8 = arg0;
				Static583.method7919(local20);
			}
		}
		@Pc(41) Class3_Sub10 local41 = Static129.method2403(Static452.aClass353_2, Static449.aClass287_128);
		local41.aClass3_Sub26_Sub1_1.method6826(arg0.anInt7279);
		local41.aClass3_Sub26_Sub1_1.method6795(arg0.anInt7254);
		local41.aClass3_Sub26_Sub1_1.method6769(Static511.anInt8807);
		local41.aClass3_Sub26_Sub1_1.method6769(Static149.anInt3464);
		local41.aClass3_Sub26_Sub1_1.method6803(Static164.anInt3670);
		local41.aClass3_Sub26_Sub1_1.method6800(arg0.anInt7268);
		Static193.method3398(local41);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILclient!iq;I)Z")
	public static boolean method3186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class25_Sub2_Sub3 arg2, @OriginalArg(4) int arg3) {
		if (!Static383.aBoolean467) {
			return false;
		} else if (Static325.anInt5933 < 100) {
			return false;
		} else if (Static258.method4012(arg3, arg1, arg0)) {
			@Pc(26) int local26 = arg3 << Static385.anInt6657;
			@Pc(30) int local30 = arg1 << Static385.anInt6657;
			@Pc(40) int local40 = Static256.aClass127Array3[arg0].method7862(arg1, arg3) - 1;
			@Pc(49) int local49 = local40 + arg2.method6652();
			if (arg2.aShort68 == 1) {
				if (!Static343.method5000(local49, local49, local26, local30 + Static331.anInt6010, local26, local30, local30, local26, local40)) {
					return false;
				} else if (Static343.method5000(local49, local40, local26, Static331.anInt6010 + local30, local26, Static331.anInt6010 + local30, local30, local26, local40)) {
					Static388.anInt6724++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort68 == 2) {
				if (!Static343.method5000(local49, local49, local26, local30 + Static331.anInt6010, local26, Static331.anInt6010 + local30, local30 + Static331.anInt6010, Static331.anInt6010 + local26, local40)) {
					return false;
				} else if (Static343.method5000(local40, local49, local26, local30 + Static331.anInt6010, local26 - -Static331.anInt6010, local30 + Static331.anInt6010, local30 - -Static331.anInt6010, Static331.anInt6010 + local26, local40)) {
					Static388.anInt6724++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort68 == 4) {
				if (!Static343.method5000(local49, local49, local26 + Static331.anInt6010, local30 + Static331.anInt6010, Static331.anInt6010 + local26, local30, local30, local26 + Static331.anInt6010, local40)) {
					return false;
				} else if (Static343.method5000(local49, local40, local26 + Static331.anInt6010, local30 - -Static331.anInt6010, local26 + Static331.anInt6010, local30 + Static331.anInt6010, local30, local26 + Static331.anInt6010, local40)) {
					Static388.anInt6724++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort68 == 8) {
				if (!Static343.method5000(local49, local49, local26, local30, local26, local30, local30, Static331.anInt6010 + local26, local40)) {
					return false;
				} else if (Static343.method5000(local40, local49, local26, local30, Static331.anInt6010 + local26, local30, local30, local26 + Static331.anInt6010, local40)) {
					Static388.anInt6724++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort68 == 16) {
				if (Static469.method7096(Static211.anInt8485, Static211.anInt8485, local26, Static211.anInt8485 + local30, local40, local49)) {
					Static388.anInt6724++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort68 == 32) {
				if (Static469.method7096(Static211.anInt8485, Static211.anInt8485, Static211.anInt8485 + local26, Static211.anInt8485 + local30, local40, local49)) {
					Static388.anInt6724++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort68 == 64) {
				if (Static469.method7096(Static211.anInt8485, Static211.anInt8485, Static211.anInt8485 + local26, local30, local40, local49)) {
					Static388.anInt6724++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort68 != 128) {
				return true;
			} else if (Static469.method7096(Static211.anInt8485, Static211.anInt8485, local26, local30, local40, local49)) {
				Static388.anInt6724++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
