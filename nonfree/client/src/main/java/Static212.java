import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public static int anInt4627;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!iq;")
	public static Class104 aClass104_118;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public static int anInt4636;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static final int anInt4618 = 0;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public static int anInt4619 = 0;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_155 = new Class221(92, 6);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	public static void method3981(@OriginalArg(0) boolean arg0) {
		if (Static222.aBoolean607 != arg0) {
			Static222.aBoolean607 = arg0;
			Static124.method2400();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBIII)V")
	public static void method3982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static41.method4708(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -arg5;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static364.anIntArrayArray57[arg3];
		@Pc(45) int local45 = arg4 - local15;
		@Pc(49) int local49 = local15 + arg4;
		Static115.method2278(local40, local45, arg0, arg4 - arg5);
		Static115.method2278(local40, local49, arg2, local45);
		Static115.method2278(local40, arg4 + arg5, arg0, local49);
		while (local10 < local24) {
			local36 += 2;
			local34 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static266.anIntArray431[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(126) int[] local126;
			@Pc(133) int[] local133;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(151) int local151;
			@Pc(155) int local155;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local24 < local15) {
					local126 = Static364.anIntArrayArray57[local24 + arg3];
					local133 = Static364.anIntArrayArray57[arg3 - local24];
					local137 = Static266.anIntArray431[local24];
					local142 = arg4 + local10;
					local147 = arg4 - local10;
					local151 = local137 + arg4;
					local155 = arg4 - local137;
					Static115.method2278(local126, local155, arg0, local147);
					Static115.method2278(local126, local151, arg2, local155);
					Static115.method2278(local126, local142, arg0, local151);
					Static115.method2278(local133, local155, arg0, local147);
					Static115.method2278(local133, local151, arg2, local155);
					Static115.method2278(local133, local142, arg0, local151);
				} else {
					local126 = Static364.anIntArrayArray57[arg3 + local24];
					local133 = Static364.anIntArrayArray57[arg3 - local24];
					local137 = local10 + arg4;
					local142 = arg4 - local10;
					Static115.method2278(local126, local137, arg0, local142);
					Static115.method2278(local133, local137, arg0, local142);
				}
			}
			local126 = Static364.anIntArrayArray57[arg3 + local10];
			local133 = Static364.anIntArrayArray57[arg3 - local10];
			local137 = local24 + arg4;
			local142 = arg4 - local24;
			if (local15 > local10) {
				local147 = local10 > local29 ? Static266.anIntArray431[local10] : local29;
				local151 = arg4 + local147;
				local155 = arg4 - local147;
				Static115.method2278(local126, local155, arg0, local142);
				Static115.method2278(local126, local151, arg2, local155);
				Static115.method2278(local126, local137, arg0, local151);
				Static115.method2278(local133, local155, arg0, local142);
				Static115.method2278(local133, local151, arg2, local155);
				Static115.method2278(local133, local137, arg0, local151);
			} else {
				Static115.method2278(local126, local137, arg0, local142);
				Static115.method2278(local133, local137, arg0, local142);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(ZI)[[[B")
	public static byte[][][] method3985(@OriginalArg(1) int arg0) {
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
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(114) int local114;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local114 = 0; local114 < arg0; local114++) {
				if (local69 <= local114) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(161) int local161;
		for (local114 = arg0 - 1; local114 >= 0; local114--) {
			for (local161 = 0; local161 < arg0; local161++) {
				if (local114 <= local161) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(207) int local207;
		for (local161 = arg0 - 1; local161 >= 0; local161--) {
			for (local207 = 0; local207 < arg0; local207++) {
				if (local207 <= local161 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(253) int local253;
		for (local207 = 0; local207 < arg0; local207++) {
			for (local253 = 0; local253 < arg0; local253++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local253 >= local207 << 1) {
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
		@Pc(318) int local318;
		for (local253 = 0; local253 < arg0; local253++) {
			for (local318 = arg0 - 1; local318 >= 0; local318--) {
				if (local318 <= local253 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(371) int local371;
		for (local318 = arg0 - 1; local318 >= 0; local318--) {
			for (local371 = arg0 - 1; local371 >= 0; local371--) {
				if (local371 >= local318 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(415) int local415;
		for (local371 = arg0 - 1; local371 >= 0; local371--) {
			for (local415 = arg0 - 1; local415 >= 0; local415--) {
				if (local415 <= local371 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(464) int local464;
		for (local415 = arg0 - 1; local415 >= 0; local415--) {
			for (local464 = 0; local464 < arg0; local464++) {
				if (local415 << 1 <= local464) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(509) int local509;
		for (local464 = 0; local464 < arg0; local464++) {
			for (local509 = 0; local509 < arg0; local509++) {
				if (local509 <= local464 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(554) int local554;
		for (local509 = 0; local509 < arg0; local509++) {
			for (local554 = arg0 - 1; local554 >= 0; local554--) {
				if (local509 << 1 <= local554) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(598) int local598;
		for (local554 = arg0 - 1; local554 >= 0; local554--) {
			for (local598 = 0; local598 < arg0; local598++) {
				if (local554 >> 1 <= local598) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(639) int local639;
		for (local598 = 0; local598 < arg0; local598++) {
			for (local639 = 0; local639 < arg0; local639++) {
				if (local598 << 1 >= local639) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(684) int local684;
		for (local639 = 0; local639 < arg0; local639++) {
			for (local684 = arg0 - 1; local684 >= 0; local684--) {
				if (local684 >= local639 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(734) int local734;
		for (local684 = arg0 - 1; local684 >= 0; local684--) {
			for (local734 = arg0 - 1; local734 >= 0; local734--) {
				if (local684 << 1 >= local734) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(778) int local778;
		for (local734 = arg0 - 1; local734 >= 0; local734--) {
			for (local778 = arg0 - 1; local778 >= 0; local778--) {
				if (local778 >= local734 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(824) int local824;
		for (local778 = arg0 - 1; local778 >= 0; local778--) {
			for (local824 = 0; local824 < arg0; local824++) {
				if (local778 << 1 >= local824) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(865) int local865;
		for (local824 = 0; local824 < arg0; local824++) {
			for (local865 = 0; local865 < arg0; local865++) {
				if (local824 >> 1 <= local865) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(918) int local918;
		for (local865 = 0; local865 < arg0; local865++) {
			for (local918 = arg0 - 1; local918 >= 0; local918--) {
				if (local918 <= local865 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(963) int local963;
		for (local918 = 0; local918 < arg0; local918++) {
			for (local963 = 0; local963 < arg0; local963++) {
				if (local963 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1014) int local1014;
		for (local963 = 0; local963 < arg0; local963++) {
			for (local1014 = 0; local1014 < arg0; local1014++) {
				if (local963 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1061) int local1061;
		for (local1014 = 0; local1014 < arg0; local1014++) {
			for (local1061 = 0; local1061 < arg0; local1061++) {
				if (local1061 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1108) int local1108;
		for (local1061 = 0; local1061 < arg0; local1061++) {
			for (local1108 = 0; local1108 < arg0; local1108++) {
				if (arg0 / 2 <= local1061) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1155) int local1155;
		for (local1108 = 0; local1108 < arg0; local1108++) {
			for (local1155 = 0; local1155 < arg0; local1155++) {
				if (local1155 <= local1108 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1202) int local1202;
		for (local1155 = arg0 - 1; local1155 >= 0; local1155--) {
			for (local1202 = 0; local1202 < arg0; local1202++) {
				if (local1155 - arg0 / 2 >= local1202) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1250) int local1250;
		for (local1202 = arg0 - 1; local1202 >= 0; local1202--) {
			for (local1250 = arg0 - 1; local1250 >= 0; local1250--) {
				if (local1202 - arg0 / 2 >= local1250) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1295) int local1295;
		for (local1250 = 0; local1250 < arg0; local1250++) {
			for (local1295 = arg0 - 1; local1295 >= 0; local1295--) {
				if (local1295 <= local1250 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1343) int local1343;
		for (local1295 = 0; local1295 < arg0; local1295++) {
			for (local1343 = 0; local1343 < arg0; local1343++) {
				if (local1343 >= local1295 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1386) int local1386;
		for (local1343 = arg0 - 1; local1343 >= 0; local1343--) {
			for (local1386 = 0; local1386 < arg0; local1386++) {
				if (local1343 - arg0 / 2 <= local1386) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1442) int local1442;
		for (local1386 = arg0 - 1; local1386 >= 0; local1386--) {
			for (local1442 = arg0 - 1; local1442 >= 0; local1442--) {
				if (local1386 - arg0 / 2 <= local1442) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1442 = 0; local1442 < arg0; local1442++) {
			for (@Pc(1488) int local1488 = arg0 - 1; local1488 >= 0; local1488--) {
				if (local1488 >= local1442 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method3986(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static338.anInt6592 = arg2;
		Static311.aString65 = arg0;
		Static56.aString6 = arg1;
		if (Static56.aString6.equals("") || Static311.aString65.equals("")) {
			Static284.anInt5721 = 3;
		} else if (Static122.anInt2591 == -1) {
			Static155.anInt3667 = 0;
			Static284.anInt5721 = -3;
			Static210.anInt4603 = 1;
			Static121.anInt2558 = 0;
			@Pc(40) Class2_Sub12 local40 = new Class2_Sub12(128);
			local40.method3147(10);
			local40.method3162((int) (Math.random() * 9.9999999E7D));
			local40.method3130(Static223.method4182(Static56.aString6));
			local40.method3162((int) (Math.random() * 9.9999999E7D));
			local40.method3156(Static311.aString65);
			local40.method3162((int) (Math.random() * 9.9999999E7D));
			local40.method3139(Static88.aBigInteger3, Static261.aBigInteger4);
			Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
			Static197.aClass2_Sub12_Sub2_2.method3147(Static217.aClass69_10.anInt1946);
			Static197.aClass2_Sub12_Sub2_2.method3147(local40.anInt3606 + 2);
			Static197.aClass2_Sub12_Sub2_2.method3158(570);
			Static197.aClass2_Sub12_Sub2_2.method3106(local40.aByteArray30, local40.anInt3606);
		} else {
			Static364.method5838();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	public static void method3987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > arg0) {
			Static115.method2278(Static364.anIntArrayArray57[arg3], arg2, arg1, arg0);
		} else {
			Static115.method2278(Static364.anIntArrayArray57[arg3], arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(ZI)V")
	public static void method3988(@OriginalArg(1) int arg0) {
		Static213.method3997();
		Static263.method4650();
		Static59.method1244(true, arg0);
		Static288.method4853(Static283.aClass104_148, Static338.aClass104_184, Static51.aClass37_1);
		Static31.method427(Static51.aClass37_1, Static338.aClass104_184);
		Static328.method5596(Static270.aClass46Array42);
		Static215.method4077();
		Static35.method5765();
		if (Static176.anInt3971 == 10) {
			Static315.method5228(false);
		} else if (Static176.anInt3971 == 30) {
			Static224.method5495(25);
		} else if (Static176.anInt3971 == 5) {
			Static269.method5572(Static338.aClass104_184, Static51.aClass37_1);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)I")
	public static int method3990(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(162) int local162 = (int) (local60 * 256.0D);
		@Pc(167) int local167 = (int) (local62 * 256.0D);
		@Pc(172) int local172 = (int) (local68 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local172 > 243) {
			local167 >>= 0x4;
		} else if (local172 > 217) {
			local167 >>= 0x3;
		} else if (local172 > 192) {
			local167 >>= 0x2;
		} else if (local172 > 179) {
			local167 >>= 0x1;
		}
		return (local172 >> 1) + (local167 >> 5 << 7) + ((local162 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)I")
	public static int method3991(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
