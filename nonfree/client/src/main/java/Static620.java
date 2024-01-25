import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!uw", name = "D", descriptor = "Lclient!kq;")
	public static Class199 aClass199_15 = null;

	@OriginalMember(owner = "client!uw", name = "M", descriptor = "Z")
	public static boolean aBoolean705 = false;

	@OriginalMember(owner = "client!uw", name = "O", descriptor = "Z")
	public static boolean aBoolean706 = false;

	@OriginalMember(owner = "client!uw", name = "P", descriptor = "Z")
	public static final boolean aBoolean707 = false;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V")
	public static void method7579() {
		Static280.anIntArray713 = null;
		Static128.anIntArray158 = null;
		Static19.anIntArray41 = null;
		Static129.aBoolean168 = false;
		Static567.anIntArray623 = null;
		Static47.anIntArray69 = null;
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(Z)V")
	public static void method7580() {
		for (@Pc(7) int local7 = 0; local7 < Static277.anInt4479; local7++) {
			@Pc(13) int local13 = Static259.anIntArray307[local7];
			@Pc(21) Class3_Sub1_Sub2_Sub2_Sub2 local21 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) local13)).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			@Pc(25) int local25 = Static159.aClass4_Sub11_Sub1_1.method8865();
			if ((local25 & 0x4) != 0) {
				local25 += Static159.aClass4_Sub11_Sub1_1.method8865() << 8;
			}
			if ((local25 & 0x8000) != 0) {
				local25 += Static159.aClass4_Sub11_Sub1_1.method8865() << 16;
			}
			@Pc(57) int local57;
			if ((local25 & 0x800) != 0) {
				local57 = Static159.aClass4_Sub11_Sub1_1.method8890();
				local21.anInt9975 = Static159.aClass4_Sub11_Sub1_1.method8843();
				local21.anInt9995 = Static159.aClass4_Sub11_Sub1_1.method8865();
				local21.aBoolean774 = (local57 & 0x8000) != 0;
				local21.anInt9937 = local57 & 0x7FFF;
				local21.anInt9949 = local21.anInt9937 + Static177.anInt3088 + local21.anInt9975;
			}
			@Pc(105) int[] local105;
			@Pc(108) int[] local108;
			@Pc(113) int local113;
			@Pc(119) int local119;
			if ((local25 & 0x400) != 0) {
				local57 = Static159.aClass4_Sub11_Sub1_1.method8855();
				local105 = new int[local57];
				local108 = new int[local57];
				@Pc(111) int[] local111 = new int[local57];
				for (local113 = 0; local113 < local57; local113++) {
					local119 = Static159.aClass4_Sub11_Sub1_1.method8883();
					if (local119 == 65535) {
						local119 = -1;
					}
					local105[local113] = local119;
					local108[local113] = Static159.aClass4_Sub11_Sub1_1.method8843();
					local111[local113] = Static159.aClass4_Sub11_Sub1_1.method8883();
				}
				Static445.method6121(local105, local108, local21, local111);
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt9947 = Static159.aClass4_Sub11_Sub1_1.method8883();
				if (local21.anInt9947 == 65535) {
					local21.anInt9947 = -1;
				}
			}
			@Pc(256) int local256;
			@Pc(281) int local281;
			@Pc(187) int local187;
			@Pc(211) int local211;
			@Pc(220) int[] local220;
			@Pc(244) short[] local244;
			@Pc(271) short[] local271;
			@Pc(308) long local308;
			if ((local25 & 0x10000) != 0) {
				local57 = local21.aClass345_1.anIntArray625.length;
				local187 = 0;
				if (local21.aClass345_1.aShortArray143 != null) {
					local187 = local21.aClass345_1.aShortArray143.length;
				}
				if (local21.aClass345_1.aShortArray145 != null) {
					local187 = local21.aClass345_1.aShortArray145.length;
				}
				local211 = Static159.aClass4_Sub11_Sub1_1.method8855();
				if ((local211 & 0x1) != 1) {
					local220 = null;
					if ((local211 & 0x2) == 2) {
						local220 = new int[local57];
						for (local119 = 0; local119 < local57; local119++) {
							local220[local119] = Static159.aClass4_Sub11_Sub1_1.method8883();
						}
					}
					local244 = null;
					if ((local211 & 0x4) == 4) {
						local244 = new short[local187];
						for (local256 = 0; local256 < local187; local256++) {
							local244[local256] = (short) Static159.aClass4_Sub11_Sub1_1.method8890();
						}
					}
					local271 = null;
					if ((local211 & 0x8) == 8) {
						local271 = new short[0];
						for (local281 = 0; local281 < 0; local281++) {
							local271[local281] = (short) Static159.aClass4_Sub11_Sub1_1.method8871();
						}
					}
					local308 = (long) local13 | (long) local21.anInt10015++ << 32;
					new Class133(local308, local220, local244, local271);
				}
			}
			if ((local25 & 0x8) != 0) {
				if (local21.aClass345_1.method7531()) {
					Static529.method2538(local21);
				}
				local21.method8537(Static255.aClass380_1.method8596(Static159.aClass4_Sub11_Sub1_1.method8871()));
				local21.method8515(local21.aClass345_1.anInt8812);
				local21.anInt9976 = local21.aClass345_1.anInt8799 << 3;
				if (local21.aClass345_1.method7531()) {
					Static245.method6857(local21, (Class3_Sub1_Sub2_Sub2_Sub1) null, local21.aByte141, local21.anIntArray694[0], (Class342) null, 0, local21.anIntArray693[0]);
				}
			}
			if ((local25 & 0x2) != 0) {
				local21.anInt10012 = Static159.aClass4_Sub11_Sub1_1.method8859();
				local21.anInt10004 = Static159.aClass4_Sub11_Sub1_1.method8859();
			}
			@Pc(404) int local404;
			if ((local25 & 0x80000) != 0) {
				local57 = Static159.aClass4_Sub11_Sub1_1.method8871();
				local187 = Static159.aClass4_Sub11_Sub1_1.method8837();
				if (local57 == 65535) {
					local57 = -1;
				}
				local404 = Static159.aClass4_Sub11_Sub1_1.method8843();
				local211 = local404 & 0x7;
				local113 = local404 >> 3 & 0xF;
				if (local113 == 15) {
					local113 = -1;
				}
				local21.method8530(2, local57, local113, local211, local187);
			}
			if ((local25 & 0x4000) != 0) {
				local21.aByte145 = Static159.aClass4_Sub11_Sub1_1.method8861();
				local21.aByte144 = Static159.aClass4_Sub11_Sub1_1.method8882();
				local21.aByte146 = Static159.aClass4_Sub11_Sub1_1.method8875();
				local21.aByte147 = (byte) Static159.aClass4_Sub11_Sub1_1.method8843();
				local21.anInt9956 = Static177.anInt3088 + Static159.aClass4_Sub11_Sub1_1.method8859();
				local21.anInt9994 = Static177.anInt3088 + Static159.aClass4_Sub11_Sub1_1.method8890();
			}
			if ((local25 & 0x2000) != 0) {
				local57 = Static159.aClass4_Sub11_Sub1_1.method8865();
				local105 = new int[local57];
				local108 = new int[local57];
				for (local211 = 0; local211 < local57; local211++) {
					local113 = Static159.aClass4_Sub11_Sub1_1.method8890();
					if ((local113 & 0xC000) == 49152) {
						local119 = Static159.aClass4_Sub11_Sub1_1.method8890();
						local105[local211] = local119 | local113 << 16;
					} else {
						local105[local211] = local113;
					}
					local108[local211] = Static159.aClass4_Sub11_Sub1_1.method8883();
				}
				local21.method8528(local108, local105);
			}
			if ((local25 & 0x1000) != 0) {
				local21.anInt9952 = Static159.aClass4_Sub11_Sub1_1.method8831();
				local21.anInt9969 = Static159.aClass4_Sub11_Sub1_1.method8882();
				local21.anInt9933 = Static159.aClass4_Sub11_Sub1_1.method8882();
				local21.anInt9966 = Static159.aClass4_Sub11_Sub1_1.method8861();
				local21.anInt9945 = Static159.aClass4_Sub11_Sub1_1.method8859() + Static177.anInt3088;
				local21.anInt9987 = Static159.aClass4_Sub11_Sub1_1.method8871() + Static177.anInt3088;
				local21.anInt9979 = Static159.aClass4_Sub11_Sub1_1.method8843();
				local21.anInt10003 = 1;
				local21.anInt9969 += local21.anIntArray694[0];
				local21.anInt9966 += local21.anIntArray694[0];
				local21.anInt9933 += local21.anIntArray693[0];
				local21.anInt10001 = 0;
				local21.anInt9952 += local21.anIntArray693[0];
			}
			if ((local25 & 0x20) != 0) {
				local57 = Static159.aClass4_Sub11_Sub1_1.method8862();
				if (local57 > 0) {
					for (local187 = 0; local187 < local57; local187++) {
						local211 = -1;
						local113 = -1;
						local404 = Static159.aClass4_Sub11_Sub1_1.method8823();
						local119 = -1;
						if (local404 == 32767) {
							local404 = Static159.aClass4_Sub11_Sub1_1.method8823();
							local113 = Static159.aClass4_Sub11_Sub1_1.method8823();
							local211 = Static159.aClass4_Sub11_Sub1_1.method8823();
							local119 = Static159.aClass4_Sub11_Sub1_1.method8823();
						} else if (local404 == 32766) {
							local404 = -1;
						} else {
							local113 = Static159.aClass4_Sub11_Sub1_1.method8823();
						}
						local256 = Static159.aClass4_Sub11_Sub1_1.method8823();
						local281 = Static159.aClass4_Sub11_Sub1_1.method8855();
						local21.method8511(local119, local211, local113, Static177.anInt3088, local404, local281, local256);
					}
				}
			}
			if ((local25 & 0x40000) != 0) {
				local21.aString120 = Static159.aClass4_Sub11_Sub1_1.method8853();
				if ("".equals(local21.aString120) || local21.aString120.equals(local21.aClass345_1.aString107)) {
					local21.aString120 = local21.aClass345_1.aString107;
				}
			}
			if ((local25 & 0x1) != 0) {
				local21.aString119 = Static159.aClass4_Sub11_Sub1_1.method8853();
				local21.anInt9993 = 100;
			}
			if ((local25 & 0x200) != 0) {
				local57 = Static159.aClass4_Sub11_Sub1_1.method8859();
				local187 = Static159.aClass4_Sub11_Sub1_1.method8850();
				if (local57 == 65535) {
					local57 = -1;
				}
				local404 = Static159.aClass4_Sub11_Sub1_1.method8865();
				local211 = local404 & 0x7;
				local113 = local404 >> 3 & 0xF;
				if (local113 == 15) {
					local113 = -1;
				}
				local21.method8530(1, local57, local113, local211, local187);
			}
			if ((local25 & 0x40) != 0) {
				local57 = Static159.aClass4_Sub11_Sub1_1.method8871();
				local187 = Static159.aClass4_Sub11_Sub1_1.method8850();
				if (local57 == 65535) {
					local57 = -1;
				}
				local404 = Static159.aClass4_Sub11_Sub1_1.method8855();
				local211 = local404 & 0x7;
				local113 = local404 >> 3 & 0xF;
				if (local113 == 15) {
					local113 = -1;
				}
				local21.method8530(0, local57, local113, local211, local187);
			}
			if ((local25 & 0x80) != 0) {
				@Pc(861) int[] local861 = new int[4];
				for (local187 = 0; local187 < 4; local187++) {
					local861[local187] = Static159.aClass4_Sub11_Sub1_1.method8890();
					if (local861[local187] == 65535) {
						local861[local187] = -1;
					}
				}
				local404 = Static159.aClass4_Sub11_Sub1_1.method8855();
				Static585.method7692(local404, local861, local21);
			}
			if ((local25 & 0x100) != 0) {
				local57 = local21.aClass345_1.anIntArray627.length;
				local187 = 0;
				if (local21.aClass345_1.aShortArray143 != null) {
					local187 = local21.aClass345_1.aShortArray143.length;
				}
				local404 = 0;
				if (local21.aClass345_1.aShortArray145 != null) {
					local404 = local21.aClass345_1.aShortArray145.length;
				}
				local211 = Static159.aClass4_Sub11_Sub1_1.method8843();
				if ((local211 & 0x1) == 1) {
					local21.aClass133_1 = null;
				} else {
					local220 = null;
					if ((local211 & 0x2) == 2) {
						local220 = new int[local57];
						for (local119 = 0; local119 < local57; local119++) {
							local220[local119] = Static159.aClass4_Sub11_Sub1_1.method8859();
						}
					}
					local244 = null;
					if ((local211 & 0x4) == 4) {
						local244 = new short[local187];
						for (local256 = 0; local256 < local187; local256++) {
							local244[local256] = (short) Static159.aClass4_Sub11_Sub1_1.method8859();
						}
					}
					local271 = null;
					if ((local211 & 0x8) == 8) {
						local271 = new short[local404];
						for (local281 = 0; local281 < local404; local281++) {
							local271[local281] = (short) Static159.aClass4_Sub11_Sub1_1.method8890();
						}
					}
					local308 = (long) local21.anInt10025++ << 32 | (long) local13;
					local21.aClass133_1 = new Class133(local308, local220, local244, local271);
				}
			}
			if ((local25 & 0x20000) != 0) {
				local21.anInt10019 = Static159.aClass4_Sub11_Sub1_1.method8890();
				if (local21.anInt10019 == 65535) {
					local21.anInt10019 = local21.aClass345_1.anInt8811;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)V")
	public static void method7581() {
		Static466.method6470();
		@Pc(17) int local17 = Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6055();
		if (local17 == 2) {
			Static602.method7915(Static357.anInt5421, Static632.anInt9867, Static582.aClass33_13);
		} else if (local17 == 3) {
			Static630.method8448(Static582.aClass33_13, Static632.anInt9867, Static357.anInt5421, Static41.anInt851, Static145.anInt2665);
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6056()) {
			Static87.method1771(Static17.aCanvas1);
		}
		if (Static582.aClass33_13 != null) {
			Static591.method7777();
		}
		Static499.aBoolean608 = Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6055() != 0;
		Static423.aBoolean517 = Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6056();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBI)I")
	public static int method7582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static225.anIntArray250[arg1 & 0x3] : Static21.anIntArray42[arg1 & 0x3];
	}
}
