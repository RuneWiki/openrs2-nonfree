import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!rc;")
	public static Class2_Sub2_Sub16 aClass2_Sub2_Sub16_3;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!nb;")
	public static Class15 aClass15_36;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
	public static int[] anIntArray429 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "Lclient!i;")
	private static Class41 aClass41_1089 = Static184.method2923("glow1:");

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_1083 = aClass41_1089;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_1084 = Static184.method2923("0(U");

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!i;")
	private static Class41 aClass41_1085 = Static184.method2923("Loaded input handler");

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_1086 = aClass41_1089;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!i;")
	private static Class41 aClass41_1087 = Static184.method2923("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_1088 = aClass41_1087;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!i;")
	public static Class41 aClass41_1090 = aClass41_1085;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!i;")
	public static Class41 aClass41_1091 = Static184.method2923("Okay");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!q;)V")
	public static void method2833(@OriginalArg(1) Class80 arg0) {
		if (Static96.anInt2368 == arg0.anInt3629) {
			Static199.aBooleanArray23[arg0.anInt3636] = true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!de;I)V")
	public static void method2835(@OriginalArg(0) Class2_Sub5 arg0) {
		Static120.method2033(arg0, 200000);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!q;IBI)V")
	public static void method2836(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte13 == 0) {
			arg0.anInt3671 = arg0.anInt3702;
		} else if (arg0.aByte13 == 1) {
			arg0.anInt3671 = arg0.anInt3702 + (arg2 - arg0.anInt3660) / 2;
		} else if (arg0.aByte13 == 2) {
			arg0.anInt3671 = arg2 - arg0.anInt3660 - arg0.anInt3702;
		} else if (arg0.aByte13 == 3) {
			arg0.anInt3671 = arg0.anInt3702 * arg2 >> 14;
		} else if (arg0.aByte13 == 4) {
			arg0.anInt3671 = (arg2 - arg0.anInt3660) / 2 + (arg0.anInt3702 * arg2 >> 14);
		} else {
			arg0.anInt3671 = arg2 - (arg0.anInt3702 * arg2 >> 14) - arg0.anInt3660;
		}
		if (arg0.aByte11 == 0) {
			arg0.anInt3627 = arg0.anInt3641;
		} else if (arg0.aByte11 == 1) {
			arg0.anInt3627 = (arg1 - arg0.anInt3635) / 2 + arg0.anInt3641;
		} else if (arg0.aByte11 == 2) {
			arg0.anInt3627 = arg1 - arg0.anInt3641 - arg0.anInt3635;
		} else if (arg0.aByte11 == 3) {
			arg0.anInt3627 = arg1 * arg0.anInt3641 >> 14;
		} else if (arg0.aByte11 == 4) {
			arg0.anInt3627 = (arg1 * arg0.anInt3641 >> 14) + (arg1 - arg0.anInt3635) / 2;
		} else {
			arg0.anInt3627 = arg1 - arg0.anInt3635 - (arg0.anInt3641 * arg1 >> 14);
		}
		if (!Static102.aBoolean133) {
			return;
		}
		if (Static70.method1287(arg0) == 0 && arg0.anInt3640 != 0) {
			return;
		}
		if (arg0.anInt3671 < 0) {
			arg0.anInt3671 = 0;
		} else if (arg2 < arg0.anInt3660 + arg0.anInt3671) {
			arg0.anInt3671 = arg2 - arg0.anInt3660;
		}
		if (arg0.anInt3627 < 0) {
			arg0.anInt3627 = 0;
			return;
		}
		if (arg0.anInt3627 + arg0.anInt3635 > arg1) {
			arg0.anInt3627 = arg1 - arg0.anInt3635;
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(JB)Lclient!i;")
	public static Class41 method2837(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(52) byte[] local52 = new byte[local27];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local27--;
				local52[local27] = Static49.aByteArray10[(int) (local56 - arg0 * 37L)];
			}
			@Pc(83) Class41 local83 = new Class41();
			local83.aByteArray26 = local52;
			local83.anInt2012 = local52.length;
			return local83;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([SI[Lclient!i;)V")
	public static void method2838(@OriginalArg(0) short[] arg0, @OriginalArg(2) Class41[] arg1) {
		Static137.method2188(0, arg1, arg1.length - 1, arg0);
	}
}
