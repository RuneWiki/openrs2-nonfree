import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_93 = new Class159(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!mq;ILclient!vq;IBLclient!ak;)Z")
	public static boolean method1266(@OriginalArg(0) Class136 arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(5) Class4_Sub3 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray363 != null) {
			local13 = Static54.anInt4742 - (arg0.anInt4271 + arg2.anInt212 - Static54.anInt4739) * (-Static54.anInt4738 + Static54.anInt4742) / (Static54.anInt4741 - Static54.anInt4739);
			local9 = (arg0.anInt4260 + arg2.anInt209 - Static54.anInt4744) * (Static54.anInt4740 - Static54.anInt4743) / (Static54.anInt4746 - Static54.anInt4744) + Static54.anInt4743;
			local7 = (Static54.anInt4740 - Static54.anInt4743) * (arg0.anInt4265 + arg2.anInt209 - Static54.anInt4744) / (Static54.anInt4746 - Static54.anInt4744) + Static54.anInt4743;
			local11 = Static54.anInt4742 - (arg2.anInt212 + arg0.anInt4278 - Static54.anInt4739) * (-Static54.anInt4738 + Static54.anInt4742) / (Static54.anInt4741 - Static54.anInt4739);
		}
		@Pc(105) Class58 local105 = null;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		if (arg0.anInt4264 != -1) {
			if (arg2.aBoolean20 && arg0.anInt4250 != -1) {
				local105 = arg0.method3848(arg1, true);
			} else {
				local105 = arg0.method3848(arg1, false);
			}
			if (local105 != null) {
				local107 = arg2.anInt207 - (local105.method4282() + 1 >> 1);
				local109 = arg2.anInt207 + (local105.method4282() + 1 >> 1);
				if (local107 < local7) {
					local7 = local107;
				}
				if (local109 > local9) {
					local9 = local109;
				}
				local111 = arg2.anInt208 - (local105.method4286() + 1 >> 1);
				local113 = arg2.anInt208 + (local105.method4286() + 1 >> 1);
				if (local111 < local11) {
					local11 = local111;
				}
				if (local13 < local113) {
					local13 = local113;
				}
			}
		}
		@Pc(216) Class189 local216 = null;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(235) int local235 = 0;
		@Pc(286) int local286;
		@Pc(313) int local313;
		if (arg0.aString44 != null) {
			local216 = Static235.method4181(arg0.anInt4257);
			if (local216 != null) {
				local218 = Static139.aClass16_3.method328(null, Static31.aStringArray7, null, arg0.aString44);
				local220 = arg2.anInt208;
				if (local105 == null) {
					local220 -= local216.method4933() * local218 / 2;
				} else {
					local220 -= (local105.method4286() >> 1) + local218 * local216.method4930();
				}
				for (local286 = 0; local286 < local218; local286++) {
					@Pc(292) String local292 = Static31.aStringArray7[local286];
					if (local286 < local218 - 1) {
						local292 = local292.substring(0, local292.length() - 4);
					}
					local313 = local216.method4932(local292);
					if (local222 < local313) {
						local222 = local313;
					}
				}
				local224 = arg2.anInt207 - local222 / 2;
				local226 = arg2.anInt207 + local222 / 2;
				if (local7 > local224) {
					local7 = local224;
				}
				local228 = local220;
				if (local9 < local226) {
					local9 = local226;
				}
				if (local228 < local11) {
					local11 = local228;
				}
				local235 = local216.method4930() * local218 + local220;
				if (local13 < local235) {
					local13 = local235;
				}
			}
		}
		if (local9 < Static54.anInt4743 || Static54.anInt4740 < local7 || local13 < Static54.anInt4738 || Static54.anInt4742 < local11) {
			return true;
		}
		@Pc(414) int local414;
		if (arg0.anIntArray363 != null) {
			@Pc(412) int[] local412 = new int[arg0.anIntArray363.length];
			for (local414 = 0; local414 < local412.length / 2; local414++) {
				local313 = arg0.anIntArray363[local414 * 2] + arg2.anInt209;
				@Pc(438) int local438 = arg2.anInt212 + arg0.anIntArray363[local414 * 2 + 1];
				local412[local414 * 2] = (local313 - Static54.anInt4744) * (-Static54.anInt4743 + Static54.anInt4740) / (Static54.anInt4746 - Static54.anInt4744) + Static54.anInt4743;
				local412[local414 * 2 + 1] = Static54.anInt4742 - (Static54.anInt4742 - Static54.anInt4738) * (local438 + -Static54.anInt4739) / (Static54.anInt4741 - Static54.anInt4739);
			}
			Static126.method2605(arg1, local412, arg0.anInt4254);
			for (local313 = 0; local313 < local412.length / 2 - 1; local313++) {
				arg1.method2704(local412[local313 * 2], local412[(local313 + 1) * 2], arg0.anInt4276, local412[(local313 + 1) * 2 + 1], local412[local313 * 2 + 1]);
			}
			arg1.method2704(local412[local412.length - 2], local412[0], arg0.anInt4276, local412[1], local412[local412.length - 1]);
		}
		if (local105 != null) {
			if (Static33.anInt820 > 0 && (Static289.anInt5645 != -1 && Static289.anInt5645 == arg2.anInt210 || Static138.anInt2999 != -1 && Static138.anInt2999 == arg0.anInt4248)) {
				if (Static273.anInt5435 > 50) {
					local286 = (100 - Static273.anInt5435) * 2;
				} else {
					local286 = Static273.anInt5435 * 2;
				}
				local414 = local286 << 24 | 0xFFFF00;
				arg1.method2659(arg2.anInt207, local414, local105.method4279() / 2 + 7, arg2.anInt208);
				arg1.method2659(arg2.anInt207, local414, local105.method4279() / 2 + 5, arg2.anInt208);
				arg1.method2659(arg2.anInt207, local414, local105.method4279() / 2 + 3, arg2.anInt208);
				arg1.method2659(arg2.anInt207, local414, local105.method4279() / 2 + 1, arg2.anInt208);
				arg1.method2659(arg2.anInt207, local414, local105.method4279() / 2, arg2.anInt208);
			}
			local105.method4269(arg2.anInt207 - (local105.method4282() >> 1), arg2.anInt208 - (local105.method4286() >> 1));
		}
		if (arg0.aString44 != null && local216 != null) {
			Static70.method1654(arg2, local222, local220, arg0, arg1, local216, local218);
		}
		if (arg0.anInt4264 != -1 || arg0.aString44 != null) {
			@Pc(738) Class4_Sub18 local738 = new Class4_Sub18(arg2);
			local738.anInt2714 = local107;
			local738.anInt2716 = local228;
			local738.anInt2712 = local109;
			local738.anInt2711 = local226;
			local738.anInt2708 = local224;
			local738.anInt2710 = local113;
			local738.anInt2715 = local111;
			local738.anInt2706 = local235;
			Static46.aClass116_4.method3274(local738);
		}
		return false;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBI)I")
	public static int method1267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method1268() {
		@Pc(7) Class84 local7 = null;
		try {
			@Pc(16) Class185 local16 = Static1.aClass134_7.method3759();
			while (local16.anInt5682 == 0) {
				Static249.method4396(1L);
			}
			if (local16.anInt5682 == 1) {
				local7 = (Class84) local16.anObject4;
				@Pc(43) byte[] local43 = new byte[(int) local7.method2416()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local7.method2418(local43, local45, local43.length - local45);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static19.method318(new Class4_Sub11(local43));
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method2413();
			}
		} catch (@Pc(89) Exception local89) {
		}
	}
}
