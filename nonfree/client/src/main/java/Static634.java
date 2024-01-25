import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
	public static int[] anIntArray578;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public static int anInt10113;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "Lclient!haa;")
	public static Class144 aClass144_1;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame5;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_103 = new Class187(4, 1);

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_322 = new Class196(88, -2);

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_104 = new Class187(79, -1);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method8423(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + (Static404.method5902(arg0.charAt(local10)) - local8);
		}
		return local8;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method8424() {
		for (@Pc(12) int local12 = 0; local12 < Static118.anInt2047; local12++) {
			@Pc(17) int local17 = Static109.anIntArray103[local12];
			@Pc(25) Class41_Sub1_Sub1_Sub3_Sub1 local25 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) local17)).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			@Pc(29) int local29 = Static386.aClass5_Sub15_Sub2_2.method3642();
			if ((local29 & 0x80) != 0) {
				local29 += Static386.aClass5_Sub15_Sub2_2.method3642() << 8;
			}
			if ((local29 & 0x400) != 0) {
				local29 += Static386.aClass5_Sub15_Sub2_2.method3642() << 16;
			}
			@Pc(61) int local61;
			@Pc(64) int[] local64;
			@Pc(67) int[] local67;
			@Pc(69) int local69;
			@Pc(74) int local74;
			@Pc(83) int local83;
			if ((local29 & 0x4000) != 0) {
				local61 = Static386.aClass5_Sub15_Sub2_2.method3646();
				local64 = new int[local61];
				local67 = new int[local61];
				for (local69 = 0; local69 < local61; local69++) {
					local74 = Static386.aClass5_Sub15_Sub2_2.method3698();
					if ((local74 & 0xC000) == 49152) {
						local83 = Static386.aClass5_Sub15_Sub2_2.method3683();
						local64[local69] = local83 | local74 << 16;
					} else {
						local64[local69] = local74;
					}
					local67[local69] = Static386.aClass5_Sub15_Sub2_2.method3683();
				}
				local25.method7927(local64, local67);
			}
			if ((local29 & 0x2) != 0) {
				local25.anInt9452 = Static386.aClass5_Sub15_Sub2_2.method3698();
				if (local25.anInt9452 == 65535) {
					local25.anInt9452 = -1;
				}
			}
			if ((local29 & 0x8000) != 0) {
				local61 = Static386.aClass5_Sub15_Sub2_2.method3698();
				local25.anInt9493 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local25.anInt9497 = Static386.aClass5_Sub15_Sub2_2.method3667();
				local25.aBoolean691 = (local61 & 0x8000) != 0;
				local25.anInt9510 = local61 & 0x7FFF;
				local25.anInt9458 = local25.anInt9493 + local25.anInt9510 + Static421.anInt7434;
			}
			if ((local29 & 0x200) != 0) {
				local61 = Static386.aClass5_Sub15_Sub2_2.method3667();
				local64 = new int[local61];
				local67 = new int[local61];
				@Pc(197) int[] local197 = new int[local61];
				for (local74 = 0; local74 < local61; local74++) {
					local83 = Static386.aClass5_Sub15_Sub2_2.method3683();
					if (local83 == 65535) {
						local83 = -1;
					}
					local64[local74] = local83;
					local67[local74] = Static386.aClass5_Sub15_Sub2_2.method3667();
					local197[local74] = Static386.aClass5_Sub15_Sub2_2.method3662();
				}
				Static654.method8348(local67, local25, local197, local64);
			}
			if ((local29 & 0x10000) != 0) {
				local25.aString45 = Static386.aClass5_Sub15_Sub2_2.method3661();
				if ("".equals(local25.aString45) || local25.aString45.equals(local25.aClass311_1.aString92)) {
					local25.aString45 = local25.aClass311_1.aString92;
				}
			}
			@Pc(285) int local285;
			@Pc(289) int local289;
			if ((local29 & 0x20) != 0) {
				local61 = Static386.aClass5_Sub15_Sub2_2.method3637();
				if (local61 == 65535) {
					local61 = -1;
				}
				local285 = Static386.aClass5_Sub15_Sub2_2.method3635();
				local289 = Static386.aClass5_Sub15_Sub2_2.method3667();
				local69 = local289 & 0x7;
				local74 = local289 >> 3 & 0xF;
				if (local74 == 15) {
					local74 = -1;
				}
				local25.method7930(0, local74, local61, local285, local69);
			}
			if ((local29 & 0x10) != 0) {
				@Pc(319) int[] local319 = new int[4];
				for (local285 = 0; local285 < 4; local285++) {
					local319[local285] = Static386.aClass5_Sub15_Sub2_2.method3683();
					if (local319[local285] == 65535) {
						local319[local285] = -1;
					}
				}
				local289 = Static386.aClass5_Sub15_Sub2_2.method3642();
				Static488.method7147(local25, local289, local319);
			}
			if ((local29 & 0x4) != 0) {
				local25.anInt5464 = Static386.aClass5_Sub15_Sub2_2.method3698();
				local25.anInt5460 = Static386.aClass5_Sub15_Sub2_2.method3637();
			}
			@Pc(437) int local437;
			@Pc(441) int local441;
			if ((local29 & 0x40) != 0) {
				local61 = Static386.aClass5_Sub15_Sub2_2.method3667();
				if (local61 > 0) {
					for (local285 = 0; local285 < local61; local285++) {
						local69 = -1;
						local74 = -1;
						local289 = Static386.aClass5_Sub15_Sub2_2.method3690();
						local83 = -1;
						if (local289 == 32767) {
							local289 = Static386.aClass5_Sub15_Sub2_2.method3690();
							local74 = Static386.aClass5_Sub15_Sub2_2.method3690();
							local69 = Static386.aClass5_Sub15_Sub2_2.method3690();
							local83 = Static386.aClass5_Sub15_Sub2_2.method3690();
						} else if (local289 == 32766) {
							local289 = -1;
						} else {
							local74 = Static386.aClass5_Sub15_Sub2_2.method3690();
						}
						local437 = Static386.aClass5_Sub15_Sub2_2.method3690();
						local441 = Static386.aClass5_Sub15_Sub2_2.method3667();
						local25.method7916(local74, local437, local83, local441, local69, local289, Static421.anInt7434);
					}
				}
			}
			@Pc(548) short[] local548;
			@Pc(497) int[] local497;
			@Pc(522) short[] local522;
			@Pc(586) long local586;
			if ((local29 & 0x100) != 0) {
				local61 = local25.aClass311_1.anIntArray473.length;
				local285 = 0;
				if (local25.aClass311_1.aShortArray99 != null) {
					local285 = local25.aClass311_1.aShortArray99.length;
				}
				local289 = 0;
				if (local25.aClass311_1.aShortArray100 != null) {
					local289 = local25.aClass311_1.aShortArray100.length;
				}
				local69 = Static386.aClass5_Sub15_Sub2_2.method3655();
				if ((local69 & 0x1) == 1) {
					local25.aClass316_1 = null;
				} else {
					local497 = null;
					if ((local69 & 0x2) == 2) {
						local497 = new int[local61];
						for (local83 = 0; local83 < local61; local83++) {
							local497[local83] = Static386.aClass5_Sub15_Sub2_2.method3683();
						}
					}
					local522 = null;
					if ((local69 & 0x4) == 4) {
						local522 = new short[local285];
						for (local437 = 0; local437 < local285; local437++) {
							local522[local437] = (short) Static386.aClass5_Sub15_Sub2_2.method3683();
						}
					}
					local548 = null;
					if ((local69 & 0x8) == 8) {
						local548 = new short[local289];
						for (local441 = 0; local441 < local289; local441++) {
							local548[local441] = (short) Static386.aClass5_Sub15_Sub2_2.method3662();
						}
					}
					local586 = (long) local17 | (long) local25.anInt5482++ << 32;
					local25.aClass316_1 = new Class316(local586, local497, local522, local548);
				}
			}
			if ((local29 & 0x2000) != 0) {
				local25.aByte132 = Static386.aClass5_Sub15_Sub2_2.method3659();
				local25.aByte130 = Static386.aClass5_Sub15_Sub2_2.method3658();
				local25.aByte129 = Static386.aClass5_Sub15_Sub2_2.method3677();
				local25.aByte128 = (byte) Static386.aClass5_Sub15_Sub2_2.method3655();
				local25.anInt9472 = Static421.anInt7434 + Static386.aClass5_Sub15_Sub2_2.method3698();
				local25.anInt9478 = Static421.anInt7434 + Static386.aClass5_Sub15_Sub2_2.method3698();
			}
			if ((local29 & 0x20000) != 0) {
				local25.anInt5483 = Static386.aClass5_Sub15_Sub2_2.method3662();
				if (local25.anInt5483 == 65535) {
					local25.anInt5483 = local25.aClass311_1.anInt8679;
				}
			}
			if ((local29 & 0x1) != 0) {
				local25.aString99 = Static386.aClass5_Sub15_Sub2_2.method3661();
				local25.anInt9467 = 100;
			}
			if ((local29 & 0x8) != 0) {
				if (local25.aClass311_1.method7322()) {
					Static207.method2883(local25);
				}
				local25.method4716(Static58.aClass230_1.method5297(Static386.aClass5_Sub15_Sub2_2.method3662()));
				local25.method7928(local25.aClass311_1.anInt8641);
				local25.anInt9474 = local25.aClass311_1.anInt8678 << 3;
				if (local25.aClass311_1.method7322()) {
					Static578.method7881(local25.anIntArray527[0], 0, (Class41_Sub1_Sub1_Sub3_Sub2) null, local25, local25.aByte149, local25.anIntArray528[0], (Class81) null);
				}
			}
			if ((local29 & 0x80000) != 0) {
				local61 = local25.aClass311_1.anIntArray475.length;
				local285 = 0;
				if (local25.aClass311_1.aShortArray99 != null) {
					local285 = local25.aClass311_1.aShortArray99.length;
				}
				if (local25.aClass311_1.aShortArray100 != null) {
					local285 = local25.aClass311_1.aShortArray100.length;
				}
				local69 = Static386.aClass5_Sub15_Sub2_2.method3642();
				if ((local69 & 0x1) != 1) {
					local497 = null;
					if ((local69 & 0x2) == 2) {
						local497 = new int[local61];
						for (local83 = 0; local83 < local61; local83++) {
							local497[local83] = Static386.aClass5_Sub15_Sub2_2.method3637();
						}
					}
					local522 = null;
					if ((local69 & 0x4) == 4) {
						local522 = new short[local285];
						for (local437 = 0; local437 < local285; local437++) {
							local522[local437] = (short) Static386.aClass5_Sub15_Sub2_2.method3662();
						}
					}
					local548 = null;
					if ((local69 & 0x8) == 8) {
						local548 = new short[0];
						for (local441 = 0; local441 < 0; local441++) {
							local548[local441] = (short) Static386.aClass5_Sub15_Sub2_2.method3683();
						}
					}
					local586 = (long) local25.anInt5478++ << 32 | (long) local17;
					new Class316(local586, local497, local522, local548);
				}
			}
			if ((local29 & 0x1000) != 0) {
				local61 = Static386.aClass5_Sub15_Sub2_2.method3698();
				local285 = Static386.aClass5_Sub15_Sub2_2.method3693();
				if (local61 == 65535) {
					local61 = -1;
				}
				local289 = Static386.aClass5_Sub15_Sub2_2.method3667();
				local69 = local289 & 0x7;
				local74 = local289 >> 3 & 0xF;
				if (local74 == 15) {
					local74 = -1;
				}
				local25.method7930(1, local74, local61, local285, local69);
			}
			if ((local29 & 0x40000) != 0) {
				local61 = Static386.aClass5_Sub15_Sub2_2.method3698();
				local285 = Static386.aClass5_Sub15_Sub2_2.method3693();
				if (local61 == 65535) {
					local61 = -1;
				}
				local289 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local69 = local289 & 0x7;
				local74 = local289 >> 3 & 0xF;
				if (local74 == 15) {
					local74 = -1;
				}
				local25.method7930(2, local74, local61, local285, local69);
			}
			if ((local29 & 0x800) != 0) {
				local25.anInt9468 = Static386.aClass5_Sub15_Sub2_2.method3677();
				local25.anInt9505 = Static386.aClass5_Sub15_Sub2_2.method3659();
				local25.anInt9490 = Static386.aClass5_Sub15_Sub2_2.method3682();
				local25.anInt9489 = Static386.aClass5_Sub15_Sub2_2.method3658();
				local25.anInt9491 = Static386.aClass5_Sub15_Sub2_2.method3698() + Static421.anInt7434;
				local25.anInt9455 = Static386.aClass5_Sub15_Sub2_2.method3637() + Static421.anInt7434;
				local25.anInt9515 = Static386.aClass5_Sub15_Sub2_2.method3646();
				local25.anInt9490 += local25.anIntArray528[0];
				local25.anInt9525 = 0;
				local25.anInt9505 += local25.anIntArray527[0];
				local25.anInt9468 += local25.anIntArray528[0];
				local25.anInt9489 += local25.anIntArray527[0];
				local25.anInt9526 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	public static void method8425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static240.anInt3903 == 1) {
			Static265.method3769(arg1, arg0, Static105.aClass5_Sub2_Sub13_1);
		} else if (Static240.anInt3903 == 2) {
			if (Static305.aBoolean315) {
				Static206.method2873(arg1 + Static304.method4150(), arg0 + Static563.method7702());
			} else {
				Static206.method2873(arg1, arg0);
			}
		}
		Static105.aClass5_Sub2_Sub13_1 = null;
		Static240.anInt3903 = 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([[[Lclient!rr;Z)V")
	public static void method8427(@OriginalArg(0) Class313[][][] arg0) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(13) Class313[][] local13 = arg0[local8];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(18) int local18 = 0; local18 < local13[local15].length; local18++) {
					@Pc(25) Class313 local25 = local13[local15][local18];
					if (local25 != null) {
						if (local25.aClass41_Sub1_Sub4_1 instanceof Interface10) {
							((Interface10) local25.aClass41_Sub1_Sub4_1).method8672();
						}
						if (local25.aClass41_Sub1_Sub5_1 instanceof Interface10) {
							((Interface10) local25.aClass41_Sub1_Sub5_1).method8672();
						}
						if (local25.aClass41_Sub1_Sub5_2 instanceof Interface10) {
							((Interface10) local25.aClass41_Sub1_Sub5_2).method8672();
						}
						if (local25.aClass41_Sub1_Sub3_2 instanceof Interface10) {
							((Interface10) local25.aClass41_Sub1_Sub3_2).method8672();
						}
						if (local25.aClass41_Sub1_Sub3_1 instanceof Interface10) {
							((Interface10) local25.aClass41_Sub1_Sub3_1).method8672();
						}
						for (@Pc(75) Class40 local75 = local25.aClass40_3; local75 != null; local75 = local75.aClass40_1) {
							@Pc(79) Class41_Sub1_Sub1 local79 = local75.aClass41_Sub1_Sub1_1;
							if (local79 instanceof Interface10) {
								((Interface10) local79).method8672();
							}
						}
					}
				}
			}
		}
	}
}
