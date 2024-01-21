import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public static int anInt763;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!ff;")
	public static Class27 aClass27_2;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!dd;")
	public static Class19 aClass19_26 = new Class19(64);

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	public static int anInt762 = 0;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!dd;")
	public static Class19 aClass19_27 = new Class19(500);

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_471 = Static69.method1153("backleft1");

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static int anInt764 = -1;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	public static int[] anIntArray107 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_472 = Static69.method1153("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method512() {
		aLongArray3 = null;
		aClass19_27 = null;
		aFrame1 = null;
		anIntArray107 = null;
		aClass64_472 = null;
		aClass27_2 = null;
		aClass64_471 = null;
		aClass19_26 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!pb;Lclient!pb;ILclient!pb;)V")
	public static void method513(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) Class41 arg2) {
		Static91.aClass41_48 = arg0;
		Static101.aClass41_57 = arg1;
		Static25.aClass41_74 = arg2;
		Static65.aClass1_Sub1_Sub11ArrayArray1 = new Class1_Sub1_Sub11[Static25.aClass41_74.method1051()][];
		Static62.aBooleanArray8 = new boolean[Static25.aClass41_74.method1051()];
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!pb;III)[B")
	public static byte[] method514(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) (arg1 * 37 + arg2 & 0xFFFF) + (long) (arg1 << 16) + ((long) arg3 << 32);
		if (Static37.aClass19_33 != null) {
			@Pc(31) Class1_Sub1_Sub12 local31 = (Class1_Sub1_Sub12) Static37.aClass19_33.method410(local23);
			if (local31 != null) {
				return local31.aByteArray23;
			}
		}
		@Pc(47) byte[] local47 = arg0.method1062(arg1, arg2);
		if (local47 == null) {
			return null;
		} else {
			if (Static37.aClass19_33 != null) {
				Static37.aClass19_33.method409(new Class1_Sub1_Sub12(local47), local23);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[BI)Z")
	public static boolean method515(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = -1;
		@Pc(22) Class1_Sub6 local22 = new Class1_Sub6(arg1);
		label52: while (true) {
			@Pc(26) int local26 = local22.method1844();
			if (local26 == 0) {
				return local15;
			}
			local17 += local26;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(45) int local45;
				while (!local39) {
					local45 = local22.method1844();
					if (local45 == 0) {
						continue label52;
					}
					local37 += local45 - 1;
					@Pc(72) int local72 = local37 & 0x3F;
					@Pc(78) int local78 = local37 >> 6 & 0x3F;
					@Pc(84) int local84 = local22.method1837() >> 2;
					@Pc(88) int local88 = local78 + arg0;
					@Pc(92) int local92 = arg2 + local72;
					if (local88 > 0 && local92 > 0 && local88 < 103 && local92 < 103) {
						@Pc(111) Class1_Sub1_Sub3 local111 = Static108.method1807(local17);
						if (local84 != 22 || !Static52.aBoolean169 || local111.anInt401 != 0 || local111.aBoolean29) {
							local39 = true;
							if (!local111.method247()) {
								Static43.anInt961++;
								local15 = false;
							}
						}
					}
				}
				local45 = local22.method1844();
				if (local45 == 0) {
					break;
				}
				local22.method1837();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method516() {
		for (@Pc(18) Class1_Sub9 local18 = (Class1_Sub9) Static60.aClass50_8.method1151(); local18 != null; local18 = (Class1_Sub9) Static60.aClass50_8.method1141()) {
			if (local18.anInt1885 > 0) {
				local18.anInt1885--;
			}
			if (local18.anInt1885 != 0) {
				if (local18.anInt1875 > 0) {
					local18.anInt1875--;
				}
				if (local18.anInt1875 == 0 && local18.anInt1890 >= 1 && local18.anInt1882 >= 1 && local18.anInt1890 <= 102 && local18.anInt1882 <= 102 && (local18.anInt1889 < 0 || Static68.method1139(local18.anInt1891, local18.anInt1889))) {
					Static77.method1334(local18.anInt1877, local18.anInt1884, local18.anInt1890, local18.anInt1891, local18.anInt1889, local18.anInt1887, local18.anInt1882);
					local18.anInt1875 = -1;
					if (local18.anInt1889 == local18.anInt1892 && local18.anInt1892 == -1) {
						local18.method2076();
					} else if (local18.anInt1892 == local18.anInt1889 && local18.anInt1884 == local18.anInt1879 && local18.anInt1886 == local18.anInt1891) {
						local18.method2076();
					}
				}
			} else if (local18.anInt1892 < 0 || Static68.method1139(local18.anInt1886, local18.anInt1892)) {
				Static77.method1334(local18.anInt1877, local18.anInt1879, local18.anInt1890, local18.anInt1886, local18.anInt1892, local18.anInt1887, local18.anInt1882);
				local18.method2076();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public static void method517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class50 local11 = Static64.aClass50ArrayArrayArray1[Static15.anInt463][arg0][arg1];
		if (local11 == null) {
			Static82.aClass68_1.method1753(Static15.anInt463, arg0, arg1);
			return;
		}
		@Pc(29) int local29 = -99999999;
		@Pc(31) Class1_Sub1_Sub2_Sub4 local31 = null;
		@Pc(36) Class1_Sub1_Sub2_Sub4 local36;
		for (local36 = (Class1_Sub1_Sub2_Sub4) local11.method1151(); local36 != null; local36 = (Class1_Sub1_Sub2_Sub4) local11.method1141()) {
			@Pc(42) Class1_Sub1_Sub6 local42 = Static106.method1739(local36.anInt1844);
			@Pc(45) int local45 = local42.anInt989;
			if (local42.anInt957 == 1) {
				local45 *= local36.anInt1850 + 1;
			}
			if (local45 > local29) {
				local31 = local36;
				local29 = local45;
			}
		}
		if (local31 == null) {
			Static82.aClass68_1.method1753(Static15.anInt463, arg0, arg1);
			return;
		}
		local11.method1144(local31);
		@Pc(88) Class1_Sub1_Sub2_Sub4 local88 = null;
		local36 = (Class1_Sub1_Sub2_Sub4) local11.method1151();
		@Pc(95) Class1_Sub1_Sub2_Sub4 local95 = null;
		@Pc(103) int local103 = (arg1 << 7) + arg0 + 1610612736;
		while (local36 != null) {
			if (local31.anInt1844 != local36.anInt1844) {
				if (local95 == null) {
					local95 = local36;
				}
				if (local95.anInt1844 != local36.anInt1844 && local88 == null) {
					local88 = local36;
				}
			}
			local36 = (Class1_Sub1_Sub2_Sub4) local11.method1141();
		}
		Static82.aClass68_1.method1770(Static15.anInt463, arg0, arg1, Static114.method1996(Static15.anInt463, arg0 * 128 + 64, arg1 * 128 - -64), local31, local103, local95, local88);
	}
}
