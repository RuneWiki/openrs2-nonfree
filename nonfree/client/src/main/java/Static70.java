import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "Lclient!ca;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "[Lclient!rc;")
	public static Class2_Sub2_Sub16[] aClass2_Sub2_Sub16Array8;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
	public static int anInt1858;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_572 = Static184.method2923("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "Lclient!i;")
	public static Class41 aClass41_573 = Static184.method2923("details)3dat");

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "Lclient!i;")
	private static Class41 aClass41_575 = Static184.method2923("Could not complete login)3");

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!i;")
	public static Class41 aClass41_574 = aClass41_575;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "[Lclient!mj;")
	public static Class64[] aClass64Array1 = new Class64[50];

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "[I")
	public static int[] anIntArray173 = new int[100];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZILclient!mf;)V")
	public static void method1286(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1) {
		if (Static189.aClass63_4 != null) {
			try {
				Static189.aClass63_4.method2043();
			} catch (@Pc(8) Exception local8) {
			}
			Static189.aClass63_4 = null;
		}
		Static189.aClass63_4 = arg1;
		Static132.method2100(arg0);
		Static134.aClass2_Sub3_5 = null;
		Static26.anInt664 = 0;
		Static48.aClass2_Sub2_Sub7_1 = null;
		Static68.aClass2_Sub3_3.anInt239 = 0;
		while (true) {
			@Pc(33) Class2_Sub2_Sub7 local33 = (Class2_Sub2_Sub7) Static136.aClass70_11.method2203();
			if (local33 == null) {
				while (true) {
					local33 = (Class2_Sub2_Sub7) Static94.aClass70_6.method2203();
					if (local33 == null) {
						if (Static17.aByte1 != 0) {
							try {
								@Pc(85) Class2_Sub3 local85 = new Class2_Sub3(4);
								local85.method208(4);
								local85.method208(Static17.aByte1);
								local85.method167(0);
								Static189.aClass63_4.method2037(4, local85.aByteArray4);
							} catch (@Pc(106) IOException local106) {
								try {
									Static189.aClass63_4.method2043();
								} catch (@Pc(111) Exception local111) {
								}
								Static189.aClass63_4 = null;
								Static67.anInt1762++;
							}
						}
						Static135.anInt3153 = 0;
						Static71.aLong52 = Static182.method2903();
						return;
					}
					Static123.aClass89_2.method2850(local33);
					Static181.aClass70_16.method2208(local33.aLong150, local33);
					Static195.anInt4422++;
					Static205.anInt4573--;
				}
			}
			Static214.aClass70_18.method2208(local33.aLong150, local33);
			Static179.anInt4160--;
			Static184.anInt4236++;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!q;)I")
	public static int method1287(@OriginalArg(1) Class80 arg0) {
		@Pc(14) Class2_Sub23 local14 = (Class2_Sub23) Static28.aClass70_1.method2205(((long) arg0.anInt3661 << 32) + ((long) arg0.anInt3649));
		return local14 == null ? arg0.anInt3691 : local14.anInt3983;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILclient!q;)V")
	public static void method1289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class80 arg2) {
		if (Static160.aClass80_13 != null || Static94.aBoolean123 || (arg2 == null || Static199.method3100(arg2) == null)) {
			return;
		}
		Static160.aClass80_13 = arg2;
		Static45.aClass80_4 = Static199.method3100(arg2);
		Static201.anInt4512 = 0;
		Static133.anInt3047 = arg0;
		Static179.aBoolean258 = false;
		Static183.anInt1328 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILclient!q;)Z")
	public static boolean method1290(@OriginalArg(1) Class80 arg0) {
		if (arg0.anIntArray393 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray393.length; local12++) {
			@Pc(24) int local24 = Static96.method1672(local12, arg0);
			@Pc(29) int local29 = arg0.anIntArray391[local12];
			if (arg0.anIntArray393[local12] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray393[local12] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray393[local12] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IBI)I")
	public static int method1291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local15 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local15;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V")
	public static void method1292(@OriginalArg(1) int arg0) {
		Static29.anInt702 += arg0 * 128;
		@Pc(27) int local27;
		if (Static29.anInt702 > Static196.anIntArray461.length) {
			Static29.anInt702 -= Static196.anIntArray461.length;
			local27 = (int) (Math.random() * 12.0D);
			Static45.method931(Static204.aClass60_Sub1Array1[local27]);
		}
		local27 = 0;
		@Pc(38) int local38 = arg0 * 128;
		@Pc(44) int local44 = (256 - arg0) * 128;
		@Pc(70) int local70;
		for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
			local70 = Static168.anIntArray407[local38 + local27] - arg0 * Static196.anIntArray461[Static196.anIntArray461.length - 1 & Static29.anInt702 + local27] / 6;
			if (local70 < 0) {
				local70 = 0;
			}
			Static168.anIntArray407[local27++] = local70;
		}
		@Pc(93) int local93;
		@Pc(95) int local95;
		@Pc(102) int local102;
		for (local70 = 256 - arg0; local70 < 256; local70++) {
			local93 = local70 * 128;
			for (local95 = 0; local95 < 128; local95++) {
				local102 = (int) (Math.random() * 100.0D);
				if (local102 < 50 && local95 > 10 && local95 < 118) {
					Static168.anIntArray407[local95 + local93] = 255;
				} else {
					Static168.anIntArray407[local93 + local95] = 0;
				}
			}
		}
		if (Static146.anInt3312 > 0) {
			Static146.anInt3312 -= arg0 * 4;
		}
		if (Static139.anInt3213 > 0) {
			Static139.anInt3213 -= arg0 * 4;
		}
		if (Static139.anInt3213 == 0 && Static146.anInt3312 == 0) {
			local93 = (int) (Math.random() * (double) (2000 / arg0));
			if (local93 == 1) {
				Static146.anInt3312 = 1024;
			}
			if (local93 == 0) {
				Static139.anInt3213 = 1024;
			}
		}
		for (local93 = 0; local93 < 256 - arg0; local93++) {
			Static213.anIntArray487[local93] = Static213.anIntArray487[arg0 + local93];
		}
		for (local95 = 256 - arg0; local95 < 256; local95++) {
			Static213.anIntArray487[local95] = (int) (Math.sin((double) Static45.anInt1339 / 14.0D) * 16.0D + Math.sin((double) Static45.anInt1339 / 15.0D) * 14.0D + Math.sin((double) Static45.anInt1339 / 16.0D) * 12.0D);
			Static45.anInt1339++;
		}
		Static59.anInt1639 += arg0;
		local102 = ((Static103.anInt2511 & 0x1) + arg0) / 2;
		if (local102 <= 0) {
			return;
		}
		@Pc(280) int local280;
		@Pc(287) int local287;
		for (@Pc(271) int local271 = 0; local271 < Static59.anInt1639 * 100; local271++) {
			local280 = (int) (Math.random() * 124.0D) + 2;
			local287 = (int) (Math.random() * 128.0D) + 128;
			Static168.anIntArray407[local280 + (local287 << 7)] = 192;
		}
		Static59.anInt1639 = 0;
		@Pc(314) int local314;
		@Pc(317) int local317;
		for (local280 = 0; local280 < 256; local280++) {
			local287 = 0;
			local314 = local280 * 128;
			for (local317 = -local102; local317 < 128; local317++) {
				if (local102 + local317 < 128) {
					local287 += Static168.anIntArray407[local314 + local317 + local102];
				}
				if (local317 - local102 - 1 >= 0) {
					local287 -= Static168.anIntArray407[local317 + local314 - local102 - 1];
				}
				if (local317 >= 0) {
					Static126.anIntArray315[local317 + local314] = local287 / (local102 * 2 + 1);
				}
			}
		}
		for (local287 = 0; local287 < 128; local287++) {
			local314 = 0;
			for (local317 = -local102; local317 < 256; local317++) {
				@Pc(399) int local399 = local317 * 128;
				if (local102 + local317 < 256) {
					local314 += Static126.anIntArray315[local102 * 128 + local287 + local399];
				}
				if (local317 - local102 - 1 >= 0) {
					local314 -= Static126.anIntArray315[local287 + local399 - local102 * 128 - 128];
				}
				if (local317 >= 0) {
					Static168.anIntArray407[local399 + local287] = local314 / (local102 * 2 + 1);
				}
			}
		}
	}
}
