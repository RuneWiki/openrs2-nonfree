import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "J")
	public static long aLong130;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
	public static int anInt4449 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!jc;IILclient!l;)V")
	public static void method3927(@OriginalArg(1) Class3_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub2_Sub1_Sub2 arg3) {
		@Pc(16) int local16;
		if ((arg1 & 0x1) != 0) {
			local16 = arg0.method4259();
			@Pc(19) byte[] local19 = new byte[local16];
			@Pc(24) Class3_Sub3 local24 = new Class3_Sub3(local19);
			arg0.method4205(local19, local16);
			Static56.aClass3_Sub3Array1[arg2] = local24;
			arg3.method5075(local24);
		}
		@Pc(40) byte local40 = -1;
		if ((arg1 & 0x4) != 0) {
			arg3.anInt5818 = arg0.method4236();
			if (arg3.anInt5792 == 0) {
				arg3.method5065(arg3.anInt5818);
				arg3.anInt5818 = -1;
			}
		}
		@Pc(85) int local85;
		@Pc(91) int local91;
		@Pc(77) int[] local77;
		@Pc(80) int[] local80;
		if ((arg1 & 0x1000) != 0) {
			local16 = arg0.method4225();
			local77 = new int[local16];
			local80 = new int[local16];
			@Pc(83) int[] local83 = new int[local16];
			for (local85 = 0; local85 < local16; local85++) {
				local91 = arg0.method4222();
				if (local91 == 65535) {
					local91 = -1;
				}
				local77[local85] = local91;
				local80[local85] = arg0.method4263();
				local83[local85] = arg0.method4222();
			}
			Static484.method7204(local83, local77, arg3, local80);
		}
		if ((arg1 & 0x20) != 0) {
			Static420.aByteArray80[arg2] = arg0.method4245();
		}
		if ((arg1 & 0x4000) != 0) {
			local40 = arg0.method4254();
		}
		if ((arg1 & 0x20000) != 0) {
			arg3.aByte88 = arg0.method4254();
			arg3.aByte90 = arg0.method4239();
			arg3.aByte89 = arg0.method4245();
			arg3.aByte91 = (byte) arg0.method4243();
			arg3.anInt5749 = Static101.anInt2262 + arg0.method4236();
			arg3.anInt5779 = Static101.anInt2262 + arg0.method4221();
		}
		if ((arg1 & 0x10) != 0) {
			local16 = arg0.method4236();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg3.anInt5744 = local16;
		}
		@Pc(219) int local219;
		@Pc(228) int local228;
		@Pc(232) int local232;
		if ((arg1 & 0x2000) != 0) {
			local16 = arg0.method4231();
			local219 = arg0.method4210();
			if (local16 == 65535) {
				local16 = -1;
			}
			local228 = arg0.method4225();
			local232 = local228 & 0x7;
			local85 = local228 >> 3 & 0xF;
			if (local85 == 15) {
				local85 = -1;
			}
			arg3.method5062(local219, true, local232, local16, local85);
		}
		if ((arg1 & 0x40000) != 0) {
			local16 = Static101.anInt2262;
			local219 = arg0.method4228();
			local228 = arg0.method4263();
			arg3.method5060(local219, local228, local16);
		}
		if ((arg1 & 0x200) != 0) {
			arg3.aBoolean408 = arg0.method4225() == 1;
		}
		if ((arg1 & 0x80) != 0) {
			@Pc(308) int[] local308 = new int[4];
			for (local219 = 0; local219 < 4; local219++) {
				local308[local219] = arg0.method4222();
				if (local308[local219] == 65535) {
					local308[local219] = -1;
				}
			}
			local228 = arg0.method4225();
			Static574.method8145(arg3, local228, local308);
		}
		if ((arg1 & 0x800) != 0) {
			arg3.anInt5750 = arg0.method4239();
			arg3.anInt5729 = arg0.method4250();
			arg3.anInt5748 = arg0.method4250();
			arg3.anInt5786 = arg0.method4245();
			arg3.anInt5788 = arg0.method4231() + Static101.anInt2262;
			arg3.anInt5754 = arg0.method4221() + Static101.anInt2262;
			arg3.anInt5758 = arg0.method4243();
			arg3.anInt5793 = 0;
			if (arg3.aBoolean412) {
				arg3.anInt5750 += arg3.anInt5833;
				arg3.anInt5748 += arg3.anInt5833;
				arg3.anInt5792 = 0;
				arg3.anInt5786 += arg3.anInt5814;
				arg3.anInt5729 += arg3.anInt5814;
			} else {
				arg3.anInt5792 = 1;
				arg3.anInt5748 += arg3.anIntArray310[0];
				arg3.anInt5729 += arg3.anIntArray309[0];
				arg3.anInt5786 += arg3.anIntArray309[0];
				arg3.anInt5750 += arg3.anIntArray310[0];
			}
		}
		if ((arg1 & 0x10000) != 0) {
			local16 = arg0.method4243();
			local77 = new int[local16];
			local80 = new int[local16];
			for (local232 = 0; local232 < local16; local232++) {
				local85 = arg0.method4231();
				if ((local85 & 0xC000) == 49152) {
					local91 = arg0.method4231();
					local77[local232] = local85 << 16 | local91;
				} else {
					local77[local232] = local85;
				}
				local80[local232] = arg0.method4221();
			}
			arg3.method5071(local80, local77);
		}
		if ((arg1 & 0x40) != 0) {
			local16 = arg0.method4228();
			local219 = arg0.method4259();
			arg3.method5060(local16, local219, Static101.anInt2262);
			arg3.anInt5757 = Static101.anInt2262 + 300;
			arg3.anInt5722 = arg0.method4243();
		}
		if ((arg1 & 0x8000) != 0) {
			local16 = arg0.method4221();
			arg3.anInt5711 = arg0.method4225();
			arg3.anInt5740 = arg0.method4225();
			arg3.aBoolean403 = (local16 & 0x8000) != 0;
			arg3.anInt5741 = local16 & 0x7FFF;
			arg3.anInt5746 = arg3.anInt5741 + Static101.anInt2262 + arg3.anInt5711;
		}
		if ((arg1 & 0x8) != 0) {
			local16 = arg0.method4236();
			if (local16 == 65535) {
				local16 = -1;
			}
			local219 = arg0.method4210();
			local228 = arg0.method4263();
			local232 = local228 & 0x7;
			local85 = local228 >> 3 & 0xF;
			if (local85 == 15) {
				local85 = -1;
			}
			arg3.method5062(local219, false, local232, local16, local85);
		}
		if ((arg1 & 0x100) != 0) {
			arg3.aString62 = arg0.method4233();
			if (arg3.aString62.charAt(0) == '~') {
				arg3.aString62 = arg3.aString62.substring(1);
				Static582.method8231(arg3.aString62, arg3.method5089(), 2, 0, arg3.method5086(), arg3.aString64);
			} else if (arg3 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2) {
				Static582.method8231(arg3.aString62, arg3.method5089(), 2, 0, arg3.method5086(), arg3.aString64);
			}
			arg3.anInt5785 = 0;
			arg3.anInt5747 = 150;
			arg3.anInt5761 = 0;
		}
		if (!arg3.aBoolean412) {
			return;
		}
		if (local40 == 127) {
			arg3.method5082(arg3.anInt5814, arg3.anInt5833);
			return;
		}
		@Pc(743) byte local743;
		if (local40 == -1) {
			local743 = Static420.aByteArray80[arg2];
		} else {
			local743 = local40;
		}
		Static192.method3268(local743, arg3);
		arg3.method5088(arg3.anInt5833, arg3.anInt5814, local743);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method3933(@OriginalArg(0) Class5 arg0) {
		Static151.aClass95Array1 = new Class95[Static307.anIntArray298.length];
		for (@Pc(20) int local20 = 0; local20 < Static307.anIntArray298.length; local20++) {
			@Pc(26) int local26 = Static307.anIntArray298[local20];
			@Pc(31) Class282 local31 = Static95.method2093(Static303.aClass196_59, local26);
			@Pc(39) Class62 local39 = arg0.method7515(local31, Static645.method2768(Static592.aClass196_123, local26));
			Static151.aClass95Array1[local20] = new Class95(local39, local31);
		}
	}
}
