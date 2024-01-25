import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
	public static int anInt7608 = 0;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_104 = new Class267("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "Lclient!um;")
	public static Class244 aClass244_45 = new Class244();

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
	public static int anInt7618 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)Z")
	public static boolean method6233(@OriginalArg(1) int arg0) {
		if (arg0 == 4 || arg0 == 59 || arg0 == 30 || arg0 == 13 || arg0 == 51) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIBII)V")
	public static void method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class6_Sub19 local12 = (Class6_Sub19) Static182.aClass244_16.method5976(); local12 != null; local12 = (Class6_Sub19) Static182.aClass244_16.method5964()) {
			Static181.method2960(local12, arg3, arg0, arg2, arg1);
		}
		for (@Pc(37) Class6_Sub19 local37 = (Class6_Sub19) Static307.aClass244_26.method5976(); local37 != null; local37 = (Class6_Sub19) Static307.aClass244_26.method5964()) {
			@Pc(41) byte local41 = 1;
			@Pc(46) Class246 local46 = local37.aClass3_Sub2_Sub1_Sub1_1.method5513();
			if (local37.aClass3_Sub2_Sub1_Sub1_1.aBoolean418) {
				local41 = 0;
			} else if (local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 == local46.anInt7296 || local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 == local46.anInt7311 || local46.anInt7293 == local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 || local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 == local46.anInt7315) {
				local41 = 2;
			} else if (local46.anInt7325 == local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 || local46.anInt7322 == local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 || local46.anInt7327 == local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 || local37.aClass3_Sub2_Sub1_Sub1_1.anInt6597 == local46.anInt7308) {
				local41 = 3;
			}
			if (local37.anInt3593 != local41) {
				@Pc(129) int local129 = Static29.method722(local37.aClass3_Sub2_Sub1_Sub1_1);
				if (local129 != local37.anInt3591) {
					if (local37.aClass6_Sub4_Sub1_3 != null) {
						Static360.aClass6_Sub4_Sub4_2.method5907(local37.aClass6_Sub4_Sub1_3);
						local37.aClass6_Sub4_Sub1_3 = null;
					}
					local37.anInt3591 = local129;
				}
				local37.anInt3593 = local41;
			}
			local37.anInt3594 = local37.aClass3_Sub2_Sub1_Sub1_1.anInt7202;
			local37.anInt3599 = local37.aClass3_Sub2_Sub1_Sub1_1.anInt7202 + (local37.aClass3_Sub2_Sub1_Sub1_1.method5521() << 6);
			local37.anInt3596 = local37.aClass3_Sub2_Sub1_Sub1_1.anInt7207;
			local37.anInt3592 = local37.aClass3_Sub2_Sub1_Sub1_1.anInt7207 + (local37.aClass3_Sub2_Sub1_Sub1_1.method5521() << 6);
			Static181.method2960(local37, arg3, arg0, arg2, arg1);
		}
		for (@Pc(208) Class6_Sub19 local208 = (Class6_Sub19) Static418.aClass74_32.method1889(); local208 != null; local208 = (Class6_Sub19) Static418.aClass74_32.method1881()) {
			@Pc(212) byte local212 = 1;
			@Pc(219) Class246 local219 = local208.aClass3_Sub2_Sub1_Sub2_1.method5513();
			if (local208.aClass3_Sub2_Sub1_Sub2_1.aBoolean418) {
				local212 = 0;
			} else if (local219.anInt7296 == local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597 || local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597 == local219.anInt7311 || local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597 == local219.anInt7293 || local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597 == local219.anInt7315) {
				local212 = 2;
			} else if (local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597 == local219.anInt7325 || local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597 == local219.anInt7322 || local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597 == local219.anInt7327 || local219.anInt7308 == local208.aClass3_Sub2_Sub1_Sub2_1.anInt6597) {
				local212 = 3;
			}
			if (local208.anInt3593 != local212) {
				@Pc(302) int local302 = Static202.method3126(local208.aClass3_Sub2_Sub1_Sub2_1);
				if (local302 != local208.anInt3591) {
					if (local208.aClass6_Sub4_Sub1_3 != null) {
						Static360.aClass6_Sub4_Sub4_2.method5907(local208.aClass6_Sub4_Sub1_3);
						local208.aClass6_Sub4_Sub1_3 = null;
					}
					local208.anInt3591 = local302;
				}
				local208.anInt3593 = local212;
			}
			local208.anInt3594 = local208.aClass3_Sub2_Sub1_Sub2_1.anInt7202;
			local208.anInt3599 = local208.aClass3_Sub2_Sub1_Sub2_1.anInt7202 + (local208.aClass3_Sub2_Sub1_Sub2_1.method5521() << 6);
			local208.anInt3596 = local208.aClass3_Sub2_Sub1_Sub2_1.anInt7207;
			local208.anInt3592 = local208.aClass3_Sub2_Sub1_Sub2_1.anInt7207 + (local208.aClass3_Sub2_Sub1_Sub2_1.method5521() << 6);
			Static181.method2960(local208, arg3, arg0, arg2, arg1);
		}
	}
}
