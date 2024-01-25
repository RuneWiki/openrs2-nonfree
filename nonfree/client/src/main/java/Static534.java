import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
	public static int method7447() {
		return Static296.anInt4685;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZIZLjava/lang/String;)V")
	public static void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		Static612.method8028(arg1, arg2, false, arg3, (String) null, arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[III[IIII[FBI[FI)V")
	public static void method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg7 + arg11 * arg2;
		@Pc(17) int local17 = arg3 * arg9 + arg0;
		@Pc(22) int local22 = arg2 - arg5;
		@Pc(27) int local27 = arg9 - arg5;
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (arg4 == null) {
			for (local31 = 0; local31 < arg6; local31++) {
				local37 = arg5 + local11;
				while (local37 > local11) {
					arg8[local17++] = arg10[local11++];
				}
				local11 += local22;
				local17 += local27;
			}
		} else if (arg10 == null) {
			for (local31 = 0; local31 < arg6; local31++) {
				local37 = arg5 + local11;
				while (local37 > local11) {
					arg1[local17++] = arg4[local11++];
				}
				local11 += local22;
				local17 += local27;
			}
		} else {
			for (local31 = 0; local31 < arg6; local31++) {
				local37 = local11 + arg5;
				while (local11 < local37) {
					arg1[local17] = arg4[local11];
					arg8[local17++] = arg10[local11++];
				}
				local11 += local22;
				local17 += local27;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZJI)V")
	public static void method7458(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static254.method3686(true, local10, arg0, local17, 0, 0, arg2, 0);
			return;
		}
		@Pc(60) Class342 local60 = Static441.aClass74_169.method2075(local24);
		@Pc(71) int local71;
		@Pc(74) int local74;
		if (local17 == 0 || local17 == 2) {
			local71 = local60.anInt8716;
			local74 = local60.anInt8728;
		} else {
			local71 = local60.anInt8728;
			local74 = local60.anInt8716;
		}
		@Pc(85) int local85 = local60.anInt8733;
		if (local17 != 0) {
			local85 = (local85 << local17 & 0xF) + (local85 >> 4 - local17);
		}
		Static254.method3686(true, 0, arg0, 0, local74, local85, arg2, local71);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method7460() {
		@Pc(7) String local7 = "www";
		if (Static596.aClass60_11 == Static181.aClass60_3) {
			local7 = "www-wtrc";
		} else if (Static342.aClass60_10 == Static181.aClass60_3) {
			local7 = "www-wtqa";
		} else if (Static495.aClass60_8 == Static181.aClass60_3) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static264.aString40 != null) {
			local33 = "/p=" + Static264.aString40;
		}
		return "http://" + local7 + "." + Static333.aClass234_5.aString72 + ".com/l=" + Static164.anInt2984 + "/a=" + Static461.anInt7416 + local33 + "/";
	}
}
