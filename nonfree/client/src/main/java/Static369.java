import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BIII)I")
	public static int method5565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!tia;Lclient!jha;IBI)V")
	public static void method5566(@OriginalArg(0) Class5_Sub41_Sub2 arg0, @OriginalArg(1) Class28_Sub1_Sub4_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((arg2 & 0x1) != 0) {
			arg1.anInt5543 = arg0.method7858();
			if (arg1.anInt5524 == 0) {
				arg1.method4582(arg1.anInt5543);
				arg1.anInt5543 = -1;
			}
		}
		@Pc(30) byte local30 = -1;
		if ((arg2 & 0x800) != 0) {
			local30 = arg0.method7819();
		}
		@Pc(49) int local49;
		@Pc(52) int[] local52;
		@Pc(55) int[] local55;
		@Pc(60) int local60;
		@Pc(66) int local66;
		if ((arg2 & 0x1000) != 0) {
			local49 = arg0.method7818();
			local52 = new int[local49];
			local55 = new int[local49];
			@Pc(58) int[] local58 = new int[local49];
			for (local60 = 0; local60 < local49; local60++) {
				local66 = arg0.method7860();
				if (local66 == 65535) {
					local66 = -1;
				}
				local52[local60] = local66;
				local55[local60] = arg0.method7799();
				local58[local60] = arg0.method7858();
			}
			Static167.method2916(local58, local52, arg1, local55);
		}
		@Pc(112) int local112;
		@Pc(139) int local139;
		if ((arg2 & 0x80) != 0) {
			@Pc(110) int[] local110 = new int[4];
			for (local112 = 0; local112 < 4; local112++) {
				local110[local112] = arg0.method7860();
				if (local110[local112] == 65535) {
					local110[local112] = -1;
				}
			}
			local139 = arg0.method7829();
			Static433.method6363(local110, local139, arg1);
		}
		@Pc(163) int local163;
		if ((arg2 & 0x20000) != 0) {
			local49 = arg0.method7829();
			local52 = new int[local49];
			local55 = new int[local49];
			for (local163 = 0; local163 < local49; local163++) {
				local60 = arg0.method7796();
				if ((local60 & 0xC000) == 49152) {
					local66 = arg0.method7860();
					local52[local163] = local66 | local60 << 16;
				} else {
					local52[local163] = local60;
				}
				local55[local163] = arg0.method7838();
			}
			arg1.method4581(local52, local55);
		}
		if ((arg2 & 0x40000) != 0) {
			arg1.aByte81 = arg0.method7861();
			arg1.lb = arg0.method7811();
			arg1.aByte80 = arg0.method7810();
			arg1.aByte78 = (byte) arg0.method7829();
			arg1.anInt5490 = Static26.anInt350 + arg0.method7796();
			arg1.anInt5495 = Static26.anInt350 + arg0.method7860();
		}
		if ((arg2 & 0x10000) != 0) {
			local49 = arg0.method7796();
			local112 = arg0.method7834();
			if (local49 == 65535) {
				local49 = -1;
			}
			local139 = arg0.method7818();
			local163 = local139 & 0x7;
			local60 = local139 >> 3 & 0xF;
			if (local60 == 15) {
				local60 = -1;
			}
			arg1.method4595(local112, local60, 2, local49, local163);
		}
		if ((arg2 & 0x400) != 0) {
			arg1.aBoolean475 = arg0.method7799() == 1;
		}
		if ((arg2 & 0x8) != 0) {
			Static598.aByteArray100[arg3] = arg0.method7861();
		}
		if ((arg2 & 0x100) != 0) {
			local49 = arg0.method7858();
			arg1.anInt5488 = arg0.method7799();
			arg1.anInt5520 = arg0.method7818();
			arg1.anInt5484 = local49 & 0x7FFF;
			arg1.aBoolean469 = (local49 & 0x8000) != 0;
			arg1.anInt5483 = Static26.anInt350 + arg1.anInt5484 + arg1.anInt5488;
		}
		if ((arg2 & 0x4000) != 0) {
			arg1.anInt5511 = arg0.method7810();
			arg1.anInt5518 = arg0.method7861();
			arg1.anInt5503 = arg0.method7819();
			arg1.anInt5467 = arg0.method7810();
			arg1.anInt5463 = arg0.method7858() + Static26.anInt350;
			arg1.anInt5473 = arg0.method7860() + Static26.anInt350;
			arg1.anInt5476 = arg0.method7799();
			if (arg1.aBoolean474) {
				arg1.anInt5511 += arg1.anInt5544;
				arg1.anInt5467 += arg1.anInt5560;
				arg1.anInt5503 += arg1.anInt5544;
				arg1.anInt5518 += arg1.anInt5560;
				arg1.anInt5524 = 0;
			} else {
				arg1.anInt5511 += arg1.anIntArray308[0];
				arg1.anInt5503 += arg1.anIntArray308[0];
				arg1.anInt5518 += arg1.anIntArray307[0];
				arg1.anInt5467 += arg1.anIntArray307[0];
				arg1.anInt5524 = 1;
			}
			arg1.anInt5525 = 0;
		}
		if ((arg2 & 0x2000) != 0) {
			local49 = arg0.method7838();
			if (local49 == 65535) {
				local49 = -1;
			}
			local112 = arg0.method7833();
			local139 = arg0.method7829();
			local163 = local139 & 0x7;
			local60 = local139 >> 3 & 0xF;
			if (local60 == 15) {
				local60 = -1;
			}
			arg1.method4595(local112, local60, 1, local49, local163);
		}
		if ((arg2 & 0x2) != 0) {
			local112 = arg0.method7816();
			if (local112 > 0) {
				for (local139 = 0; local139 < local112; local139++) {
					local60 = -1;
					local66 = -1;
					local163 = arg0.method7812();
					@Pc(570) int local570 = -1;
					if (local163 == 32767) {
						local163 = arg0.method7812();
						local66 = arg0.method7812();
						local60 = arg0.method7812();
						local570 = arg0.method7812();
					} else if (local163 == 32766) {
						local163 = -1;
					} else {
						local66 = arg0.method7812();
					}
					@Pc(606) int local606 = arg0.method7812();
					@Pc(610) int local610 = arg0.method7816();
					arg1.method4579(local610, Static26.anInt350, local66, local163, local606, local60, local570);
				}
			}
		}
		if ((arg2 & 0x10) != 0) {
			local112 = arg0.method7796();
			if (local112 == 65535) {
				local112 = -1;
			}
			arg1.anInt5500 = local112;
		}
		if ((arg2 & 0x80000) != 0) {
			arg1.aBoolean476 = arg0.method7816() == 1;
		}
		if ((arg2 & 0x40) != 0) {
			local112 = arg0.method7858();
			if (local112 == 65535) {
				local112 = -1;
			}
			local139 = arg0.method7834();
			local163 = arg0.method7818();
			local60 = local163 & 0x7;
			local66 = local163 >> 3 & 0xF;
			if (local66 == 15) {
				local66 = -1;
			}
			arg1.method4595(local139, local66, 0, local112, local60);
		}
		if ((arg2 & 0x200) != 0) {
			arg1.aString43 = arg0.method7847();
			if (arg1.aString43.charAt(0) == '~') {
				arg1.aString43 = arg1.aString43.substring(1);
				Static234.method3619(0, arg1.method4612(), arg1.method4607(), arg1.aString44, arg1.aString43, 2);
			} else if (arg1 == Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1) {
				Static234.method3619(0, arg1.method4612(), arg1.method4607(), arg1.aString44, arg1.aString43, 2);
			}
			arg1.anInt5505 = 0;
			arg1.anInt5454 = 150;
			arg1.anInt5489 = 0;
		}
		if ((arg2 & 0x4) != 0) {
			local112 = arg0.method7818();
			@Pc(792) byte[] local792 = new byte[local112];
			@Pc(797) Class5_Sub41 local797 = new Class5_Sub41(local792);
			arg0.method7802(local112, 0, local792);
			Static271.aClass5_Sub41Array2[arg3] = local797;
			arg1.method4605(local797);
		}
		if (!arg1.aBoolean474) {
			return;
		}
		if (local30 == 127) {
			arg1.method4609(arg1.anInt5560, arg1.anInt5544);
			return;
		}
		@Pc(827) byte local827;
		if (local30 == -1) {
			local827 = Static598.aByteArray100[arg3];
		} else {
			local827 = local30;
		}
		Static117.method2216(local827, arg1);
		arg1.method4604(arg1.anInt5544, local827, arg1.anInt5560);
	}
}
