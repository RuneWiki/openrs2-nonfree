import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public static int anInt138;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Z")
	public static boolean aBoolean5;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!v;")
	private static Class76 aClass76_46 = Static134.method2017("Loaded sprites");

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt131 = 0;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!v;")
	private static Class76 aClass76_49 = Static134.method2017("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_47 = aClass76_49;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Lclient!v;")
	private static Class76 aClass76_54 = Static134.method2017("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_48 = aClass76_54;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public static int anInt132 = -1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_50 = aClass76_46;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_51 = Static134.method2017("Clientscript error in: ");

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_52 = Static134.method2017("<col=ffff00>");

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_53 = Static134.method2017("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Lclient!oa;")
	public static Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method82() {
		@Pc(11) int local11;
		if (Static84.anInt2023 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static84.anInt2023 > 768) {
					Static81.anIntArray278[local11] = Static119.method1802(Static65.anIntArray64[local11], Static64.anIntArray222[local11], 1024 - Static84.anInt2023);
				} else if (Static84.anInt2023 > 256) {
					Static81.anIntArray278[local11] = Static64.anIntArray222[local11];
				} else {
					Static81.anIntArray278[local11] = Static119.method1802(Static64.anIntArray222[local11], Static65.anIntArray64[local11], 256 - Static84.anInt2023);
				}
			}
		} else if (Static87.anInt1972 <= 0) {
			for (local11 = 0; local11 < 256; local11++) {
				Static81.anIntArray278[local11] = Static65.anIntArray64[local11];
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static87.anInt1972 > 768) {
					Static81.anIntArray278[local11] = Static119.method1802(Static65.anIntArray64[local11], Static105.anIntArray327[local11], 1024 - Static87.anInt1972);
				} else if (Static87.anInt1972 > 256) {
					Static81.anIntArray278[local11] = Static105.anIntArray327[local11];
				} else {
					Static81.anIntArray278[local11] = Static119.method1802(Static105.anIntArray327[local11], Static65.anIntArray64[local11], 256 - Static87.anInt1972);
				}
			}
		}
		Static46.method1828(0, 9, 128, 263);
		Static73.aClass4_Sub4_Sub5_Sub2_2.method910(0, 0);
		local11 = 0;
		Static46.method1817();
		@Pc(164) int local164 = 6885;
		@Pc(179) int local179;
		@Pc(183) int local183;
		@Pc(193) int local193;
		@Pc(200) int local200;
		@Pc(210) int local210;
		@Pc(215) int local215;
		@Pc(224) int local224;
		for (@Pc(166) int local166 = 1; local166 < 255; local166++) {
			local179 = (256 - local166) * Static58.anIntArray194[local166] / 256;
			local183 = local179 + 22;
			if (local183 < 0) {
				local183 = 0;
			}
			local11 += local183;
			for (local193 = local183; local193 < 128; local193++) {
				local200 = Static41.anIntArray129[local11++];
				if (local200 == 0) {
					local164++;
				} else {
					local210 = local200;
					local215 = 256 - local200;
					local200 = Static81.anIntArray278[local200];
					local224 = Static118.aClass43_1.anIntArray395[local164];
					Static118.aClass43_1.anIntArray395[local164++] = (local210 * (local200 & 0xFF00FF) + local215 * (local224 & 0xFF00FF) & 0xFF00FF00) + ((local224 & 0xFF00) * local215 + (local200 & 0xFF00) * local210 & 0xFF0000) >> 8;
				}
			}
			local164 += local183 + 765 - 128;
		}
		local11 = 0;
		Static46.method1828(637, 9, 765, 263);
		Static68.aClass4_Sub4_Sub5_Sub2_1.method910(382, 0);
		Static46.method1817();
		local164 = 7546;
		for (local179 = 1; local179 < 255; local179++) {
			local183 = (256 - local179) * Static58.anIntArray194[local179] / 256;
			local164 += local183;
			local193 = 103 - local183;
			for (local200 = 0; local200 < local193; local200++) {
				local210 = Static41.anIntArray129[local11++];
				if (local210 == 0) {
					local164++;
				} else {
					local215 = local210;
					local224 = 256 - local210;
					@Pc(352) int local352 = Static118.aClass43_1.anIntArray395[local164];
					local210 = Static81.anIntArray278[local210];
					Static118.aClass43_1.anIntArray395[local164++] = (local215 * (local210 & 0xFF00FF) + local224 * (local352 & 0xFF00FF) & 0xFF00FF00) + (local215 * (local210 & 0xFF00) + local224 * (local352 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local164 += 765 - local193 - local183;
			local11 += 128 - local193;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method83() {
		@Pc(10) Object local10 = Static99.anObject35;
		synchronized (Static99.anObject35) {
			if (Static97.anInt2247 != 0) {
				Static97.anInt2247 = 1;
				try {
					Static99.anObject35.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V")
	public static void method84(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static76.method1382(arg0 - 1L);
			Static76.method1382(1L);
		} else {
			Static76.method1382(arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)V")
	public static void method85(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static45.method816(arg1)) {
			Static5.method80(Static29.aClass4_Sub8ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public static void method86() {
		aClass76_51 = null;
		aClass76_46 = null;
		aBigInteger1 = null;
		aClass76_50 = null;
		aClass76_48 = null;
		aClass76_54 = null;
		aClass76_53 = null;
		aClass76_52 = null;
		aClass76_47 = null;
		aClass76_49 = null;
		aClass53_1 = null;
	}
}
