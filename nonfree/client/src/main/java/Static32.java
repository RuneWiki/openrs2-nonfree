import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_18 = new Class48(51, 6);

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
	public static final int anInt651 = 50;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
	public static final int[] anIntArray96 = new int[anInt651];

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "[I")
	public static final int[] anIntArray97 = new int[anInt651];

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "[I")
	public static final int[] anIntArray98 = new int[anInt651];

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	public static int anInt649 = 0;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "[I")
	public static final int[] anIntArray99 = new int[anInt651];

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[anInt651];

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
	public static int anInt650 = 999999;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "[I")
	public static final int[] anIntArray100 = new int[anInt651];

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "[I")
	public static final int[] anIntArray101 = new int[anInt651];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!vg;)V")
	public static void method499(@OriginalArg(1) Class1_Sub33_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method5200();
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static331.anInt5548; local12++) {
			local18 = Static345.anIntArray681[local12];
			if ((Static117.aByteArray39[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static117.aByteArray39[local18] = (byte) (Static117.aByteArray39[local18] | 0x2);
				} else {
					local49 = arg0.method5191(1);
					if (local49 == 0) {
						local7 = Static105.method1492(arg0);
						Static117.aByteArray39[local18] = (byte) (Static117.aByteArray39[local18] | 0x2);
					} else {
						Static203.method2877(local18, arg0);
					}
				}
			}
		}
		arg0.method5193();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5200();
		@Pc(127) int local127;
		for (local18 = 0; local18 < Static331.anInt5548; local18++) {
			local49 = Static345.anIntArray681[local18];
			if ((Static117.aByteArray39[local49] & 0x1) != 0) {
				if (local7 > 0) {
					Static117.aByteArray39[local49] = (byte) (Static117.aByteArray39[local49] | 0x2);
					local7--;
				} else {
					local127 = arg0.method5191(1);
					if (local127 == 0) {
						local7 = Static105.method1492(arg0);
						Static117.aByteArray39[local49] = (byte) (Static117.aByteArray39[local49] | 0x2);
					} else {
						Static203.method2877(local49, arg0);
					}
				}
			}
		}
		arg0.method5193();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5200();
		@Pc(202) int local202;
		for (local49 = 0; local49 < Static93.anInt1678; local49++) {
			local127 = Static37.anIntArray108[local49];
			if ((Static117.aByteArray39[local127] & 0x1) != 0) {
				if (local7 > 0) {
					Static117.aByteArray39[local127] = (byte) (Static117.aByteArray39[local127] | 0x2);
					local7--;
				} else {
					local202 = arg0.method5191(1);
					if (local202 == 0) {
						local7 = Static105.method1492(arg0);
						Static117.aByteArray39[local127] = (byte) (Static117.aByteArray39[local127] | 0x2);
					} else if (Static267.method4124(local127, arg0)) {
						Static117.aByteArray39[local127] = (byte) (Static117.aByteArray39[local127] | 0x2);
					}
				}
			}
		}
		arg0.method5193();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5200();
		for (local127 = 0; local127 < Static93.anInt1678; local127++) {
			local202 = Static37.anIntArray108[local127];
			if ((Static117.aByteArray39[local202] & 0x1) == 0) {
				if (local7 > 0) {
					Static117.aByteArray39[local202] = (byte) (Static117.aByteArray39[local202] | 0x2);
					local7--;
				} else {
					@Pc(294) int local294 = arg0.method5191(1);
					if (local294 == 0) {
						local7 = Static105.method1492(arg0);
						Static117.aByteArray39[local202] = (byte) (Static117.aByteArray39[local202] | 0x2);
					} else if (Static267.method4124(local202, arg0)) {
						Static117.aByteArray39[local202] = (byte) (Static117.aByteArray39[local202] | 0x2);
					}
				}
			}
		}
		arg0.method5193();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static331.anInt5548 = 0;
		Static93.anInt1678 = 0;
		for (local202 = 1; local202 < 2048; local202++) {
			Static117.aByteArray39[local202] = (byte) (Static117.aByteArray39[local202] >> 1);
			@Pc(369) Class25_Sub1_Sub1_Sub1 local369 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local202];
			if (local369 == null) {
				Static37.anIntArray108[Static93.anInt1678++] = local202;
			} else {
				Static345.anIntArray681[Static331.anInt5548++] = local202;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
	public static void method500(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static353.aClass1_Sub6_Sub4_2 != null) {
			Static255.anInt4402 = Static353.aClass1_Sub6_Sub4_2.anInt1850;
		} else {
			Static255.anInt4402 = -1;
		}
		Static353.aClass1_Sub6_Sub4_2 = null;
		Static35.aClass17_8 = null;
		Static240.anInt4008 = 0;
		Static56.aClass117_1 = null;
		Static353.method2119();
		Static353.aClass17_25.method205();
		Static359.anInt6301 = -1;
		Static167.aClass51_8 = null;
		Static270.aClass79_8 = null;
		Static390.anInt6367 = -1;
		Static203.aClass79_6 = null;
		Static85.aClass79_2 = null;
		Static38.aClass79_1 = null;
		Static353.aClass93_2 = null;
		Static213.aClass79_7 = null;
		Static121.aClass79_4 = null;
		Static89.aClass79_3 = null;
		Static188.aClass79_5 = null;
		Static353.aClass249_4.method5525();
		Static353.aClass184_2.method4225(64, 64);
		Static353.aClass249_4.method5523(128, 64);
		Static353.aClass153_3.method3082(64);
		Static371.aClass147_5.method2960(64);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIII)V")
	public static void method501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static140.method5231(arg1, Static264.anInt4589, Static194.anInt3448);
		@Pc(19) int local19 = Static140.method5231(arg2, Static264.anInt4589, Static194.anInt3448);
		@Pc(25) int local25 = Static140.method5231(arg5, Static98.anInt1774, Static372.anInt1561);
		@Pc(33) int local33 = Static140.method5231(arg3, Static98.anInt1774, Static372.anInt1561);
		@Pc(43) int local43 = Static140.method5231(arg0 + arg1, Static264.anInt4589, Static194.anInt3448);
		@Pc(54) int local54 = Static140.method5231(arg2 - arg0, Static264.anInt4589, Static194.anInt3448);
		for (@Pc(56) int local56 = local11; local56 < local43; local56++) {
			Static382.method5419(Static369.anIntArrayArray35[local56], local25, local33, arg4);
		}
		for (@Pc(76) int local76 = local19; local76 > local54; local76--) {
			Static382.method5419(Static369.anIntArrayArray35[local76], local25, local33, arg4);
		}
		@Pc(102) int local102 = Static140.method5231(arg5 + arg0, Static98.anInt1774, Static372.anInt1561);
		@Pc(113) int local113 = Static140.method5231(arg3 - arg0, Static98.anInt1774, Static372.anInt1561);
		for (@Pc(115) int local115 = local43; local115 <= local54; local115++) {
			@Pc(121) int[] local121 = Static369.anIntArrayArray35[local115];
			Static382.method5419(local121, local25, local102, arg4);
			Static382.method5419(local121, local113, local33, arg4);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)I")
	public static int method502(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
	public static void method503() {
		Static215.anInt3678 = 0;
		Static358.aClass17_66.method205();
		Static358.aClass17_66.method199(Static107.aClass1_Sub40_3);
		Static215.anInt3678++;
	}
}
