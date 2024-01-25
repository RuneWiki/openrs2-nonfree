import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!au", name = "b", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "Lclient!wm;")
	public static Class361 aClass361_1;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIB)I")
	public static int method243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 << 13 ^ local15;
		@Pc(35) int local35 = Integer.MAX_VALUE & local21 * (local21 * local21 * 15731 + 789221) + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
	public static void method244() {
		Static98.aClass171_1.method4160();
		Static436.aClass71_4.method2106();
		Static324.aClass356_1.method7914();
		Static536.aClass146_4.method3719();
		Static181.aClass60_1.method1796();
		Static272.aClass121_2.method3326();
		Static245.aClass155_1.method3822();
		Static386.aClass23_1.method225();
		Static333.aClass177_1.method4307();
		Static406.aClass144_1.method3701();
		Static98.aClass313_1.method6867();
		Static550.aClass189_3.method4644();
		Static493.aClass296_4.method6520();
		Static106.aClass27_1.method488();
		Static428.aClass124_1.method3404();
		Static345.aClass103_1.method2775();
		Static240.aClass13_1.method119();
		Static517.aClass261_1.method5829();
		Static198.aClass210_2.method4931();
		Static326.aClass7_1.method64();
		Static370.method5108();
		Static230.method3740();
		Static42.method1090();
		Static300.method4553();
		Static129.method2402();
		Static312.aClass342_121.method7697(5);
		Static426.aClass342_146.method7697(5);
		Static187.aClass342_75.method7697(5);
		Static476.aClass342_168.method7697(5);
		Static583.aClass342_199.method7697(5);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public static void method245() {
		for (@Pc(3) int local3 = 0; local3 < Static363.aClass263ArrayArray5.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static363.aClass263ArrayArray5[local3].length; local7++) {
				Static363.aClass263ArrayArray5[local3][local7] = Static384.aClass263_2;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!ol;I)V")
	public static void method247(@OriginalArg(0) Class25_Sub2_Sub2_Sub5 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt8493 == Static397.anInt6998 || arg0.anInt8545 == -1 || arg0.anInt8492 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class270 local26 = Static245.aClass155_1.method3820(arg0.anInt8545);
			if (local26.aBoolean534 || local26.anIntArray445[arg0.anInt8539] < arg0.anInt8521 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(58) int local58 = arg0.anInt8493 - arg0.anInt8533;
			@Pc(64) int local64 = Static397.anInt6998 - arg0.anInt8533;
			@Pc(75) int local75 = arg0.anInt8553 * 512 + arg0.method6668() * 256;
			@Pc(86) int local86 = arg0.anInt8546 * 512 + arg0.method6668() * 256;
			@Pc(97) int local97 = arg0.anInt8556 * 512 + arg0.method6668() * 256;
			@Pc(108) int local108 = arg0.anInt8532 * 512 + arg0.method6668() * 256;
			arg0.anInt8476 = ((local58 - local64) * local75 + local97 * local64) / local58;
			arg0.anInt8482 = (local64 * local108 + local86 * (local58 - local64)) / local58;
		}
		arg0.anInt8579 = 0;
		if (arg0.anInt8514 == 0) {
			arg0.method6672(false, 8192);
		}
		if (arg0.anInt8514 == 1) {
			arg0.method6672(false, 12288);
		}
		if (arg0.anInt8514 == 2) {
			arg0.method6672(false, 0);
		}
		if (arg0.anInt8514 == 3) {
			arg0.method6672(false, 4096);
		}
	}
}
