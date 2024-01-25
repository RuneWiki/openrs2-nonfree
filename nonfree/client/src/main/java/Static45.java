import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Lclient!tr;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "[Lclient!ff;")
	public static Class80[] aClass80Array1;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_20 = new Class57("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
	public static int anInt804 = 0;

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILclient!uj;Lclient!uj;)V")
	public static void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub3 arg3, @OriginalArg(4) Class28_Sub3 arg4) {
		@Pc(4) Class48 local4 = Static382.method5674(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass28_Sub3_1 = arg3;
			local4.aClass28_Sub3_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)Z")
	public static boolean method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface3 local9 = (Interface3) Static343.method5200(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static57.method1012(local9) & true;
		}
		local9 = (Interface3) Static30.method472(arg1, arg2, arg0, gg.class);
		if (local9 != null) {
			local11 &= Static57.method1012(local9);
		}
		local9 = (Interface3) Static277.method4347(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static57.method1012(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!km;)V")
	public static void method705(@OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(15) Class3_Sub10 local15 = (Class3_Sub10) Static185.aClass138_23.method3051(); local15 != null; local15 = (Class3_Sub10) Static185.aClass138_23.method3050()) {
			if (arg0 == local15.aClass28_Sub1_Sub1_Sub1_1) {
				if (local15.aClass3_Sub8_Sub1_2 != null) {
					Static137.aClass3_Sub8_Sub2_2.method1712(local15.aClass3_Sub8_Sub1_2);
					local15.aClass3_Sub8_Sub1_2 = null;
				}
				local15.method5700();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZB)V")
	public static void method706(@OriginalArg(0) boolean arg0) {
		Static302.method4685(arg0, Static199.anInt3567, Static207.anInt2251, Static68.anInt1346);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)I")
	public static int method707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static83.method1392(arg0 + 91923, 4, arg1 + 45365) + (Static83.method1392(arg0 + 37821, 2, arg1 - -10294) - 128 >> 1) + (Static83.method1392(arg0, 1, arg1) - 128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}
}
