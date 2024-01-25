import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_63 = new Class186(30, -1);

	@OriginalMember(owner = "client!lt", name = "O", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_34 = new Class220(64);

	@OriginalMember(owner = "client!lt", name = "S", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!lt", name = "T", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	public static void method3668() {
		if (Static349.aClass249_7 == null) {
			return;
		}
		if (Static349.aClass249_7.anInt6929 == 1) {
			Static349.aClass249_7 = null;
			return;
		}
		if (Static349.aClass249_7.anInt6929 == 2) {
			Static181.method2815(Static5.aString1, Static159.aClass103_2, 2);
			Static349.aClass249_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method3676(@OriginalArg(0) Class6_Sub15 arg0) {
		if (arg0.aByteArray51.length - arg0.anInt3487 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method3111();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray51.length - arg0.anInt3487 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method3108();
		if (local46 * 6 != arg0.aByteArray51.length - arg0.anInt3487) {
			return;
		}
		while (true) {
			@Pc(66) int local66;
			@Pc(70) int local70;
			do {
				do {
					do {
						if (arg0.aByteArray51.length <= arg0.anInt3487) {
							return;
						}
						local66 = arg0.method3108();
						local70 = arg0.method3109();
					} while (Static235.anIntArray358.length <= local66);
				} while (!Static434.aBooleanArray27[local66]);
			} while (Static255.aClass199_1.method4413(local66).aChar2 == '1' && (local70 < -1 || local70 > 1));
			Static235.anIntArray358[local66] = local70;
		}
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "(II)I")
	public static int method3692(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!pi;IIIII)V")
	public static void method3697(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2147 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static267.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class66 local35 = Static304.aClass66Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt2147; local37++) {
							if (arg0.aClass6_Sub6Array3[local37] == local35.aClass6_Sub6_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass6_Sub6Array3[arg0.anInt2147++] = local35.aClass6_Sub6_1;
						if (arg0.anInt2147 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt2147; local7 < 4; local7++) {
			arg0.aClass6_Sub6Array3[local7] = null;
		}
	}
}
