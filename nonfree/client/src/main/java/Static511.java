import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	public static int anInt7697;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static int anInt7699 = 0;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public static final int anInt7701 = 4;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!rca;ZILclient!ak;)V")
	public static void method6431(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class11_Sub1_Sub1_Sub2_Sub1 arg3) {
		if ((arg0 & 0x800) != 0) {
			arg3.anInt3209 = arg1.method6917();
			arg3.anInt3261 = arg1.method6905();
			arg3.anInt3287 = arg1.method6905();
			arg3.anInt3291 = arg1.method6917();
			arg3.anInt3220 = arg1.method6911() + Static325.anInt5888;
			arg3.anInt3274 = arg1.method6859() + Static325.anInt5888;
			arg3.anInt3289 = arg1.method6909();
			arg3.anInt3294 = 0;
			if (arg3.aBoolean44) {
				arg3.anInt3287 += arg3.anInt545;
				arg3.anInt3291 += arg3.anInt569;
				arg3.anInt3209 += arg3.anInt545;
				arg3.anInt3296 = 0;
				arg3.anInt3261 += arg3.anInt569;
			} else {
				arg3.anInt3261 += arg3.anIntArray233[0];
				arg3.anInt3287 += arg3.anIntArray232[0];
				arg3.anInt3296 = 1;
				arg3.anInt3291 += arg3.anIntArray233[0];
				arg3.anInt3209 += arg3.anIntArray232[0];
			}
		}
		@Pc(129) byte local129 = -1;
		if ((arg0 & 0x4000) != 0) {
			arg3.aString33 = arg1.method6903();
			if (arg3.aString33.charAt(0) == '~') {
				arg3.aString33 = arg3.aString33.substring(1);
				Static369.method5571(arg3.method421(), arg3.aString3, arg3.aString33, 0, 2, arg3.method425());
			} else if (arg3 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2) {
				Static369.method5571(arg3.method421(), arg3.aString3, arg3.aString33, 0, 2, arg3.method425());
			}
			arg3.anInt3212 = 0;
			arg3.anInt3249 = 150;
			arg3.anInt3277 = 0;
		}
		@Pc(209) int local209;
		@Pc(213) int local213;
		if ((arg0 & 0x80) != 0) {
			local209 = arg1.method6863();
			local213 = arg1.method6904();
			arg3.method2766(local213, Static325.anInt5888, local209);
			arg3.anInt3267 = Static325.anInt5888 + 300;
			arg3.anInt3260 = arg1.method6904();
		}
		@Pc(243) int[] local243;
		@Pc(245) int local245;
		@Pc(250) int local250;
		@Pc(261) int local261;
		@Pc(240) int[] local240;
		if ((arg0 & 0x20000) != 0) {
			local209 = arg1.method6919();
			local240 = new int[local209];
			local243 = new int[local209];
			for (local245 = 0; local245 < local209; local245++) {
				local250 = arg1.method6859();
				if ((local250 & 0xC000) == 49152) {
					local261 = arg1.method6884();
					local240[local245] = local261 | local250 << 16;
				} else {
					local240[local245] = local250;
				}
				local243[local245] = arg1.method6879();
			}
			arg3.method2779(local240, local243);
		}
		if ((arg0 & 0x2000) != 0) {
			local209 = arg1.method6879();
			arg3.anInt3286 = arg1.method6904();
			arg3.anInt3207 = arg1.method6919();
			arg3.aBoolean277 = (local209 & 0x8000) != 0;
			arg3.anInt3219 = local209 & 0x7FFF;
			arg3.anInt3276 = arg3.anInt3286 + Static325.anInt5888 + arg3.anInt3219;
		}
		if ((arg0 & 0x10000) != 0) {
			arg3.aByte61 = arg1.method6917();
			arg3.aByte62 = arg1.method6873();
			arg3.aByte63 = arg1.method6908();
			arg3.aByte60 = (byte) arg1.method6909();
			arg3.anInt3271 = Static325.anInt5888 + arg1.method6879();
			arg3.anInt3228 = Static325.anInt5888 + arg1.method6859();
		}
		if ((arg0 & 0x200) != 0) {
			arg3.aBoolean47 = arg1.method6867() == 1;
		}
		if ((arg0 & 0x10) != 0) {
			local209 = arg1.method6884();
			if (local209 == 65535) {
				local209 = -1;
			}
			arg3.anInt3278 = local209;
		}
		if ((arg0 & 0x4) != 0) {
			arg3.anInt568 = arg1.method6859();
			if (arg3.anInt3296 == 0) {
				arg3.method2771(arg3.anInt568);
				arg3.anInt568 = -1;
			}
		}
		@Pc(464) int local464;
		if ((arg0 & 0x1000) != 0) {
			local209 = arg1.method6884();
			local213 = arg1.method6865();
			if (local209 == 65535) {
				local209 = -1;
			}
			local464 = arg1.method6909();
			local245 = local464 & 0x7;
			local250 = local464 >> 3 & 0xF;
			if (local250 == 15) {
				local250 = -1;
			}
			arg3.method2760(local245, local209, local250, true, local213);
		}
		if ((arg0 & 0x40000) != 0) {
			local209 = Static325.anInt5888;
			local213 = arg1.method6863();
			local464 = arg1.method6867();
			arg3.method2766(local464, local209, local213);
		}
		if ((arg0 & 0x100) != 0) {
			local129 = arg1.method6917();
		}
		if ((arg0 & 0x2) != 0) {
			@Pc(530) int[] local530 = new int[4];
			for (local213 = 0; local213 < 4; local213++) {
				local530[local213] = arg1.method6884();
				if (local530[local213] == 65535) {
					local530[local213] = -1;
				}
			}
			local464 = arg1.method6909();
			Static588.method8119(arg3, local530, local464);
		}
		if ((arg0 & 0x8) != 0) {
			Static99.aByteArray24[arg2] = arg1.method6873();
		}
		if ((arg0 & 0x20) != 0) {
			local209 = arg1.method6911();
			local213 = arg1.method6896();
			if (local209 == 65535) {
				local209 = -1;
			}
			local464 = arg1.method6867();
			local245 = local464 & 0x7;
			local250 = local464 >> 3 & 0xF;
			if (local250 == 15) {
				local250 = -1;
			}
			arg3.method2760(local245, local209, local250, false, local213);
		}
		if ((arg0 & 0x40) != 0) {
			local209 = arg1.method6867();
			@Pc(639) byte[] local639 = new byte[local209];
			@Pc(644) Class2_Sub34 local644 = new Class2_Sub34(local639);
			arg1.method6902(local209, local639);
			Static624.aClass2_Sub34Array1[arg2] = local644;
			arg3.method429(local644);
		}
		if ((arg0 & 0x400) != 0) {
			local209 = arg1.method6909();
			local240 = new int[local209];
			local243 = new int[local209];
			@Pc(678) int[] local678 = new int[local209];
			for (local250 = 0; local250 < local209; local250++) {
				local261 = arg1.method6884();
				if (local261 == 65535) {
					local261 = -1;
				}
				local240[local250] = local261;
				local243[local250] = arg1.method6919();
				local678[local250] = arg1.method6911();
			}
			Static412.method6324(arg3, local243, local678, local240);
		}
		if (!arg3.aBoolean44) {
			return;
		}
		if (local129 == 127) {
			arg3.method424(arg3.anInt569, arg3.anInt545);
			return;
		}
		@Pc(740) byte local740;
		if (local129 == -1) {
			local740 = Static99.aByteArray24[arg2];
		} else {
			local740 = local129;
		}
		Static7.method129(arg3, local740);
		arg3.method430(local740, arg3.anInt545, arg3.anInt569);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IC)Ljava/lang/String;")
	public static String method6432(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg1.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(11) int local11 = local6;
		@Pc(15) int local15 = local9 - 1;
		if (local15 != 0) {
			@Pc(20) int local20 = 0;
			while (true) {
				local20 = arg1.indexOf(13, local20);
				if (local20 < 0) {
					break;
				}
				local11 += local15;
				local20++;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local11);
		@Pc(40) int local40 = 0;
		while (true) {
			@Pc(45) int local45 = arg1.indexOf(13, local40);
			if (local45 < 0) {
				local38.append(arg1.substring(local40));
				return local38.toString();
			}
			local38.append(arg1.substring(local40, local45));
			local38.append(arg0);
			local40 = local45 + 1;
		}
	}
}
