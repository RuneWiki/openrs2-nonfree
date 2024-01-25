import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "[I")
	public static final int[] anIntArray242 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_48 = new Class2(73, 2);

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	public static int anInt2745 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(FBFF)I")
	public static int method2211(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(19) float local19 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(28) float local28 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(37) float local37 = arg1 < 0.0F ? -arg1 : arg1;
		if (local19 < local28 && local37 < local28) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local37 > local19 && local37 > local28) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([IB[I[ILclient!vi;)V")
	public static void method2212(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class26_Sub2_Sub4_Sub2 arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg2[local12];
			@Pc(26) int local26 = arg1[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg3.aClass69Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass69Array3[local28] = null;
					} else {
						@Pc(43) Class139 local43 = Static364.aClass151_2.method3293(local18);
						@Pc(46) int local46 = local43.anInt3937;
						@Pc(51) Class69 local51 = arg3.aClass69Array3[local28];
						if (local51 != null) {
							if (local51.anInt1933 == local18) {
								if (local46 == 0) {
									local51 = arg3.aClass69Array3[local28] = null;
								} else if (local46 == 1) {
									local51.anInt1927 = 0;
									local51.anInt1931 = local26;
									local51.anInt1929 = 1;
									local51.anInt1928 = 0;
									local51.anInt1932 = 0;
									Static454.method5772(local43, arg3 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg3.anInt7383, arg3.aByte102, arg3.anInt7388, 0);
								} else if (local46 == 2) {
									local51.anInt1932 = 0;
								}
							} else if (local43.anInt3953 >= Static364.aClass151_2.method3293(local51.anInt1933).anInt3953) {
								local51 = arg3.aClass69Array3[local28] = null;
							}
						}
						if (local51 == null) {
							local51 = arg3.aClass69Array3[local28] = new Class69();
							local51.anInt1931 = local26;
							local51.anInt1933 = local18;
							local51.anInt1927 = 0;
							local51.anInt1928 = 0;
							local51.anInt1932 = 0;
							local51.anInt1929 = 1;
							Static454.method5772(local43, arg3 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg3.anInt7383, arg3.aByte102, arg3.anInt7388, 0);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)J")
	public static long method2213() {
		return Static184.aClass99_1.method2626();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)Z")
	public static boolean method2214(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static269.aClass51_9.method5326();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static269.aClass51_9.method5283();
		} else if (!Static269.aClass51_9.method5317()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static130.aClass153_Sub1_1.aBoolean352 = arg0;
			Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
			return true;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[BBI)I")
	public static int method2215(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class267.anIntArray622[(local7 ^ arg1[local9]) & 0xFF];
		}
		return ~local7;
	}
}
