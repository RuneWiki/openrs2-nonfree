import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "Lclient!ci;")
	public static Class38 aClass38_70;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	public static int anInt6019;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_187 = new Class214(8, 3);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BII)Z")
	public static boolean method4981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static151.method2806(arg1, arg0) || Static45.method928(arg1, arg0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!tf;ILclient!qa;I)V")
	public static void method4982(@OriginalArg(1) Class240 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class74 local10 = arg0.method5528(arg2);
		if (local10 == null) {
			return;
		}
		arg2.w(arg3, arg1, arg0.anInt6904 + arg3, arg0.anInt6894 + arg1);
		if (Static431.anInt7385 == 2 || Static431.anInt7385 == 5 || Static43.aClass2_4 == null) {
			arg2.GA(-16777216, local10, arg3, arg1);
			return;
		}
		@Pc(49) int local49;
		@Pc(52) int local52;
		@Pc(46) int local46;
		@Pc(59) int local59;
		if (Static275.anInt5173 == 4) {
			local46 = (int) -Static322.aFloat82 & 0x3FFF;
			local49 = Static3.anInt1340;
			local59 = 4096;
			local52 = Static373.anInt6559;
		} else {
			local46 = Static53.anInt4624 + (int) -Static322.aFloat82 & 0x3FFF;
			local49 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514;
			local52 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515;
			local59 = 4096 - Static437.anInt7473 * 16;
		}
		@Pc(86) int local86 = local49 / 32 + 48 - (Static193.anInt3853 - 104) * 2;
		@Pc(104) int local104 = Static301.anInt5585 * 4 + 208 + 48 - Static301.anInt5585 * 2 - local52 / 32;
		Static43.aClass2_4.method5912((float) arg3 + (float) arg0.anInt6904 / 2.0F, (float) arg1 + (float) arg0.anInt6894 / 2.0F, (float) local86, (float) local104, local59, local46 << 2, local10, arg3, arg1);
		@Pc(154) int local154;
		@Pc(164) int local164;
		@Pc(174) int local174;
		@Pc(185) int local185;
		for (@Pc(138) Class4_Sub16 local138 = (Class4_Sub16) Static202.aClass91_26.method2584(); local138 != null; local138 = (Class4_Sub16) Static202.aClass91_26.method2586()) {
			@Pc(143) int local143 = local138.anInt2197;
			local154 = (Static311.aClass189_3.anIntArray441[local143] >> 14 & 0x3FFF) - Static426.anInt7325;
			local164 = (Static311.aClass189_3.anIntArray441[local143] & 0x3FFF) - Static72.anInt1776;
			local174 = local154 * 4 + 2 - local49 / 32;
			local185 = local164 * 4 + 2 - local52 / 32;
			Static202.method3546(arg1, local185, Static311.aClass189_3.anIntArray440[local143], arg0, local10, arg2, local174, arg3);
		}
		for (local154 = 0; local154 < Static139.anInt2876; local154++) {
			local164 = Static89.anIntArray174[local154] * 4 + 2 - local49 / 32;
			local174 = Static328.anIntArray478[local154] * 4 + 2 - local52 / 32;
			@Pc(244) Class139 local244 = Static146.aClass228_1.method5203(Static195.anIntArray485[local154]);
			if (local244.anIntArray344 != null) {
				local244 = local244.method3751(Static67.aClass224_1);
				if (local244 == null || local244.anInt4363 == -1) {
					continue;
				}
			}
			Static202.method3546(arg1, local174, local244.anInt4363, arg0, local10, arg2, local164, arg3);
		}
		@Pc(331) int local331;
		@Pc(341) int local341;
		for (@Pc(287) Class4_Sub47 local287 = (Class4_Sub47) Static377.aClass96_31.method2798(); local287 != null; local287 = (Class4_Sub47) Static377.aClass96_31.method2796()) {
			local174 = (int) (local287.aLong228 >> 28 & 0x3L);
			if (Static455.anInt7776 == local174) {
				local185 = (int) (local287.aLong228 & 0x3FFFL) - Static426.anInt7325;
				@Pc(320) int local320 = (int) (local287.aLong228 >> 14 & 0x3FFFL) - Static72.anInt1776;
				local331 = local185 * 4 + 2 - local49 / 32;
				local341 = local320 * 4 + 2 - local52 / 32;
				Static351.method5117(local10, local331, arg3, local341, arg1, arg0, Static373.aClass2Array42[0]);
			}
		}
		@Pc(432) int local432;
		for (local174 = 0; local174 < Static77.anInt1870; local174++) {
			@Pc(372) Class4_Sub44 local372 = (Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local174]);
			if (local372 != null) {
				@Pc(377) Class11_Sub5_Sub2_Sub2 local377 = local372.aClass11_Sub5_Sub2_Sub2_2;
				if (local377.method5315() && local377.aByte100 == Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100) {
					@Pc(395) Class241 local395 = local377.aClass241_1;
					if (local395 != null && local395.anIntArray565 != null) {
						local395 = local395.method5593(Static67.aClass224_1);
					}
					if (local395 != null && local395.aBoolean515 && local395.aBoolean514) {
						local341 = local377.anInt7514 / 32 - local49 / 32;
						local432 = local377.anInt7515 / 32 - local52 / 32;
						if (local395.anInt7015 == -1) {
							Static351.method5117(local10, local341, arg3, local432, arg1, arg0, Static373.aClass2Array42[1]);
						} else {
							Static202.method3546(arg1, local432, local395.anInt7015, arg0, local10, arg2, local341, arg3);
						}
					}
				}
			}
		}
		local185 = Static402.anInt7091;
		@Pc(474) int[] local474 = Static144.anIntArray244;
		@Pc(518) int local518;
		@Pc(522) int local522;
		@Pc(554) int local554;
		for (local331 = 0; local331 < local185; local331++) {
			@Pc(484) Class11_Sub5_Sub2_Sub1 local484 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local474[local331]];
			if (local484 != null && local484.method3620() && Static52.aClass11_Sub5_Sub2_Sub1_2 != local484 && Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 == local484.aByte100) {
				local432 = local484.anInt7514 / 32 - local49 / 32;
				local518 = local484.anInt7515 / 32 - local52 / 32;
				@Pc(520) boolean local520 = false;
				for (local522 = 0; local522 < Static65.anInt1626; local522++) {
					if (local484.aString31.equals(Static75.aStringArray9[local522]) && Static269.anIntArray390[local522] != 0) {
						local520 = true;
						break;
					}
				}
				@Pc(552) boolean local552 = false;
				for (local554 = 0; local554 < Static422.anInt7300; local554++) {
					if (local484.aString31.equals(Static87.aClass152Array1[local554].aString37)) {
						local552 = true;
						break;
					}
				}
				@Pc(578) boolean local578 = false;
				if (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4189 != 0 && local484.anInt4189 != 0 && Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4189 == local484.anInt4189) {
					local578 = true;
				}
				if (local484.aBoolean262) {
					Static351.method5117(local10, local432, arg3, local518, arg1, arg0, Static373.aClass2Array42[6]);
				} else if (local520) {
					Static351.method5117(local10, local432, arg3, local518, arg1, arg0, Static373.aClass2Array42[3]);
				} else if (local552) {
					Static351.method5117(local10, local432, arg3, local518, arg1, arg0, Static373.aClass2Array42[5]);
				} else if (local578) {
					Static351.method5117(local10, local432, arg3, local518, arg1, arg0, Static373.aClass2Array42[4]);
				} else {
					Static351.method5117(local10, local432, arg3, local518, arg1, arg0, Static373.aClass2Array42[2]);
				}
			}
		}
		@Pc(676) Class51[] local676 = Static209.aClass51Array1;
		@Pc(758) int local758;
		for (local432 = 0; local432 < local676.length; local432++) {
			@Pc(684) Class51 local684 = local676[local432];
			if (local684 != null && local684.anInt1749 != 0 && Static277.anInt2834 % 20 < 10) {
				@Pc(723) int local723;
				if (local684.anInt1749 == 1) {
					@Pc(708) Class4_Sub44 local708 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local684.anInt1740);
					if (local708 != null) {
						@Pc(713) Class11_Sub5_Sub2_Sub2 local713 = local708.aClass11_Sub5_Sub2_Sub2_2;
						local723 = local713.anInt7514 / 32 - local49 / 32;
						local554 = local713.anInt7515 / 32 - local52 / 32;
						Static231.method3927(arg3, local684.anInt1744, 360000L, local723, arg0, local10, arg1, local554);
					}
				}
				if (local684.anInt1749 == 2) {
					local758 = local684.anInt1746 / 32 - local49 / 32;
					local522 = local684.anInt1748 / 32 - local52 / 32;
					@Pc(774) long local774 = (long) (local684.anInt1738 << 5);
					@Pc(778) long local778 = local774 * local774;
					Static231.method3927(arg3, local684.anInt1744, local778, local758, arg0, local10, arg1, local522);
				}
				if (local684.anInt1749 == 10 && local684.anInt1740 >= 0 && local684.anInt1740 < Static39.aClass11_Sub5_Sub2_Sub1Array1.length) {
					@Pc(806) Class11_Sub5_Sub2_Sub1 local806 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local684.anInt1740];
					if (local806 != null) {
						local522 = local806.anInt7514 / 32 - local49 / 32;
						local723 = local806.anInt7515 / 32 - local52 / 32;
						Static231.method3927(arg3, local684.anInt1744, 360000L, local522, arg0, local10, arg1, local723);
					}
				}
			}
		}
		if (Static275.anInt5173 == 4) {
			return;
		}
		if (Static38.anInt906 != 0) {
			local518 = Static38.anInt906 * 4 + Static52.aClass11_Sub5_Sub2_Sub1_2.method5302() * 2 + 2 - local49 / 32 - 2;
			local758 = Static184.anInt3729 * 4 + (Static52.aClass11_Sub5_Sub2_Sub1_2.method5302() - 1) * 2 + 2 - local52 / 32;
			Static351.method5117(local10, local518, arg3, local758, arg1, arg0, Static403.aClass2Array28[Static381.aBoolean486 ? 1 : 0]);
		}
		arg2.method2072(arg1 + arg0.anInt6894 / 2 - 1, arg3 + -1 + arg0.anInt6904 / 2, 3, 3, -1);
	}
}
