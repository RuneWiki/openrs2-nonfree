import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	public static int anInt557 = 0;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "J")
	public static volatile long aLong15 = 0L;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)Z")
	public static boolean method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static68.method1588(arg1, arg0) | (arg0 & 0x70000) != 0 || Static328.method4993(arg1, arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III[FIII)V")
	public static void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static608.method8539(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static608.method8539(arg3)) {
			@Pc(39) int local39 = Static257.method4273(6408);
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg5 < arg3 ? arg5 : arg3;
			@Pc(52) int local52 = arg5 >> 1;
			@Pc(56) int local56 = arg3 >> 1;
			@Pc(58) float[] local58 = arg2;
			@Pc(65) float[] local65 = new float[local56 * local52 * local39];
			while (true) {
				OpenGL.glTexImage2Df(3553, local41, 34842, arg5, arg3, 0, 6408, 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(83) int local83 = local39 * arg5;
				for (@Pc(85) int local85 = 0; local85 < local39; local85++) {
					@Pc(88) int local88 = local85;
					@Pc(90) int local90 = local85;
					@Pc(94) int local94 = local83 + local85;
					for (@Pc(96) int local96 = 0; local96 < local56; local96++) {
						for (@Pc(99) int local99 = 0; local99 < local52; local99++) {
							@Pc(104) float local104 = local58[local90];
							local90 += local39;
							@Pc(114) float local114 = local104 + local58[local90];
							local90 += local39;
							@Pc(124) float local124 = local114 + local58[local94];
							local94 += local39;
							@Pc(134) float local134 = local124 + local58[local94];
							local65[local88] = local134 * 0.25F;
							local94 += local39;
							local88 += local39;
						}
						local94 += local83;
						local90 += local83;
					}
				}
				@Pc(178) float[] local178 = local65;
				local65 = local58;
				local58 = local178;
				arg5 = local52;
				arg3 = local56;
				local41++;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[Lclient!ria;Z)V")
	public static void method656(@OriginalArg(0) int arg0, @OriginalArg(1) Class303[] arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
			@Pc(21) Class303 local21 = arg1[local16];
			if (local21 != null) {
				if (local21.anInt7935 == 0) {
					if (local21.aClass303Array2 != null) {
						method656(arg0, local21.aClass303Array2);
					}
					@Pc(45) Class2_Sub28 local45 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local21.anInt7962);
					if (local45 != null) {
						Static593.method8369(arg0, local45.anInt5454);
					}
				}
				@Pc(64) Class2_Sub18 local64;
				if (arg0 == 0 && local21.anObjectArray4 != null) {
					local64 = new Class2_Sub18();
					local64.aClass303_4 = local21;
					local64.anObjectArray1 = local21.anObjectArray4;
					Static156.method2728(local64);
				}
				if (arg0 == 1 && local21.anObjectArray18 != null) {
					if (local21.anInt7983 >= 0) {
						@Pc(87) Class303 local87 = Static43.method1101(local21.anInt7962);
						if (local87 == null || local87.aClass303Array2 == null || local21.anInt7983 >= local87.aClass303Array2.length || local21 != local87.aClass303Array2[local21.anInt7983]) {
							continue;
						}
					}
					local64 = new Class2_Sub18();
					local64.aClass303_4 = local21;
					local64.anObjectArray1 = local21.anObjectArray18;
					Static156.method2728(local64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[[BLclient!sa;)V")
	public static void method657(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class309_Sub1 arg1) {
		@Pc(8) int local8 = Static94.aByteArrayArray5.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static635.anIntArray728[local10] >> 8) * 64 - Static406.anInt6899;
				@Pc(40) int local40 = (Static635.anIntArray728[local10] & 0xFF) * 64 - Static338.anInt5885;
				Static113.method2018();
				arg1.method7111(Static141.aClass13_27, Static520.aClass175Array1, local16, local29, local40);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public static void method658() {
		if (Static626.anInt10190 > 1) {
			Static82.anInt2146 = Static148.anInt3063;
			Static626.anInt10190--;
		}
		if (Static236.aBoolean321) {
			Static236.aBoolean321 = false;
			Static271.method4448();
			return;
		}
		if (!Static113.aBoolean192) {
			Static298.method4717();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static429.method8912(); local29++) {
		}
		if (Static454.anInt7416 != 10) {
			return;
		}
		@Pc(51) Class2_Sub31 local51;
		@Pc(60) int local60;
		while (Static392.method5800()) {
			local51 = Static275.method4480(Static640.aClass314_2, Static433.aClass145_127);
			local51.aClass2_Sub17_Sub1_2.method2837(0);
			local60 = local51.aClass2_Sub17_Sub1_2.anInt3378;
			Static185.method3168(local51.aClass2_Sub17_Sub1_2);
			local51.aClass2_Sub17_Sub1_2.method2840(local51.aClass2_Sub17_Sub1_2.anInt3378 - local60);
			Static526.method7309(local51);
		}
		if (Static209.aClass2_Sub47_1 == null) {
			if (Static48.method1203() >= Static77.aLong53) {
				Static209.aClass2_Sub47_1 = Static69.aClass329_1.method7528(Static262.aClass155_9.aString38);
			}
		} else if (Static209.aClass2_Sub47_1.anInt10143 != -1) {
			local51 = Static275.method4480(Static640.aClass314_2, Static2.aClass145_1);
			local51.aClass2_Sub17_Sub1_2.method2879(Static209.aClass2_Sub47_1.anInt10143);
			Static526.method7309(local51);
			Static209.aClass2_Sub47_1 = null;
			Static77.aLong53 = Static48.method1203() + 30000L;
		}
		@Pc(124) Class2_Sub1 local124 = (Class2_Sub1) Static574.aClass114_53.method2772();
		@Pc(141) int local141;
		@Pc(163) int local163;
		@Pc(182) int local182;
		@Pc(224) int local224;
		@Pc(231) int local231;
		@Pc(242) int local242;
		@Pc(139) Class2_Sub31 local139;
		if (local124 != null || Static68.aLong50 < Static48.method1203() - 2000L) {
			local139 = null;
			local141 = 0;
			for (@Pc(146) Class2_Sub1 local146 = (Class2_Sub1) Static232.aClass114_23.method2772(); local146 != null && (local139 == null || local139.aClass2_Sub17_Sub1_2.anInt3378 - local141 < 240); local146 = (Class2_Sub1) Static232.aClass114_23.method2762()) {
				local146.method8920();
				local163 = local146.method7157();
				if (local163 < -1) {
					local163 = -1;
				} else if (local163 > 65534) {
					local163 = 65534;
				}
				local182 = local146.method7155();
				if (local182 < -1) {
					local182 = -1;
				} else if (local182 > 65534) {
					local182 = 65534;
				}
				if (local182 != Static105.anInt2342 || Static315.anInt5580 != local163) {
					if (local139 == null) {
						local139 = Static275.method4480(Static640.aClass314_2, Static393.aClass145_118);
						local139.aClass2_Sub17_Sub1_2.method2837(0);
						local141 = local139.aClass2_Sub17_Sub1_2.anInt3378;
					}
					local224 = local182 - Static105.anInt2342;
					Static105.anInt2342 = local182;
					local231 = local163 - Static315.anInt5580;
					Static315.anInt5580 = local163;
					local242 = (int) ((local146.method7152() - Static68.aLong50) / 20L);
					if (local242 < 8 && local224 >= -32 && local224 <= 31 && local231 >= -32 && local231 <= 31) {
						local224 += 32;
						local231 += 32;
						local139.aClass2_Sub17_Sub1_2.method2879((local242 << 12) + (local224 << 6) + local231);
					} else if (local242 < 32 && local224 >= -128 && local224 <= 127 && local231 >= -128 && local231 <= 127) {
						local224 += 128;
						local139.aClass2_Sub17_Sub1_2.method2837(local242 + 128);
						local231 += 128;
						local139.aClass2_Sub17_Sub1_2.method2879((local224 << 8) + local231);
					} else if (local242 < 32) {
						local139.aClass2_Sub17_Sub1_2.method2837(local242 + 192);
						if (local182 == 1 || local163 == -1) {
							local139.aClass2_Sub17_Sub1_2.method2827(Integer.MIN_VALUE);
						} else {
							local139.aClass2_Sub17_Sub1_2.method2827(local182 | local163 << 16);
						}
					} else {
						local139.aClass2_Sub17_Sub1_2.method2879(local242 + 57344);
						if (local182 == 1 || local163 == -1) {
							local139.aClass2_Sub17_Sub1_2.method2827(Integer.MIN_VALUE);
						} else {
							local139.aClass2_Sub17_Sub1_2.method2827(local163 << 16 | local182);
						}
					}
					Static68.aLong50 = local146.method7152();
				}
			}
			if (local139 != null) {
				local139.aClass2_Sub17_Sub1_2.method2840(local139.aClass2_Sub17_Sub1_2.anInt3378 - local141);
				Static526.method7309(local139);
			}
		}
		@Pc(445) int local445;
		if (local124 != null) {
			@Pc(429) long local429 = (local124.method7152() - Static398.aLong173) / 50L;
			if (local429 > 32767L) {
				local429 = 32767L;
			}
			Static398.aLong173 = local124.method7152();
			local445 = local124.method7157();
			if (local445 < 0) {
				local445 = 0;
			} else if (local445 > 65535) {
				local445 = 65535;
			}
			local163 = local124.method7155();
			if (local163 < 0) {
				local163 = 0;
			} else if (local163 > 65535) {
				local163 = 65535;
			}
			@Pc(475) byte local475 = 0;
			if (local124.method7153() == 2) {
				local475 = 1;
			}
			local224 = (int) local429;
			@Pc(496) Class2_Sub31 local496 = Static275.method4480(Static640.aClass314_2, Static361.aClass145_108);
			local496.aClass2_Sub17_Sub1_2.method2883(local224 | local475 << 15);
			local496.aClass2_Sub17_Sub1_2.method2857(local163 | local445 << 16);
			Static526.method7309(local496);
		}
		if (Static413.anInt6940 > 0) {
			local139 = Static275.method4480(Static640.aClass314_2, Static508.aClass145_146);
			local139.aClass2_Sub17_Sub1_2.method2837(Static413.anInt6940 * 3);
			for (local141 = 0; local141 < Static413.anInt6940; local141++) {
				@Pc(543) Interface20 local543 = Static51.anInterface20Array2[local141];
				@Pc(551) long local551 = (local543.method7057() - Static374.aLong166) / 50L;
				Static374.aLong166 = local543.method7057();
				if (local551 > 65535L) {
					local551 = 65535L;
				}
				local139.aClass2_Sub17_Sub1_2.method2837(local543.method7060());
				local139.aClass2_Sub17_Sub1_2.method2879((int) local551);
			}
			Static526.method7309(local139);
		}
		if (Static356.anInt6168 > 0) {
			Static356.anInt6168--;
		}
		if (Static583.aBoolean679 && Static356.anInt6168 <= 0) {
			Static356.anInt6168 = 20;
			Static583.aBoolean679 = false;
			local139 = Static275.method4480(Static640.aClass314_2, Static301.aClass145_90);
			local139.aClass2_Sub17_Sub1_2.method2889((int) Static464.aFloat130 >> 3);
			local139.aClass2_Sub17_Sub1_2.method2870((int) Static225.aFloat85 >> 3);
			Static526.method7309(local139);
		}
		if (Static356.aBoolean448 != Static453.aBoolean526) {
			Static356.aBoolean448 = Static453.aBoolean526;
			local139 = Static275.method4480(Static640.aClass314_2, Static149.aClass145_51);
			local139.aClass2_Sub17_Sub1_2.method2837(Static453.aBoolean526 ? 1 : 0);
			Static526.method7309(local139);
		}
		if (!Static406.aBoolean496) {
			local139 = Static275.method4480(Static640.aClass314_2, Static549.aClass145_158);
			local139.aClass2_Sub17_Sub1_2.method2837(0);
			local141 = local139.aClass2_Sub17_Sub1_2.anInt3378;
			@Pc(676) Class2_Sub17 local676 = Static305.aClass2_Sub49_15.method8842();
			local139.aClass2_Sub17_Sub1_2.method2873(0, local676.aByteArray26, local676.anInt3378);
			local139.aClass2_Sub17_Sub1_2.method2840(local139.aClass2_Sub17_Sub1_2.anInt3378 - local141);
			Static526.method7309(local139);
			Static406.aBoolean496 = true;
		}
		if (Static348.aClass84ArrayArrayArray5 != null) {
			if (Static407.anInt6909 == 2) {
				Static590.method8341();
			} else if (Static407.anInt6909 == 3) {
				Static303.method4762();
			}
		}
		if (Static385.aBoolean468) {
			Static385.aBoolean468 = false;
		} else {
			Static431.aFloat131 /= 2.0F;
		}
		if (Static405.aBoolean494) {
			Static405.aBoolean494 = false;
		} else {
			Static383.aFloat185 /= 2.0F;
		}
		Static480.method6803();
		if (Static454.anInt7416 != 10) {
			return;
		}
		Static563.method7886();
		Static248.method4176();
		Static380.method8875();
		Static535.anInt8620++;
		if (Static535.anInt8620 > 750) {
			Static271.method4448();
			return;
		}
		Static21.method560();
		Static585.method8083();
		Static246.method4164();
		for (local60 = Static382.aClass282_1.method6474(true); local60 != -1; local60 = Static382.aClass282_1.method6474(false)) {
			Static60.method1320(local60);
			Static238.anIntArray584[Static134.anInt9427++ & 0x1F] = local60;
		}
		@Pc(825) Class303 local825;
		for (@Pc(795) Class2_Sub7_Sub2 local795 = Static418.method6114(); local795 != null; local795 = Static418.method6114()) {
			local445 = local795.method922();
			local163 = local795.method924();
			if (local445 == 1) {
				Static450.anIntArray501[local163] = local795.anInt852;
				Static342.aBoolean425 |= Static226.aBooleanArray6[local163];
				Static329.anIntArray373[Static547.anInt8830++ & 0x1F] = local163;
			} else if (local445 == 2) {
				Static192.aStringArray23[local163] = local795.aString7;
				Static141.anIntArray192[Static28.anInt10469++ & 0x1F] = local163;
			} else if (local445 == 3) {
				local825 = Static43.method1101(local163);
				if (!local795.aString7.equals(local825.aString80)) {
					local825.aString80 = local795.aString7;
					Static514.method7103(local825);
				}
			} else if (local445 == 4) {
				local825 = Static43.method1101(local163);
				local224 = local795.anInt852;
				local231 = local795.anInt855;
				local242 = local795.anInt858;
				if (local224 != local825.anInt7956 || local825.anInt7992 != local231 || local242 != local825.anInt7945) {
					local825.anInt7992 = local231;
					local825.anInt7945 = local242;
					local825.anInt7956 = local224;
					Static514.method7103(local825);
				}
			} else if (local445 == 5) {
				local825 = Static43.method1101(local163);
				if (local825.anInt7931 != local795.anInt852 || local795.anInt852 == -1) {
					local825.anInt7990 = 0;
					local825.anInt8005 = 0;
					local825.anInt7931 = local795.anInt852;
					local825.anInt7913 = 1;
					@Pc(1308) Class228 local1308 = local825.anInt7931 == -1 ? null : Static479.aClass308_2.method7075(local825.anInt7931);
					if (local1308 != null) {
						Static70.method1614(local1308, local825.anInt8005);
					}
					Static514.method7103(local825);
				}
			} else if (local445 == 6) {
				local182 = local795.anInt852;
				local224 = local182 >> 10 & 0x1F;
				local231 = local182 >> 5 & 0x1F;
				local242 = local182 & 0x1F;
				@Pc(906) int local906 = (local242 << 3) + ((local224 << 19) + (local231 << 11));
				@Pc(910) Class303 local910 = Static43.method1101(local163);
				if (local910.anInt7947 != local906) {
					local910.anInt7947 = local906;
					Static514.method7103(local910);
				}
			} else if (local445 == 7) {
				local825 = Static43.method1101(local163);
				@Pc(939) boolean local939 = local795.anInt852 == 1;
				if (local939 != local825.aBoolean567) {
					local825.aBoolean567 = local939;
					Static514.method7103(local825);
				}
			} else if (local445 == 8) {
				local825 = Static43.method1101(local163);
				if (local795.anInt852 != local825.anInt7997 || local795.anInt855 != local825.anInt7967 || local825.anInt7960 != local795.anInt858) {
					local825.anInt7960 = local795.anInt858;
					local825.anInt7967 = local795.anInt855;
					local825.anInt7997 = local795.anInt852;
					if (local825.anInt7964 != -1) {
						if (local825.anInt7951 > 0) {
							local825.anInt7960 = local825.anInt7960 * 32 / local825.anInt7951;
						} else if (local825.anInt7940 > 0) {
							local825.anInt7960 = local825.anInt7960 * 32 / local825.anInt7940;
						}
					}
					Static514.method7103(local825);
				}
			} else if (local445 == 9) {
				local825 = Static43.method1101(local163);
				if (local825.anInt7964 != local795.anInt852 || local825.anInt7927 != local795.anInt855) {
					local825.anInt7964 = local795.anInt852;
					local825.anInt7927 = local795.anInt855;
					Static514.method7103(local825);
				}
			} else if (local445 == 10) {
				local825 = Static43.method1101(local163);
				if (local795.anInt852 != local825.anInt7975 || local795.anInt855 != local825.anInt7939 || local825.anInt7937 != local795.anInt858) {
					local825.anInt7975 = local795.anInt852;
					local825.anInt7937 = local795.anInt858;
					local825.anInt7939 = local795.anInt855;
					Static514.method7103(local825);
				}
			} else if (local445 == 11) {
				local825 = Static43.method1101(local163);
				local825.anInt7923 = local825.anInt7953 = local795.anInt852;
				local825.anInt7955 = local825.anInt7926 = local795.anInt855;
				local825.aByte105 = 0;
				local825.aByte103 = 0;
				Static514.method7103(local825);
			} else if (local445 == 12) {
				local825 = Static43.method1101(local163);
				local224 = local795.anInt852;
				if (local825 != null && local825.anInt7935 == 0) {
					if (local224 > local825.anInt7936 - local825.anInt7971) {
						local224 = local825.anInt7936 - local825.anInt7971;
					}
					if (local224 < 0) {
						local224 = 0;
					}
					if (local825.anInt7982 != local224) {
						local825.anInt7982 = local224;
						Static514.method7103(local825);
					}
				}
			} else if (local445 == 14) {
				local825 = Static43.method1101(local163);
				local825.anInt7949 = local795.anInt852;
			} else if (local445 == 15) {
				Static583.anInt9512 = local795.anInt855;
				Static375.anInt6459 = local795.anInt852;
				Static520.aBoolean607 = true;
			} else if (local445 == 16) {
				local825 = Static43.method1101(local163);
				local825.anInt7918 = local795.anInt852;
			} else if (local445 == 17) {
				local825 = Static43.method1101(local163);
				local825.anInt7946 = local795.anInt852;
			}
		}
		if (Static429.anInt10488 != 0) {
			Static579.anInt9466 += 20;
			if (Static579.anInt9466 >= 400) {
				Static429.anInt10488 = 0;
			}
		}
		Static190.anInt3789++;
		if (Static449.aClass303_16 != null) {
			Static382.anInt6626++;
			if (Static382.anInt6626 >= 15) {
				Static514.method7103(Static449.aClass303_16);
				Static449.aClass303_16 = null;
			}
		}
		Static551.aBoolean626 = false;
		Static422.aClass303_15 = null;
		Static252.aBoolean360 = false;
		Static582.aClass303_21 = null;
		Static90.method1856((Class303) null, -1, -1);
		Static577.method8013((Class303) null, -1, -1);
		if (!Static557.aBoolean660) {
			Static398.anInt6843 = -1;
		}
		Static478.method6781();
		Static148.anInt3063++;
		if (Static224.aBoolean307) {
			@Pc(1455) Class2_Sub31 local1455 = Static275.method4480(Static640.aClass314_2, Static121.aClass145_47);
			local1455.aClass2_Sub17_Sub1_2.method2827(Static514.anInt8279 << 28 | Static166.anInt3399 << 14 | Static591.anInt9827);
			Static526.method7309(local1455);
			Static224.aBoolean307 = false;
		}
		while (true) {
			@Pc(1478) Class2_Sub18 local1478;
			@Pc(1483) Class303 local1483;
			do {
				local1478 = (Class2_Sub18) Static596.aClass114_59.method2765();
				if (local1478 == null) {
					while (true) {
						do {
							local1478 = (Class2_Sub18) Static289.aClass114_27.method2765();
							if (local1478 == null) {
								while (true) {
									do {
										local1478 = (Class2_Sub18) Static102.aClass114_11.method2765();
										if (local1478 == null) {
											if (Static422.aClass303_15 == null) {
												Static272.anInt5078 = 0;
											}
											if (Static351.aClass303_13 != null) {
												Static559.method7860();
											}
											if (Static463.anInt7496 > 0 && Static185.aClass221_1.method8050(82) && Static185.aClass221_1.method8050(81) && Static617.anInt10101 != 0) {
												local445 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 - Static617.anInt10101;
												if (local445 < 0) {
													local445 = 0;
												} else if (local445 > 3) {
													local445 = 3;
												}
												Static99.method1935(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0] + Static338.anInt5885, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0] + Static406.anInt6899, local445);
											}
											Static533.method7371();
											for (local445 = 0; local445 < 5; local445++) {
												@Pc(1675) int local1675 = Static455.anIntArray684[local445]++;
											}
											if (Static342.aBoolean425 && Static48.method1203() - 60000L > Static641.aLong271) {
												Static293.method4635();
											}
											for (@Pc(1702) Class16_Sub6_Sub2 local1702 = (Class16_Sub6_Sub2) Static39.aClass19_2.method562(); local1702 != null; local1702 = (Class16_Sub6_Sub2) Static39.aClass19_2.method558()) {
												if (Static48.method1203() / 1000L - 5L > (long) local1702.anInt6081) {
													if (local1702.aShort83 > 0) {
														Static107.method1973(local1702.aString50 + Static573.aClass345_21.method7951(Static496.anInt7407), 0, "", "", 5, "");
													}
													if (local1702.aShort83 == 0) {
														Static107.method1973(local1702.aString50 + Static573.aClass345_22.method7951(Static496.anInt7407), 0, "", "", 5, "");
													}
													local1702.method8874();
												}
											}
											Static461.anInt7464++;
											if (Static461.anInt7464 > 500) {
												Static461.anInt7464 = 0;
												local182 = (int) (Math.random() * 8.0D);
												if ((local182 & 0x2) == 2) {
													Static538.anInt8671 += Static464.anInt7520;
												}
												if ((local182 & 0x4) == 4) {
													Static66.anInt1804 += Static249.anInt4782;
												}
												if ((local182 & 0x1) == 1) {
													Static605.anInt10017 += Static189.anInt3758;
												}
											}
											if (Static605.anInt10017 < -50) {
												Static189.anInt3758 = 2;
											}
											if (Static605.anInt10017 > 50) {
												Static189.anInt3758 = -2;
											}
											if (Static538.anInt8671 < -55) {
												Static464.anInt7520 = 2;
											}
											if (Static538.anInt8671 > 55) {
												Static464.anInt7520 = -2;
											}
											if (Static66.anInt1804 < -40) {
												Static249.anInt4782 = 1;
											}
											Static545.anInt8790++;
											if (Static66.anInt1804 > 40) {
												Static249.anInt4782 = -1;
											}
											if (Static545.anInt8790 > 500) {
												Static545.anInt8790 = 0;
												local182 = (int) (Math.random() * 8.0D);
												if ((local182 & 0x1) == 1) {
													Static463.anInt7491 += Static271.anInt5075;
												}
												if ((local182 & 0x2) == 2) {
													Static594.anInt9866 += Static512.anInt10120;
												}
											}
											if (Static463.anInt7491 < -60) {
												Static271.anInt5075 = 2;
											}
											if (Static463.anInt7491 > 60) {
												Static271.anInt5075 = -2;
											}
											if (Static594.anInt9866 < -20) {
												Static512.anInt10120 = 1;
											}
											if (Static594.anInt9866 > 10) {
												Static512.anInt10120 = -1;
											}
											Static617.anInt10103++;
											if (Static617.anInt10103 > 50) {
												@Pc(1947) Class2_Sub31 local1947 = Static275.method4480(Static640.aClass314_2, Static555.aClass145_162);
												Static526.method7309(local1947);
											}
											if (Static441.aBoolean524) {
												Static149.method2641();
												Static441.aBoolean524 = false;
											}
											try {
												Static255.method4268();
												return;
											} catch (@Pc(1960) IOException local1960) {
												Static271.method4448();
												return;
											}
										}
										local1483 = local1478.aClass303_4;
										if (local1483.anInt7983 < 0) {
											break;
										}
										local825 = Static43.method1101(local1483.anInt7985);
									} while (local825 == null || local825.aClass303Array2 == null || local825.aClass303Array2.length <= local1483.anInt7983 || local1483 != local825.aClass303Array2[local1483.anInt7983]);
									Static156.method2728(local1478);
								}
							}
							local1483 = local1478.aClass303_4;
							if (local1483.anInt7983 < 0) {
								break;
							}
							local825 = Static43.method1101(local1483.anInt7985);
						} while (local825 == null || local825.aClass303Array2 == null || local825.aClass303Array2.length <= local1483.anInt7983 || local825.aClass303Array2[local1483.anInt7983] != local1483);
						Static156.method2728(local1478);
					}
				}
				local1483 = local1478.aClass303_4;
				if (local1483.anInt7983 < 0) {
					break;
				}
				local825 = Static43.method1101(local1483.anInt7985);
			} while (local825 == null || local825.aClass303Array2 == null || local825.aClass303Array2.length <= local1483.anInt7983 || local825.aClass303Array2[local1483.anInt7983] != local1483);
			Static156.method2728(local1478);
		}
	}
}
