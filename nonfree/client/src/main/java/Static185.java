import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	public static int anInt3322 = 0;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method2691(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static168.anInt3026 = 7;
		Static363.anInt5820 = 0x1 << Static168.anInt3026;
		Static297.anInt4923 = Static363.anInt5820 >> 1;
		Static225.anInt4946 = (int) Math.sqrt((double) (Static297.anInt4923 * Static297.anInt4923 + Static297.anInt4923 * Static297.anInt4923));
		Static322.anInt5338 = Static363.anInt5820 >> 2;
		Static35.anInt4762 = Static363.anInt5820;
		Static264.anInt4480 = arg0;
		Static295.anInt4910 = arg1;
		Static133.anInt2523 = arg2;
		Static150.aClass223ArrayArrayArray3 = new Class223[4][Static264.anInt4480][Static295.anInt4910];
		Static149.aClass165Array7 = new Class165[4];
		if (arg3) {
			Static268.anIntArrayArray39 = new int[Static264.anInt4480][Static295.anInt4910];
			Static46.aByteArrayArray3 = new byte[Static264.anInt4480][Static295.anInt4910];
			Static373.aShortArrayArray6 = new short[Static264.anInt4480][Static295.anInt4910];
			Static142.aClass223ArrayArrayArray2 = new Class223[1][Static264.anInt4480][Static295.anInt4910];
			Static28.aClass165Array1 = new Class165[1];
		} else {
			Static268.anIntArrayArray39 = null;
			Static46.aByteArrayArray3 = null;
			Static373.aShortArrayArray6 = null;
			Static142.aClass223ArrayArrayArray2 = null;
			Static28.aClass165Array1 = null;
		}
		if (arg4) {
			Static194.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static302.aClass74Array1 = new Class74[65535];
			Static128.aBooleanArray9 = new boolean[65535];
			Static270.anInt4582 = 0;
		} else {
			Static194.aLongArrayArrayArray1 = null;
			Static302.aClass74Array1 = null;
			Static128.aBooleanArray9 = null;
			Static270.anInt4582 = 0;
		}
		Static22.method3909(false);
		Static124.aClass260Array1 = new Class260[1000];
		Static36.anInt641 = 0;
		Static215.aClass260Array2 = new Class260[1000];
		Static29.anInt455 = 0;
		Static440.anIntArrayArrayArray14 = new int[4][Static264.anInt4480 + 1][Static295.anInt4910 + 1];
		Static49.aClass26_Sub2Array1 = new Class26_Sub2[5000];
		Static135.anInt5022 = 0;
		Static262.aBooleanArrayArray20 = new boolean[Static133.anInt2523 + Static133.anInt2523 + 1][Static133.anInt2523 + Static133.anInt2523 + 1];
		Static454.aBooleanArrayArray22 = new boolean[Static133.anInt2523 + Static133.anInt2523 + 2][Static133.anInt2523 + Static133.anInt2523 + 2];
		Static223.aClass92_1 = null;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IBI)I")
	public static int method2693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static112.method1920(arg1 - 1, arg0 + -1) + Static112.method1920(arg1 + 1, arg0 + -1) + Static112.method1920(arg1 - 1, arg0 + 1) + Static112.method1920(arg1 + 1, arg0 + 1);
		@Pc(78) int local78 = Static112.method1920(arg1 - 1, arg0) + Static112.method1920(arg1 + 1, arg0) + Static112.method1920(arg1, arg0 + -1) + Static112.method1920(arg1, arg0 - -1);
		@Pc(83) int local83 = Static112.method1920(arg1, arg0);
		return local40 / 16 + local78 / 8 + local83 / 4;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2695(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}
}
