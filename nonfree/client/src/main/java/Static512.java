import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "Lclient!jia;")
	public static Class172 aClass172_11;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!wk;)I")
	public static int method7632(@OriginalArg(1) Class374 arg0) {
		if (Static314.aClass374_2 == arg0) {
			return 7681;
		} else if (Static514.aClass374_5 == arg0) {
			return 8448;
		} else if (Static275.aClass374_1 == arg0) {
			return 34165;
		} else if (Static377.aClass374_3 == arg0) {
			return 260;
		} else if (Static480.aClass374_4 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!sl;)Ljava/lang/String;")
	public static String method7641(@OriginalArg(1) Class3_Sub3 arg0) {
		return Static301.method4801(arg0);
	}

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "(I)V")
	public static void method7642() {
		@Pc(15) int local15 = Static349.aByteArrayArray19.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (Static349.aByteArrayArray19[local17] != null) {
				@Pc(25) int local25 = -1;
				for (@Pc(27) int local27 = 0; local27 < Static457.anInt8064; local27++) {
					if (Static636.anIntArray661[local27] == Static351.anIntArray405[local17]) {
						local25 = local27;
						break;
					}
				}
				if (local25 == -1) {
					Static636.anIntArray661[Static457.anInt8064] = Static351.anIntArray405[local17];
					local25 = Static457.anInt8064++;
				}
				@Pc(71) Class3_Sub3 local71 = new Class3_Sub3(Static349.aByteArrayArray19[local17]);
				@Pc(73) int local73 = 0;
				while (Static349.aByteArrayArray19[local17].length > local71.anInt4736 && local73 < 511 && Static94.anInt2209 < 1023) {
					@Pc(90) int local90 = local25 | local73++ << 6;
					@Pc(94) int local94 = local71.method4221();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(120) int local120 = local104 + (Static351.anIntArray405[local17] >> 8) * 64 - Static299.anInt5307;
					@Pc(134) int local134 = (Static351.anIntArray405[local17] & 0xFF) * 64 + local108 - Static171.anInt3340;
					@Pc(145) Class109 local145 = Static547.aClass177_2.method4471(local71.method4221());
					@Pc(152) Class3_Sub28 local152 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local90);
					if (local152 == null && (local145.aByte35 & 0x1) > 0 && Static35.anInt1167 == local98 && local120 >= 0 && Static634.anInt10129 > local145.anInt3032 + local120 && local134 >= 0 && local134 + local145.anInt3032 < Static638.anInt10172) {
						@Pc(193) Class4_Sub1_Sub2_Sub1_Sub1 local193 = new Class4_Sub1_Sub2_Sub1_Sub1();
						local193.anInt5759 = local90;
						@Pc(201) Class3_Sub28 local201 = new Class3_Sub28(local193);
						Static551.aClass280_43.method7109(local201, (long) local90);
						Static28.aClass3_Sub28Array1[Static294.anInt5193++] = local201;
						Static520.anIntArray594[Static94.anInt2209++] = local90;
						local193.anInt5721 = Static101.anInt2262;
						local193.method3334(local145);
						local193.method5072(local193.aClass109_1.anInt3032);
						local193.anInt5739 = local193.aClass109_1.anInt3036 << 3;
						local193.method5067((local193.aClass109_1.aByte39 + 4 & 0xD7000007) << 11, true);
						local193.method3336(local134, local98, local120, local193.method5059(), true);
					}
				}
			}
		}
	}
}
