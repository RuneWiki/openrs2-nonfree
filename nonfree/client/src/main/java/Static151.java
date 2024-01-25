import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_35 = new Class243(81, 8);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIII)V")
	public static void method2613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg2 << 1) - 3);
		@Pc(86) int local86 = local54;
		@Pc(92) int local92 = local50 * (arg2 - 1);
		@Pc(110) int local110;
		@Pc(121) int local121;
		if (Static328.anInt6154 <= arg4 && Static394.anInt7462 >= arg4) {
			local110 = Static84.method1650(Static7.anInt8119, arg3 + arg0, Static34.anInt603);
			local121 = Static84.method1650(Static7.anInt8119, arg3 - arg0, Static34.anInt603);
			Static403.method6377(arg1, Static130.anIntArrayArray89[arg4], local110, local121);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local62;
					local46 += local86;
					local62 += local54;
					local86 += local54;
					local7++;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local86;
				local62 += local54;
				local86 += local54;
				local7++;
			}
			local38 += -local92;
			local46 += -local70;
			local9--;
			local92 -= local50;
			local70 -= local50;
			local110 = arg4 - local9;
			local121 = arg4 + local9;
			if (local121 >= Static328.anInt6154 && local110 <= Static394.anInt7462) {
				@Pc(220) int local220 = Static84.method1650(Static7.anInt8119, arg3 + local7, Static34.anInt603);
				@Pc(229) int local229 = Static84.method1650(Static7.anInt8119, arg3 - local7, Static34.anInt603);
				if (Static328.anInt6154 <= local110) {
					Static403.method6377(arg1, Static130.anIntArrayArray89[local110], local220, local229);
				}
				if (local121 <= Static394.anInt7462) {
					Static403.method6377(arg1, Static130.anIntArrayArray89[local121], local220, local229);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!k;III[Z)Z")
	public static boolean method2619(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static532.aClass75Array3 != Static427.aClass75Array2) {
			@Pc(11) int local11 = Static164.aClass75Array1[arg1].aa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class75 local18 = Static164.aClass75Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.aa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method6703(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.ya(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z")
	public static boolean method2621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
