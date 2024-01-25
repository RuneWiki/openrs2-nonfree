import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_29 = new Class179(9, 2);

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "Lclient!g;")
	public static final Class113 aClass113_1 = new Class113("WIP", 2);

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
	public static int anInt2239 = 0;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "[Lclient!nea;")
	public static final Class2_Sub2_Sub15[] aClass2_Sub2_Sub15Array34 = new Class2_Sub2_Sub15[14];

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	public static void method1828() {
		if (Static298.aFrame3 != null) {
			return;
		}
		@Pc(10) int local10 = Static394.anInt6214;
		@Pc(12) int local12 = Static223.anInt3639;
		@Pc(19) int local19 = Static550.anInt9024 - local10 - Static511.anInt8548;
		@Pc(26) int local26 = Static236.anInt3828 - Static153.anInt2747 - local12;
		if (local10 <= 0 && local19 <= 0 && local12 <= 0 && local26 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static202.aFrame2 != null) {
				local48 = Static202.aFrame2;
			} else if (Static617.anApplet2 == null) {
				local48 = Static263.anApplet_Sub1_1;
			} else {
				local48 = Static617.anApplet2;
			}
			@Pc(60) int local60 = 0;
			@Pc(62) int local62 = 0;
			if (local48 == Static202.aFrame2) {
				@Pc(68) Insets local68 = Static202.aFrame2.getInsets();
				local62 = local68.top;
				local60 = local68.left;
			}
			@Pc(77) Graphics local77 = local48.getGraphics();
			local77.setColor(Color.black);
			if (local10 > 0) {
				local77.fillRect(local60, local62, local10, Static236.anInt3828);
			}
			if (local12 > 0) {
				local77.fillRect(local60, local62, Static550.anInt9024, local12);
			}
			if (local19 > 0) {
				local77.fillRect(Static550.anInt9024 + local60 - local19, local62, local19, Static236.anInt3828);
			}
			if (local26 > 0) {
				local77.fillRect(local60, Static236.anInt3828 + local62 - local26, Static550.anInt9024, local26);
				return;
			}
		} catch (@Pc(130) Exception local130) {
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!wn;ILclient!kc;BI)V")
	public static void method1831(@OriginalArg(0) Class2_Sub22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if ((arg1 & 0x400) != 0) {
			local18 = arg0.method8520();
			if (local18 == 65535) {
				local18 = -1;
			}
			local29 = arg0.method8494();
			local33 = arg0.method8496();
			local37 = local33 & 0x7;
			local43 = local33 >> 3 & 0xF;
			if (local43 == 15) {
				local43 = -1;
			}
			arg2.method3965(local37, true, local18, local43, local29);
		}
		@Pc(58) byte local58 = -1;
		@Pc(86) int local86;
		@Pc(72) int[] local72;
		@Pc(75) int[] local75;
		if ((arg1 & 0x4000) != 0) {
			local18 = arg0.method8545();
			local72 = new int[local18];
			local75 = new int[local18];
			@Pc(78) int[] local78 = new int[local18];
			for (local43 = 0; local43 < local18; local43++) {
				local86 = arg0.method8520();
				if (local86 == 65535) {
					local86 = -1;
				}
				local72[local43] = local86;
				local75[local43] = arg0.method8547();
				local78[local43] = arg0.method8544();
			}
			Static243.method3361(local78, arg2, local72, local75);
		}
		if ((arg1 & 0x1000) != 0) {
			local18 = arg0.method8521();
			arg2.anInt4599 = arg0.method8496();
			arg2.anInt4578 = arg0.method8547();
			arg2.anInt4631 = local18 & 0x7FFF;
			arg2.aBoolean318 = (local18 & 0x8000) != 0;
			arg2.anInt4607 = arg2.anInt4599 + arg2.anInt4631 + Static262.anInt5597;
		}
		if ((arg1 & 0x1) != 0) {
			Static148.aByteArray34[arg3] = arg0.method8525();
		}
		if ((arg1 & 0x20000) != 0) {
			local18 = Static262.anInt5597;
			local29 = arg0.method8543();
			local33 = arg0.method8547();
			arg2.method3963(local18, local29, local33);
		}
		if ((arg1 & 0x10) != 0) {
			local18 = arg0.method8545();
			@Pc(217) byte[] local217 = new byte[local18];
			@Pc(222) Class2_Sub22 local222 = new Class2_Sub22(local217);
			arg0.method8502(local217, 0, local18);
			Static458.aClass2_Sub22Array1[arg3] = local222;
			arg2.method3973(local222);
		}
		if ((arg1 & 0x8000) != 0) {
			local58 = arg0.method8499();
		}
		if ((arg1 & 0x80) != 0) {
			@Pc(254) int[] local254 = new int[4];
			for (local29 = 0; local29 < 4; local29++) {
				local254[local29] = arg0.method8521();
				if (local254[local29] == 65535) {
					local254[local29] = -1;
				}
			}
			local33 = arg0.method8496();
			Static94.method1467(local254, arg2, local33);
		}
		if ((arg1 & 0x100) != 0) {
			arg2.anInt4594 = arg0.method8499();
			arg2.anInt4590 = arg0.method8525();
			arg2.anInt4597 = arg0.method8491();
			arg2.anInt4572 = arg0.method8548();
			arg2.anInt4619 = arg0.method8544() + Static262.anInt5597;
			arg2.anInt4630 = arg0.method8520() + Static262.anInt5597;
			arg2.anInt4571 = arg0.method8545();
			if (arg2.aBoolean325) {
				arg2.anInt4594 += arg2.anInt4662;
				arg2.anInt4639 = 0;
				arg2.anInt4590 += arg2.anInt4671;
				arg2.anInt4597 += arg2.anInt4662;
				arg2.anInt4572 += arg2.anInt4671;
			} else {
				arg2.anInt4594 += arg2.anIntArray307[0];
				arg2.anInt4597 += arg2.anIntArray307[0];
				arg2.anInt4572 += arg2.anIntArray306[0];
				arg2.anInt4639 = 1;
				arg2.anInt4590 += arg2.anIntArray306[0];
			}
			arg2.anInt4637 = 0;
		}
		if ((arg1 & 0x40) != 0) {
			local18 = arg0.method8546();
			if (local18 == 65535) {
				local18 = -1;
			}
			local29 = arg0.method8497();
			local33 = arg0.method8496();
			local37 = local33 & 0x7;
			local43 = local33 >> 3 & 0xF;
			if (local43 == 15) {
				local43 = -1;
			}
			arg2.method3965(local37, false, local18, local43, local29);
		}
		if ((arg1 & 0x10000) != 0) {
			arg2.aByte69 = arg0.method8491();
			arg2.aByte66 = arg0.method8499();
			arg2.aByte67 = arg0.method8525();
			arg2.aByte68 = (byte) arg0.method8547();
			arg2.anInt4577 = Static262.anInt5597 + arg0.method8546();
			arg2.anInt4618 = Static262.anInt5597 + arg0.method8520();
		}
		if ((arg1 & 0x40000) != 0) {
			local18 = arg0.method8527();
			local72 = new int[local18];
			local75 = new int[local18];
			for (local37 = 0; local37 < local18; local37++) {
				local43 = arg0.method8544();
				if ((local43 & 0xC000) == 49152) {
					local86 = arg0.method8546();
					local72[local37] = local86 | local43 << 16;
				} else {
					local72[local37] = local43;
				}
				local75[local37] = arg0.method8546();
			}
			arg2.method3953(local72, local75);
		}
		if ((arg1 & 0x20) != 0) {
			local18 = arg0.method8521();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg2.anInt4580 = local18;
		}
		if ((arg1 & 0x2) != 0) {
			arg2.anInt4652 = arg0.method8521();
			if (arg2.anInt4639 == 0) {
				arg2.method3956(arg2.anInt4652);
				arg2.anInt4652 = -1;
			}
		}
		if ((arg1 & 0x200) != 0) {
			arg2.aBoolean323 = arg0.method8496() == 1;
		}
		if ((arg1 & 0x8) != 0) {
			local18 = arg0.method8543();
			local29 = arg0.method8545();
			arg2.method3963(Static262.anInt5597, local18, local29);
			arg2.anInt4579 = Static262.anInt5597 + 300;
			arg2.anInt4568 = arg0.method8496();
		}
		if ((arg1 & 0x800) != 0) {
			arg2.aString48 = arg0.method8549();
			if (arg2.aString48.charAt(0) == '~') {
				arg2.aString48 = arg2.aString48.substring(1);
				Static443.method6042(arg2.method3978(), 0, arg2.aString49, arg2.aString48, arg2.method3977(), 2);
			} else if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == arg2) {
				Static443.method6042(arg2.method3978(), 0, arg2.aString49, arg2.aString48, arg2.method3977(), 2);
			}
			arg2.anInt4587 = 0;
			arg2.anInt4583 = 0;
			arg2.anInt4576 = 150;
		}
		if (!arg2.aBoolean325) {
			return;
		}
		if (local58 == 127) {
			arg2.method3975(arg2.anInt4671, arg2.anInt4662);
			return;
		}
		@Pc(723) byte local723;
		if (local58 == -1) {
			local723 = Static148.aByteArray34[arg3];
		} else {
			local723 = local58;
		}
		Static309.method4209(arg2, local723);
		arg2.method3970(arg2.anInt4671, local723, arg2.anInt4662);
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)V")
	public static void method1832() {
		if (Static363.anInt5740 > 1) {
			Static363.anInt5740--;
			Static369.anInt5832 = Static542.anInt8903;
		}
		if (Static171.aBoolean226) {
			Static171.aBoolean226 = false;
			Static532.method7363();
			return;
		}
		if (!Static627.aBoolean736) {
			Static131.method8459();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static266.method3741(); local36++) {
		}
		if (Static324.anInt5145 != 10) {
			return;
		}
		@Pc(58) Class2_Sub40 local58;
		@Pc(67) int local67;
		while (Static203.method2861()) {
			local58 = Static464.method6285(Static251.aClass131_1, Static127.aClass179_28);
			local58.aClass2_Sub22_Sub2_2.method8537(0);
			local67 = local58.aClass2_Sub22_Sub2_2.anInt10247;
			Static383.method5124(local58.aClass2_Sub22_Sub2_2);
			local58.aClass2_Sub22_Sub2_2.method8514(local58.aClass2_Sub22_Sub2_2.anInt10247 - local67);
			Static528.method7295(local58);
		}
		if (Static523.aClass2_Sub32_6 == null) {
			if (Static476.method6413() >= Static2.aLong10) {
				Static523.aClass2_Sub32_6 = Static308.aClass253_1.method5495(Static216.aClass326_9.aString102);
			}
		} else if (Static523.aClass2_Sub32_6.anInt5896 != -1) {
			local58 = Static464.method6285(Static251.aClass131_1, Static571.aClass179_122);
			local58.aClass2_Sub22_Sub2_2.method8500(Static523.aClass2_Sub32_6.anInt5896);
			Static528.method7295(local58);
			Static523.aClass2_Sub32_6 = null;
			Static2.aLong10 = Static476.method6413() + 30000L;
		}
		@Pc(137) Class2_Sub12 local137 = (Class2_Sub12) Static595.aClass109_69.method2325();
		@Pc(154) int local154;
		@Pc(176) int local176;
		@Pc(194) int local194;
		@Pc(244) int local244;
		@Pc(251) int local251;
		@Pc(262) int local262;
		@Pc(152) Class2_Sub40 local152;
		if (local137 != null || Static476.method6413() - 2000L > Static529.aLong236) {
			local152 = null;
			local154 = 0;
			for (@Pc(159) Class2_Sub12 local159 = (Class2_Sub12) Static156.aClass109_24.method2325(); local159 != null && (local152 == null || local152.aClass2_Sub22_Sub2_2.anInt10247 - local154 < 240); local159 = (Class2_Sub12) Static156.aClass109_24.method2318()) {
				local159.method8653();
				local176 = local159.method7238();
				if (local176 < -1) {
					local176 = -1;
				} else if (local176 > 65534) {
					local176 = 65534;
				}
				local194 = local159.method7237();
				if (local194 < -1) {
					local194 = -1;
				} else if (local194 > 65534) {
					local194 = 65534;
				}
				if (local194 != Static339.anInt5383 || Static198.anInt8167 != local176) {
					if (local152 == null) {
						local152 = Static464.method6285(Static251.aClass131_1, Static234.aClass179_131);
						local152.aClass2_Sub22_Sub2_2.method8537(0);
						local154 = local152.aClass2_Sub22_Sub2_2.anInt10247;
					}
					local244 = local194 - Static339.anInt5383;
					Static339.anInt5383 = local194;
					local251 = local176 - Static198.anInt8167;
					Static198.anInt8167 = local176;
					local262 = (int) ((local159.method7242() - Static529.aLong236) / 20L);
					if (local262 < 8 && local244 >= -32 && local244 <= 31 && local251 >= -32 && local251 <= 31) {
						local244 += 32;
						local251 += 32;
						local152.aClass2_Sub22_Sub2_2.method8500(local251 + (local262 << 12) + (local244 << 6));
					} else if (local262 < 32 && local244 >= -128 && local244 <= 127 && local251 >= -128 && local251 <= 127) {
						local244 += 128;
						local251 += 128;
						local152.aClass2_Sub22_Sub2_2.method8537(local262 + 128);
						local152.aClass2_Sub22_Sub2_2.method8500(local251 + (local244 << 8));
					} else if (local262 < 32) {
						local152.aClass2_Sub22_Sub2_2.method8537(local262 + 192);
						if (local194 == 1 || local176 == -1) {
							local152.aClass2_Sub22_Sub2_2.method8552(Integer.MIN_VALUE);
						} else {
							local152.aClass2_Sub22_Sub2_2.method8552(local176 << 16 | local194);
						}
					} else {
						local152.aClass2_Sub22_Sub2_2.method8500(local262 + 57344);
						if (local194 == 1 || local176 == -1) {
							local152.aClass2_Sub22_Sub2_2.method8552(Integer.MIN_VALUE);
						} else {
							local152.aClass2_Sub22_Sub2_2.method8552(local176 << 16 | local194);
						}
					}
					Static529.aLong236 = local159.method7242();
				}
			}
			if (local152 != null) {
				local152.aClass2_Sub22_Sub2_2.method8514(local152.aClass2_Sub22_Sub2_2.anInt10247 - local154);
				Static528.method7295(local152);
			}
		}
		@Pc(457) int local457;
		if (local137 != null) {
			@Pc(443) long local443 = (local137.method7242() - Static447.aLong238) / 50L;
			Static447.aLong238 = local137.method7242();
			if (local443 > 32767L) {
				local443 = 32767L;
			}
			local457 = local137.method7238();
			if (local457 < 0) {
				local457 = 0;
			} else if (local457 > 65535) {
				local457 = 65535;
			}
			local176 = local137.method7237();
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 65535) {
				local176 = 65535;
			}
			@Pc(492) byte local492 = 0;
			if (local137.method7241() == 2) {
				local492 = 1;
			}
			local244 = (int) local443;
			@Pc(511) Class2_Sub40 local511 = Static464.method6285(Static251.aClass131_1, Static328.aClass179_65);
			local511.aClass2_Sub22_Sub2_2.method8495(local244 | local492 << 15);
			local511.aClass2_Sub22_Sub2_2.method8490(local176 | local457 << 16);
			Static528.method7295(local511);
		}
		if (Static131.anInt10170 > 0) {
			local152 = Static464.method6285(Static251.aClass131_1, Static135.aClass179_30);
			local152.aClass2_Sub22_Sub2_2.method8537(Static131.anInt10170 * 3);
			for (local154 = 0; local154 < Static131.anInt10170; local154++) {
				@Pc(561) Interface22 local561 = Static622.anInterface22Array2[local154];
				@Pc(570) long local570 = (local561.method5224() - Static638.aLong221) / 50L;
				if (local570 > 65535L) {
					local570 = 65535L;
				}
				Static638.aLong221 = local561.method5224();
				local152.aClass2_Sub22_Sub2_2.method8537(local561.method5223());
				local152.aClass2_Sub22_Sub2_2.method8500((int) local570);
			}
			Static528.method7295(local152);
		}
		if (Static115.anInt2101 > 0) {
			Static115.anInt2101--;
		}
		if (Static68.aBoolean87 && Static115.anInt2101 <= 0) {
			Static115.anInt2101 = 20;
			Static68.aBoolean87 = false;
			local152 = Static464.method6285(Static251.aClass131_1, Static174.aClass179_45);
			local152.aClass2_Sub22_Sub2_2.method8495((int) Static440.aFloat144 >> 3);
			local152.aClass2_Sub22_Sub2_2.method8528((int) Static339.aFloat100 >> 3);
			Static528.method7295(local152);
		}
		if (Static223.aBoolean258 != Static184.aBoolean231) {
			Static184.aBoolean231 = Static223.aBoolean258;
			local152 = Static464.method6285(Static251.aClass131_1, Static180.aClass179_48);
			local152.aClass2_Sub22_Sub2_2.method8537(Static223.aBoolean258 ? 1 : 0);
			Static528.method7295(local152);
		}
		if (!Static266.aBoolean292) {
			local152 = Static464.method6285(Static251.aClass131_1, Static245.aClass179_56);
			local152.aClass2_Sub22_Sub2_2.method8537(0);
			local154 = local152.aClass2_Sub22_Sub2_2.anInt10247;
			@Pc(701) Class2_Sub22 local701 = Static234.aClass2_Sub5_48.method178();
			local152.aClass2_Sub22_Sub2_2.method8508(0, local701.anInt10247, local701.aByteArray115);
			local152.aClass2_Sub22_Sub2_2.method8514(local152.aClass2_Sub22_Sub2_2.anInt10247 - local154);
			Static528.method7295(local152);
			Static266.aBoolean292 = true;
		}
		if (Static28.aClass53ArrayArrayArray1 != null) {
			if (Static445.anInt7122 == 2) {
				Static273.method3798();
			} else if (Static445.anInt7122 == 3) {
				Static573.method7859();
			}
		}
		if (Static601.aBoolean709) {
			Static601.aBoolean709 = false;
		} else {
			Static257.aFloat69 /= 2.0F;
		}
		if (Static362.aBoolean421) {
			Static362.aBoolean421 = false;
		} else {
			Static16.aFloat3 /= 2.0F;
		}
		Static531.method7360();
		if (Static324.anInt5145 != 10) {
			return;
		}
		Static384.method5146();
		Static361.method4864();
		Static27.method503();
		Static243.anInt3928++;
		if (Static243.anInt3928 > 750) {
			Static532.method7363();
			return;
		}
		Static58.method898();
		Static455.method6238();
		Static469.method464();
		for (local67 = Static431.aClass205_1.method4261(true); local67 != -1; local67 = Static431.aClass205_1.method4261(false)) {
			Static100.method1534(local67);
			Static553.anIntArray619[Static245.anInt3947++ & 0x1F] = local67;
		}
		@Pc(866) Class261 local866;
		for (@Pc(822) Class2_Sub2_Sub4 local822 = Static626.method8385(); local822 != null; local822 = Static626.method8385()) {
			local457 = local822.method667();
			local176 = local822.method664();
			if (local457 == 1) {
				Static171.anIntArray203[local176] = local822.anInt823;
				Static365.aBoolean427 |= Static410.aBooleanArray116[local176];
				Static437.anIntArray501[Static376.anInt5904++ & 0x1F] = local176;
			} else if (local457 == 2) {
				Static3.aStringArray48[local176] = local822.aString10;
				Static143.anIntArray176[Static480.anInt10375++ & 0x1F] = local176;
			} else if (local457 == 3) {
				local866 = Static357.method4826(local176);
				if (!local822.aString10.equals(local866.aString93)) {
					local866.aString93 = local822.aString10;
					Static624.method8351(local866);
				}
			} else if (local457 == 4) {
				local866 = Static357.method4826(local176);
				local244 = local822.anInt823;
				local251 = local822.anInt817;
				local262 = local822.anInt821;
				if (local866.anInt6634 != local244 || local866.anInt6576 != local251 || local866.anInt6593 != local262) {
					local866.anInt6576 = local251;
					local866.anInt6593 = local262;
					local866.anInt6634 = local244;
					Static624.method8351(local866);
				}
			} else if (local457 == 5) {
				local866 = Static357.method4826(local176);
				if (local866.anInt6578 != local822.anInt823 || local822.anInt823 == -1) {
					local866.anInt6636 = 1;
					local866.anInt6581 = 0;
					local866.anInt6578 = local822.anInt823;
					local866.anInt6597 = 0;
					@Pc(1314) Class81 local1314 = local866.anInt6578 == -1 ? null : Static540.aClass173_2.method3791(local866.anInt6578);
					if (local1314 != null) {
						Static350.method4702(local866.anInt6581, local1314);
					}
					Static624.method8351(local866);
				}
			} else if (local457 == 6) {
				local194 = local822.anInt823;
				local244 = local194 >> 10 & 0x1F;
				local251 = local194 >> 5 & 0x1F;
				local262 = local194 & 0x1F;
				@Pc(1254) int local1254 = (local262 << 3) + (local244 << 19) + (local251 << 11);
				@Pc(1258) Class261 local1258 = Static357.method4826(local176);
				if (local1254 != local1258.anInt6650) {
					local1258.anInt6650 = local1254;
					Static624.method8351(local1258);
				}
			} else if (local457 == 7) {
				local866 = Static357.method4826(local176);
				@Pc(1211) boolean local1211 = local822.anInt823 == 1;
				if (local866.aBoolean482 != local1211) {
					local866.aBoolean482 = local1211;
					Static624.method8351(local866);
				}
			} else if (local457 == 8) {
				local866 = Static357.method4826(local176);
				if (local822.anInt823 != local866.anInt6644 || local866.anInt6667 != local822.anInt817 || local866.anInt6613 != local822.anInt821) {
					local866.anInt6613 = local822.anInt821;
					local866.anInt6644 = local822.anInt823;
					local866.anInt6667 = local822.anInt817;
					if (local866.anInt6585 != -1) {
						if (local866.anInt6609 > 0) {
							local866.anInt6613 = local866.anInt6613 * 32 / local866.anInt6609;
						} else if (local866.anInt6604 > 0) {
							local866.anInt6613 = local866.anInt6613 * 32 / local866.anInt6604;
						}
					}
					Static624.method8351(local866);
				}
			} else if (local457 == 9) {
				local866 = Static357.method4826(local176);
				if (local822.anInt823 != local866.anInt6585 || local822.anInt817 != local866.anInt6626) {
					local866.anInt6626 = local822.anInt817;
					local866.anInt6585 = local822.anInt823;
					Static624.method8351(local866);
				}
			} else if (local457 == 10) {
				local866 = Static357.method4826(local176);
				if (local866.anInt6649 != local822.anInt823 || local866.anInt6602 != local822.anInt817 || local866.anInt6647 != local822.anInt821) {
					local866.anInt6647 = local822.anInt821;
					local866.anInt6649 = local822.anInt823;
					local866.anInt6602 = local822.anInt817;
					Static624.method8351(local866);
				}
			} else if (local457 == 11) {
				local866 = Static357.method4826(local176);
				local866.anInt6623 = local866.anInt6632 = local822.anInt817;
				local866.aByte96 = 0;
				local866.aByte95 = 0;
				local866.anInt6642 = local866.anInt6657 = local822.anInt823;
				Static624.method8351(local866);
			} else if (local457 == 12) {
				local866 = Static357.method4826(local176);
				local244 = local822.anInt823;
				if (local866 != null && local866.anInt6635 == 0) {
					if (local244 > local866.anInt6617 - local866.anInt6622) {
						local244 = local866.anInt6617 - local866.anInt6622;
					}
					if (local244 < 0) {
						local244 = 0;
					}
					if (local244 != local866.anInt6624) {
						local866.anInt6624 = local244;
						Static624.method8351(local866);
					}
				}
			} else if (local457 == 14) {
				local866 = Static357.method4826(local176);
				local866.anInt6599 = local822.anInt823;
			} else if (local457 == 15) {
				Static621.anInt9980 = local822.anInt823;
				Static643.aBoolean747 = true;
				Static507.anInt8466 = local822.anInt817;
			} else if (local457 == 16) {
				local866 = Static357.method4826(local176);
				local866.anInt6651 = local822.anInt823;
			} else if (local457 == 17) {
				local866 = Static357.method4826(local176);
				local866.anInt6605 = local822.anInt823;
			}
		}
		if (Static28.anInt666 != 0) {
			Static587.anInt9568 += 20;
			if (Static587.anInt9568 >= 400) {
				Static28.anInt666 = 0;
			}
		}
		Static544.anInt9305++;
		if (Static338.aClass261_6 != null) {
			Static254.anInt4048++;
			if (Static254.anInt4048 >= 15) {
				Static624.method8351(Static338.aClass261_6);
				Static338.aClass261_6 = null;
			}
		}
		Static443.aBoolean532 = false;
		Static362.aBoolean420 = false;
		Static637.aClass261_14 = null;
		Static93.aClass261_2 = null;
		Static70.method970(-1, -1, null);
		Static415.method5565(-1, null, -1);
		if (!Static8.aBoolean11) {
			Static144.anInt2622 = -1;
		}
		Static299.method4132();
		Static542.anInt8903++;
		if (Static35.aBoolean730) {
			@Pc(1467) Class2_Sub40 local1467 = Static464.method6285(Static251.aClass131_1, Static164.aClass179_42);
			local1467.aClass2_Sub22_Sub2_2.method8552(Static540.anInt8853 << 28 | Static581.anInt9451 << 14 | Static457.anInt7377);
			Static528.method7295(local1467);
			Static35.aBoolean730 = false;
		}
		while (true) {
			@Pc(1490) Class2_Sub46 local1490;
			@Pc(1495) Class261 local1495;
			do {
				local1490 = (Class2_Sub46) Static485.aClass109_51.method2322();
				if (local1490 == null) {
					while (true) {
						do {
							local1490 = (Class2_Sub46) Static79.aClass109_7.method2322();
							if (local1490 == null) {
								while (true) {
									do {
										local1490 = (Class2_Sub46) Static122.aClass109_13.method2322();
										if (local1490 == null) {
											if (Static93.aClass261_2 == null) {
												Static91.anInt1707 = 0;
											}
											if (Static444.aClass261_9 != null) {
												Static490.method6838();
											}
											if (Static165.anInt5949 > 0 && Static16.aClass167_1.method3544(82) && Static16.aClass167_1.method3544(81) && Static487.anInt8042 != 0) {
												local457 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 - Static487.anInt8042;
												if (local457 < 0) {
													local457 = 0;
												} else if (local457 > 3) {
													local457 = 3;
												}
												Static499.method6900(local457, Static132.anInt2246 + Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0], Static123.anInt2176 - -Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0]);
											}
											Static409.method5497();
											for (local457 = 0; local457 < 5; local457++) {
												@Pc(1685) int local1685 = Static356.anIntArray402[local457]++;
											}
											if (Static365.aBoolean427 && Static74.aLong49 < Static476.method6413() - 60000L) {
												Static202.method2859();
											}
											for (@Pc(1714) Class13_Sub3_Sub1 local1714 = (Class13_Sub3_Sub1) Static121.aClass171_2.method3745(); local1714 != null; local1714 = (Class13_Sub3_Sub1) Static121.aClass171_2.method3744()) {
												if (Static476.method6413() / 1000L - 5L > (long) local1714.anInt1491) {
													if (local1714.aShort25 > 0) {
														Static443.method6042("", 0, "", local1714.aString15 + Static434.aClass271_19.method5972(Static483.anInt7694), "", 5);
													}
													if (local1714.aShort25 == 0) {
														Static443.method6042("", 0, "", local1714.aString15 + Static434.aClass271_20.method5972(Static483.anInt7694), "", 5);
													}
													local1714.method8394();
												}
											}
											Static507.anInt8467++;
											if (Static507.anInt8467 > 500) {
												Static507.anInt8467 = 0;
												local194 = (int) (Math.random() * 8.0D);
												if ((local194 & 0x4) == 4) {
													Static365.anInt5778 += Static599.anInt9692;
												}
												if ((local194 & 0x2) == 2) {
													Static54.anInt255 += Static292.anInt4748;
												}
												if ((local194 & 0x1) == 1) {
													Static639.anInt10304 += Static378.anInt9721;
												}
											}
											if (Static639.anInt10304 < -50) {
												Static378.anInt9721 = 2;
											}
											if (Static54.anInt255 < -55) {
												Static292.anInt4748 = 2;
											}
											if (Static639.anInt10304 > 50) {
												Static378.anInt9721 = -2;
											}
											if (Static54.anInt255 > 55) {
												Static292.anInt4748 = -2;
											}
											if (Static365.anInt5778 < -40) {
												Static599.anInt9692 = 1;
											}
											if (Static365.anInt5778 > 40) {
												Static599.anInt9692 = -1;
											}
											Static4.anInt74++;
											if (Static4.anInt74 > 500) {
												Static4.anInt74 = 0;
												local194 = (int) (Math.random() * 8.0D);
												if ((local194 & 0x2) == 2) {
													Static407.anInt9051 += Static27.anInt637;
												}
												if ((local194 & 0x1) == 1) {
													Static99.anInt7118 += Static221.anInt3618;
												}
											}
											if (Static99.anInt7118 < -60) {
												Static221.anInt3618 = 2;
											}
											if (Static407.anInt9051 < -20) {
												Static27.anInt637 = 1;
											}
											if (Static99.anInt7118 > 60) {
												Static221.anInt3618 = -2;
											}
											if (Static407.anInt9051 > 10) {
												Static27.anInt637 = -1;
											}
											Static22.anInt550++;
											if (Static22.anInt550 > 50) {
												@Pc(1946) Class2_Sub40 local1946 = Static464.method6285(Static251.aClass131_1, Static528.aClass179_111);
												Static528.method7295(local1946);
											}
											if (Static365.aBoolean426) {
												Static462.method6281();
												Static365.aBoolean426 = false;
											}
											try {
												Static124.method1779();
												return;
											} catch (@Pc(1959) IOException local1959) {
												Static532.method7363();
												return;
											}
										}
										local1495 = local1490.aClass261_10;
										if (local1495.anInt6629 < 0) {
											break;
										}
										local866 = Static357.method4826(local1495.anInt6631);
									} while (local866 == null || local866.aClass261Array2 == null || local1495.anInt6629 >= local866.aClass261Array2.length || local866.aClass261Array2[local1495.anInt6629] != local1495);
									Static300.method4138(local1490);
								}
							}
							local1495 = local1490.aClass261_10;
							if (local1495.anInt6629 < 0) {
								break;
							}
							local866 = Static357.method4826(local1495.anInt6631);
						} while (local866 == null || local866.aClass261Array2 == null || local1495.anInt6629 >= local866.aClass261Array2.length || local866.aClass261Array2[local1495.anInt6629] != local1495);
						Static300.method4138(local1490);
					}
				}
				local1495 = local1490.aClass261_10;
				if (local1495.anInt6629 < 0) {
					break;
				}
				local866 = Static357.method4826(local1495.anInt6631);
			} while (local866 == null || local866.aClass261Array2 == null || local866.aClass261Array2.length <= local1495.anInt6629 || local866.aClass261Array2[local1495.anInt6629] != local1495);
			Static300.method4138(local1490);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
	public static void method1833() {
		Static309.anInt4985 = 200;
		Static147.anInt2652 = (int) ((double) Static228.anInt3704 * 34.46D);
		Static147.anInt2652 <<= 0x2;
		if (Static192.aClass95_4.method6932()) {
			Static147.anInt2652 += 512;
		}
		Static296.method4089(false);
	}
}
