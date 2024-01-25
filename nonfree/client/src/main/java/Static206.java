import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "Lclient!da;")
	public static Class27 aClass27_20;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "Lclient!oh;")
	public static Class237 aClass237_130;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!cf;III)V")
	public static void method7634(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg2 << 28 | arg0 << 14);
		@Pc(22) Class8_Sub26 local22 = (Class8_Sub26) Static567.aClass253_38.method6594(local16);
		if (local22 == null) {
			local22 = new Class8_Sub26();
			Static567.aClass253_38.method6591(local22, local16);
			local22.aClass43_25.method1424(arg1);
			return;
		}
		@Pc(47) Class284 local47 = Static497.aClass258_21.method6652(arg1.anInt2018);
		@Pc(55) int local55 = local47.anInt8515;
		if (local47.anInt8550 == 1) {
			local55 *= arg1.anInt2019 + 1;
		}
		for (@Pc(72) Class8_Sub11 local72 = (Class8_Sub11) local22.aClass43_25.method1422(); local72 != null; local72 = (Class8_Sub11) local22.aClass43_25.method1426()) {
			local47 = Static497.aClass258_21.method6652(local72.anInt2018);
			@Pc(83) int local83 = local47.anInt8515;
			if (local47.anInt8550 == 1) {
				local83 *= local72.anInt2019 + 1;
			}
			if (local83 < local55) {
				Static501.method7286(local72, arg1);
				return;
			}
		}
		local22.aClass43_25.method1424(arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZIII)I")
	public static int method7638(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class8_Sub18 local10 = Static211.method4038(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local10.anIntArray154.length; local30++) {
				if (arg2 == local10.anIntArray153[local30]) {
					local28 += local10.anIntArray154[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!bda;B)I")
	public static int method7639(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0) {
		if (arg0.anInt8097 == 0) {
			return 0;
		}
		@Pc(72) int local72;
		@Pc(65) int local65;
		if (arg0.anInt8108 != -1) {
			@Pc(25) Class15_Sub1_Sub2_Sub2 local25 = null;
			if (arg0.anInt8108 < 32768) {
				@Pc(37) Class8_Sub50 local37 = (Class8_Sub50) Static278.aClass253_20.method6594((long) arg0.anInt8108);
				if (local37 != null) {
					local25 = local37.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				}
			} else if (arg0.anInt8108 >= 32768) {
				local25 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[arg0.anInt8108 - 32768];
			}
			if (local25 != null) {
				local65 = arg0.anInt10301 - local25.anInt10301;
				local72 = arg0.anInt10298 - local25.anInt10298;
				if (local65 != 0 || local72 != 0) {
					arg0.method6700((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class15_Sub1_Sub2_Sub2_Sub1) {
			@Pc(98) Class15_Sub1_Sub2_Sub2_Sub1 local98 = (Class15_Sub1_Sub2_Sub2_Sub1) arg0;
			if (local98.anInt3316 != -1 && (local98.anInt8137 == 0 || local98.anInt8138 > 0)) {
				local98.method6700(local98.anInt3316);
				local98.anInt3316 = -1;
			}
		} else if (arg0 instanceof Class15_Sub1_Sub2_Sub2_Sub2) {
			@Pc(130) Class15_Sub1_Sub2_Sub2_Sub2 local130 = (Class15_Sub1_Sub2_Sub2_Sub2) arg0;
			if (local130.anInt8155 != -1 && (local130.anInt8137 == 0 || local130.anInt8138 > 0)) {
				local65 = local130.anInt10301 - (local130.anInt8155 - Static628.anInt10493 - Static628.anInt10493) * 256;
				local72 = local130.anInt10298 - (local130.anInt8153 - Static594.anInt10160 - Static594.anInt10160) * 256;
				if (local65 != 0 || local72 != 0) {
					local130.method6700((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
				local130.anInt8155 = -1;
			}
		}
		return arg0.method6694();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)Z")
	public static boolean method7640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static46.method1368(arg1, arg0) | (arg0 & 0x40000) != 0 || Static376.method5847(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	public static void method7641() {
		Static566.aClass369_6.method8411();
		Static627.aClass107_5.method3244();
		Static314.aClass79_1.method2532();
		Static437.aClass199_3.method5350();
		Static297.aClass338_1.method7856();
		Static497.aClass258_21.method6648();
		Static28.aClass220_1.method5672();
		Static202.aClass333_2.method7821();
		Static418.aClass293_1.method7161();
		Static198.aClass161_1.method4579();
		Static472.aClass202_4.method5414();
		Static612.aClass12_4.method134();
		Static76.aClass67_1.method2162();
		Static144.aClass274_1.method6931();
		Static216.aClass356_1.method8255();
		Static527.aClass321_1.method7504();
		Static274.aClass270_1.method6822();
		Static543.aClass364_1.method8371();
		Static454.aClass166_2.method4637();
		Static6.aClass233_1.method6156();
		Static74.method1950();
		Static369.method5757();
		Static70.method1798();
		Static181.method3460();
		Static154.method1386();
		Static439.aClass236_76.method6243(5);
		Static135.aClass236_25.method6243(5);
		Static231.aClass236_41.method6243(5);
		Static468.aClass236_107.method6243(5);
		Static273.aClass236_52.method6243(5);
	}
}
