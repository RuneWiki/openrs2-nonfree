import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
	public static final int[] anIntArray428 = new int[500];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method4296() {
		Static250.aClass137_45.method2739();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIZI)V")
	public static void method4297(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg3 == Static34.anInt2146 && arg2 == Static361.anInt627 && (Static163.anInt3008 == Static68.anInt1387 || Static413.aClass49_Sub1_1.method2485(Static341.anInt5549))) {
			return;
		}
		Static34.anInt2146 = arg3;
		Static163.anInt3008 = Static68.anInt1387;
		Static361.anInt627 = arg2;
		if (Static413.aClass49_Sub1_1.method2485(Static341.anInt5549)) {
			Static163.anInt3008 = 0;
		}
		Static119.method4569(arg0);
		Static94.method4424(Static283.aClass123_6, Static243.aClass15_65.method180(Static429.anInt6999), true);
		@Pc(56) int local56 = Static365.anInt6047;
		Static365.anInt6047 = (Static34.anInt2146 - (Static337.anInt5497 >> 4)) * 8;
		@Pc(67) int local67 = Static366.anInt6052;
		Static366.anInt6052 = (Static361.anInt627 - (Static282.anInt4644 >> 4)) * 8;
		Static290.aClass4_Sub2_Sub11_1 = Static292.method4933(Static34.anInt2146 * 8, Static361.anInt627 * 8);
		Static337.aClass11_2 = null;
		@Pc(91) int local91 = Static365.anInt6047 - local56;
		@Pc(95) int local95 = Static366.anInt6052 - local67;
		@Pc(100) int local100;
		@Pc(110) int local110;
		if (arg0 == 10) {
			for (local100 = 0; local100 < 32768; local100++) {
				@Pc(106) Class8_Sub3_Sub1_Sub2 local106 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local100];
				if (local106 != null) {
					for (local110 = 0; local110 < 10; local110++) {
						local106.anIntArray560[local110] -= local91;
						local106.anIntArray559[local110] -= local95;
					}
					local106.anInt7343 -= local95 * 128;
					local106.anInt7339 -= local91 * 128;
				}
			}
		} else {
			Static148.anInt2692 = 0;
			local100 = (Static337.anInt5497 - 1) * 128;
			@Pc(170) int local170 = Static282.anInt4644 * 128 - 128;
			for (local110 = 0; local110 < 32768; local110++) {
				@Pc(178) Class8_Sub3_Sub1_Sub2 local178 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local110];
				if (local178 != null) {
					local178.anInt7343 -= local95 * 128;
					local178.anInt7339 -= local91 * 128;
					if (local178.anInt7339 >= 0 && local100 >= local178.anInt7339 && local178.anInt7343 >= 0 && local170 >= local178.anInt7343) {
						@Pc(223) boolean local223 = true;
						for (@Pc(225) int local225 = 0; local225 < 10; local225++) {
							local178.anIntArray560[local225] -= local91;
							local178.anIntArray559[local225] -= local95;
							if (local178.anIntArray560[local225] < 0 || local178.anIntArray560[local225] >= Static337.anInt5497 || local178.anIntArray559[local225] < 0 || Static282.anInt4644 <= local178.anIntArray559[local225]) {
								local223 = false;
							}
						}
						if (local223) {
							Static106.anIntArray150[Static148.anInt2692++] = local110;
						} else {
							Static367.aClass8_Sub3_Sub1_Sub2Array1[local110].method5907(null);
							Static367.aClass8_Sub3_Sub1_Sub2Array1[local110] = null;
						}
					} else {
						Static367.aClass8_Sub3_Sub1_Sub2Array1[local110].method5907(null);
						Static367.aClass8_Sub3_Sub1_Sub2Array1[local110] = null;
					}
				}
			}
		}
		for (local100 = 0; local100 < 2048; local100++) {
			@Pc(331) Class8_Sub3_Sub1_Sub1 local331 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local100];
			if (local331 != null) {
				for (local110 = 0; local110 < 10; local110++) {
					local331.anIntArray560[local110] -= local91;
					local331.anIntArray559[local110] -= local95;
				}
				local331.anInt7343 -= local95 * 128;
				local331.anInt7339 -= local91 * 128;
			}
		}
		@Pc(381) Class133[] local381 = Static62.aClass133Array1;
		for (local110 = 0; local110 < local381.length; local110++) {
			@Pc(389) Class133 local389 = local381[local110];
			if (local389 != null) {
				local389.anInt3344 -= local91 * 128;
				local389.anInt3340 -= local95 * 128;
			}
		}
		Static145.method2043(local91, local95);
		for (@Pc(421) Class4_Sub18 local421 = (Class4_Sub18) Static342.aClass244_34.method5263(); local421 != null; local421 = (Class4_Sub18) Static342.aClass244_34.method5271()) {
			local421.anInt3031 -= local95;
			local421.anInt3037 -= local91;
			if (Static267.anInt4402 != 3 && (local421.anInt3037 < 0 || local421.anInt3031 < 0 || local421.anInt3037 >= Static337.anInt5497 || Static282.anInt4644 <= local421.anInt3031)) {
				local421.method6059();
			}
		}
		if (Static363.anInt5531 != 0) {
			Static25.anInt375 -= local95;
			Static363.anInt5531 -= local91;
		}
		Static168.method1844();
		if (arg0 != 10) {
			Static131.anInt2368 -= local95;
			Static64.anInt1159 -= local91;
			Static392.anInt6418 -= local91;
			Static393.anInt7135 -= local95 * 128;
			Static235.anInt4004 -= local91 * 128;
			Static288.anInt4738 -= local95;
			if (Math.abs(local91) > Static337.anInt5497 || Math.abs(local95) > Static282.anInt4644) {
				Static458.method5376();
			}
		} else if (Static97.anInt1791 == 4) {
			Static190.anInt3490 -= local91 * 128;
			Static371.anInt5975 -= local91 * 128;
			Static212.anInt3693 -= local95 * 128;
			Static196.anInt3536 -= local95 * 128;
		} else {
			Static97.anInt1791 = 1;
		}
		Static148.method2080();
		Static351.method4657();
		Static295.aClass244_25.method5264();
		Static251.aClass244_19.method5264();
		Static436.aClass248_8.method5581();
		Static52.method681();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIFILclient!hs;FFFIF)[B")
	public static byte[] method4299(@OriginalArg(3) float arg0, @OriginalArg(5) Class92 arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static290.method3783(arg1, arg0, arg3, arg5, 0, arg2, arg4, local15);
		return local15;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!rh;")
	public static Class218 method4300(@OriginalArg(1) int arg0) {
		@Pc(18) Class218 local18 = (Class218) Static66.aClass137_10.method2744((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static408.aClass211_91.method4377(1, arg0);
		local18 = new Class218();
		local18.anInt5721 = arg0;
		if (local28 != null) {
			local18.method4585(new Class4_Sub9(local28));
		}
		local18.method4582();
		if (local18.anInt5714 == 2 && Static247.aClass67_24.method1429((long) arg0) == null) {
			Static247.aClass67_24.method1426(new Class4_Sub24(Static438.anInt2800), (long) arg0);
			Static346.aClass218Array1[Static438.anInt2800++] = local18;
		}
		Static66.aClass137_10.method2732((long) arg0, local18);
		return local18;
	}
}
