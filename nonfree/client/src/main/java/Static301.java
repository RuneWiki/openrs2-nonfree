import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public static int anInt5645 = 0;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)I")
	public static int method4354() {
		return Static270.anInt5249;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLclient!ec;)V")
	public static void method4358(@OriginalArg(1) Class68 arg0) {
		if (!Static293.aBoolean300) {
			return;
		}
		if (arg0.anObjectArray9 != null) {
			@Pc(14) Class68 local14 = Static115.method1866(Static132.anInt2941, Static118.anInt2743);
			if (local14 != null) {
				@Pc(20) Class1_Sub10 local20 = new Class1_Sub10();
				local20.aClass68_3 = arg0;
				local20.aClass68_2 = local14;
				local20.anObjectArray2 = arg0.anObjectArray9;
				Static178.method3000(local20);
			}
		}
		Static32.method677(Static384.aClass177_99);
		Static433.aClass1_Sub3_Sub1_11.method1197(arg0.anInt2135);
		Static433.aClass1_Sub3_Sub1_11.method1227(Static118.anInt2743);
		Static433.aClass1_Sub3_Sub1_11.method1205(arg0.anInt2136);
		Static433.aClass1_Sub3_Sub1_11.method1184(Static189.anInt3984);
		Static433.aClass1_Sub3_Sub1_11.method1223(arg0.anInt2188);
		Static433.aClass1_Sub3_Sub1_11.method1167(Static132.anInt2941);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public static void method4359() {
		@Pc(9) int[] local9 = new int[Static43.aClass57_1.anInt1929];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static43.aClass57_1.anInt1929; local13++) {
			@Pc(20) Class168 local20 = Static43.aClass57_1.method1414(local13);
			if (local20.anInt4851 >= 0 || local20.anInt4823 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static353.anIntArray704 = new int[local11];
		for (@Pc(48) int local48 = 0; local48 < local11; local48++) {
			Static353.anIntArray704[local48] = local9[local48];
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II[BIIII)Z")
	public static boolean method4360(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg1 % 8;
		@Pc(18) int local18;
		if (local14 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local14;
		}
		@Pc(34) int local34 = -((arg4 + 8 - 1) / 8);
		@Pc(44) int local44 = -((arg1 + 8 - 1) / 8);
		for (@Pc(46) int local46 = local34; local46 < 0; local46++) {
			for (@Pc(50) int local50 = local44; local50 < 0; local50++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local18;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	public static void method4362() {
		Static37.aClass211_13.anInt6207 = 1;
		Static31.method1536();
		Static174.aBoolean238 = true;
		Static266.aBoolean321 = true;
		Static415.method5633();
		for (@Pc(5616) int local5616 = 0; local5616 < Static393.aClass178Array1.length; local5616++) {
			Static393.aClass178Array1[local5616] = null;
		}
		Static293.aBoolean300 = false;
		Static2.method40();
		Static436.anInt7703 = (int) (Math.random() * 100.0D) - 50;
		Static267.aFloat83 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static135.anInt3022 = (int) (Math.random() * 30.0D) - 20;
		Static217.anInt4366 = (int) (Math.random() * 120.0D) - 60;
		Static167.anInt5709 = (int) (Math.random() * 80.0D) - 40;
		Static383.anInt6965 = (int) (Math.random() * 110.0D) - 55;
		Static243.method3641();
		for (@Pc(5683) int local5683 = 0; local5683 < 2048; local5683++) {
			Static135.aClass30_Sub1_Sub1_Sub2Array1[local5683] = null;
		}
		Static127.anInt2832 = 0;
		Static197.anInt4078 = 0;
		Static24.aClass38_3.method774();
		Static398.aClass203_46.method4553();
		Static184.aClass203_32.method4553();
		Static367.aClass117_8.method2960();
		Static156.aClass38_16.method774();
		Static239.aClass203_37 = new Class203();
		Static366.aClass190_1.method4307();
		Static129.method2127();
		Static64.anInt1733 = 0;
		Static195.anInt4072 = 0;
		Static325.anInt6023 = 0;
		Static181.anInt3929 = 0;
		Static342.anInt6261 = 0;
		Static363.anInt6666 = 0;
		Static83.anInt2025 = 0;
		Static41.anInt1051 = 0;
		Static259.anInt5010 = 0;
		Static272.anInt5269 = 0;
		for (@Pc(5744) int local5744 = 0; local5744 < Static31.anIntArray221.length; local5744++) {
			if (!Static398.aBooleanArray23[local5744]) {
				Static31.anIntArray221[local5744] = -1;
			}
		}
		if (Static456.anInt1594 != -1) {
			Static222.method3439(Static456.anInt1594);
		}
		for (@Pc(5769) Class1_Sub39 local5769 = (Class1_Sub39) Static177.aClass38_18.method767(); local5769 != null; local5769 = (Class1_Sub39) Static177.aClass38_18.method773()) {
			if (!local5769.method6175()) {
				local5769 = (Class1_Sub39) Static177.aClass38_18.method767();
				if (local5769 == null) {
					break;
				}
			}
			Static285.method4176(local5769, false, true);
		}
		Static456.anInt1594 = -1;
		Static177.aClass38_18 = new Class38(8);
		Static54.method1005();
		Static18.aClass68_1 = null;
		for (@Pc(5809) int local5809 = 0; local5809 < 8; local5809++) {
			Static264.aStringArray35[local5809] = null;
			Static155.aBooleanArray15[local5809] = false;
			Static359.anIntArray613[local5809] = -1;
		}
		Static82.method1506();
		Static31.aBoolean129 = true;
		for (@Pc(5834) int local5834 = 0; local5834 < 100; local5834++) {
			Static58.aBooleanArray8[local5834] = true;
		}
		for (@Pc(5845) int local5845 = 0; local5845 < 6; local5845++) {
			Static450.aClass67Array1[local5845] = new Class67();
		}
		for (@Pc(5858) int local5858 = 0; local5858 < 25; local5858++) {
			Static365.anIntArray617[local5858] = 0;
			Static240.anIntArray442[local5858] = 0;
			Static2.anIntArray5[local5858] = 0;
		}
		Static448.method6102();
		Static450.aBoolean515 = true;
		Static430.aShortArray133 = Static325.aShortArray111 = Static358.aShortArray121 = Static383.aShortArray128 = new short[256];
		Static219.aString36 = Static130.aClass158_76.method3594(Static365.anInt6682);
		Static20.anInt524 = 0;
		Static12.aClass34_Sub1_1.aBoolean460 = false;
		Static12.aClass34_Sub1_1.aBoolean461 = false;
		Static259.method3826();
		Static318.method4541();
		Static2.aClass1_Sub15_1 = null;
		Static37.aClass211_13.anInt6207 = 2;
		Static208.aLong126 = 0L;
	}
}
