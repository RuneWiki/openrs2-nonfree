import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_29 = new Class74();

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
	public static int anInt3829 = -60;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "Lclient!il;")
	public static final Class104 aClass104_1 = new Class104();

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_35 = new Class103(32);

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "[I")
	public static final int[] anIntArray524 = new int[13];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII)V")
	public static void method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg4 >= Static61.anInt1534 && arg4 + arg2 <= Static168.anInt3509 && Static142.anInt3103 <= arg0 - arg4 && arg0 + arg4 <= Static314.anInt6030) {
			Static122.method2569(arg5, arg3, arg0, arg1, arg4, arg2);
		} else {
			Static73.method1458(arg5, arg0, arg1, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Z")
	public static boolean method3460(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static54.anInt1423; local1 < Static41.anInt1075; local1++) {
			@Pc(6) Class49[][] local6 = Static229.aClass49ArrayArrayArray6[local1];
			for (@Pc(9) int local9 = -Static52.anInt1395; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static314.anInt6028 + local9;
				@Pc(18) int local18 = Static314.anInt6028 - local9;
				if (local14 >= Static350.anInt6599 || local18 < Static63.anInt5457) {
					for (@Pc(27) int local27 = -Static52.anInt1395; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static206.anInt4117 + local27;
						@Pc(36) int local36 = Static206.anInt4117 - local27;
						@Pc(48) Class49 local48;
						if (local14 >= Static350.anInt6599) {
							if (local32 >= Static220.anInt4388) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean117) {
									Static85.aBoolean151 = arg0;
									Static220.aClass11_1.method2937(local48);
									Static220.aClass11_1.method2942();
								}
							}
							if (local36 < Static35.anInt1035) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean117) {
									Static85.aBoolean151 = arg0;
									Static220.aClass11_1.method2937(local48);
									Static220.aClass11_1.method2942();
								}
							}
						}
						if (local18 < Static63.anInt5457) {
							if (local32 >= Static220.anInt4388) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean117) {
									Static85.aBoolean151 = arg0;
									Static220.aClass11_1.method2937(local48);
									Static220.aClass11_1.method2942();
								}
							}
							if (local36 < Static35.anInt1035) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean117) {
									Static85.aBoolean151 = arg0;
									Static220.aClass11_1.method2937(local48);
									Static220.aClass11_1.method2942();
								}
							}
						}
						if (Static109.anInt63 == 0) {
							if (Static281.aBoolean379) {
								Static220.aClass11_1.method2936(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public static void method3461() {
		Static85.anInt2209 = 0;
		Static69.anInt1716 = 0;
		Static100.method2029();
		Static344.method5560();
		Static301.method4878();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static69.anInt1716; local17++) {
			local23 = Static53.anIntArray207[local17];
			if (Static212.anInt4234 != Static69.aClass22_Sub2_Sub1_Sub2Array1[local23].anInt5096) {
				if (Static69.aClass22_Sub2_Sub1_Sub2Array1[local23].aClass174_1.method4440()) {
					Static62.method1296(Static69.aClass22_Sub2_Sub1_Sub2Array1[local23]);
				}
				Static69.aClass22_Sub2_Sub1_Sub2Array1[local23].method4426(null);
				Static69.aClass22_Sub2_Sub1_Sub2Array1[local23] = null;
			}
		}
		if (Static200.aClass7_Sub3_Sub2_3.anInt3005 != Static54.anInt1421) {
			throw new RuntimeException("gnp1 pos:" + Static200.aClass7_Sub3_Sub2_3.anInt3005 + " psize:" + Static54.anInt1421);
		}
		for (local23 = 0; local23 < Static11.anInt3203; local23++) {
			if (Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static11.anInt3203);
			}
		}
	}
}
