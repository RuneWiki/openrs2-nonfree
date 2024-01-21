import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!l;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_533 = Static9.method266("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_534 = Static9.method266("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!id;")
	private static Class34 aClass34_535 = Static9.method266("Your profile will be transferred in:");

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!id;")
	private static Class34 aClass34_536 = Static9.method266("slide:");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[B")
	public static byte[] aByteArray16 = new byte[520];

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_537 = Static9.method266(" )2>");

	@OriginalMember(owner = "client!g", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_538 = aClass34_536;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "[I")
	public static int[] anIntArray115 = new int[100];

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	public static int anInt1143 = 0;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!id;")
	public static Class34 aClass34_539 = aClass34_536;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_540 = aClass34_535;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	public static int anInt1145 = 0;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "[I")
	public static int[] anIntArray116 = new int[2000];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method680(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static27.aClass1_Sub1_Sub2_Sub1_2.anIntArray26;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (52736 - local25 * 512) * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static105.aByteArrayArrayArray9[arg0][local40][local25] & 0x18) == 0) {
					aClass44_1.method1155(local8, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static105.aByteArrayArrayArray9[arg0 + 1][local40][local25] & 0x8) != 0) {
					aClass44_1.method1155(local8, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static27.aClass1_Sub1_Sub2_Sub1_2.method193();
		local38 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + 238 - 10;
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(149) int local149;
		for (@Pc(145) int local145 = 1; local145 < 103; local145++) {
			for (local149 = 1; local149 < 103; local149++) {
				if ((Static105.aByteArrayArrayArray9[arg0][local149][local145] & 0x18) == 0) {
					Static36.method641(local145, local149, local38, arg0, local40);
				}
				if (arg0 < 3 && (Static105.aByteArrayArrayArray9[arg0 + 1][local149][local145] & 0x8) != 0) {
					Static36.method641(local145, local149, local38, arg0 + 1, local40);
				}
			}
		}
		Static59.anInt1637 = 0;
		for (local149 = 0; local149 < 104; local149++) {
			for (@Pc(212) int local212 = 0; local212 < 104; local212++) {
				@Pc(220) int local220 = aClass44_1.method1153(Static42.anInt1208, local149, local212);
				if (local220 != 0) {
					local220 = local220 >> 14 & 0x7FFF;
					@Pc(233) int local233 = Static28.method2008(local220).anInt2953;
					if (local233 >= 0) {
						@Pc(240) int local240 = local212;
						@Pc(242) int local242 = local149;
						if (local233 != 22 && local233 != 29 && local233 != 34 && local233 != 36 && local233 != 46 && local233 != 47 && local233 != 48) {
							@Pc(276) int[][] local276 = Static114.aClass58Array1[Static42.anInt1208].anIntArrayArray26;
							for (@Pc(278) int local278 = 0; local278 < 10; local278++) {
								@Pc(285) int local285 = (int) (Math.random() * 4.0D);
								if (local285 == 0 && local242 > 0 && local149 - 3 < local242 && (local276[local242 - 1][local240] & 0x12C0108) == 0) {
									local242--;
								}
								if (local285 == 1 && local242 < 103 && local242 < local149 + 3 && (local276[local242 + 1][local240] & 0x12C0180) == 0) {
									local242++;
								}
								if (local285 == 2 && local240 > 0 && local212 - 3 < local240 && (local276[local242][local240 - 1] & 0x12C0102) == 0) {
									local240--;
								}
								if (local285 == 3 && local240 < 103 && local212 + 3 > local240 && (local276[local242][local240 + 1] & 0x12C0120) == 0) {
									local240++;
								}
							}
						}
						Static38.aClass1_Sub1_Sub2_Sub1Array5[Static59.anInt1637] = Static132.aClass1_Sub1_Sub2_Sub1Array10[local233];
						Static78.anIntArray246[Static59.anInt1637] = local242;
						Static66.anIntArray213[Static59.anInt1637] = local240;
						Static59.anInt1637++;
					}
				}
			}
		}
		Static62.aClass6_1.method1350();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ie;Lclient!ie;I)V")
	public static void method681(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1) {
		Static112.aClass35_28 = arg0;
		Static122.aClass35_33 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method682() {
		aClass34_537 = null;
		aClass34_535 = null;
		aClass34_538 = null;
		aClass34_540 = null;
		aClass44_1 = null;
		aByteArray16 = null;
		anIntArray115 = null;
		aClass34_539 = null;
		aClass34_536 = null;
		aByteArrayArray3 = null;
		anIntArray116 = null;
		aClass34_533 = null;
		aClass34_534 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
	public static boolean method683(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([II[III[Lclient!ea;)V")
	public static void method684(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class18[] arg4) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(16) int local16 = arg3 - 1;
		@Pc(20) int local20 = arg1 + 1;
		@Pc(26) int local26 = (arg1 + arg3) / 2;
		@Pc(30) Class18 local30 = arg4[local26];
		arg4[local26] = arg4[arg3];
		arg4[arg3] = local30;
		while (local20 > local16) {
			@Pc(44) boolean local44 = true;
			@Pc(47) int local47;
			@Pc(68) int local68;
			@Pc(71) int local71;
			do {
				local20--;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg2[local47] == 2) {
						local71 = local30.anInt893;
						local68 = arg4[local20].anInt893;
					} else if (arg2[local47] == 1) {
						local68 = arg4[local20].anInt894;
						local71 = local30.anInt894;
						if (local71 == -1 && arg0[local47] == 1) {
							local71 = 2001;
						}
						if (local68 == -1 && arg0[local47] == 1) {
							local68 = 2001;
						}
					} else if (arg2[local47] == 3) {
						local71 = local30.aBoolean45 ? 1 : 0;
						local68 = arg4[local20].aBoolean45 ? 1 : 0;
					} else {
						local71 = local30.anInt886;
						local68 = arg4[local20].anInt886;
					}
					if (local71 != local68) {
						if ((arg0[local47] != 1 || local68 <= local71) && (arg0[local47] != 0 || local71 <= local68)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			local44 = true;
			do {
				local16++;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg2[local47] == 2) {
						local71 = local30.anInt893;
						local68 = arg4[local16].anInt893;
					} else if (arg2[local47] == 1) {
						local68 = arg4[local16].anInt894;
						local71 = local30.anInt894;
						if (local68 == -1 && arg0[local47] == 1) {
							local68 = 2001;
						}
						if (local71 == -1 && arg0[local47] == 1) {
							local71 = 2001;
						}
					} else if (arg2[local47] == 3) {
						local71 = local30.aBoolean45 ? 1 : 0;
						local68 = arg4[local16].aBoolean45 ? 1 : 0;
					} else {
						local68 = arg4[local16].anInt886;
						local71 = local30.anInt886;
					}
					if (local71 != local68) {
						if ((arg0[local47] != 1 || local71 <= local68) && (arg0[local47] != 0 || local68 <= local71)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			if (local16 < local20) {
				@Pc(343) Class18 local343 = arg4[local16];
				arg4[local16] = arg4[local20];
				arg4[local20] = local343;
			}
		}
		method684(arg0, local20, arg2, arg3, arg4);
		method684(arg0, arg1, arg2, local20 + 1, arg4);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!id;ILclient!id;I)V")
	public static void method685(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		Static2.method97(null, arg2, arg0, arg1);
	}
}
