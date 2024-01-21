import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!pb;")
	public static Class31 aClass31_17;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_462 = Static23.method501("Name eingeben:");

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public static final int anInt854 = 20;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!mc;")
	private static Class42 aClass42_463 = Static23.method501("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_464 = Static23.method501("@or3@");

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt859 = 0;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_465 = Static23.method501("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_466 = Static23.method501("(X");

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!kc;")
	public static Class37 aClass37_12 = new Class37(64);

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_467 = aClass42_463;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!kc;")
	public static Class37 aClass37_13 = new Class37(64);

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "Lclient!mc;")
	private static Class42 aClass42_469 = Static23.method501("To play on this world move to a free area first");

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "Lclient!mc;")
	public static Class42 aClass42_468 = aClass42_469;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Lclient!mc;")
	public static Class42 aClass42_470 = Static23.method501("Aus");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method586() {
		aClass31_17 = null;
		aClass42_465 = null;
		aClass42_462 = null;
		aClass42_463 = null;
		aClass42_464 = null;
		aClass42_467 = null;
		aClass37_12 = null;
		aBigInteger1 = null;
		aClass37_13 = null;
		aClass42_470 = null;
		aClass42_466 = null;
		aClass42_468 = null;
		aClass42_469 = null;
		anIntArray116 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ja;IIII)[B")
	public static byte[] method587(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(29) long local29 = ((long) arg1 << 32) + ((long) (arg2 << 16)) + (long) (arg2 * 37 - -arg3 & 0xFFFF);
		if (Static12.aClass37_7 != null) {
			@Pc(37) Class1_Sub1_Sub7 local37 = (Class1_Sub1_Sub7) Static12.aClass37_7.method982(local29);
			if (local37 != null) {
				return local37.aByteArray12;
			}
		}
		@Pc(48) byte[] local48 = arg0.method1305(arg3, arg2);
		if (local48 == null) {
			return null;
		} else {
			if (Static12.aClass37_7 != null) {
				Static12.aClass37_7.method981(local29, new Class1_Sub1_Sub7(local48));
			}
			return local48;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method589() {
		Static84.aClass37_22.method976();
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method590() {
		Static39.anIntArray37 = null;
		Static69.anIntArray243 = null;
		Static83.anIntArray340 = null;
		Static98.aByteArrayArray10 = null;
		Static36.anIntArray124 = null;
		Static29.anIntArray98 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ja;Lclient!ja;IZ)V")
	public static void method591(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) boolean arg2) {
		Static20.aClass33_7 = arg1;
		Static80.aClass33_23 = arg0;
		Static27.aBoolean38 = arg2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method592() {
		@Pc(9) int local9 = Static57.anInt2698 * 128 + 64;
		@Pc(15) int local15 = Static56.anInt1424 * 128 + 64;
		@Pc(24) int local24 = Static104.method1821(local15, Static82.anInt2165, local9) - Static58.anInt1436;
		if (Static37.anInt917 < local15) {
			Static37.anInt917 += Static25.anInt734 + (local15 - Static37.anInt917) * Static50.anInt1739 / 1000;
			if (local15 < Static37.anInt917) {
				Static37.anInt917 = local15;
			}
		}
		if (Static37.anInt917 > local15) {
			Static37.anInt917 -= Static25.anInt734 + (Static37.anInt917 - local15) * Static50.anInt1739 / 1000;
			if (local15 > Static37.anInt917) {
				Static37.anInt917 = local15;
			}
		}
		local15 = Static17.anInt598 * 128 + 64;
		if (Static68.anInt1671 < local9) {
			Static68.anInt1671 += Static25.anInt734 + Static50.anInt1739 * (local9 - Static68.anInt1671) / 1000;
			if (Static68.anInt1671 > local9) {
				Static68.anInt1671 = local9;
			}
		}
		if (Static68.anInt1671 > local9) {
			Static68.anInt1671 -= Static25.anInt734 + (Static68.anInt1671 - local9) * Static50.anInt1739 / 1000;
			if (local9 > Static68.anInt1671) {
				Static68.anInt1671 = local9;
			}
		}
		if (Static8.anInt243 < local24) {
			Static8.anInt243 += Static25.anInt734 + (local24 - Static8.anInt243) * Static50.anInt1739 / 1000;
			if (Static8.anInt243 > local24) {
				Static8.anInt243 = local24;
			}
		}
		local9 = Static43.anInt1127 * 128 + 64;
		if (Static8.anInt243 > local24) {
			Static8.anInt243 -= Static50.anInt1739 * (Static8.anInt243 - local24) / 1000 + Static25.anInt734;
			if (local24 > Static8.anInt243) {
				Static8.anInt243 = local24;
			}
		}
		local24 = Static104.method1821(local15, Static82.anInt2165, local9) - Static109.anInt2755;
		@Pc(203) int local203 = local9 - Static68.anInt1671;
		@Pc(208) int local208 = local15 - Static37.anInt917;
		@Pc(213) int local213 = local24 - Static8.anInt243;
		@Pc(224) int local224 = (int) Math.sqrt((double) (local208 * local208 + local203 * local203));
		@Pc(235) int local235 = (int) (Math.atan2((double) local213, (double) local224) * 325.949D) & 0x7FF;
		@Pc(246) int local246 = (int) (Math.atan2((double) local203, (double) local208) * -325.949D) & 0x7FF;
		@Pc(251) int local251 = local246 - Static92.anInt2431;
		if (local235 < 128) {
			local235 = 128;
		}
		if (local251 > 1024) {
			local251 -= 2048;
		}
		if (local235 > 383) {
			local235 = 383;
		}
		if (local251 < -1024) {
			local251 += 2048;
		}
		if (local251 > 0) {
			Static92.anInt2431 += Static59.anInt2001 * local251 / 1000 + Static11.anInt346;
			Static92.anInt2431 &= 0x7FF;
		}
		if (local235 > Static30.anInt830) {
			Static30.anInt830 += Static11.anInt346 + Static59.anInt2001 * (local235 - Static30.anInt830) / 1000;
			if (Static30.anInt830 > local235) {
				Static30.anInt830 = local235;
			}
		}
		if (local251 < 0) {
			Static92.anInt2431 -= Static11.anInt346 + -local251 * Static59.anInt2001 / 1000;
			Static92.anInt2431 &= 0x7FF;
		}
		@Pc(341) int local341 = local246 - Static92.anInt2431;
		if (local341 > 1024) {
			local341 -= 2048;
		}
		if (local341 < -1024) {
			local341 += 2048;
		}
		if (Static30.anInt830 > local235) {
			Static30.anInt830 -= Static11.anInt346 + Static59.anInt2001 * (Static30.anInt830 - local235) / 1000;
			if (Static30.anInt830 < local235) {
				Static30.anInt830 = local235;
			}
		}
		if (local341 < 0 && local251 > 0 || local341 > 0 && local251 < 0) {
			Static92.anInt2431 = local246;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
	public static boolean method593(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
