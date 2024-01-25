import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!mv;")
	public static Class229 aClass229_112;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "Lclient!ll;")
	private static Class211 aClass211_6;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!sf;")
	private static Class309 aClass309_6;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Lclient!ida;")
	public static Class2_Sub2_Sub9 aClass2_Sub2_Sub9_3;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!wf;")
	public static Class360 aClass360_4;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Lclient!lm;")
	public static Class212 aClass212_5;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Lclient!uaa;")
	public static Interface23 anInterface23_2;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "Lclient!qp;")
	public static Class290 aClass290_4;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Lclient!lp;")
	public static Class214 aClass214_3;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
	public static int anInt7574;

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
	public static int anInt7575;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "[[[Lclient!mb;")
	private static Class220[][][] aClass220ArrayArrayArray2;

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
	public static int anInt7576;

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
	public static int anInt7577;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
	public static int anInt7578;

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public static int anInt7579;

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "[S")
	private static short[] aShortArray119;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "[B")
	private static byte[] aByteArray80;

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "[B")
	private static byte[] aByteArray81;

	@OriginalMember(owner = "client!rv", name = "C", descriptor = "I")
	public static int anInt7580;

	@OriginalMember(owner = "client!rv", name = "D", descriptor = "[B")
	private static byte[] aByteArray82;

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "[S")
	private static short[] aShortArray120;

	@OriginalMember(owner = "client!rv", name = "F", descriptor = "Lclient!efa;")
	private static Class90 aClass90_31;

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "I")
	public static int anInt7581;

	@OriginalMember(owner = "client!rv", name = "H", descriptor = "[B")
	private static byte[] aByteArray83;

	@OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
	public static int anInt7582;

	@OriginalMember(owner = "client!rv", name = "J", descriptor = "I")
	public static int anInt7583;

	@OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
	public static int anInt7584;

	@OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
	public static int anInt7585;

	@OriginalMember(owner = "client!rv", name = "M", descriptor = "[I")
	private static int[] anIntArray508;

	@OriginalMember(owner = "client!rv", name = "N", descriptor = "I")
	public static int anInt7586;

	@OriginalMember(owner = "client!rv", name = "O", descriptor = "[B")
	private static byte[] aByteArray84;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "Lclient!efa;")
	private static final Class90 aClass90_30 = new Class90(16);

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "[B")
	private static final byte[] aByteArray79 = new byte[1];

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_47 = new Class70();

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	public static int anInt7572 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	public static int anInt7573 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "[S")
	private static final short[] aShortArray118 = new short[1];

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "()V")
	public static void method6098() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass214_3.anInt5134; local4++) {
			@Pc(32) boolean local32 = aClass2_Sub2_Sub9_3.method2734(aClass214_3.anIntArray357[local4] >> 28 & 0x3, aClass214_3.anIntArray357[local4] >> 14 & 0x3FFF, aClass214_3.anIntArray357[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class2_Sub20 local42 = new Class2_Sub20(aClass214_3.anIntArray356[local4]);
				local42.anInt2971 = local2[1] - anInt7583;
				local42.anInt2973 = local2[2] - anInt7584;
				aClass70_47.method1269(local42);
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method6099(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub7 local9 = new Class2_Sub7(aClass229_112.method4953(aClass2_Sub2_Sub9_3.aString47, "area"));
		@Pc(13) int local13 = local9.method4464();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method4464();
		}
		@Pc(33) int local33 = local9.method4464();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method4464();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt5186 < local9.aByteArray52.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method4464() == 0) {
					local58 = local9.method4464();
					local62 = local9.method4464();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt7583;
							local84 = local62 * 64 + local67 - anInt7584;
							method6120(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method4464();
					local62 = local9.method4464();
					local64 = local9.method4464();
					local67 = local9.method4464();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt7583;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt7584;
							method6120(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray84 = new byte[anInt7576 * anInt7586];
			aShortArray120 = new short[anInt7576 * anInt7586];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt7576 * anInt7586];
				for (local64 = 0; local64 < aClass220ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass220ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class220 local205 = aClass220ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class12_Sub7 local212 = (Class12_Sub7) local205.method4661(); local212 != null; local212 = (Class12_Sub7) local205.method4660()) {
								local191[local64 * 64 + local212.aByte93 + (local67 * 64 + local212.aByte92) * anInt7576] = (byte) local212.anInt7168;
							}
						}
					}
				}
				method6112(local191, aByteArray84, aShortArray120, arg1, arg2);
				for (local67 = 0; local67 < aClass220ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass220ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class220 local276 = aClass220ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class12_Sub7 local283 = (Class12_Sub7) local276.method4661(); local283 != null; local283 = (Class12_Sub7) local276.method4660()) {
								local148 = local67 * 64 + local283.aByte93 + (local76 * 64 + local283.aByte92) * anInt7576;
								local283.anInt7168 = (aByteArray84[local148] & 0xFF) << 16 | aShortArray120[local148] & 0xFFFF;
								if (local283.anInt7168 != 0) {
									local283.anInt7168 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method6112(aByteArray82, aByteArray84, aShortArray120, arg1, arg2);
			aByteArray82 = null;
			method6110();
			return;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt7582 = arg0 - anInt7583;
		anInt7575 = arg1 - anInt7584;
		anInt7577 = arg2 - anInt7583;
		anInt7578 = arg3 - anInt7584;
		anInt7580 = arg4;
		anInt7585 = arg5;
		anInt7581 = arg6;
		anInt7579 = arg7;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!fa;III)I")
	private static int method6101(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class179 local4 = aClass309_6.method6246(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt4278;
		if (local11 >= 0 && arg0.method1074(local11).aBoolean603) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt4279 >= 0) {
			local27 = local4.anInt4279;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static73.anIntArray126[Static565.method7389(Static181.method2308(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static73.anIntArray126[Static565.method7389(Static181.method2308(arg0.method1074(local11).aShort88)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt4274 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt4274;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static73.anIntArray126[Static565.method7389(Static181.method2308(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!mv;Lclient!sf;Lclient!ll;Lclient!qp;Lclient!wf;Lclient!lm;Lclient!uaa;)V")
	public static void method6103(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class290 arg3, @OriginalArg(4) Class360 arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) Interface23 arg6) {
		aClass229_112 = arg0;
		aClass309_6 = arg1;
		aClass211_6 = arg2;
		aClass290_4 = arg3;
		aClass360_4 = arg4;
		aClass212_5 = arg5;
		anInterface23_2 = arg6;
		aClass90_30.method1678();
		@Pc(21) int local21 = aClass229_112.method4955("details");
		@Pc(26) int[] local26 = aClass229_112.method4982(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class2_Sub2_Sub9 local39 = Static511.method7269(aClass229_112, local21, local26[local30]);
				aClass90_30.method1684(local39, (long) local39.anInt3270);
			}
		}
		Static50.method866(false, true);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lclient!ida;")
	public static Class2_Sub2_Sub9 method6104(@OriginalArg(0) int arg0) {
		return (Class2_Sub2_Sub9) aClass90_30.method1685((long) arg0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)Lclient!ida;")
	public static Class2_Sub2_Sub9 method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub2_Sub9 local4 = (Class2_Sub2_Sub9) aClass90_30.method1676(); local4 != null; local4 = (Class2_Sub2_Sub9) aClass90_30.method1680()) {
			if (local4.aBoolean236 && local4.method2733(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;IIII)Lclient!dc;")
	private static Class70 method6106(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class2_Sub20 local4 = (Class2_Sub20) aClass70_47.method1264(); local4 != null; local4 = (Class2_Sub20) aClass70_47.method1261()) {
			method6119(arg0, local4, arg1, arg2);
		}
		return aClass70_47;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;IIII[S[B)V")
	private static void method6107(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class216 local14 = aClass290_4.method5799(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt5273;
			if (local17 != -1) {
				@Pc(25) Class252 local25 = aClass212_5.method4407(local17);
				@Pc(49) Class38 local49 = local25.method5256(local14.aBoolean412 ? local14.aBoolean408 : false, local14.aBoolean413 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.A() >> 2;
					@Pc(65) int local65 = arg4 * local49.ca() >> 2;
					if (local25.aBoolean494) {
						@Pc(71) int local71 = local14.anInt5287;
						@Pc(74) int local74 = local14.anInt5244;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt6300 == 0) {
							local49.method7466(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7461(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt6300 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;)V")
	public static void method6108(@OriginalArg(0) Class162 arg0) {
		@Pc(3) int local3 = anInt7577 - anInt7582;
		@Pc(7) int local7 = anInt7575 - anInt7578;
		@Pc(15) int local15 = (anInt7581 - anInt7580 << 16) / local3;
		@Pc(23) int local23 = (anInt7579 - anInt7585 << 16) / local7;
		method6109(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lclient!r;IIII)V")
	private static void method6109(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt7577 - anInt7582;
		@Pc(7) int local7 = anInt7575 - anInt7578;
		if (anInt7577 < anInt7576) {
			local3++;
		}
		if (anInt7575 < anInt7586) {
			local7++;
		}
		@Pc(28) int local28;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(173) int local173;
		@Pc(175) int local175;
		@Pc(177) int local177;
		@Pc(179) int local179;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt7580;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt7580;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt7582 + local17;
				if (local50 >= 0 && local50 < anInt7576) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7579 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7579 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt7578;
							local173 = local50 + local93 * anInt7576;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt7586) {
								local175 = (aByteArray84[local173] & 0xFF) << 16 | aShortArray120[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray81[local173] & 0xFF;
								local179 = aShortArray119[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass2_Sub2_Sub9_3.anInt3268 != -1) {
									local175 = aClass2_Sub2_Sub9_3.anInt3268 | 0xFF000000;
								} else if ((local17 + anInt7582 & 0x4) == (local57 + anInt7575 & 0x4)) {
									local175 = anIntArray508[aClass309_6.anInt7724 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.J(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method6114(arg0, local28, local70, local44, local84, local175, local177, aByteArray80[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class2_Sub28 local282 = (Class2_Sub28) aClass90_31.method1685((long) (local50 << 16 | local93));
								if (local282 != null) {
									method6114(arg0, local28, local70, local44, local84, local175, local177, aByteArray80[local173], local282.aShortArray92, local282.aByteArray47, true);
								}
							} else {
								aShortArray118[0] = (short) (local179 - 1);
								aByteArray79[0] = aByteArray83[local173];
								method6114(arg0, local28, local70, local44, local84, local175, local177, aByteArray80[local173], aShortArray118, aByteArray79, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7579 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7579 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass2_Sub2_Sub9_3.anInt3268 != -1) {
							local93 = aClass2_Sub2_Sub9_3.anInt3268 | 0xFF000000;
						} else if ((local17 + anInt7582 & 0x4) == (local57 + anInt7575 & 0x4)) {
							local93 = anIntArray508[aClass309_6.anInt7724 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.J(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt7580;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt7580;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt7582;
				if (local57 >= 0 && local57 < anInt7576) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt7579 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt7579 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt7578;
							if (local173 >= 0 && local173 < anInt7586) {
								local175 = aShortArray119[local57 + local173 * anInt7576] & 0xFFFF;
								if (local175 <= 0) {
									method6107(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class2_Sub28 local459 = (Class2_Sub28) aClass90_31.method1685((long) (local57 << 16 | local173));
									if (local459 != null) {
										method6107(arg0, local40, local80, local50, local93, local459.aShortArray92, local459.aByteArray47);
									}
								} else {
									aShortArray118[0] = (short) (local175 - 1);
									aByteArray79[0] = aByteArray83[local57 + local173 * anInt7576];
									method6107(arg0, local40, local80, local50, local93, aShortArray118, aByteArray79);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt7582 >> 6;
		local44 = anInt7578 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt7577 >> 6;
		local57 = anInt7575 >> 6;
		if (local50 >= aClass220ArrayArrayArray2[0].length) {
			local50 = aClass220ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass220ArrayArrayArray2[0][0].length) {
			local57 = aClass220ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class220 local589 = aClass220ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt7583 >> 6)) * 64;
						local175 = (local84 + (anInt7584 >> 6)) * 64;
						for (@Pc(612) Class12_Sub7 local612 = (Class12_Sub7) local589.method4661(); local612 != null; local612 = (Class12_Sub7) local589.method4660()) {
							local179 = local173 + local612.aByte93 - anInt7583 - anInt7582;
							local631 = local175 + local612.aByte92 - anInt7584 - anInt7578;
							local641 = (arg1 * local179 >> 16) + anInt7580;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt7580;
							local665 = anInt7579 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt7579 - (arg2 * local631 >> 16);
							method6114(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt7168, local612.aByte91 & 0xFF, local612.aByte94, local612.aShortArray108, local612.aByteArray69, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class220 local727 = aClass220ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt7583 >> 6)) * 64;
						local177 = (local93 + (anInt7584 >> 6)) * 64;
						for (@Pc(750) Class12_Sub7 local750 = (Class12_Sub7) local727.method4661(); local750 != null; local750 = (Class12_Sub7) local727.method4660()) {
							local631 = local175 + local750.aByte93 - anInt7583 - anInt7582;
							local641 = local177 + local750.aByte92 - anInt7584 - anInt7578;
							local653 = (arg1 * local631 >> 16) + anInt7580;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt7580;
							local675 = anInt7579 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt7579 - (arg2 * local641 >> 16);
							method6107(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray108, local750.aByteArray69);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "()V")
	private static void method6110() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt7576; local1++) {
			for (local4 = 0; local4 < anInt7586; local4++) {
				local15 = aShortArray119[local1 + local4 * anInt7576] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class2_Sub28 local31 = (Class2_Sub28) aClass90_31.method1685((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray92.length; local35++) {
								@Pc(46) Class216 local46 = aClass290_4.method5799(local31.aShortArray92[local35] & 0xFFFF);
								local49 = local46.anInt5284;
								if (local46.anIntArray362 != null) {
									local46 = local46.method4560(anInterface23_2);
									if (local46 != null) {
										local49 = local46.anInt5284;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class2_Sub20 local70 = new Class2_Sub20(local49);
									local70.anInt2971 = local1;
									local70.anInt2973 = local4;
									aClass70_47.method1269(local70);
								}
							}
						}
					} else {
						@Pc(94) Class216 local94 = aClass290_4.method5799(local15 - 1);
						local35 = local94.anInt5284;
						if (local94.anIntArray362 != null) {
							local94 = local94.method4560(anInterface23_2);
							if (local94 != null) {
								local35 = local94.anInt5284;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class2_Sub20 local118 = new Class2_Sub20(local35);
							local118.anInt2971 = local1;
							local118.anInt2973 = local4;
							aClass70_47.method1269(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass220ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass220ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class220 local153 = aClass220ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class12_Sub7 local160 = (Class12_Sub7) local153.method4661(); local160 != null; local160 = (Class12_Sub7) local153.method4660()) {
							if (local160.aShortArray108 != null) {
								for (local49 = 0; local49 < local160.aShortArray108.length; local49++) {
									@Pc(177) Class216 local177 = aClass290_4.method5799(local160.aShortArray108[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt5284;
									if (local177.anIntArray362 != null) {
										local177 = local177.method4560(anInterface23_2);
										if (local177 != null) {
											local180 = local177.anInt5284;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class2_Sub20 local201 = new Class2_Sub20(local180);
										local201.anInt2971 = (local15 + (anInt7583 >> 6)) * 64 + local160.aByte93 - anInt7583;
										local201.anInt2973 = (local144 + (anInt7584 >> 6)) * 64 + local160.aByte92 - anInt7584;
										aClass70_47.method1269(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lclient!r;)Lclient!dc;")
	public static Class70 method6111(@OriginalArg(0) Class162 arg0) {
		@Pc(3) int local3 = anInt7577 - anInt7582;
		@Pc(7) int local7 = anInt7575 - anInt7578;
		@Pc(15) int local15 = (anInt7581 - anInt7580 << 16) / local3;
		@Pc(23) int local23 = (anInt7579 - anInt7585 << 16) / local7;
		return method6106(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([B[B[SII)V")
	private static void method6112(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt7586];
		@Pc(5) int[] local5 = new int[anInt7586];
		@Pc(8) int[] local8 = new int[anInt7586];
		@Pc(11) int[] local11 = new int[anInt7586];
		@Pc(14) int[] local14 = new int[anInt7586];
		for (@Pc(16) int local16 = -5; local16 < anInt7576; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt7586; local27++) {
				@Pc(50) Class274 local50;
				@Pc(86) int local86;
				if (local21 < anInt7576) {
					local41 = arg0[local21 + local27 * anInt7576] & 0xFF;
					if (local41 > 0) {
						local50 = aClass211_6.method4404(local41 - 1);
						local2[local27] += local50.anInt6888;
						local5[local27] += local50.anInt6894;
						local8[local27] += local50.anInt6897;
						local11[local27] += local50.anInt6891;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt7576] & 0xFF;
					if (local41 > 0) {
						local50 = aClass211_6.method4404(local41 - 1);
						local2[local27] -= local50.anInt6888;
						local5[local27] -= local50.anInt6894;
						local8[local27] -= local50.anInt6897;
						local11[local27] -= local50.anInt6891;
						local86 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				for (@Pc(167) int local167 = -5; local167 < anInt7586; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt7586) {
						local41 += local2[local172];
						local159 += local5[local172];
						local161 += local8[local172];
						local163 += local11[local172];
						local165 += local14[local172];
					}
					@Pc(209) int local209 = local167 - 5;
					if (local209 >= 0) {
						local41 -= local2[local209];
						local159 -= local5[local209];
						local161 -= local8[local209];
						local163 -= local11[local209];
						local165 -= local14[local209];
					}
					if (local167 >= 0 && local165 > 0) {
						@Pc(261) int local261;
						if ((arg0[local16 + local167 * anInt7576] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt7576;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static470.method6062(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt7576;
							@Pc(333) int local333 = Static73.anIntArray126[Static565.method7389(Static230.method2782(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "()V")
	public static void method6113() {
		aByteArray82 = new byte[anInt7576 * anInt7586];
		aByteArray81 = new byte[anInt7576 * anInt7586];
		aByteArray80 = new byte[anInt7576 * anInt7586];
		aShortArray119 = new short[anInt7576 * anInt7586];
		aByteArray83 = new byte[anInt7576 * anInt7586];
		aClass90_31 = new Class90(1024);
		aClass220ArrayArrayArray2 = new Class220[3][anInt7576 >> 6][anInt7586 >> 6];
		anIntArray508 = new int[aClass309_6.anInt7723 + 1];
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;IIIIIII[S[BZ)V")
	private static void method6114(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.J(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray508[arg6];
					if (arg10 || local32 != 0) {
						arg0.J(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static48.method858(local32, local20, arg2, arg1, arg7 >> 6 & 0x3, anIntArray508[arg6], arg5, anInt7574, aByteArrayArrayArray17, arg0, arg4, arg3);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			local20 = arg1;
		} else {
			local20 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			local32 = arg2;
		} else {
			local32 = arg2 + arg4 - 1;
		}
		for (@Pc(100) int local100 = 0; local100 < arg8.length; local100++) {
			@Pc(107) int local107 = arg9[local100] & 0x3F;
			if (local107 == 0 || local107 == 2 || local107 == 3 || local107 == 9) {
				@Pc(127) Class216 local127 = aClass290_4.method5799(arg8[local100] & 0xFFFF);
				if (local127.anInt5273 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt5275 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.m(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.XA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.m(local20, arg2, arg4, local133, 0);
						} else {
							arg0.XA(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.m(arg1, arg2, arg4, -1, 0);
							arg0.XA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.m(local20, arg2, arg4, -1, 0);
							arg0.XA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.m(local20, arg2, arg4, -1, 0);
							arg0.XA(arg1, local32, arg3, local133, 0);
						} else {
							arg0.m(arg1, arg2, arg4, -1, 0);
							arg0.XA(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.XA(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.XA(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.XA(local20, local32, 1, local133, 0);
						} else {
							arg0.XA(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.XA(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.XA(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "()V")
	public static void method6115() {
		aByteArray82 = null;
		aByteArray84 = null;
		aShortArray120 = null;
		aByteArray81 = null;
		aByteArray80 = null;
		aShortArray119 = null;
		aByteArray83 = null;
		aClass90_31 = null;
		aClass220ArrayArrayArray2 = null;
		anIntArray508 = null;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)Lclient!oga;")
	public static Class253 method6116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class253 local3 = new Class253();
		for (@Pc(8) Class2_Sub2_Sub9 local8 = (Class2_Sub2_Sub9) aClass90_30.method1676(); local8 != null; local8 = (Class2_Sub2_Sub9) aClass90_30.method1680()) {
			if (local8.aBoolean236 && local8.method2733(arg1, arg0)) {
				local3.method5329(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!fa;II)V")
	public static void method6117(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass309_6.anInt7723; local1++) {
			anIntArray508[local1 + 1] = method6101(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public static void method6118(@OriginalArg(0) int arg0) {
		aClass2_Sub2_Sub9_3 = (Class2_Sub2_Sub9) aClass90_30.method1685((long) arg0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;Lclient!hi;IIII)V")
	private static void method6119(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt2968 = anInt7580 + (arg2 * (arg1.anInt2971 - anInt7582) >> 16);
		arg1.anInt2974 = anInt7579 - (arg3 * (arg1.anInt2973 - anInt7578) >> 16);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;Lclient!gk;IIII[I[I)V")
	private static void method6120(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method4464();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method4464();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray82[arg4 + arg5 * anInt7576] = (byte) local21;
					aByteArray81[arg4 + arg5 * anInt7576] = 0;
				} else {
					aByteArray81[arg4 + arg5 * anInt7576] = (byte) local21;
					aByteArray80[arg4 + arg5 * anInt7576] = 0;
					aByteArray82[arg4 + arg5 * anInt7576] = arg1.method4477();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method4464();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method4464();
				local127 = arg1.method4464();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method4464();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray82[arg4 + arg5 * anInt7576] = (byte) local123;
				aByteArray81[arg4 + arg5 * anInt7576] = (byte) local125;
				aByteArray80[arg4 + arg5 * anInt7576] = (byte) local127;
				if (local139 == 1) {
					aShortArray119[arg4 + arg5 * anInt7576] = (short) (arg1.method4518() + 1);
					aByteArray83[arg4 + arg5 * anInt7576] = arg1.method4477();
				} else if (local139 > 1) {
					aShortArray119[arg4 + arg5 * anInt7576] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4518();
						local218[local220] = arg1.method4477();
					}
					aClass90_31.method1684(new Class2_Sub28(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4518();
						local218[local220] = arg1.method4477();
					}
				}
				if (aClass220ArrayArrayArray2[local118 - 1][arg2 - (anInt7583 >> 6)][arg3 - (anInt7584 >> 6)] == null) {
					aClass220ArrayArrayArray2[local118 - 1][arg2 - (anInt7583 >> 6)][arg3 - (anInt7584 >> 6)] = new Class220();
				}
				@Pc(338) Class12_Sub7 local338 = new Class12_Sub7(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass220ArrayArrayArray2[local118 - 1][arg2 - (anInt7583 >> 6)][arg3 - (anInt7584 >> 6)].method4659(local338);
			}
		}
	}
}
