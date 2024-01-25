import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!ij;")
	public static Class93 aClass93_8;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!wn;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIIII)V")
	public static void method310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg1, 10);
		local8.method850();
		local8.anInt996 = arg2;
		local8.anInt991 = arg3;
		local8.anInt994 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
	public static void method312() {
		for (@Pc(7) int local7 = 0; local7 < Static139.anInt2692; local7++) {
			@Pc(13) int local13 = Static190.anIntArray57[local7]--;
			if (Static190.anIntArray57[local7] >= -10) {
				@Pc(90) Class50 local90 = Static270.aClass50Array1[local7];
				if (local90 == null) {
					local90 = Static359.method926(Static186.aClass93_72, Static9.anIntArray41[local7], 0);
					if (local90 == null) {
						continue;
					}
					Static190.anIntArray57[local7] += local90.method924();
					Static270.aClass50Array1[local7] = local90;
				}
				if (Static190.anIntArray57[local7] < 0) {
					@Pc(226) int local226;
					if (Static127.anIntArray243[local7] == 0) {
						local226 = Static316.anIntArray443[local7] * Static226.anInt4453 >> 8;
					} else {
						@Pc(137) int local137 = (Static127.anIntArray243[local7] & 0xFF) * 128;
						@Pc(145) int local145 = Static127.anIntArray243[local7] >> 16 & 0xFF;
						@Pc(154) int local154 = local145 * 128 + 64 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631;
						if (local154 < 0) {
							local154 = -local154;
						}
						@Pc(167) int local167 = Static127.anIntArray243[local7] >> 8 & 0xFF;
						@Pc(177) int local177 = local167 * 128 + 64 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632;
						if (local177 < 0) {
							local177 = -local177;
						}
						@Pc(191) int local191 = local177 + local154 - 128;
						if (local137 < local191) {
							Static190.anIntArray57[local7] = -100;
							continue;
						}
						if (local191 < 0) {
							local191 = 0;
						}
						local226 = Static316.anIntArray443[local7] * (local137 - local191) * Static263.anInt5208 / local137 >> 8;
					}
					if (local226 > 0) {
						@Pc(243) Class5_Sub10_Sub1 local243 = local90.method925().method896(Static146.aClass101_1);
						@Pc(248) Class5_Sub16_Sub3 local248 = Static365.method4582(local243, local226);
						local248.method4592(Static350.anIntArray636[local7] - 1);
						Static114.aClass5_Sub16_Sub4_1.method5797(local248);
					}
					Static190.anIntArray57[local7] = -100;
				}
			} else {
				Static139.anInt2692--;
				for (@Pc(29) int local29 = local7; local29 < Static139.anInt2692; local29++) {
					Static9.anIntArray41[local29] = Static9.anIntArray41[local29 + 1];
					Static270.aClass50Array1[local29] = Static270.aClass50Array1[local29 + 1];
					Static350.anIntArray636[local29] = Static350.anIntArray636[local29 + 1];
					Static190.anIntArray57[local29] = Static190.anIntArray57[local29 + 1];
					Static127.anIntArray243[local29] = Static127.anIntArray243[local29 + 1];
					Static316.anIntArray443[local29] = Static316.anIntArray443[local29 + 1];
				}
				local7--;
			}
		}
		if (Static111.aBoolean156 && !Static317.method5541()) {
			if (Static349.anInt6699 != 0 && Static236.anInt4219 != -1) {
				Static354.method6026(Static236.anInt4219, Static319.aClass93_121, Static349.anInt6699);
			}
			Static111.aBoolean156 = false;
		} else if (Static349.anInt6699 != 0 && Static236.anInt4219 != -1 && !Static317.method5541()) {
			Static125.aClass5_Sub12_Sub2_3.method5125(31);
			Static125.aClass5_Sub12_Sub2_3.method5070(Static236.anInt4219);
			Static236.anInt4219 = -1;
		}
	}
}
