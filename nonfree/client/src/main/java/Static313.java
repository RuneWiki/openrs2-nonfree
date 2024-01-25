import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "Lclient!sfa;")
	public static Class1_Sub3_Sub17 aClass1_Sub3_Sub17_2;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "Lclient!ml;")
	public static Interface15 anInterface15_2;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "Lclient!ga;")
	public static Class111 aClass111_42;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "Lclient!kaa;")
	public static Class184 aClass184_3;

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "Lclient!lp;")
	private static Class206 aClass206_2;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "Lclient!cf;")
	public static Class46 aClass46_2;

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "Lclient!mg;")
	public static Class214 aClass214_3;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "Lclient!cq;")
	private static Class56 aClass56_2;

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "Lclient!oca;")
	public static Class236 aClass236_3;

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
	public static int anInt4082;

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
	public static int anInt4085;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "Lclient!wh;")
	private static Class356 aClass356_17;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
	public static int anInt4086;

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "[B")
	private static byte[] aByteArray35;

	@OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
	public static int anInt4087;

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
	public static int anInt4088;

	@OriginalMember(owner = "client!lw", name = "z", descriptor = "[B")
	private static byte[] aByteArray36;

	@OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
	public static int anInt4089;

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "I")
	public static int anInt4090;

	@OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
	public static int anInt4091;

	@OriginalMember(owner = "client!lw", name = "D", descriptor = "[S")
	private static short[] aShortArray48;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
	public static int anInt4092;

	@OriginalMember(owner = "client!lw", name = "F", descriptor = "[B")
	private static byte[] aByteArray37;

	@OriginalMember(owner = "client!lw", name = "G", descriptor = "[B")
	private static byte[] aByteArray38;

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "[S")
	private static short[] aShortArray49;

	@OriginalMember(owner = "client!lw", name = "J", descriptor = "[B")
	private static byte[] aByteArray39;

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "[[[Lclient!vu;")
	private static Class349[][][] aClass349ArrayArrayArray2;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
	public static int anInt4093;

	@OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
	public static int anInt4094;

	@OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
	public static int anInt4095;

	@OriginalMember(owner = "client!lw", name = "Q", descriptor = "I")
	public static int anInt4096;

	@OriginalMember(owner = "client!lw", name = "R", descriptor = "[I")
	private static int[] anIntArray233;

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "Lclient!wh;")
	private static final Class356 aClass356_16 = new Class356(16);

	@OriginalMember(owner = "client!lw", name = "n", descriptor = "[B")
	private static final byte[] aByteArray34 = new byte[1];

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_41 = new Class361();

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "[S")
	private static final short[] aShortArray47 = new short[1];

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
	public static int anInt4083 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
	public static int anInt4084 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "()V")
	public static void method3473() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass236_3.anInt6600; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub3_Sub17_2.method6737(aClass236_3.anIntArray441[local4] & 0x3FFF, local2, aClass236_3.anIntArray441[local4] >> 14 & 0x3FFF, aClass236_3.anIntArray441[local4] >> 28 & 0x3);
			if (local32) {
				@Pc(42) Class1_Sub27 local42 = new Class1_Sub27(aClass236_3.anIntArray443[local4]);
				local42.anInt5627 = local2[1] - anInt4085;
				local42.anInt5623 = local2[2] - anInt4096;
				aClass361_41.method7855(local42);
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;)V")
	public static void method3474(@OriginalArg(0) Class12 arg0) {
		@Pc(3) int local3 = anInt4088 - anInt4093;
		@Pc(7) int local7 = anInt4094 - anInt4089;
		@Pc(15) int local15 = (anInt4091 - anInt4090 << 16) / local3;
		@Pc(23) int local23 = (anInt4092 - anInt4086 << 16) / local7;
		method3484(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;IIIIIII[S[BZ)V")
	private static void method3475(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.J(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray233[arg6];
					if (arg10 || local32 != 0) {
						arg0.J(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static528.method7217(local20, arg2, arg4, arg3, arg0, local32, anIntArray233[arg6], aByteArrayArrayArray4, arg1, arg7 >> 6 & 0x3, arg5, anInt4082);
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
				@Pc(127) Class306 local127 = aClass214_3.method4897(arg8[local100] & 0xFFFF);
				if (local127.anInt8391 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt8387 == 1) {
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

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	public static void method3476(@OriginalArg(0) int arg0) {
		aClass1_Sub3_Sub17_2 = (Class1_Sub3_Sub17) aClass356_16.method7796((long) arg0);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)Lclient!sfa;")
	public static Class1_Sub3_Sub17 method3477(@OriginalArg(0) int arg0) {
		return (Class1_Sub3_Sub17) aClass356_16.method7796((long) arg0);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "()V")
	public static void method3478() {
		aByteArray39 = new byte[anInt4095 * anInt4087];
		aByteArray36 = new byte[anInt4095 * anInt4087];
		aByteArray37 = new byte[anInt4095 * anInt4087];
		aShortArray48 = new short[anInt4095 * anInt4087];
		aByteArray35 = new byte[anInt4095 * anInt4087];
		aClass356_17 = new Class356(1024);
		aClass349ArrayArrayArray2 = new Class349[3][anInt4095 >> 6][anInt4087 >> 6];
		anIntArray233 = new int[aClass206_2.anInt5530 + 1];
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method3480(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub20 local9 = new Class1_Sub20(aClass111_42.method2450("area", aClass1_Sub3_Sub17_2.aString84));
		@Pc(13) int local13 = local9.method4393();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method4393();
		}
		@Pc(33) int local33 = local9.method4393();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method4393();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt5238 < local9.aByteArray52.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method4393() == 0) {
					local58 = local9.method4393();
					local62 = local9.method4393();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt4085;
							local84 = local62 * 64 + local67 - anInt4096;
							method3488(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method4393();
					local62 = local9.method4393();
					local64 = local9.method4393();
					local67 = local9.method4393();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt4085;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt4096;
							method3488(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray38 = new byte[anInt4095 * anInt4087];
			aShortArray49 = new short[anInt4095 * anInt4087];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt4095 * anInt4087];
				for (local64 = 0; local64 < aClass349ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass349ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class349 local205 = aClass349ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class20_Sub4 local212 = (Class20_Sub4) local205.method7653(); local212 != null; local212 = (Class20_Sub4) local205.method7660()) {
								local191[local64 * 64 + local212.aByte35 + (local67 * 64 + local212.aByte34) * anInt4095] = (byte) local212.anInt2341;
							}
						}
					}
				}
				method3493(local191, aByteArray38, aShortArray49, arg1, arg2);
				for (local67 = 0; local67 < aClass349ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass349ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class349 local276 = aClass349ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class20_Sub4 local283 = (Class20_Sub4) local276.method7653(); local283 != null; local283 = (Class20_Sub4) local276.method7660()) {
								local148 = local67 * 64 + local283.aByte35 + (local76 * 64 + local283.aByte34) * anInt4095;
								local283.anInt2341 = (aByteArray38[local148] & 0xFF) << 16 | aShortArray49[local148] & 0xFFFF;
								if (local283.anInt2341 != 0) {
									local283.anInt2341 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3493(aByteArray39, aByteArray38, aShortArray49, arg1, arg2);
			aByteArray39 = null;
			method3487();
			return;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!fa;II)V")
	public static void method3481(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass206_2.anInt5530; local1++) {
			anIntArray233[local1 + 1] = method3486(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;Lclient!lv;IIII)V")
	private static void method3482(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class1_Sub27 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt5626 = anInt4090 + (arg2 * (arg1.anInt5627 - anInt4093) >> 16);
		arg1.anInt5622 = anInt4092 - (arg3 * (arg1.anInt5623 - anInt4089) >> 16);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Lclient!gfa;")
	public static Class117 method3483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class117 local3 = new Class117();
		for (@Pc(8) Class1_Sub3_Sub17 local8 = (Class1_Sub3_Sub17) aClass356_16.method7792(); local8 != null; local8 = (Class1_Sub3_Sub17) aClass356_16.method7795()) {
			if (local8.aBoolean578 && local8.method6740(arg0, arg1)) {
				local3.method2550(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;IIII)V")
	private static void method3484(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt4088 - anInt4093;
		@Pc(7) int local7 = anInt4094 - anInt4089;
		if (anInt4088 < anInt4095) {
			local3++;
		}
		if (anInt4094 < anInt4087) {
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
			local28 = (arg1 * local17 >> 16) + anInt4090;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt4090;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt4093 + local17;
				if (local50 >= 0 && local50 < anInt4095) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4092 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4092 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt4089;
							local173 = local50 + local93 * anInt4095;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt4087) {
								local175 = (aByteArray38[local173] & 0xFF) << 16 | aShortArray49[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray36[local173] & 0xFF;
								local179 = aShortArray48[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass1_Sub3_Sub17_2.anInt8098 != -1) {
									local175 = aClass1_Sub3_Sub17_2.anInt8098 | 0xFF000000;
								} else if ((local17 + anInt4093 & 0x4) == (local57 + anInt4094 & 0x4)) {
									local175 = anIntArray233[aClass206_2.anInt5535 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.J(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method3475(arg0, local28, local70, local44, local84, local175, local177, aByteArray37[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class1_Sub12 local282 = (Class1_Sub12) aClass356_17.method7796((long) (local50 << 16 | local93));
								if (local282 != null) {
									method3475(arg0, local28, local70, local44, local84, local175, local177, aByteArray37[local173], local282.aShortArray37, local282.aByteArray24, true);
								}
							} else {
								aShortArray47[0] = (short) (local179 - 1);
								aByteArray34[0] = aByteArray35[local173];
								method3475(arg0, local28, local70, local44, local84, local175, local177, aByteArray37[local173], aShortArray47, aByteArray34, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4092 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4092 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub3_Sub17_2.anInt8098 != -1) {
							local93 = aClass1_Sub3_Sub17_2.anInt8098 | 0xFF000000;
						} else if ((local17 + anInt4093 & 0x4) == (local57 + anInt4094 & 0x4)) {
							local93 = anIntArray233[aClass206_2.anInt5535 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt4090;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt4090;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt4093;
				if (local57 >= 0 && local57 < anInt4095) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt4092 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt4092 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt4089;
							if (local173 >= 0 && local173 < anInt4087) {
								local175 = aShortArray48[local57 + local173 * anInt4095] & 0xFFFF;
								if (local175 <= 0) {
									method3492(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class1_Sub12 local459 = (Class1_Sub12) aClass356_17.method7796((long) (local57 << 16 | local173));
									if (local459 != null) {
										method3492(arg0, local40, local80, local50, local93, local459.aShortArray37, local459.aByteArray24);
									}
								} else {
									aShortArray47[0] = (short) (local175 - 1);
									aByteArray34[0] = aByteArray35[local57 + local173 * anInt4095];
									method3492(arg0, local40, local80, local50, local93, aShortArray47, aByteArray34);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt4093 >> 6;
		local44 = anInt4089 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt4088 >> 6;
		local57 = anInt4094 >> 6;
		if (local50 >= aClass349ArrayArrayArray2[0].length) {
			local50 = aClass349ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass349ArrayArrayArray2[0][0].length) {
			local57 = aClass349ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class349 local589 = aClass349ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt4085 >> 6)) * 64;
						local175 = (local84 + (anInt4096 >> 6)) * 64;
						for (@Pc(612) Class20_Sub4 local612 = (Class20_Sub4) local589.method7653(); local612 != null; local612 = (Class20_Sub4) local589.method7660()) {
							local179 = local173 + local612.aByte35 - anInt4085 - anInt4093;
							local631 = local175 + local612.aByte34 - anInt4096 - anInt4089;
							local641 = (arg1 * local179 >> 16) + anInt4090;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt4090;
							local665 = anInt4092 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt4092 - (arg2 * local631 >> 16);
							method3475(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt2341, local612.aByte33 & 0xFF, local612.aByte36, local612.aShortArray36, local612.aByteArray21, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class349 local727 = aClass349ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt4085 >> 6)) * 64;
						local177 = (local93 + (anInt4096 >> 6)) * 64;
						for (@Pc(750) Class20_Sub4 local750 = (Class20_Sub4) local727.method7653(); local750 != null; local750 = (Class20_Sub4) local727.method7660()) {
							local631 = local175 + local750.aByte35 - anInt4085 - anInt4093;
							local641 = local177 + local750.aByte34 - anInt4096 - anInt4089;
							local653 = (arg1 * local631 >> 16) + anInt4090;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt4090;
							local675 = anInt4092 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt4092 - (arg2 * local641 >> 16);
							method3492(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray36, local750.aByteArray21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lclient!r;)Lclient!wo;")
	public static Class361 method3485(@OriginalArg(0) Class12 arg0) {
		@Pc(3) int local3 = anInt4088 - anInt4093;
		@Pc(7) int local7 = anInt4094 - anInt4089;
		@Pc(15) int local15 = (anInt4091 - anInt4090 << 16) / local3;
		@Pc(23) int local23 = (anInt4092 - anInt4086 << 16) / local7;
		return method3489(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!fa;III)I")
	private static int method3486(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class303 local4 = aClass206_2.method4718(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt8309;
		if (local11 >= 0 && arg0.method4043(local11).aBoolean118) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt8303 >= 0) {
			local27 = local4.anInt8303;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static341.anIntArray409[Static242.method3964(Static362.method5267(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static341.anIntArray409[Static242.method3964(Static362.method5267(arg0.method4043(local11).aShort19)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt8298 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt8298;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static341.anIntArray409[Static242.method3964(Static362.method5267(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "()V")
	private static void method3487() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt4095; local1++) {
			for (local4 = 0; local4 < anInt4087; local4++) {
				local15 = aShortArray48[local1 + local4 * anInt4095] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub12 local31 = (Class1_Sub12) aClass356_17.method7796((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray37.length; local35++) {
								@Pc(46) Class306 local46 = aClass214_3.method4897(local31.aShortArray37[local35] & 0xFFFF);
								local49 = local46.anInt8409;
								if (local46.anIntArray570 != null) {
									local46 = local46.method6966(anInterface15_2);
									if (local46 != null) {
										local49 = local46.anInt8409;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class1_Sub27 local70 = new Class1_Sub27(local49);
									local70.anInt5627 = local1;
									local70.anInt5623 = local4;
									aClass361_41.method7855(local70);
								}
							}
						}
					} else {
						@Pc(94) Class306 local94 = aClass214_3.method4897(local15 - 1);
						local35 = local94.anInt8409;
						if (local94.anIntArray570 != null) {
							local94 = local94.method6966(anInterface15_2);
							if (local94 != null) {
								local35 = local94.anInt8409;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class1_Sub27 local118 = new Class1_Sub27(local35);
							local118.anInt5627 = local1;
							local118.anInt5623 = local4;
							aClass361_41.method7855(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass349ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass349ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class349 local153 = aClass349ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class20_Sub4 local160 = (Class20_Sub4) local153.method7653(); local160 != null; local160 = (Class20_Sub4) local153.method7660()) {
							if (local160.aShortArray36 != null) {
								for (local49 = 0; local49 < local160.aShortArray36.length; local49++) {
									@Pc(177) Class306 local177 = aClass214_3.method4897(local160.aShortArray36[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt8409;
									if (local177.anIntArray570 != null) {
										local177 = local177.method6966(anInterface15_2);
										if (local177 != null) {
											local180 = local177.anInt8409;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class1_Sub27 local201 = new Class1_Sub27(local180);
										local201.anInt5627 = (local15 + (anInt4085 >> 6)) * 64 + local160.aByte35 - anInt4085;
										local201.anInt5623 = (local144 + (anInt4096 >> 6)) * 64 + local160.aByte34 - anInt4096;
										aClass361_41.method7855(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;Lclient!io;IIII[I[I)V")
	private static void method3488(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class1_Sub20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method4393();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method4393();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray39[arg4 + arg5 * anInt4095] = (byte) local21;
					aByteArray36[arg4 + arg5 * anInt4095] = 0;
				} else {
					aByteArray36[arg4 + arg5 * anInt4095] = (byte) local21;
					aByteArray37[arg4 + arg5 * anInt4095] = 0;
					aByteArray39[arg4 + arg5 * anInt4095] = arg1.method4432();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method4393();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method4393();
				local127 = arg1.method4393();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method4393();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray39[arg4 + arg5 * anInt4095] = (byte) local123;
				aByteArray36[arg4 + arg5 * anInt4095] = (byte) local125;
				aByteArray37[arg4 + arg5 * anInt4095] = (byte) local127;
				if (local139 == 1) {
					aShortArray48[arg4 + arg5 * anInt4095] = (short) (arg1.method4426() + 1);
					aByteArray35[arg4 + arg5 * anInt4095] = arg1.method4432();
				} else if (local139 > 1) {
					aShortArray48[arg4 + arg5 * anInt4095] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4426();
						local218[local220] = arg1.method4432();
					}
					aClass356_17.method7800((long) (arg4 << 16 | arg5), new Class1_Sub12(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4426();
						local218[local220] = arg1.method4432();
					}
				}
				if (aClass349ArrayArrayArray2[local118 - 1][arg2 - (anInt4085 >> 6)][arg3 - (anInt4096 >> 6)] == null) {
					aClass349ArrayArrayArray2[local118 - 1][arg2 - (anInt4085 >> 6)][arg3 - (anInt4096 >> 6)] = new Class349();
				}
				@Pc(338) Class20_Sub4 local338 = new Class20_Sub4(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass349ArrayArrayArray2[local118 - 1][arg2 - (anInt4085 >> 6)][arg3 - (anInt4096 >> 6)].method7655(local338);
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lclient!r;IIII)Lclient!wo;")
	private static Class361 method3489(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub27 local4 = (Class1_Sub27) aClass361_41.method7854(); local4 != null; local4 = (Class1_Sub27) aClass361_41.method7853()) {
			method3482(arg0, local4, arg1, arg2);
		}
		return aClass361_41;
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "()V")
	public static void method3490() {
		aByteArray39 = null;
		aByteArray38 = null;
		aShortArray49 = null;
		aByteArray36 = null;
		aByteArray37 = null;
		aShortArray48 = null;
		aByteArray35 = null;
		aClass356_17 = null;
		aClass349ArrayArrayArray2 = null;
		anIntArray233 = null;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!ga;Lclient!lp;Lclient!cq;Lclient!mg;Lclient!cf;Lclient!kaa;Lclient!ml;)V")
	public static void method3491(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class214 arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) Class184 arg5, @OriginalArg(6) Interface15 arg6) {
		aClass111_42 = arg0;
		aClass206_2 = arg1;
		aClass56_2 = arg2;
		aClass214_3 = arg3;
		aClass46_2 = arg4;
		aClass184_3 = arg5;
		anInterface15_2 = arg6;
		aClass356_16.method7802();
		@Pc(21) int local21 = aClass111_42.method2462("details");
		@Pc(26) int[] local26 = aClass111_42.method2457(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class1_Sub3_Sub17 local39 = Static501.method6970(aClass111_42, local21, local26[local30]);
				aClass356_16.method7800((long) local39.anInt8092, local39);
			}
		}
		Static113.method1979(false, true);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;IIII[S[B)V")
	private static void method3492(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class306 local14 = aClass214_3.method4897(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt8391;
			if (local17 != -1) {
				@Pc(25) Class223 local25 = aClass184_3.method4074(local17);
				@Pc(49) Class10 local49 = local25.method5099(local14.aBoolean607 ? local14.aBoolean609 : false, local14.aBoolean622 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.A() >> 2;
					@Pc(65) int local65 = arg4 * local49.ca() >> 2;
					if (local25.aBoolean435) {
						@Pc(71) int local71 = local14.anInt8385;
						@Pc(74) int local74 = local14.anInt8414;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt6073 == 0) {
							local49.method7682(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7680(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt6073 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([B[B[SII)V")
	private static void method3493(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt4087];
		@Pc(5) int[] local5 = new int[anInt4087];
		@Pc(8) int[] local8 = new int[anInt4087];
		@Pc(11) int[] local11 = new int[anInt4087];
		@Pc(14) int[] local14 = new int[anInt4087];
		for (@Pc(16) int local16 = -5; local16 < anInt4095; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt4087; local27++) {
				@Pc(50) Class166 local50;
				@Pc(86) int local86;
				if (local21 < anInt4095) {
					local41 = arg0[local21 + local27 * anInt4095] & 0xFF;
					if (local41 > 0) {
						local50 = aClass56_2.method1618(local41 - 1);
						local2[local27] += local50.anInt4602;
						local5[local27] += local50.anInt4598;
						local8[local27] += local50.anInt4608;
						local11[local27] += local50.anInt4600;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt4095] & 0xFF;
					if (local41 > 0) {
						local50 = aClass56_2.method1618(local41 - 1);
						local2[local27] -= local50.anInt4602;
						local5[local27] -= local50.anInt4598;
						local8[local27] -= local50.anInt4608;
						local11[local27] -= local50.anInt4600;
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
				for (@Pc(167) int local167 = -5; local167 < anInt4087; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt4087) {
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
						if ((arg0[local16 + local167 * anInt4095] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt4095;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static204.method3498(local161 / local165, local159 / local165, local41 * 256 / local163);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt4095;
							@Pc(333) int local333 = Static341.anIntArray409[Static242.method3964(Static164.method2527(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)Lclient!sfa;")
	public static Class1_Sub3_Sub17 method3494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub3_Sub17 local4 = (Class1_Sub3_Sub17) aClass356_16.method7792(); local4 != null; local4 = (Class1_Sub3_Sub17) aClass356_16.method7795()) {
			if (local4.aBoolean578 && local4.method6740(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt4093 = arg0 - anInt4085;
		anInt4094 = arg1 - anInt4096;
		anInt4088 = arg2 - anInt4085;
		anInt4089 = arg3 - anInt4096;
		anInt4090 = arg4;
		anInt4086 = arg5;
		anInt4091 = arg6;
		anInt4092 = arg7;
	}
}
