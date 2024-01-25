import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
	public static int anInt5372;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "[B")
	public static final byte[] aByteArray61 = new byte[520];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method4188() {
		Static126.aClass1_Sub45_1 = new Class1_Sub45(Static419.aClass151_212.method3122(Static188.anInt3028), "", Static258.anInt4103, 1008, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method4189(@OriginalArg(1) int arg0) {
		@Pc(14) byte[][][] local14 = new byte[8][4][];
		@Pc(23) byte[] local23 = new byte[arg0 * arg0];
		@Pc(25) int local25 = 0;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
			for (local31 = 0; local31 < arg0; local31++) {
				if (local27 >= local31) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[0][0] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(74) int local74;
		for (local31 = arg0 - 1; local31 >= 0; local31--) {
			for (local74 = 0; local74 < arg0; local74++) {
				if (local31 >= local74) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[0][1] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(110) int local110;
		for (local74 = 0; local74 < arg0; local74++) {
			for (local110 = 0; local110 < arg0; local110++) {
				if (local74 <= local110) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[0][2] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(157) int local157;
		for (local110 = arg0 - 1; local110 >= 0; local110--) {
			for (local157 = 0; local157 < arg0; local157++) {
				if (local157 >= local110) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[0][3] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(195) int local195;
		for (local157 = arg0 - 1; local157 >= 0; local157--) {
			for (local195 = 0; local195 < arg0; local195++) {
				if (local195 <= local157 >> 1) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[1][0] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(240) int local240;
		for (local195 = 0; local195 < arg0; local195++) {
			for (local240 = 0; local240 < arg0; local240++) {
				if (local25 >= 0 && local25 < local23.length) {
					if (local240 >= local195 << 1) {
						local23[local25] = -1;
					}
					local25++;
				} else {
					local25++;
				}
			}
		}
		local14[1][1] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(298) int local298;
		for (local240 = 0; local240 < arg0; local240++) {
			for (local298 = arg0 - 1; local298 >= 0; local298--) {
				if (local298 <= local240 >> 1) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[1][2] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(344) int local344;
		for (local298 = arg0 - 1; local298 >= 0; local298--) {
			for (local344 = arg0 - 1; local344 >= 0; local344--) {
				if (local298 << 1 <= local344) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[1][3] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(392) int local392;
		for (local344 = arg0 - 1; local344 >= 0; local344--) {
			for (local392 = arg0 - 1; local392 >= 0; local392--) {
				if (local344 >> 1 >= local392) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[2][0] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(435) int local435;
		for (local392 = arg0 - 1; local392 >= 0; local392--) {
			for (local435 = 0; local435 < arg0; local435++) {
				if (local435 >= local392 << 1) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[2][1] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(484) int local484;
		for (local435 = 0; local435 < arg0; local435++) {
			for (local484 = 0; local484 < arg0; local484++) {
				if (local435 >> 1 >= local484) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[2][2] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(533) int local533;
		for (local484 = 0; local484 < arg0; local484++) {
			for (local533 = arg0 - 1; local533 >= 0; local533--) {
				if (local484 << 1 <= local533) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[2][3] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(577) int local577;
		for (local533 = arg0 - 1; local533 >= 0; local533--) {
			for (local577 = 0; local577 < arg0; local577++) {
				if (local533 >> 1 <= local577) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[3][0] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(619) int local619;
		for (local577 = 0; local577 < arg0; local577++) {
			for (local619 = 0; local619 < arg0; local619++) {
				if (local577 << 1 >= local619) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[3][1] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(664) int local664;
		for (local619 = 0; local619 < arg0; local619++) {
			for (local664 = arg0 - 1; local664 >= 0; local664--) {
				if (local619 >> 1 <= local664) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[3][2] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(714) int local714;
		for (local664 = arg0 - 1; local664 >= 0; local664--) {
			for (local714 = arg0 - 1; local714 >= 0; local714--) {
				if (local664 << 1 >= local714) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[3][3] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(762) int local762;
		for (local714 = arg0 - 1; local714 >= 0; local714--) {
			for (local762 = arg0 - 1; local762 >= 0; local762--) {
				if (local762 >= local714 >> 1) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[4][0] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(805) int local805;
		for (local762 = arg0 - 1; local762 >= 0; local762--) {
			for (local805 = 0; local805 < arg0; local805++) {
				if (local805 <= local762 << 1) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[4][1] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(851) int local851;
		for (local805 = 0; local805 < arg0; local805++) {
			for (local851 = 0; local851 < arg0; local851++) {
				if (local805 >> 1 <= local851) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[4][2] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(904) int local904;
		for (local851 = 0; local851 < arg0; local851++) {
			for (local904 = arg0 - 1; local904 >= 0; local904--) {
				if (local851 << 1 >= local904) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[4][3] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(950) int local950;
		for (local904 = 0; local904 < arg0; local904++) {
			for (local950 = 0; local950 < arg0; local950++) {
				if (local950 <= arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[5][0] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(993) int local993;
		for (local950 = 0; local950 < arg0; local950++) {
			for (local993 = 0; local993 < arg0; local993++) {
				if (local950 <= arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[5][1] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1040) int local1040;
		for (local993 = 0; local993 < arg0; local993++) {
			for (local1040 = 0; local1040 < arg0; local1040++) {
				if (local1040 >= arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[5][2] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1083) int local1083;
		for (local1040 = 0; local1040 < arg0; local1040++) {
			for (local1083 = 0; local1083 < arg0; local1083++) {
				if (local1040 >= arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[5][3] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1130) int local1130;
		for (local1083 = 0; local1083 < arg0; local1083++) {
			for (local1130 = 0; local1130 < arg0; local1130++) {
				if (local1130 <= local1083 - arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[6][0] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(1181) int local1181;
		for (local1130 = arg0 - 1; local1130 >= 0; local1130--) {
			for (local1181 = 0; local1181 < arg0; local1181++) {
				if (local1130 - arg0 / 2 >= local1181) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[6][1] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1233) int local1233;
		for (local1181 = arg0 - 1; local1181 >= 0; local1181--) {
			for (local1233 = arg0 - 1; local1233 >= 0; local1233--) {
				if (local1181 - arg0 / 2 >= local1233) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[6][2] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(1284) int local1284;
		for (local1233 = 0; local1233 < arg0; local1233++) {
			for (local1284 = arg0 - 1; local1284 >= 0; local1284--) {
				if (local1233 - arg0 / 2 >= local1284) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[6][3] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(1332) int local1332;
		for (local1284 = 0; local1284 < arg0; local1284++) {
			for (local1332 = 0; local1332 < arg0; local1332++) {
				if (local1332 >= local1284 - arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[7][0] = local23;
		local23 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1383) int local1383;
		for (local1332 = arg0 - 1; local1332 >= 0; local1332--) {
			for (local1383 = 0; local1383 < arg0; local1383++) {
				if (local1332 - arg0 / 2 <= local1383) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[7][1] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		@Pc(1432) int local1432;
		for (local1383 = arg0 - 1; local1383 >= 0; local1383--) {
			for (local1432 = arg0 - 1; local1432 >= 0; local1432--) {
				if (local1432 >= local1383 - arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[7][2] = local23;
		local25 = 0;
		local23 = new byte[arg0 * arg0];
		for (local1432 = 0; local1432 < arg0; local1432++) {
			for (@Pc(1476) int local1476 = arg0 - 1; local1476 >= 0; local1476--) {
				if (local1476 >= local1432 - arg0 / 2) {
					local23[local25] = -1;
				}
				local25++;
			}
		}
		local14[7][3] = local23;
		return local14;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4190(@OriginalArg(1) String arg0) {
		return Static397.method4996(arg0);
	}
}
