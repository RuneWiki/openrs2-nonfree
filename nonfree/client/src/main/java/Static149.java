import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public static int anInt3853;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	public static int anInt3855;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt3852 = 0;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1047 = Static158.method3034("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1046 = aClass60_1047;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array21 = new Class60[100];

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_56 = new Class89(50);

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1048 = Static158.method3034("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1049 = Static158.method3034("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)I")
	public static int method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg5;
			arg5 = arg4;
			arg4 = local6;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg0;
		} else if (local18 == 1) {
			return arg2;
		} else if (local18 == 2) {
			return 1 + 7 - arg5 - arg0;
		} else {
			return 1 + 7 - arg4 - arg2;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
	public static void method2962() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static98.anInt2864; local1++) {
			for (local4 = 0; local4 < Static146.anInt3815; local4++) {
				for (local7 = 0; local7 < Static193.anInt4611; local7++) {
					Static118.aClass2_Sub17ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static143.anInt3751; local4++) {
			for (local7 = 0; local7 < Static143.anIntArray416[local4]; local7++) {
				Static143.aClass38ArrayArray1[local4][local7] = null;
			}
			Static143.anIntArray416[local4] = 0;
		}
		for (local7 = 0; local7 < Static17.anInt552; local7++) {
			Static102.aClass6Array1[local7] = null;
		}
		Static17.anInt552 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static141.aClass6Array3.length; local69++) {
			Static141.aClass6Array3[local69] = null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)Lclient!ob;")
	public static Class60 method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - arg1;
		if (local12 < -9) {
			return Static166.aClass60_1128;
		} else if (local12 < -6) {
			return Static103.aClass60_841;
		} else if (local12 < -3) {
			return Static114.aClass60_894;
		} else if (local12 < 0) {
			return Static111.aClass60_875;
		} else if (local12 > 9) {
			return Static176.aClass60_1184;
		} else if (local12 > 6) {
			return Static15.aClass60_118;
		} else if (local12 > 3) {
			return Static26.aClass60_190;
		} else if (local12 > 0) {
			return Static87.aClass60_701;
		} else {
			return Static19.aClass60_863;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!aa;III)V")
	public static void method2964(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub17 local12;
		if (arg2 < Static146.anInt3815) {
			local12 = Static118.aClass2_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass52_1 != null && local12.aClass52_1.aClass2_Sub1_Sub1_7.method3178()) {
				arg0.method3176(local12.aClass52_1.aClass2_Sub1_Sub1_7, 128, 0, 0, true);
			}
		}
		if (arg3 < Static146.anInt3815) {
			local12 = Static118.aClass2_Sub17ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass52_1 != null && local12.aClass52_1.aClass2_Sub1_Sub1_7.method3178()) {
				arg0.method3176(local12.aClass52_1.aClass2_Sub1_Sub1_7, 0, 0, 128, true);
			}
		}
		if (arg2 < Static146.anInt3815 && arg3 < Static193.anInt4611) {
			local12 = Static118.aClass2_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass52_1 != null && local12.aClass52_1.aClass2_Sub1_Sub1_7.method3178()) {
				arg0.method3176(local12.aClass52_1.aClass2_Sub1_Sub1_7, 128, 0, 128, true);
			}
		}
		if (arg2 < Static146.anInt3815 && arg3 > 0) {
			local12 = Static118.aClass2_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass52_1 != null && local12.aClass52_1.aClass2_Sub1_Sub1_7.method3178()) {
				arg0.method3176(local12.aClass52_1.aClass2_Sub1_Sub1_7, 128, 0, -128, true);
			}
		}
	}
}
