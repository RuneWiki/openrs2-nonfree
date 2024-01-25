import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pg", name = "wc", descriptor = "Lclient!fo;")
	public static Class82 aClass82_72;

	@OriginalMember(owner = "client!pg", name = "Cb", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_126 = new Class119("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!pg", name = "uc", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_38 = new Class269(4, 3);

	@OriginalMember(owner = "client!pg", name = "vc", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_39 = new Class269(1, 5);

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public static void method4179() {
		Static383.aClass34_11.JA(((float) Static453.aClass136_Sub1_1.anInt4451 * 0.1F + 0.7F) * 1.1523438F);
		Static383.aClass34_11.B(Static343.anInt5894, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static383.aClass34_11.Q(Static429.anInt7256, -1, 256);
		Static383.aClass34_11.method5746(Static322.aClass3_2);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4181(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(116) int local116;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local73 <= local116) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(155) int local155;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local155 = 0; local155 < arg0; local155++) {
				if (local116 <= local155) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(204) int local204;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local204 = 0; local204 < arg0; local204++) {
				if (local155 >> 1 >= local204) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(249) int local249;
		for (local204 = 0; local204 < arg0; local204++) {
			for (local249 = 0; local249 < arg0; local249++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local204 << 1 <= local249) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(311) int local311;
		for (local249 = 0; local249 < arg0; local249++) {
			for (local311 = arg0 - 1; local311 >= 0; local311--) {
				if (local311 <= local249 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(360) int local360;
		for (local311 = arg0 - 1; local311 >= 0; local311--) {
			for (local360 = arg0 - 1; local360 >= 0; local360--) {
				if (local311 << 1 <= local360) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(408) int local408;
		for (local360 = arg0 - 1; local360 >= 0; local360--) {
			for (local408 = arg0 - 1; local408 >= 0; local408--) {
				if (local360 >> 1 >= local408) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(447) int local447;
		for (local408 = arg0 - 1; local408 >= 0; local408--) {
			for (local447 = 0; local447 < arg0; local447++) {
				if (local408 << 1 <= local447) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(488) int local488;
		for (local447 = 0; local447 < arg0; local447++) {
			for (local488 = 0; local488 < arg0; local488++) {
				if (local447 >> 1 >= local488) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(537) int local537;
		for (local488 = 0; local488 < arg0; local488++) {
			for (local537 = arg0 - 1; local537 >= 0; local537--) {
				if (local537 >= local488 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(584) int local584;
		for (local537 = arg0 - 1; local537 >= 0; local537--) {
			for (local584 = 0; local584 < arg0; local584++) {
				if (local537 >> 1 <= local584) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(629) int local629;
		for (local584 = 0; local584 < arg0; local584++) {
			for (local629 = 0; local629 < arg0; local629++) {
				if (local629 <= local584 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(683) int local683;
		for (local629 = 0; local629 < arg0; local629++) {
			for (local683 = arg0 - 1; local683 >= 0; local683--) {
				if (local683 >= local629 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(732) int local732;
		for (local683 = arg0 - 1; local683 >= 0; local683--) {
			for (local732 = arg0 - 1; local732 >= 0; local732--) {
				if (local683 << 1 >= local732) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(776) int local776;
		for (local732 = arg0 - 1; local732 >= 0; local732--) {
			for (local776 = arg0 - 1; local776 >= 0; local776--) {
				if (local732 >> 1 <= local776) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(822) int local822;
		for (local776 = arg0 - 1; local776 >= 0; local776--) {
			for (local822 = 0; local822 < arg0; local822++) {
				if (local822 <= local776 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(864) int local864;
		for (local822 = 0; local822 < arg0; local822++) {
			for (local864 = 0; local864 < arg0; local864++) {
				if (local864 >= local822 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(917) int local917;
		for (local864 = 0; local864 < arg0; local864++) {
			for (local917 = arg0 - 1; local917 >= 0; local917--) {
				if (local917 <= local864 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(966) int local966;
		for (local917 = 0; local917 < arg0; local917++) {
			for (local966 = 0; local966 < arg0; local966++) {
				if (arg0 / 2 >= local966) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1013) int local1013;
		for (local966 = 0; local966 < arg0; local966++) {
			for (local1013 = 0; local1013 < arg0; local1013++) {
				if (local966 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1056) int local1056;
		for (local1013 = 0; local1013 < arg0; local1013++) {
			for (local1056 = 0; local1056 < arg0; local1056++) {
				if (arg0 / 2 <= local1056) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1099) int local1099;
		for (local1056 = 0; local1056 < arg0; local1056++) {
			for (local1099 = 0; local1099 < arg0; local1099++) {
				if (local1056 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1142) int local1142;
		for (local1099 = 0; local1099 < arg0; local1099++) {
			for (local1142 = 0; local1142 < arg0; local1142++) {
				if (local1142 <= local1099 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1194) int local1194;
		for (local1142 = arg0 - 1; local1142 >= 0; local1142--) {
			for (local1194 = 0; local1194 < arg0; local1194++) {
				if (local1142 - arg0 / 2 >= local1194) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1246) int local1246;
		for (local1194 = arg0 - 1; local1194 >= 0; local1194--) {
			for (local1246 = arg0 - 1; local1246 >= 0; local1246--) {
				if (local1246 <= local1194 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1291) int local1291;
		for (local1246 = 0; local1246 < arg0; local1246++) {
			for (local1291 = arg0 - 1; local1291 >= 0; local1291--) {
				if (local1246 - arg0 / 2 >= local1291) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1343) int local1343;
		for (local1291 = 0; local1291 < arg0; local1291++) {
			for (local1343 = 0; local1343 < arg0; local1343++) {
				if (local1343 >= local1291 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1391) int local1391;
		for (local1343 = arg0 - 1; local1343 >= 0; local1343--) {
			for (local1391 = 0; local1391 < arg0; local1391++) {
				if (local1391 >= local1343 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1447) int local1447;
		for (local1391 = arg0 - 1; local1391 >= 0; local1391--) {
			for (local1447 = arg0 - 1; local1447 >= 0; local1447--) {
				if (local1391 - arg0 / 2 <= local1447) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1447 = 0; local1447 < arg0; local1447++) {
			for (@Pc(1499) int local1499 = arg0 - 1; local1499 >= 0; local1499--) {
				if (local1499 >= local1447 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)Z")
	public static boolean method4182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface8 local9 = (Interface8) Static337.method4524(arg0, arg2, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static412.method5314(local9) & true;
		}
		local9 = (Interface8) Static364.method2862(arg0, arg2, arg1, mh.class);
		if (local9 != null) {
			local11 &= Static412.method5314(local9);
		}
		local9 = (Interface8) Static231.method3312(arg0, arg2, arg1);
		if (local9 != null) {
			local11 &= Static412.method5314(local9);
		}
		return local11;
	}
}
