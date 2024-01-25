import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!sj;")
	public static Class37 aClass37_6;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	public static int anInt5721;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public static int anInt5723;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_43 = new Class216();

	@OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
	public static final int[] anIntArray417 = new int[6];

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[100];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method5086() {
		Static269.aClass2_Sub10_Sub1_3.method2056();
		@Pc(13) int local13 = Static269.aClass2_Sub10_Sub1_3.method2052(8);
		@Pc(22) int local22;
		if (Static169.anInt3463 > local13) {
			for (local22 = local13; local22 < Static169.anInt3463; local22++) {
				Static159.anIntArray272[Static322.anInt6489++] = Static98.anIntArray215[local22];
			}
		}
		if (Static169.anInt3463 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static169.anInt3463 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static98.anIntArray215[local22];
			@Pc(68) Class62_Sub1_Sub2_Sub1 local68 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local64];
			@Pc(73) int local73 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
			if (local73 == 0) {
				Static98.anIntArray215[Static169.anInt3463++] = local64;
				local68.anInt5333 = Static212.anInt4090;
			} else {
				@Pc(93) int local93 = Static269.aClass2_Sub10_Sub1_3.method2052(2);
				if (local93 == 0) {
					Static98.anIntArray215[Static169.anInt3463++] = local64;
					local68.anInt5333 = Static212.anInt4090;
					Static102.anIntArray217[Static95.anInt6378++] = local64;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local93 == 1) {
						Static98.anIntArray215[Static169.anInt3463++] = local64;
						local68.anInt5333 = Static212.anInt4090;
						local135 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
						local68.method4721(local135, 1);
						local145 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
						if (local145 == 1) {
							Static102.anIntArray217[Static95.anInt6378++] = local64;
						}
					} else if (local93 == 2) {
						Static98.anIntArray215[Static169.anInt3463++] = local64;
						local68.anInt5333 = Static212.anInt4090;
						if (Static269.aClass2_Sub10_Sub1_3.method2052(1) == 1) {
							local135 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
							local68.method4721(local135, 2);
							local145 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
							local68.method4721(local145, 2);
						} else {
							local135 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
							local68.method4721(local135, 0);
						}
						local135 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
						if (local135 == 1) {
							Static102.anIntArray217[Static95.anInt6378++] = local64;
						}
					} else if (local93 == 3) {
						Static159.anIntArray272[Static322.anInt6489++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lclient!sf;")
	public static Class180 method5089(@OriginalArg(0) int arg0) {
		@Pc(5) Class119 local5 = Static153.aClass119_96;
		@Pc(14) Class180 local14;
		synchronized (Static153.aClass119_96) {
			local14 = (Class180) Static153.aClass119_96.method3311((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static11.aClass191_10.method5459(32, arg0);
		local14 = new Class180();
		if (local30 != null) {
			local14.method5101(new Class2_Sub10(local30));
		}
		local14.method5094();
		@Pc(56) Class119 local56 = Static153.aClass119_96;
		synchronized (Static153.aClass119_96) {
			Static153.aClass119_96.method3308(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qr;B)V")
	public static void method5090(@OriginalArg(0) Class62_Sub1_Sub2_Sub2 arg0) {
		@Pc(16) Class2_Sub7 local16 = (Class2_Sub7) Static167.aClass199_17.method5751((long) arg0.anInt5328);
		if (local16 == null) {
			Static52.method1200(null, Static182.anInt3603, null, 0, arg0.anIntArray396[0], arg0, arg0.anIntArray397[0]);
		} else {
			local16.method761();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
	public static int method5091(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method5093(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local26 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local69 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(156) int local156;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local113 <= local156) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(198) int local198;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local198 = 0; local198 < arg0; local198++) {
				if (local156 >> 1 >= local198) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(239) int local239;
		for (local198 = 0; local198 < arg0; local198++) {
			for (local239 = 0; local239 < arg0; local239++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local198 << 1 <= local239) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(300) int local300;
		for (local239 = 0; local239 < arg0; local239++) {
			for (local300 = arg0 - 1; local300 >= 0; local300--) {
				if (local239 >> 1 >= local300) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(350) int local350;
		for (local300 = arg0 - 1; local300 >= 0; local300--) {
			for (local350 = arg0 - 1; local350 >= 0; local350--) {
				if (local300 << 1 <= local350) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(398) int local398;
		for (local350 = arg0 - 1; local350 >= 0; local350--) {
			for (local398 = arg0 - 1; local398 >= 0; local398--) {
				if (local350 >> 1 >= local398) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(443) int local443;
		for (local398 = arg0 - 1; local398 >= 0; local398--) {
			for (local443 = 0; local443 < arg0; local443++) {
				if (local398 << 1 <= local443) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(489) int local489;
		for (local443 = 0; local443 < arg0; local443++) {
			for (local489 = 0; local489 < arg0; local489++) {
				if (local443 >> 1 >= local489) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(538) int local538;
		for (local489 = 0; local489 < arg0; local489++) {
			for (local538 = arg0 - 1; local538 >= 0; local538--) {
				if (local538 >= local489 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(581) int local581;
		for (local538 = arg0 - 1; local538 >= 0; local538--) {
			for (local581 = 0; local581 < arg0; local581++) {
				if (local538 >> 1 <= local581) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(626) int local626;
		for (local581 = 0; local581 < arg0; local581++) {
			for (local626 = 0; local626 < arg0; local626++) {
				if (local626 <= local581 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(671) int local671;
		for (local626 = 0; local626 < arg0; local626++) {
			for (local671 = arg0 - 1; local671 >= 0; local671--) {
				if (local626 >> 1 <= local671) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(721) int local721;
		for (local671 = arg0 - 1; local671 >= 0; local671--) {
			for (local721 = arg0 - 1; local721 >= 0; local721--) {
				if (local721 <= local671 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(765) int local765;
		for (local721 = arg0 - 1; local721 >= 0; local721--) {
			for (local765 = arg0 - 1; local765 >= 0; local765--) {
				if (local721 >> 1 <= local765) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(811) int local811;
		for (local765 = arg0 - 1; local765 >= 0; local765--) {
			for (local811 = 0; local811 < arg0; local811++) {
				if (local811 <= local765 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(856) int local856;
		for (local811 = 0; local811 < arg0; local811++) {
			for (local856 = 0; local856 < arg0; local856++) {
				if (local856 >= local811 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(901) int local901;
		for (local856 = 0; local856 < arg0; local856++) {
			for (local901 = arg0 - 1; local901 >= 0; local901--) {
				if (local901 <= local856 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(946) int local946;
		for (local901 = 0; local901 < arg0; local901++) {
			for (local946 = 0; local946 < arg0; local946++) {
				if (arg0 / 2 >= local946) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(989) int local989;
		for (local946 = 0; local946 < arg0; local946++) {
			for (local989 = 0; local989 < arg0; local989++) {
				if (arg0 / 2 >= local946) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1036) int local1036;
		for (local989 = 0; local989 < arg0; local989++) {
			for (local1036 = 0; local1036 < arg0; local1036++) {
				if (local1036 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1087) int local1087;
		for (local1036 = 0; local1036 < arg0; local1036++) {
			for (local1087 = 0; local1087 < arg0; local1087++) {
				if (arg0 / 2 <= local1036) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1130) int local1130;
		for (local1087 = 0; local1087 < arg0; local1087++) {
			for (local1130 = 0; local1130 < arg0; local1130++) {
				if (local1130 <= local1087 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1178) int local1178;
		for (local1130 = arg0 - 1; local1130 >= 0; local1130--) {
			for (local1178 = 0; local1178 < arg0; local1178++) {
				if (local1178 <= local1130 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1227) int local1227;
		for (local1178 = arg0 - 1; local1178 >= 0; local1178--) {
			for (local1227 = arg0 - 1; local1227 >= 0; local1227--) {
				if (local1227 <= local1178 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1273) int local1273;
		for (local1227 = 0; local1227 < arg0; local1227++) {
			for (local1273 = arg0 - 1; local1273 >= 0; local1273--) {
				if (local1273 <= local1227 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1317) int local1317;
		for (local1273 = 0; local1273 < arg0; local1273++) {
			for (local1317 = 0; local1317 < arg0; local1317++) {
				if (local1273 - arg0 / 2 <= local1317) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1369) int local1369;
		for (local1317 = arg0 - 1; local1317 >= 0; local1317--) {
			for (local1369 = 0; local1369 < arg0; local1369++) {
				if (local1317 - arg0 / 2 <= local1369) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1421) int local1421;
		for (local1369 = arg0 - 1; local1369 >= 0; local1369--) {
			for (local1421 = arg0 - 1; local1421 >= 0; local1421--) {
				if (local1369 - arg0 / 2 <= local1421) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1421 = 0; local1421 < arg0; local1421++) {
			for (@Pc(1463) int local1463 = arg0 - 1; local1463 >= 0; local1463--) {
				if (local1463 >= local1421 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
