import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!i", name = "H", descriptor = "Lclient!v;")
	public static Class3_Sub3_Sub2_Sub4_Sub1 aClass3_Sub3_Sub2_Sub4_Sub1_4;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_820 = Static193.method3027("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!i", name = "I", descriptor = "Lclient!oc;")
	public static Class70 aClass70_818 = aClass70_820;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "I")
	public static volatile int anInt1645 = 0;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_821 = Static193.method3027("Connection lost)3");

	@OriginalMember(owner = "client!i", name = "K", descriptor = "Lclient!oc;")
	public static Class70 aClass70_819 = aClass70_821;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!b;I)V")
	public static void method1194(@OriginalArg(0) Class6 arg0) {
		@Pc(15) int local15 = arg0.anInt220 == 0 ? arg0.anInt217 : arg0.anInt220;
		@Pc(27) int local27 = arg0.anInt209 == 0 ? arg0.anInt244 : arg0.anInt209;
		Static40.method676(local15, arg0.anInt229, Static49.aClass6ArrayArray1[arg0.anInt229 >> 16], local27);
		if (arg0.aClass6Array1 != null) {
			Static40.method676(local15, arg0.anInt229, arg0.aClass6Array1, local27);
		}
		@Pc(58) Class3_Sub10 local58 = (Class3_Sub10) Static144.aClass40_9.method1029((long) arg0.anInt229);
		if (local58 != null) {
			Static16.method298(local27, local58.anInt1427, local15);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)I")
	public static int method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static17.aByteArrayArrayArray2[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static17.aByteArrayArrayArray2[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Lclient!b;I)Lclient!b;")
	public static Class6 method1196(@OriginalArg(0) Class6 arg0) {
		@Pc(3) Class6 local3 = Static21.method345(arg0);
		if (local3 == null) {
			local3 = arg0.aClass6_10;
		}
		return local3;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
	public static void method1201(@OriginalArg(1) byte[] arg0) {
		@Pc(5) int local5 = 0;
		while (true) {
			while (arg0.length > local5) {
				@Pc(20) int local20 = arg0[local5++] * 64 - Static157.anInt3260;
				@Pc(30) int local30 = arg0[local5++] * 64 - Static115.anInt2318;
				@Pc(55) int local55;
				@Pc(63) int local63;
				if (local20 > 0 && local30 > 0 && local20 + 64 < Static65.anInt1364 && local30 + 64 < Static50.anInt1046) {
					local55 = local20 >> 6;
					local63 = Static50.anInt1046 - local30 - 1 >> 6;
					for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
						for (@Pc(68) int local68 = -64; local68 < 0; local68++) {
							@Pc(74) byte local74 = arg0[local5++];
							if (local74 != 0) {
								@Pc(91) byte local91;
								if ((local74 & 0x1) == 1) {
									local91 = arg0[local5++];
									if (Static36.aByteArrayArrayArray4[local55][local63] == null) {
										Static36.aByteArrayArrayArray4[local55][local63] = new byte[4096];
									}
									Static36.aByteArrayArrayArray4[local55][local63][(-(local68 + 1) << 6) + local65] = (byte) local91;
								}
								if ((local74 & 0x2) == 2) {
									local91 = arg0[local5++];
									if (Static43.aByteArrayArrayArray5[local55][local63] == null) {
										Static43.aByteArrayArrayArray5[local55][local63] = new byte[4096];
									}
									Static43.aByteArrayArrayArray5[local55][local63][(-(local68 + 1) << 6) + local65] = (byte) (local91 - 28);
								}
								if ((local74 & 0x4) == 4) {
									local5 += 3;
									@Pc(198) int local198 = ((arg0[local5 - 2] & 0xFF) << 8) + ((arg0[local5 - 3] & 0xFF) << 16) + (arg0[local5 + -1] & 0xFF);
									if (Static8.anIntArrayArrayArray1[local55][local63] == null) {
										Static8.anIntArrayArrayArray1[local55][local63] = new int[4096];
									}
									local198--;
									@Pc(218) Class3_Sub3_Sub9 local218 = Static161.method2421(local198);
									if (local218.anIntArray52 != null) {
										local218 = local218.method769();
										if (local218 == null || local218.anInt999 == -1) {
											continue;
										}
									}
									Static8.anIntArrayArrayArray1[local55][local63][local65 + (-(local68 + 1) << 6)] = local218.anInt992 + 1;
									@Pc(254) Class3_Sub9 local254 = new Class3_Sub9();
									local254.anInt1405 = local218.anInt999;
									local254.anInt1406 = local20;
									local254.anInt1403 = Static50.anInt1046 - local30;
									Static186.aClass10_111.method261(local254);
								}
							}
						}
					}
				} else {
					for (local55 = 0; local55 < 64; local55++) {
						for (local63 = -64; local63 < 0; local63++) {
							@Pc(293) byte local293 = arg0[local5++];
							if (local293 != 0) {
								if ((local293 & 0x1) == 1) {
									local5++;
								}
								if ((local293 & 0x2) == 2) {
									local5++;
								}
								if ((local293 & 0x4) == 4) {
									local5 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}
}
