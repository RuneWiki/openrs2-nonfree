import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V")
	public static void method3569(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static307.anInt5578 != -1) {
				Static569.method7560(Static307.anInt5578);
			}
			for (@Pc(14) Class3_Sub28 local14 = (Class3_Sub28) Static227.aClass310_15.method6602(); local14 != null; local14 = (Class3_Sub28) Static227.aClass310_15.method6599()) {
				if (!local14.method7813()) {
					local14 = (Class3_Sub28) Static227.aClass310_15.method6602();
					if (local14 == null) {
						break;
					}
				}
				Static423.method6029(false, true, local14);
			}
			Static307.anInt5578 = -1;
			Static227.aClass310_15 = new Class310(8);
			Static403.method5866();
			Static307.anInt5578 = Static576.anInt9188;
			Static517.method6895(false);
			Static121.method2508();
			Static149.method2776(Static307.anInt5578);
		}
		Static594.aString129 = "";
		Static412.aString100 = "";
		Static451.aBoolean584 = false;
		Static348.method5280();
		Static212.anInt4226 = -1;
		Static144.method2733(Static215.anInt4261);
		Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 = new Class9_Sub1_Sub1_Sub2_Sub2();
		Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] = Static400.anInt6818 / 2;
		Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 = Static271.anInt5050 * 512 / 2;
		Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 = Static400.anInt6818 * 512 / 2;
		Static233.anInt4431 = 0;
		Static421.anInt7061 = 0;
		Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] = Static271.anInt5050 / 2;
		if (Static446.anInt7363 == 2) {
			Static233.anInt4431 = Static41.anInt966 << 9;
			Static421.anInt7061 = Static12.anInt137 << 9;
		} else {
			Static546.method7319();
		}
		Static578.method7669();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)Z")
	public static boolean method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static90.method2035(arg1, arg0) | (arg0 & 0x60000) != 0 || Static350.method6850(arg1, arg0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;Lclient!om;ZB)Lclient!ik;")
	public static Class149 method3571(@OriginalArg(0) String arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(15) int local15 = arg1.method5665(arg0);
		if (local15 == -1) {
			return new Class149(0);
		}
		@Pc(31) int[] local31 = arg1.method5668(local15);
		@Pc(37) Class149 local37 = new Class149(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local37.anInt4386 > local39) {
				@Pc(55) Class3_Sub11 local55 = new Class3_Sub11(arg1.method5653(local15, local31[local41++]));
				@Pc(59) int local59 = local55.method3116();
				@Pc(63) int local63 = local55.method3109();
				@Pc(67) int local67 = local55.method3118();
				if (!arg2 && local67 == 1) {
					local37.anInt4386--;
				} else {
					local37.anIntArray352[local39] = local59;
					local37.anIntArray351[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILclient!tea;)V")
	public static void method3572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub1_Sub3 arg3) {
		@Pc(4) Class63 local4 = Static343.method5228(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub1_Sub3_1 = arg3;
		@Pc(16) int local16 = Static29.aClass139Array6 == Static168.aClass139Array22 ? 1 : 0;
		if (arg3.method7481()) {
			if (arg3.method7473()) {
				Static239.aClass9_Sub1ArrayArray2[local16][Static343.anIntArray471[local16]++] = arg3;
				return;
			}
			Static499.aClass9_Sub1ArrayArray3[local16][Static332.anIntArray459[local16]++] = arg3;
			return;
		}
		Static225.aClass9_Sub1ArrayArray1[local16][Static1.anIntArray1[local16]++] = arg3;
	}
}
