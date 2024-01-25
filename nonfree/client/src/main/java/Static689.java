import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static689 {

	@OriginalMember(owner = "client!vp", name = "N", descriptor = "I")
	public static int anInt10611;

	@OriginalMember(owner = "client!vp", name = "S", descriptor = "Lclient!ha;")
	public static Class145 aClass145_16;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V")
	public static void method9303(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub20_Sub2 local8 = Static487.aClass221_2.aClass2_Sub20_Sub2_2;
		for (@Pc(10) int local10 = 0; local10 < Static584.anInt9206; local10++) {
			@Pc(18) int local18 = Static45.anIntArray57[local10];
			@Pc(26) Class4_Sub2_Sub1_Sub2_Sub2 local26 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) local18, 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
			@Pc(30) int local30 = local8.method8581(-17416);
			if ((local30 & 0x8) != 0) {
				local30 += local8.method8581(-17416) << 8;
			}
			if ((local30 & 0x2000) != 0) {
				local30 += local8.method8581(-17416) << 16;
			}
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(83) int local83;
			@Pc(73) int local73;
			@Pc(75) int local75;
			@Pc(77) int local77;
			@Pc(125) int local125;
			@Pc(129) int local129;
			if ((local30 & 0x10) != 0) {
				local65 = local8.method8557();
				if (local65 > 0) {
					for (local69 = 0; local69 < local65; local69++) {
						local73 = -1;
						local75 = -1;
						local77 = -1;
						local83 = local8.method8592(arg0 ^ 0xFFFFE9ED);
						if (local83 == 32767) {
							local83 = local8.method8592(255);
							local75 = local8.method8592(255);
							local73 = local8.method8592(255);
							local77 = local8.method8592(255);
						} else if (local83 == 32766) {
							local83 = -1;
						} else {
							local75 = local8.method8592(255);
						}
						local125 = local8.method8592(255);
						local129 = local8.method8588();
						local26.method2061(local73, Static528.anInt8386, local75, local129, local83, local77, local125);
					}
				}
			}
			if ((local30 & 0x1) != 0) {
				if (local26.aClass261_1.method6273()) {
					Static647.method8754(local26);
				}
				local26.method2068(Static192.aClass41_1.method754(local8.method8530(), arg0 + 5872));
				local26.method2057(local26.aClass261_1.anInt7010);
				local26.anInt2357 = local26.aClass261_1.anInt7015 << 3;
				if (local26.aClass261_1.method6273()) {
					Static255.method3624(local26.anIntArray182[0], (Class4_Sub2_Sub1_Sub2_Sub1) null, 0, local26, (Class81) null, local26.anIntArray183[0], local26.aByte133);
				}
			}
			if ((local30 & 0x200) != 0) {
				local65 = local8.method8559();
				local26.anInt2310 = local8.method8581(arg0 ^ 0x52EA);
				local26.anInt2342 = local8.method8593();
				local26.anInt2349 = local65 & 0x7FFF;
				local26.aBoolean246 = (local65 & 0x8000) != 0;
				local26.anInt2325 = local26.anInt2349 + Static528.anInt8386 + local26.anInt2310;
			}
			@Pc(313) boolean local313;
			if ((local30 & 0x20000) != 0) {
				local65 = local8.method8559();
				local69 = local8.method8578();
				if (local65 == 65535) {
					local65 = -1;
				}
				local83 = local8.method8557();
				local73 = local83 & 0x7;
				local75 = local83 >> 3 & 0xF;
				if (local75 == 15) {
					local75 = -1;
				}
				local313 = (local83 >> 7 & 0x1) == 1;
				local26.method2047(local313, local69, local65, local73, 3, local75);
			}
			if ((local30 & 0x100) != 0) {
				local26.aByte60 = local8.method8538();
				local26.aByte58 = local8.method8538();
				local26.aByte61 = local8.method8536();
				local26.aByte59 = (byte) local8.method8588();
				local26.anInt2364 = Static528.anInt8386 + local8.method8554(31493);
				local26.anInt2366 = Static528.anInt8386 + local8.method8530();
			}
			@Pc(408) int[] local408;
			@Pc(434) short[] local434;
			@Pc(465) short[] local465;
			@Pc(504) long local504;
			if ((local30 & 0x1000) != 0) {
				local65 = local26.aClass261_1.anIntArray500.length;
				local69 = 0;
				if (local26.aClass261_1.aShortArray116 != null) {
					local69 = local26.aClass261_1.aShortArray116.length;
				}
				local83 = 0;
				if (local26.aClass261_1.aShortArray117 != null) {
					local83 = local26.aClass261_1.aShortArray117.length;
				}
				local73 = local8.method8557();
				if ((local73 & 0x1) == 1) {
					local26.aClass384_1 = null;
				} else {
					local408 = null;
					if ((local73 & 0x2) == 2) {
						local408 = new int[local65];
						for (local77 = 0; local77 < local65; local77++) {
							local408[local77] = local8.method8575();
						}
					}
					local434 = null;
					if ((local73 & 0x4) == 4) {
						local434 = new short[local69];
						for (local125 = 0; local125 < local69; local125++) {
							local434[local125] = (short) local8.method8554(arg0 ^ 0xFFFF9217);
						}
					}
					local465 = null;
					if ((local73 & 0x8) == 8) {
						local465 = new short[local83];
						for (local129 = 0; local129 < local83; local129++) {
							local465[local129] = (short) local8.method8554(31493);
						}
					}
					local504 = (long) local26.anInt2379++ << 32 | (long) local18;
					local26.aClass384_1 = new Class384(local504, local408, local434, local465);
				}
			}
			if ((local30 & 0x80000) != 0) {
				local65 = local8.method8554(31493);
				if (local65 == 65535) {
					local65 = -1;
				}
				local69 = local8.method8555(arg0 ^ 0x3276);
				local83 = local8.method8593();
				local73 = local83 & 0x7;
				local75 = local83 >> 3 & 0xF;
				if (local75 == 15) {
					local75 = -1;
				}
				local313 = (local83 >> 7 & 0x1) == 1;
				local26.method2047(local313, local69, local65, local73, 2, local75);
			}
			@Pc(592) int[] local592;
			@Pc(595) int[] local595;
			if ((local30 & 0x400) != 0) {
				local65 = local8.method8588();
				local592 = new int[local65];
				local595 = new int[local65];
				@Pc(598) int[] local598 = new int[local65];
				for (local75 = 0; local75 < local65; local75++) {
					local77 = local8.method8554(arg0 + 37363);
					if (local77 == 65535) {
						local77 = -1;
					}
					local592[local75] = local77;
					local595[local75] = local8.method8593();
					local598[local75] = local8.method8559();
				}
				Static285.method3987(arg0 + 5870, local592, local598, local595, local26);
			}
			if ((local30 & 0x4000) != 0) {
				local65 = local8.method8559();
				if (local65 == 65535) {
					local65 = -1;
				}
				local69 = local8.method8540();
				local83 = local8.method8581(-17416);
				local73 = local83 & 0x7;
				local75 = local83 >> 3 & 0xF;
				if (local75 == 15) {
					local75 = -1;
				}
				local313 = (local83 >> 7 & 0x1) == 1;
				local26.method2047(local313, local69, local65, local73, 1, local75);
			}
			if ((local30 & 0x800) != 0) {
				local65 = local8.method8588();
				local592 = new int[local65];
				local595 = new int[local65];
				for (local73 = 0; local73 < local65; local73++) {
					local75 = local8.method8559();
					if ((local75 & 0xC000) == 49152) {
						local77 = local8.method8554(31493);
						local592[local73] = local75 << 16 | local77;
					} else {
						local592[local73] = local75;
					}
					local595[local73] = local8.method8559();
				}
				local26.method2060(local592, local595, (byte) -106);
			}
			if ((local30 & 0x20) != 0) {
				local26.anInt2398 = local8.method8530();
				local26.anInt2388 = local8.method8575();
			}
			if ((local30 & 0x10000) != 0) {
				local26.anInt2378 = local8.method8530();
				if (local26.anInt2378 == 65535) {
					local26.anInt2378 = local26.aClass261_1.anInt7011;
				}
			}
			if ((local30 & 0x2) != 0) {
				local26.anInt2348 = local8.method8554(31493);
				if (local26.anInt2348 == 65535) {
					local26.anInt2348 = -1;
				}
			}
			if ((local30 & 0x100000) != 0) {
				local65 = local26.aClass261_1.anIntArray501.length;
				local69 = 0;
				if (local26.aClass261_1.aShortArray116 != null) {
					local69 = local26.aClass261_1.aShortArray116.length;
				}
				if (local26.aClass261_1.aShortArray117 != null) {
					local69 = local26.aClass261_1.aShortArray117.length;
				}
				local73 = local8.method8581(arg0 ^ 0x52EA);
				if ((local73 & 0x1) != 1) {
					local408 = null;
					if ((local73 & 0x2) == 2) {
						local408 = new int[local65];
						for (local77 = 0; local77 < local65; local77++) {
							local408[local77] = local8.method8559();
						}
					}
					local434 = null;
					if ((local73 & 0x4) == 4) {
						local434 = new short[local69];
						for (local125 = 0; local125 < local69; local125++) {
							local434[local125] = (short) local8.method8575();
						}
					}
					local465 = null;
					if ((local73 & 0x8) == 8) {
						local465 = new short[0];
						for (local129 = 0; local129 < 0; local129++) {
							local465[local129] = (short) local8.method8575();
						}
					}
					local504 = (long) local18 | (long) local26.anInt2382++ << 32;
					new Class384(local504, local408, local434, local465);
				}
			}
			if ((local30 & 0x80) != 0) {
				local26.method2070(local8.method8553());
			}
			if ((local30 & 0x40) != 0) {
				@Pc(1021) int[] local1021 = new int[4];
				for (local69 = 0; local69 < 4; local69++) {
					local1021[local69] = local8.method8559();
					if (local1021[local69] == 65535) {
						local1021[local69] = -1;
					}
				}
				local83 = local8.method8557();
				Static274.method3838(true, local1021, local83, local26, arg0 ^ 0xFFFF9A28);
			}
			if ((local30 & 0x4) != 0) {
				local65 = local8.method8554(31493);
				if (local65 == 65535) {
					local65 = -1;
				}
				local69 = local8.method8529((byte) 60);
				local83 = local8.method8581(-17416);
				local73 = local83 & 0x7;
				local75 = local83 >> 3 & 0xF;
				if (local75 == 15) {
					local75 = -1;
				}
				local313 = (local83 >> 7 & 0x1) == 1;
				local26.method2047(local313, local69, local65, local73, 0, local75);
			}
			if ((local30 & 0x8000) != 0) {
				local26.anInt2363 = local8.method8566();
				local26.anInt2361 = local8.method8536();
				local26.anInt2359 = local8.method8538();
				local26.anInt2362 = local8.method8538();
				local26.anInt2358 = local8.method8559() + Static528.anInt8386;
				local26.anInt2367 = local8.method8575() + Static528.anInt8386;
				local26.anInt2356 = local8.method8557();
				local26.anInt2363 += local26.anIntArray183[0];
				local26.anInt2370 = 0;
				local26.anInt2359 += local26.anIntArray183[0];
				local26.anInt2361 += local26.anIntArray182[0];
				local26.anInt2362 += local26.anIntArray182[0];
				local26.anInt2371 = 1;
			}
			if ((local30 & 0x40000) != 0) {
				local26.aString24 = local8.method8553();
				if ("".equals(local26.aString24) || local26.aString24.equals(local26.aClass261_1.aString76)) {
					local26.aString24 = local26.aClass261_1.aString76;
				}
			}
		}
		if (arg0 != -5870) {
			method9305(false, -61L, 69, -2);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZJII)Ljava/lang/String;")
	public static String method9305(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 8110) {
			method9303(-67);
		}
		@Pc(17) Calendar local17;
		if (arg0) {
			Static325.method4556(arg1);
			local17 = Static246.aCalendar4;
		} else {
			Static97.method1514(arg1);
			local17 = Static246.aCalendar3;
		}
		@Pc(28) int local28 = local17.get(5);
		@Pc(32) int local32 = local17.get(2);
		@Pc(36) int local36 = local17.get(1);
		@Pc(40) int local40 = local17.get(11);
		@Pc(44) int local44 = local17.get(12);
		return arg2 == 3 ? Static552.method4272(arg0, arg2, arg1) : Integer.toString(local28 / 10) + local28 % 10 + "-" + Static437.aStringArrayArray2[arg2][local32] + "-" + local36 + " " + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10;
	}
}
