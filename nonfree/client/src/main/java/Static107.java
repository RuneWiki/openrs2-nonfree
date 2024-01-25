import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Z")
	public static boolean aBoolean133;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public static int anInt1977 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public static void method1935() {
		if (Static626.anInt10884 < 0) {
			return;
		}
		@Pc(7) long local7 = Static99.method1701();
		Static626.anInt10884 = (int) ((long) Static626.anInt10884 + Static633.aLong293 - local7);
		if (Static626.anInt10884 <= 0) {
			Static474.aFloat177 = Static458.aClass363_2.aFloat194;
			Static88.aFloat14 = Static458.aClass363_2.aFloat196;
			Static240.aFloat91 = Static458.aClass363_2.aFloat195;
			Static427.anInt7842 = Static458.aClass363_2.anInt10778;
			Static21.aFloat1 = Static458.aClass363_2.aFloat193;
			Static489.aFloat178 = Static458.aClass363_2.aFloat197;
			Static383.anInt7254 = Static458.aClass363_2.anInt10776;
			Static567.anInt9848 = Static458.aClass363_2.anInt10783;
			Static202.aFloat85 = Static458.aClass363_2.aFloat198;
			Static283.aClass3_2 = Static458.aClass363_2.aClass3_4;
			Static626.anInt10884 = -1;
		} else {
			@Pc(60) int local60 = (Static626.anInt10884 << 8) / Static440.anInt8001;
			@Pc(65) int local65 = 255 - local60;
			@Pc(70) float local70 = (float) local60 / 255.0F;
			Static567.anInt9848 = (local65 * (Static458.aClass363_2.anInt10783 & 0xFF00) + (Static543.anInt9487 & 0xFF00) * local60 & 0xFF0000) + ((Static543.anInt9487 & 0xFF00FF) * local60 + local65 * (Static458.aClass363_2.anInt10783 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(106) float local106 = 1.0F - local70;
			Static21.aFloat1 = (Static458.aClass363_2.aFloat193 - Static184.aFloat81) * local106 + Static184.aFloat81;
			Static88.aFloat14 = Static91.aFloat15 + (Static458.aClass363_2.aFloat196 - Static91.aFloat15) * local106;
			Static474.aFloat177 = local106 * (Static458.aClass363_2.aFloat194 - Static130.aFloat39) + Static130.aFloat39;
			Static383.anInt7254 = ((Static398.anInt7406 & 0xFF00FF) * local60 + local65 * (Static458.aClass363_2.anInt10776 & 0xFF00FF) & 0xFF00FF00) + ((Static458.aClass363_2.anInt10776 & 0xFF00) * local65 + (Static398.anInt7406 & 0xFF00) * local60 & 0xFF0000) >>> 8;
			Static202.aFloat85 = local106 * (Static458.aClass363_2.aFloat198 - Static259.aFloat92) + Static259.aFloat92;
			Static427.anInt7842 = Static457.anInt8187 * local60 + local65 * Static458.aClass363_2.anInt10778 >> 8;
			Static489.aFloat178 = (Static458.aClass363_2.aFloat197 - Static214.aFloat87) * local106 + Static214.aFloat87;
			Static240.aFloat91 = (Static458.aClass363_2.aFloat195 - Static409.aFloat162) * local106 + Static409.aFloat162;
			if (Static458.aClass363_2.aClass3_4 != Static376.aClass3_3) {
				Static283.aClass3_2 = Static595.aClass101_14.method8071(Static376.aClass3_3, Static458.aClass363_2.aClass3_4, local106, Static283.aClass3_2);
			}
		}
		Static633.aLong293 = local7;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;")
	public static String method1936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(25) String local25 = arg2[arg1];
			return local25 == null ? "null" : local25.toString();
		} else {
			@Pc(36) int local36 = arg1 + arg0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = arg1; local40 < local36; local40++) {
				@Pc(46) String local46 = arg2[local40];
				if (local46 == null) {
					local38 += 4;
				} else {
					local38 += local46.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local38);
			for (@Pc(67) int local67 = arg1; local67 < local36; local67++) {
				@Pc(73) String local73 = arg2[local67];
				if (local73 == null) {
					local65.append("null");
				} else {
					local65.append(local73);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public static void method1937() {
		@Pc(8) int local8 = Static101.aByteArrayArray7.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static101.aByteArrayArray7[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static513.anInt9127; local24++) {
					if (Static437.anIntArray399[local14] == Static163.anIntArray168[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static163.anIntArray168[Static513.anInt9127] = Static437.anIntArray399[local14];
					local22 = Static513.anInt9127++;
				}
				@Pc(67) Class2_Sub8 local67 = new Class2_Sub8(Static101.aByteArrayArray7[local14]);
				@Pc(69) int local69 = 0;
				while (local67.anInt5725 < Static101.aByteArrayArray7[local14].length && local69 < 511 && Static532.anInt9330 < 1023) {
					@Pc(88) int local88 = local69++ << 6 | local22;
					@Pc(92) int local92 = local67.method5211();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = local102 + (Static437.anIntArray399[local14] >> 8) * 64 - Static640.anInt11085;
					@Pc(132) int local132 = local106 + (Static437.anIntArray399[local14] & 0xFF) * 64 - Static490.anInt8763;
					@Pc(141) Class312 local141 = Static522.aClass272_2.method7200(local67.method5211());
					@Pc(148) Class2_Sub6 local148 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local88);
					if (local148 == null && (local141.aByte115 & 0x1) > 0 && local96 == Static578.anInt6963 && local119 >= 0 && Static222.anInt4533 > local141.anInt9095 + local119 && local132 >= 0 && local141.anInt9095 + local132 < Static668.anInt11370) {
						@Pc(185) Class15_Sub3_Sub3_Sub1_Sub2 local185 = new Class15_Sub3_Sub3_Sub1_Sub2();
						local185.anInt3977 = local88;
						@Pc(193) Class2_Sub6 local193 = new Class2_Sub6(local185);
						Static630.aClass335_29.method8356(local193, (long) local88);
						Static275.aClass2_Sub6Array1[Static487.anInt8726++] = local193;
						Static84.anIntArray73[Static532.anInt9330++] = local88;
						local185.anInt3999 = Static62.anInt1184;
						local185.method3698(local141);
						local185.method3689(local185.aClass312_1.anInt9095);
						local185.anInt4024 = local185.aClass312_1.anInt9063 << 3;
						local185.method3686(local185.aClass312_1.aByte118 + 4 << 11 & 0x3898, true);
						local185.method3695(local96, local119, local132, local185.method3690(), true);
					}
				}
			}
		}
	}
}
