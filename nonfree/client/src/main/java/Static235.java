import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
	public static int anInt4621;

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
	public static int anInt4623;

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array14;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString173 = "Please remove ";

	@OriginalMember(owner = "client!oo", name = "Q", descriptor = "Lclient!bn;")
	public static final Class25 aClass25_23 = new Class25(512);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)V")
	public static void method4145(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static113.aByteArrayArray6;
			local11 = 1;
		} else {
			local9 = Static196.aByteArrayArray14;
			local11 = 4;
		}
		for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
			Static151.method3006();
			for (@Pc(25) int local25 = 0; local25 < Static195.anInt3965 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static298.anInt5716 >> 3; local29++) {
					@Pc(39) int local39 = Static221.anIntArrayArrayArray11[local19][local25][local29];
					if (local39 != -1) {
						@Pc(48) int local48 = local39 >> 24 & 0x3;
						if (!arg0 || local48 == 0) {
							@Pc(61) int local61 = local39 >> 1 & 0x3;
							@Pc(67) int local67 = local39 >> 14 & 0x3FF;
							@Pc(73) int local73 = local39 >> 3 & 0x7FF;
							@Pc(83) int local83 = local73 / 8 + (local67 / 8 << 8);
							for (@Pc(85) int local85 = 0; local85 < Static8.anIntArray9.length; local85++) {
								if (Static8.anIntArray9[local85] == local83 && local9[local85] != null) {
									Static239.method5612(local19, Static75.aClass65Array1, local29 * 8, Static218.aClass46_5, local61, arg0, local25 * 8, (local73 & 0x7) * 8, (local67 & 0x7) * 8, local9[local85], local48);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V")
	public static void method4146() {
		if (Static274.aFloat100 < 1024.0F) {
			Static274.aFloat100 = 1024.0F;
		}
		if (Static274.aFloat100 > 3072.0F) {
			Static274.aFloat100 = 3072.0F;
		}
		while (Static94.aFloat42 >= 16384.0F) {
			Static94.aFloat42 -= 16384.0F;
		}
		while (Static94.aFloat42 < 0.0F) {
			Static94.aFloat42 += 16384.0F;
		}
		@Pc(41) int local41 = Static17.anInt349 >> 7;
		@Pc(45) int local45 = Static340.anInt6526 >> 7;
		@Pc(51) int local51 = Static279.method4730(Static219.anInt4400, Static17.anInt349, Static340.anInt6526);
		@Pc(53) int local53 = 0;
		@Pc(71) int local71;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local71 = local41 - 4; local71 <= local41 + 4; local71++) {
				for (@Pc(77) int local77 = local45 - 4; local77 <= local45 + 4; local77++) {
					@Pc(81) int local81 = Static219.anInt4400;
					if (local81 < 3 && Static6.method132(local77, local71)) {
						local81++;
					}
					@Pc(92) int local92 = 0;
					if (Static260.aByteArrayArrayArray10 != null && Static260.aByteArrayArrayArray10[local81] != null) {
						local92 = (Static260.aByteArrayArrayArray10[local81][local71][local77] & 0xFF) * 8;
					}
					@Pc(123) int local123 = local92 + local51 - Static158.aClass114Array2[local81].method3610(local71, local77);
					if (local53 < local123) {
						local53 = local123;
					}
				}
			}
		}
		local71 = local53 * 1536;
		if (local71 > 786432) {
			local71 = 786432;
		}
		if (local71 < 262144) {
			local71 = 262144;
		}
		if (local71 > Static313.anInt6043) {
			Static313.anInt6043 += (local71 - Static313.anInt6043) / 24;
		} else if (Static313.anInt6043 > local71) {
			Static313.anInt6043 += (local71 - Static313.anInt6043) / 80;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILclient!mo;)Lclient!gh;")
	public static Class76 method4148(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(8) byte[] local8 = arg1.method3750(arg0);
		return local8 == null ? null : new Class76(local8);
	}
}
