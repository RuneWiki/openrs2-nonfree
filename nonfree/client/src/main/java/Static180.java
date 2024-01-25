import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "I")
	public static int anInt3144;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lclient!ee;ZZ)V")
	public static void method2872(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean724 = arg1;
		if (Static539.aBoolean563) {
			Static306.aClass353Array1[Static306.aClass353Array1.length - 1].method7812(arg0);
		} else {
			Static516.method6962(arg0, Static136.aClass3_Sub5Array2);
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)V")
	public static void method2873() {
		@Pc(8) int local8 = Static186.aByteArrayArray5.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			if (Static186.aByteArrayArray5[local17] != null) {
				@Pc(27) int local27 = -1;
				for (@Pc(29) int local29 = 0; local29 < Static681.anInt10653; local29++) {
					if (Static385.anIntArray437[local17] == Static68.anIntArray88[local29]) {
						local27 = local29;
						break;
					}
				}
				if (local27 == -1) {
					Static68.anIntArray88[Static681.anInt10653] = Static385.anIntArray437[local17];
					local27 = Static681.anInt10653++;
				}
				@Pc(80) Class3_Sub2 local80 = new Class3_Sub2(Static186.aByteArrayArray5[local17]);
				@Pc(82) int local82 = 0;
				while (Static186.aByteArrayArray5[local17].length > local80.anInt2178 && local82 < 511 && Static28.anInt1087 < 1023) {
					@Pc(105) int local105 = local82++ << 6 | local27;
					@Pc(109) int local109 = local80.method2028(-14795);
					@Pc(113) int local113 = local109 >> 14;
					@Pc(119) int local119 = local109 >> 7 & 0x3F;
					@Pc(123) int local123 = local109 & 0x3F;
					@Pc(136) int local136 = local119 + (Static385.anIntArray437[local17] >> 8) * 64 - Static291.anInt4448;
					@Pc(149) int local149 = local123 + (Static385.anIntArray437[local17] & 0xFF) * 64 - Static189.anInt3243;
					@Pc(156) Class219 local156 = Static255.aClass14_1.method619(local80.method2028(-14795));
					@Pc(163) Class3_Sub52 local163 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local105);
					if (local163 == null && (local156.aByte79 & 0x1) > 0 && Static606.anInt9196 == local113 && local136 >= 0 && local136 + local156.anInt5693 < Static497.anInt7926 && local149 >= 0 && local149 + local156.anInt5693 < Static646.anInt9979) {
						@Pc(216) Class9_Sub1_Sub1_Sub2_Sub2 local216 = new Class9_Sub1_Sub1_Sub2_Sub2();
						local216.anInt8783 = local105;
						@Pc(224) Class3_Sub52 local224 = new Class3_Sub52(local216);
						Static94.aClass313_8.method7107((long) local105, local224);
						Static169.aClass3_Sub52Array1[Static568.anInt8629++] = local224;
						Static633.anIntArray705[Static28.anInt1087++] = local105;
						local216.anInt8801 = Static716.anInt11157;
						local216.method7509(local156);
						local216.method7481(local216.aClass219_1.anInt5693);
						local216.anInt8807 = local216.aClass219_1.lb << 3;
						local216.method7495(local216.aClass219_1.aByte78 + 4 << 11 & 0x3BA2, true);
						local216.method7506(local216.method7485(), local149, local136, true, local113);
					}
				}
			}
		}
	}
}
