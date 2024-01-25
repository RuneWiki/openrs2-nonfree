import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!lu;")
	public static Class231 aClass231_4;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public static void method7104() {
		@Pc(16) int local16 = Static316.aByteArrayArray16.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (Static316.aByteArrayArray16[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static208.anInt3838; local28++) {
					if (Static442.anIntArray464[local18] == Static459.anIntArray477[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static459.anIntArray477[Static208.anInt3838] = Static442.anIntArray464[local18];
					local26 = Static208.anInt3838++;
				}
				@Pc(68) Class3_Sub17 local68 = new Class3_Sub17(Static316.aByteArrayArray16[local18]);
				@Pc(70) int local70 = 0;
				while (Static316.aByteArrayArray16[local18].length > local68.lb && local70 < 511 && Static308.anInt5687 < 1023) {
					@Pc(87) int local87 = local26 | local70++ << 6;
					@Pc(91) int local91 = local68.method4858();
					@Pc(95) int local95 = local91 >> 14;
					@Pc(101) int local101 = local91 >> 7 & 0x3F;
					@Pc(105) int local105 = local91 & 0x3F;
					@Pc(118) int local118 = local101 + (Static442.anIntArray464[local18] >> 8) * 64 - Static417.anInt7047;
					@Pc(131) int local131 = local105 + (Static442.anIntArray464[local18] & 0xFF) * 64 - Static347.anInt7851;
					@Pc(138) Class5 local138 = Static481.aClass241_2.method5582(local68.method4858());
					@Pc(145) Class3_Sub11 local145 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local87);
					if (local145 == null && (local138.aByte4 & 0x1) > 0 && Static407.anInt6944 == local95 && local118 >= 0 && local118 + local138.anInt66 < Static251.anInt4680 && local131 >= 0 && local131 + local138.anInt66 < Static406.anInt6924) {
						@Pc(182) Class23_Sub2_Sub1_Sub2_Sub2 local182 = new Class23_Sub2_Sub1_Sub2_Sub2();
						local182.anInt10180 = local87;
						@Pc(190) Class3_Sub11 local190 = new Class3_Sub11(local182);
						Static500.aClass62_40.method1686((long) local87, local190);
						Static43.aClass3_Sub11Array1[Static609.anInt6433++] = local190;
						Static390.anIntArray424[Static308.anInt5687++] = local87;
						local182.anInt10155 = Static621.anInt9665;
						local182.method8636(local138);
						local182.method8621(local182.aClass5_1.anInt66);
						local182.anInt10133 = local182.aClass5_1.anInt55 << 3;
						local182.method8623(local182.aClass5_1.aByte9 + 4 << 11 & 0x3E49, true);
						local182.method8638(local131, local95, local182.method8625(), local118, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I")
	public static int method7105(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) int local16 = arg1.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local18 - local22 < local8 || local16 > local20 - local24) {
			if (local8 <= local18 - local22) {
				return -1;
			}
			if (local16 <= local20 - local24) {
				return 1;
			}
			@Pc(66) char local66;
			if (local22 == '\u0000') {
				local66 = arg0.charAt(local18++);
			} else {
				local66 = local22;
			}
			@Pc(82) char local82;
			if (local24 == '\u0000') {
				local82 = arg1.charAt(local20++);
			} else {
				local82 = local24;
			}
			local22 = Static593.method7940(local66);
			local24 = Static593.method7940(local82);
			local66 = Static676.method8731(local66, arg2);
			local82 = Static676.method8731(local82, arg2);
			if (local66 != local82 && Character.toUpperCase(local66) != Character.toUpperCase(local82)) {
				local66 = Character.toLowerCase(local66);
				local82 = Character.toLowerCase(local82);
				if (local82 != local66) {
					return Static146.method2532(local66, arg2) - Static146.method2532(local82, arg2);
				}
			}
		}
		@Pc(149) int local149 = Math.min(local8, local16);
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			if (arg2 == 2) {
				local20 = local16 - local151 - 1;
				local18 = local8 - local151 - 1;
			} else {
				local20 = local151;
				local18 = local151;
			}
			@Pc(181) char local181 = arg0.charAt(local18);
			@Pc(185) char local185 = arg1.charAt(local20);
			if (local181 != local185 && Character.toUpperCase(local181) != Character.toUpperCase(local185)) {
				local181 = Character.toLowerCase(local181);
				local185 = Character.toLowerCase(local185);
				if (local181 != local185) {
					return Static146.method2532(local181, arg2) - Static146.method2532(local185, arg2);
				}
			}
		}
		@Pc(229) int local229 = local8 - local16;
		if (local229 != 0) {
			return local229;
		}
		for (@Pc(238) int local238 = 0; local238 < local149; local238++) {
			@Pc(244) char local244 = arg0.charAt(local238);
			@Pc(248) char local248 = arg1.charAt(local238);
			if (local244 != local248) {
				return Static146.method2532(local244, arg2) - Static146.method2532(local248, arg2);
			}
		}
		return 0;
	}
}
