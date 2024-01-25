import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_64 = new Class186(100, 0);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	public static void method3017() {
		Static492.method7119(255, -1);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	public static void method3019() {
		@Pc(8) Class3_Sub28_Sub2 local8 = Static532.aClass400_3.aClass3_Sub28_Sub2_2;
		for (@Pc(17) int local17 = 0; local17 < Static48.anInt822; local17++) {
			@Pc(23) int local23 = Static6.anIntArray3[local17];
			@Pc(31) Class19_Sub1_Sub3_Sub2_Sub1 local31 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) local23)).aClass19_Sub1_Sub3_Sub2_Sub1_2;
			@Pc(37) int local37 = local8.method5322(-102);
			if ((local37 & 0x1) != 0) {
				local37 += local8.method5322(-29) << 8;
			}
			if ((local37 & 0x1000) != 0) {
				local37 += local8.method5322(-91) << 16;
			}
			@Pc(73) int local73;
			@Pc(75) int local75;
			@Pc(86) int local86;
			@Pc(99) int local99;
			@Pc(108) int[] local108;
			@Pc(118) int local118;
			@Pc(146) int local146;
			@Pc(179) int local179;
			@Pc(134) short[] local134;
			@Pc(167) short[] local167;
			@Pc(212) long local212;
			if ((local37 & 0x100) != 0) {
				local73 = local31.aClass18_1.anIntArray21.length;
				local75 = 0;
				if (local31.aClass18_1.aShortArray9 != null) {
					local75 = local31.aClass18_1.aShortArray9.length;
				}
				local86 = 0;
				if (local31.aClass18_1.aShortArray7 != null) {
					local86 = local31.aClass18_1.aShortArray7.length;
				}
				local99 = local8.method5293();
				if ((local99 & 0x1) == 1) {
					local31.aClass208_1 = null;
				} else {
					local108 = null;
					if ((local99 & 0x2) == 2) {
						local108 = new int[local73];
						for (local118 = 0; local118 < local73; local118++) {
							local108[local118] = local8.method5272();
						}
					}
					local134 = null;
					if ((local99 & 0x4) == 4) {
						local134 = new short[local75];
						for (local146 = 0; local146 < local75; local146++) {
							local134[local146] = (short) local8.method5305();
						}
					}
					local167 = null;
					if ((local99 & 0x8) == 8) {
						local167 = new short[local86];
						for (local179 = 0; local179 < local86; local179++) {
							local167[local179] = (short) local8.method5303();
						}
					}
					local212 = (long) local23 | (long) local31.anInt4136++ << 32;
					local31.aClass208_1 = new Class208(local212, local108, local134, local167);
				}
			}
			if ((local37 & 0x200) != 0) {
				local31.aByte120 = local8.method5318();
				local31.aByte121 = local8.method5318();
				local31.aByte119 = local8.method5299();
				local31.aByte118 = (byte) local8.method5334();
				local31.anInt7813 = Static269.anInt4883 + local8.method5303();
				local31.anInt7808 = Static269.anInt4883 + local8.method5303();
			}
			if ((local37 & 0x20000) != 0) {
				local31.anInt4146 = local8.method5301();
				if (local31.anInt4146 == 65535) {
					local31.anInt4146 = local31.aClass18_1.anInt431;
				}
			}
			@Pc(304) int[] local304;
			@Pc(307) int[] local307;
			@Pc(315) int local315;
			if ((local37 & 0x400) != 0) {
				local73 = local8.method5293();
				local304 = new int[local73];
				local307 = new int[local73];
				for (local99 = 0; local99 < local73; local99++) {
					local315 = local8.method5303();
					if ((local315 & 0xC000) == 49152) {
						local118 = local8.method5303();
						local304[local99] = local315 << 16 | local118;
					} else {
						local304[local99] = local315;
					}
					local307[local99] = local8.method5301();
				}
				local31.method6601(local304, local307);
			}
			if ((local37 & 0x4000) != 0) {
				local73 = local8.method5272();
				local31.anInt7806 = local8.method5322(-26);
				local31.anInt7758 = local8.method5308();
				local31.aBoolean593 = (local73 & 0x8000) != 0;
				local31.anInt7771 = local73 & 0x7FFF;
				local31.anInt7785 = Static269.anInt4883 + local31.anInt7771 + local31.anInt7806;
			}
			@Pc(463) boolean local463;
			if ((local37 & 0x10000) != 0) {
				local73 = local8.method5305();
				if (local73 == 65535) {
					local73 = -1;
				}
				local75 = local8.method5323();
				local86 = local8.method5322(-95);
				local99 = local86 & 0x7;
				local315 = local86 >> 3 & 0xF;
				if (local315 == 15) {
					local315 = -1;
				}
				local463 = (local86 >> 7 & 0x1) == 1;
				local31.method6585(local75, 2, local99, local463, local315, local73);
			}
			if ((local37 & 0x2) != 0) {
				local31.anInt4137 = local8.method5272();
				local31.anInt4140 = local8.method5272();
			}
			if ((local37 & 0x800) != 0) {
				local73 = local8.method5301();
				if (local73 == 65535) {
					local73 = -1;
				}
				local75 = local8.method5314();
				local86 = local8.method5322(-69);
				local99 = local86 & 0x7;
				local315 = local86 >> 3 & 0xF;
				if (local315 == 15) {
					local315 = -1;
				}
				local463 = (local86 >> 7 & 0x1) == 1;
				local31.method6585(local75, 1, local99, local463, local315, local73);
			}
			if ((local37 & 0x8000) != 0) {
				local73 = local8.method5334();
				local304 = new int[local73];
				local307 = new int[local73];
				@Pc(573) int[] local573 = new int[local73];
				for (local315 = 0; local315 < local73; local315++) {
					local118 = local8.method5303();
					if (local118 == 65535) {
						local118 = -1;
					}
					local304[local315] = local118;
					local307[local315] = local8.method5293();
					local573[local315] = local8.method5301();
				}
				Static363.method5199(local573, local307, local304, local31);
			}
			if ((local37 & 0x100000) != 0) {
				local73 = local8.method5305();
				if (local73 == 65535) {
					local73 = -1;
				}
				local75 = local8.method5314();
				local86 = local8.method5322(-39);
				local99 = local86 & 0x7;
				local315 = local86 >> 3 & 0xF;
				if (local315 == 15) {
					local315 = -1;
				}
				local463 = (local86 >> 7 & 0x1) == 1;
				local31.method6585(local75, 3, local99, local463, local315, local73);
			}
			if ((local37 & 0x80000) != 0) {
				local73 = local31.aClass18_1.anIntArray22.length;
				local75 = 0;
				if (local31.aClass18_1.aShortArray9 != null) {
					local75 = local31.aClass18_1.aShortArray9.length;
				}
				if (local31.aClass18_1.aShortArray7 != null) {
					local75 = local31.aClass18_1.aShortArray7.length;
				}
				local99 = local8.method5322(-114);
				if ((local99 & 0x1) != 1) {
					local108 = null;
					if ((local99 & 0x2) == 2) {
						local108 = new int[local73];
						for (local118 = 0; local118 < local73; local118++) {
							local108[local118] = local8.method5272();
						}
					}
					local134 = null;
					if ((local99 & 0x4) == 4) {
						local134 = new short[local75];
						for (local146 = 0; local146 < local75; local146++) {
							local134[local146] = (short) local8.method5301();
						}
					}
					local167 = null;
					if ((local99 & 0x8) == 8) {
						local167 = new short[0];
						for (local179 = 0; local179 < 0; local179++) {
							local167[local179] = (short) local8.method5301();
						}
					}
					local212 = (long) local31.anInt4145++ << 32 | (long) local23;
					new Class208(local212, local108, local134, local167);
				}
			}
			if ((local37 & 0x40) != 0) {
				local73 = local8.method5293();
				if (local73 > 0) {
					for (local75 = 0; local75 < local73; local75++) {
						local99 = -1;
						local315 = -1;
						local86 = local8.method5331();
						local118 = -1;
						if (local86 == 32767) {
							local86 = local8.method5331();
							local315 = local8.method5331();
							local99 = local8.method5331();
							local118 = local8.method5331();
						} else if (local86 == 32766) {
							local86 = -1;
						} else {
							local315 = local8.method5331();
						}
						local146 = local8.method5331();
						local179 = local8.method5322(-38);
						local31.method6589(local86, local118, local315, local146, local179, Static269.anInt4883, local99);
					}
				}
			}
			if ((local37 & 0x10) != 0) {
				local73 = local8.method5303();
				local75 = local8.method5323();
				if (local73 == 65535) {
					local73 = -1;
				}
				local86 = local8.method5308();
				local99 = local86 & 0x7;
				local315 = local86 >> 3 & 0xF;
				if (local315 == 15) {
					local315 = -1;
				}
				local463 = (local86 >> 7 & 0x1) == 1;
				local31.method6585(local75, 0, local99, local463, local315, local73);
			}
			if ((local37 & 0x20) != 0) {
				if (local31.aClass18_1.method411()) {
					Static46.method629(local31);
				}
				local31.method3434(Static631.aClass85_2.method2214(local8.method5305()));
				local31.method6599(local31.aClass18_1.anInt437);
				local31.anInt7818 = local31.aClass18_1.anInt464 << 3;
				if (local31.aClass18_1.method411()) {
					Static119.method2062((Class19_Sub1_Sub3_Sub2_Sub2) null, local31.anIntArray430[0], (Class144) null, local31.lb[0], local31, 0, local31.aByte146);
				}
			}
			if ((local37 & 0x2000) != 0) {
				local31.anInt7811 = local8.method5299();
				local31.anInt7816 = local8.method5330();
				local31.anInt7820 = local8.method5288();
				local31.anInt7809 = local8.method5288();
				local31.anInt7812 = local8.method5305() + Static269.anInt4883;
				local31.anInt7814 = local8.method5303() + Static269.anInt4883;
				local31.anInt7817 = local8.method5322(-56);
				local31.anInt7816 += local31.lb[0];
				local31.anInt7809 += local31.lb[0];
				local31.anInt7811 += local31.anIntArray430[0];
				local31.anInt7822 = 0;
				local31.anInt7824 = 1;
				local31.anInt7820 += local31.anIntArray430[0];
			}
			if ((local37 & 0x40000) != 0) {
				local31.aString69 = local8.method5295();
				if ("".equals(local31.aString69) || local31.aString69.equals(local31.aClass18_1.aString6)) {
					local31.aString69 = local31.aClass18_1.aString6;
				}
			}
			if ((local37 & 0x8) != 0) {
				local31.anInt7780 = local8.method5305();
				if (local31.anInt7780 == 65535) {
					local31.anInt7780 = -1;
				}
			}
			if ((local37 & 0x4) != 0) {
				local31.method3439(local8.method5295());
			}
			if ((local37 & 0x80) != 0) {
				@Pc(1228) int[] local1228 = new int[4];
				for (local75 = 0; local75 < 4; local75++) {
					local1228[local75] = local8.method5272();
					if (local1228[local75] == 65535) {
						local1228[local75] = -1;
					}
				}
				local86 = local8.method5334();
				Static192.method2903(local31, true, local86, local1228);
			}
		}
	}
}
