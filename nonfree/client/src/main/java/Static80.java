import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Lclient!jb;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_2;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!ie;")
	public static Class53 aClass53_16 = new Class53(64);

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public static int anInt1790 = 0;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	public static int anInt1797 = 0;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Lclient!ia;")
	public static Class51 aClass51_604 = Static64.method1101(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method1381() {
		Static16.anInt379 &= 0x7FF;
		@Pc(13) int local13 = Static151.anInt3335 >> 7;
		@Pc(17) int local17 = Static161.anInt3485 >> 7;
		if (Static20.anInt552 < 128) {
			Static20.anInt552 = 128;
		}
		@Pc(24) int local24 = 0;
		if (Static20.anInt552 > 383) {
			Static20.anInt552 = 383;
		}
		@Pc(35) int local35 = Static26.method2454(Static197.anInt2422, Static161.anInt3485, Static151.anInt3335);
		@Pc(55) int local55;
		if (local13 > 3 && local17 > 3 && local13 < 100 && local17 < 100) {
			for (local55 = local13 - 4; local55 <= local13 + 4; local55++) {
				for (@Pc(61) int local61 = local17 - 4; local61 <= local17 + 4; local61++) {
					@Pc(65) int local65 = Static197.anInt2422;
					if (local65 < 3 && (Static150.aByteArrayArrayArray9[1][local55][local61] & 0x2) == 2) {
						local65++;
					}
					@Pc(92) int local92 = local35 - Static20.anIntArrayArrayArray2[local65][local55][local61];
					if (local92 > local24) {
						local24 = local92;
					}
				}
			}
		}
		local55 = local24 * 192;
		if (local55 > 98048) {
			local55 = 98048;
		}
		if (local55 < 32768) {
			local55 = 32768;
		}
		if (Static71.anInt1640 < local55) {
			Static71.anInt1640 += (local55 - Static71.anInt1640) / 24;
		} else if (Static71.anInt1640 > local55) {
			Static71.anInt1640 += (local55 - Static71.anInt1640) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)V")
	public static void method1383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg3 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static87.method1505(arg3, arg0, arg1, arg4);
			}
		} else if (local15 == 0) {
			Static192.method3223(arg0, arg4, arg1, arg2);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg4 - (local49 * arg0 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (Static160.anInt3454 > arg2) {
				local75 = Static160.anInt3454;
				local73 = local57 + (local49 * Static160.anInt3454 >> 12);
			} else if (arg2 <= Static149.anInt3252) {
				local73 = arg3;
				local75 = arg2;
			} else {
				local75 = Static149.anInt3252;
				local73 = (local49 * Static149.anInt3252 >> 12) + local57;
			}
			if (Static225.anInt4729 > local73) {
				local73 = Static225.anInt4729;
				local75 = (Static225.anInt4729 - local57 << 12) / local49;
			} else if (Static122.anInt2710 < local73) {
				local73 = Static122.anInt2710;
				local75 = (Static122.anInt2710 - local57 << 12) / local49;
			}
			@Pc(149) int local149;
			@Pc(147) int local147;
			if (Static160.anInt3454 > arg0) {
				local147 = local57 + (Static160.anInt3454 * local49 >> 12);
				local149 = Static160.anInt3454;
			} else if (arg0 <= Static149.anInt3252) {
				local149 = arg0;
				local147 = arg4;
			} else {
				local149 = Static149.anInt3252;
				local147 = (Static149.anInt3252 * local49 >> 12) + local57;
			}
			if (local147 < Static225.anInt4729) {
				local147 = Static225.anInt4729;
				local149 = (Static225.anInt4729 - local57 << 12) / local49;
			} else if (Static122.anInt2710 < local147) {
				local147 = Static122.anInt2710;
				local149 = (Static122.anInt2710 - local57 << 12) / local49;
			}
			Static103.method3803(local73, local149, local147, arg1, local75);
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public static void method1384() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static202.anInt4289 - 1; local13++) {
				if (Static227.aShortArray59[local13] < 1000 && Static227.aShortArray59[local13 + 1] > 1000) {
					local7 = false;
					@Pc(35) Class51 local35 = Static168.aClass51Array27[local13];
					Static168.aClass51Array27[local13] = Static168.aClass51Array27[local13 + 1];
					Static168.aClass51Array27[local13 + 1] = local35;
					@Pc(53) Class51 local53 = Static21.aClass51Array3[local13];
					Static21.aClass51Array3[local13] = Static21.aClass51Array3[local13 + 1];
					Static21.aClass51Array3[local13 + 1] = local53;
					@Pc(71) int local71 = Static185.anIntArray302[local13];
					Static185.anIntArray302[local13] = Static185.anIntArray302[local13 + 1];
					Static185.anIntArray302[local13 + 1] = local71;
					@Pc(89) int local89 = Static179.anIntArray299[local13];
					Static179.anIntArray299[local13] = Static179.anIntArray299[local13 + 1];
					Static179.anIntArray299[local13 + 1] = local89;
					@Pc(107) short local107 = Static227.aShortArray59[local13];
					Static227.aShortArray59[local13] = Static227.aShortArray59[local13 + 1];
					Static227.aShortArray59[local13 + 1] = local107;
					@Pc(125) long local125 = Static19.aLongArray12[local13];
					Static19.aLongArray12[local13] = Static19.aLongArray12[local13 + 1];
					Static19.aLongArray12[local13 + 1] = local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public static void method1385() {
		if (Static157.aBrowsercontrol1 != null) {
			Static157.aBrowsercontrol1.method2339();
		}
		Static16.method294(Static36.aCanvas1);
		Static109.method1858(Static36.aCanvas1);
		if (Static119.aClass64_25 != null) {
			Static119.aClass64_25.method1851(Static36.aCanvas1);
		}
		Static161.method2720();
		Static60.method1060(Static36.aCanvas1);
		Static31.method538(Static36.aCanvas1);
		if (Static119.aClass64_25 != null) {
			Static119.aClass64_25.method1852(Static36.aCanvas1);
		}
		if (Static157.aBrowsercontrol1 != null && Static107.aCanvas2 != null) {
			Static157.aBrowsercontrol1.method2338(Static107.aCanvas2);
		}
	}
}
