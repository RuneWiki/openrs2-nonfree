import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "Lclient!la;")
	public static Class207 aClass207_33;

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BZILclient!raa;I)V")
	public static void method2213(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class295 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt7957;
		if (arg2.aByte117 == 0) {
			arg2.anInt7957 = arg2.anInt7973;
		} else if (arg2.aByte117 == 1) {
			arg2.anInt7957 = arg1 - arg2.anInt7973;
		} else if (arg2.aByte117 == 2) {
			arg2.anInt7957 = arg1 * arg2.anInt7973 >> 14;
		}
		@Pc(55) int local55 = arg2.anInt7985;
		if (arg2.aByte118 == 0) {
			arg2.anInt7985 = arg2.anInt7998;
		} else if (arg2.aByte118 == 1) {
			arg2.anInt7985 = arg3 - arg2.anInt7998;
		} else if (arg2.aByte118 == 2) {
			arg2.anInt7985 = arg2.anInt7998 * arg3 >> 14;
		}
		if (arg2.aByte117 == 4) {
			arg2.anInt7957 = arg2.anInt7985 * arg2.anInt7956 / arg2.anInt7947;
		}
		if (arg2.aByte118 == 4) {
			arg2.anInt7985 = arg2.anInt7947 * arg2.anInt7957 / arg2.anInt7956;
		}
		if (Static132.aBoolean513 && (Static75.method1286(arg2).anInt7590 != 0 || arg2.anInt8001 == 0)) {
			if (arg2.anInt7985 < 5 && arg2.anInt7957 < 5) {
				arg2.anInt7957 = 5;
				arg2.anInt7985 = 5;
			} else {
				if (arg2.anInt7985 <= 0) {
					arg2.anInt7985 = 5;
				}
				if (arg2.anInt7957 <= 0) {
					arg2.anInt7957 = 5;
				}
			}
		}
		if (arg2.anInt7960 == Static27.anInt354) {
			Static477.aClass295_16 = arg2;
		}
		if (arg0 && arg2.anObjectArray28 != null && (arg2.anInt7957 != local8 || arg2.anInt7985 != local55)) {
			@Pc(190) Class5_Sub51 local190 = new Class5_Sub51();
			local190.anObjectArray33 = arg2.anObjectArray28;
			local190.aClass295_19 = arg2;
			Static354.aClass330_10.method7917(local190);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILjava/lang/String;ZBZIIIJZLjava/lang/String;IJ)V")
	public static void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) long arg11) {
		if (!Static142.aBoolean190 && Static491.anInt8293 < 500) {
			@Pc(24) int local24 = arg4 == -1 ? Static578.anInt4589 : arg4;
			@Pc(40) Class5_Sub5_Sub15 local40 = new Class5_Sub5_Sub15(arg9, arg1, local24, arg10, arg6, arg11, arg5, arg0, arg2, arg8, arg7, arg3);
			Static219.method3770(local40);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BC)Z")
	public static boolean method2215(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BIIII)V")
	public static void method2216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static275.anInt4919 <= arg0 && Static529.anInt9089 >= arg0) {
			@Pc(22) int local22 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg2);
			@Pc(28) int local28 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg1);
			Static2.method20(arg0, local22, arg3, local28);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILclient!la;I)Lclient!caa;")
	public static Class5_Sub10 method2217(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1) {
		@Pc(8) byte[] local8 = arg1.method4690(arg0);
		return local8 == null ? null : new Class5_Sub10(local8);
	}
}
