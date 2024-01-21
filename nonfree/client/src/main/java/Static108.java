import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!td;")
	public static Class54 aClass54_35;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_52;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public static int anInt2777;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array13;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1346 = Static87.method1648("Attack");

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1345 = aClass27_1346;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1347 = Static87.method1648("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public static int anInt2774 = -1;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1348 = Static87.method1648("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
	public static int[] anIntArray400 = new int[2000];

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1349 = Static87.method1648(" x ");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public static int anInt2778 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lclient!jc;")
	public static Class3_Sub3_Sub4 method1902(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub4 local10 = (Class3_Sub3_Sub4) Static56.aClass21_18.method658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static65.aClass54_22.method1615(6, arg0);
		local10 = new Class3_Sub3_Sub4();
		local10.anInt1332 = arg0;
		if (local20 != null) {
			local10.method981(new Class3_Sub11(local20));
		}
		local10.method969();
		if (local10.aBoolean65) {
			local10.aBoolean64 = false;
			local10.aBoolean68 = false;
		}
		Static56.aClass21_18.method660(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method1903() {
		aClass54_Sub1_52 = null;
		aClass27_1346 = null;
		aClass27_1347 = null;
		aClass27_1349 = null;
		aClass27_1345 = null;
		aClass3_Sub3_Sub2_Sub2Array13 = null;
		anIntArray400 = null;
		aClass54_35 = null;
		aClass27_1348 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
	public static void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static76.aClass18_1.method505(arg3, arg0, arg4);
		@Pc(31) int local31;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(43) int local43;
		@Pc(65) int local65;
		@Pc(71) int local71;
		if (local15 != 0) {
			local31 = Static76.aClass18_1.method535(arg3, arg0, arg4, local15);
			local37 = local31 >> 6 & 0x3;
			local41 = local31 & 0x1F;
			local43 = arg1;
			@Pc(46) int[] local46 = Static3.aClass3_Sub3_Sub2_Sub2_1.anIntArray172;
			if (local15 > 0) {
				local43 = arg2;
			}
			local65 = arg0 * 4 + (-arg4 + 103) * 4 * 512 + 24624;
			local71 = local15 >> 14 & 0x7FFF;
			@Pc(75) Class3_Sub3_Sub4 local75 = method1902(local71);
			if (local75.anInt1314 == -1) {
				if (local41 == 0 || local41 == 2) {
					if (local37 == 0) {
						local46[local65] = local43;
						local46[local65 + 512] = local43;
						local46[local65 + 1024] = local43;
						local46[local65 + 1536] = local43;
					} else if (local37 == 1) {
						local46[local65] = local43;
						local46[local65 + 1] = local43;
						local46[local65 + 2] = local43;
						local46[local65 + 3] = local43;
					} else if (local37 == 2) {
						local46[local65 + 3] = local43;
						local46[local65 + 515] = local43;
						local46[local65 + 1024 + 3] = local43;
						local46[local65 + 1536 + 3] = local43;
					} else if (local37 == 3) {
						local46[local65 + 1536] = local43;
						local46[local65 + 1536 + 1] = local43;
						local46[local65 + 1536 + 2] = local43;
						local46[local65 + 1536 + 3] = local43;
					}
				}
				if (local41 == 3) {
					if (local37 == 0) {
						local46[local65] = local43;
					} else if (local37 == 1) {
						local46[local65 + 3] = local43;
					} else if (local37 == 2) {
						local46[local65 + 1536 + 3] = local43;
					} else if (local37 == 3) {
						local46[local65 + 1536] = local43;
					}
				}
				if (local41 == 2) {
					if (local37 == 3) {
						local46[local65] = local43;
						local46[local65 + 512] = local43;
						local46[local65 + 1024] = local43;
						local46[local65 + 1536] = local43;
					} else if (local37 == 0) {
						local46[local65] = local43;
						local46[local65 + 1] = local43;
						local46[local65 + 2] = local43;
						local46[local65 + 3] = local43;
					} else if (local37 == 1) {
						local46[local65 + 3] = local43;
						local46[local65 + 512 + 3] = local43;
						local46[local65 + 3 + 1024] = local43;
						local46[local65 + 3 + 1536] = local43;
					} else if (local37 == 2) {
						local46[local65 + 1536] = local43;
						local46[local65 + 1537] = local43;
						local46[local65 + 2 + 1536] = local43;
						local46[local65 + 1536 + 3] = local43;
					}
				}
			} else {
				@Pc(84) Class3_Sub3_Sub2_Sub4 local84 = Static59.aClass3_Sub3_Sub2_Sub4Array4[local75.anInt1314];
				if (local84 != null) {
					@Pc(97) int local97 = (local75.anInt1334 * 4 - local84.anInt1904) / 2;
					@Pc(108) int local108 = (local75.anInt1309 * 4 - local84.anInt1902) / 2;
					local84.method1332(local97 + arg0 * 4 + 48, local108 + 48 + (-arg4 + 104 - local75.anInt1309) * 4);
				}
			}
		}
		local15 = Static76.aClass18_1.method518(arg3, arg0, arg4);
		if (local15 != 0) {
			local31 = Static76.aClass18_1.method535(arg3, arg0, arg4, local15);
			local37 = local31 >> 6 & 0x3;
			local41 = local31 & 0x1F;
			local43 = local15 >> 14 & 0x7FFF;
			@Pc(482) Class3_Sub3_Sub4 local482 = method1902(local43);
			@Pc(503) int local503;
			if (local482.anInt1314 != -1) {
				@Pc(491) Class3_Sub3_Sub2_Sub4 local491 = Static59.aClass3_Sub3_Sub2_Sub4Array4[local482.anInt1314];
				if (local491 != null) {
					local503 = (local482.anInt1309 * 4 - local491.anInt1902) / 2;
					local71 = (local482.anInt1334 * 4 - local491.anInt1904) / 2;
					local491.method1332(arg0 * 4 + local71 + 48, (104 - arg4 + -local482.anInt1309) * 4 + 48 + local503);
				}
			} else if (local41 == 9) {
				local65 = 15658734;
				if (local15 > 0) {
					local65 = 15597568;
				}
				@Pc(556) int[] local556 = Static3.aClass3_Sub3_Sub2_Sub2_1.anIntArray172;
				local503 = (103 - arg4) * 4 * 512 + arg0 * 4 + 24624;
				if (local37 == 0 || local37 == 2) {
					local556[local503 + 1536] = local65;
					local556[local503 + 1024 + 1] = local65;
					local556[local503 + 2 + 512] = local65;
					local556[local503 + 3] = local65;
				} else {
					local556[local503] = local65;
					local556[local503 + 512 + 1] = local65;
					local556[local503 + 1026] = local65;
					local556[local503 + 1539] = local65;
				}
			}
		}
		local15 = Static76.aClass18_1.method531(arg3, arg0, arg4);
		if (local15 == 0) {
			return;
		}
		local31 = local15 >> 14 & 0x7FFF;
		@Pc(653) Class3_Sub3_Sub4 local653 = method1902(local31);
		if (local653.anInt1314 == -1) {
			return;
		}
		@Pc(662) Class3_Sub3_Sub2_Sub4 local662 = Static59.aClass3_Sub3_Sub2_Sub4Array4[local653.anInt1314];
		if (local662 != null) {
			local43 = (local653.anInt1334 * 4 - local662.anInt1904) / 2;
			@Pc(685) int local685 = (local653.anInt1309 * 4 - local662.anInt1902) / 2;
			local662.method1332(local43 + arg0 * 4 + 48, (-local653.anInt1309 + -arg4 + 104) * 4 + 48 + local685);
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 method1905() {
		@Pc(7) Class3_Sub3_Sub2_Sub4 local7 = new Class3_Sub3_Sub2_Sub4();
		local7.anInt1901 = Static66.anInt1710;
		local7.anInt1903 = Static28.anInt748;
		local7.anInt1905 = Static54.anIntArray238[0];
		local7.anInt1900 = Static72.anIntArray316[0];
		local7.anInt1904 = Static36.anIntArray160[0];
		local7.anInt1902 = Static54.anIntArray239[0];
		local7.anIntArray315 = Static98.anIntArray378;
		local7.aByteArray15 = Static72.aByteArrayArray10[0];
		Static96.method1232();
		return local7;
	}
}
