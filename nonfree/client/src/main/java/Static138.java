import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array17;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!ba;")
	public static Class11 aClass11_9;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array18;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array6;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	public static int anInt2800;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	public static int anInt2801;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1348 = Static187.method3089(" (X");

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1350 = null;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1351 = Static187.method3089("underlay)3dat");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(13) int local13 = arg6 - arg7;
		@Pc(22) int local22 = (arg3 - arg2 << 16) / local13;
		@Pc(36) boolean local36;
		if (Static27.anInt616 > 0 && Static27.anInt616 % 10 < 5) {
			local36 = true;
		} else {
			local36 = false;
		}
		@Pc(45) int local45 = arg4 - arg5;
		@Pc(54) int local54 = (arg0 - arg1 << 16) / local45;
		@Pc(66) int local66;
		@Pc(77) int local77;
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(159) int local159;
		@Pc(165) int local165;
		for (@Pc(56) int local56 = 0; local56 < local13; local56++) {
			local66 = (local56 + 1) * local22 >> 16;
			@Pc(72) int local72 = local22 * local56 >> 16;
			local77 = local66 - local72;
			if (local77 > 0) {
				local72 += arg2;
				@Pc(99) int[][] local99 = Static104.anIntArrayArrayArray4[local56 + arg7 >> 6];
				for (local101 = 0; local101 < local45; local101++) {
					local109 = local101 * local54 >> 16;
					local117 = local54 * (local101 + 1) >> 16;
					@Pc(122) int local122 = local117 - local109;
					if (local122 > 0) {
						local109 += arg1;
						@Pc(141) int local141 = local101 + arg5 >> 6;
						if (local99[local141] != null) {
							local159 = ((arg5 + local101 & 0x3F) << 6) + (local56 + arg7 & 0x3F);
							local165 = local99[local141][local159];
							if (local165 != 0) {
								@Pc(173) Class1_Sub3_Sub5 local173 = Static154.method2362(local165 - 1);
								if (local36 && Static171.anInt3625 == local173.anInt1412) {
									@Pc(183) Class1_Sub15 local183 = new Class1_Sub15();
									local183.anInt2224 = local109;
									local183.anInt2225 = local72;
									local183.anInt2226 = local173.anInt1412;
									Static132.aClass20_15.method466(local183);
								}
								Static22.aClass1_Sub3_Sub1_Sub1Array4[local173.anInt1412].method358(local72 - 7, local109 - 7);
							}
						}
					}
				}
			}
		}
		if (Static203.aDouble11 == Static94.aDouble10) {
			for (@Pc(225) Class1_Sub7 local225 = (Class1_Sub7) Static117.aClass20_14.method467(); local225 != null; local225 = (Class1_Sub7) Static117.aClass20_14.method468()) {
				local66 = local225.anInt1032;
				local66 -= Static150.anInt3065;
				@Pc(250) int local250 = (arg3 - arg2) * (local66 - arg7) / (arg6 - arg7) + arg2;
				local77 = local225.anInt1033;
				local109 = local225.anInt1030;
				local117 = 16777215;
				@Pc(260) Class1_Sub3_Sub1_Sub2 local260 = null;
				if (local109 == 0) {
					if (Static203.aDouble11 == 3.0D) {
						local260 = Static184.aClass1_Sub3_Sub1_Sub2_10;
					}
					if (Static203.aDouble11 == 4.0D) {
						local260 = Static124.aClass1_Sub3_Sub1_Sub2_6;
					}
					if (Static203.aDouble11 == 6.0D) {
						local260 = Static167.aClass1_Sub3_Sub1_Sub2_7;
					}
					if (Static203.aDouble11 == 8.0D) {
						local260 = Static93.aClass1_Sub3_Sub1_Sub2_4;
					}
				}
				if (local109 == 1) {
					if (Static203.aDouble11 == 3.0D) {
						local260 = Static167.aClass1_Sub3_Sub1_Sub2_7;
					}
					if (Static203.aDouble11 == 4.0D) {
						local260 = Static93.aClass1_Sub3_Sub1_Sub2_4;
					}
					if (Static203.aDouble11 == 6.0D) {
						local260 = Static17.aClass1_Sub3_Sub1_Sub2_8;
					}
					if (Static203.aDouble11 == 8.0D) {
						local260 = Static173.aClass1_Sub3_Sub1_Sub2_9;
					}
				}
				local77 = Static35.anInt988 + Static52.anInt1305 - local77;
				local101 = arg1 + (arg0 - arg1) * (local77 - arg5) / (arg4 - arg5);
				if (local109 == 2) {
					local117 = 16755200;
					if (Static203.aDouble11 == 3.0D) {
						local260 = Static17.aClass1_Sub3_Sub1_Sub2_8;
					}
					if (Static203.aDouble11 == 4.0D) {
						local260 = Static173.aClass1_Sub3_Sub1_Sub2_9;
					}
					if (Static203.aDouble11 == 6.0D) {
						local260 = Static84.aClass1_Sub3_Sub1_Sub2_3;
					}
					if (Static203.aDouble11 == 8.0D) {
						local260 = Static123.aClass1_Sub3_Sub1_Sub2_5;
					}
				}
				if (local260 != null) {
					@Pc(374) Class92[] local374 = local225.aClass92Array10;
					local159 = local374.length;
					local101 -= (local159 - 1) * local260.method1804() / 2;
					local101 += local260.method1797() / 2;
					for (local165 = 0; local165 < local159; local165++) {
						local260.method1801(local374[local165], local250, local101, local117);
						local101 += local260.method1804();
					}
				}
			}
		}
		for (@Pc(433) Class1_Sub15 local433 = (Class1_Sub15) Static132.aClass20_15.method467(); local433 != null; local433 = (Class1_Sub15) Static132.aClass20_15.method468()) {
			Static22.aClass1_Sub3_Sub1_Sub1Array4[local433.anInt2226].method358(local433.anInt2225 - 7, local433.anInt2224 - 7);
			Static46.method3165(local433.anInt2225, local433.anInt2224, 15, 16776960, 128);
			Static46.method3165(local433.anInt2225, local433.anInt2224, 7, 16777215, 256);
		}
		Static132.aClass20_15.method469();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Z")
	public static boolean method2069(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	public static void method2070() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static163.anInt3629; local1++) {
			for (local4 = 0; local4 < Static115.anInt2477; local4++) {
				for (local7 = 0; local7 < Static160.anInt3334; local7++) {
					Static179.aClass1_Sub17ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static195.anInt4226; local4++) {
			for (local7 = 0; local7 < Static195.anIntArray344[local4]; local7++) {
				Static195.aClass74ArrayArray1[local4][local7] = null;
			}
			Static195.anIntArray344[local4] = 0;
		}
		for (local7 = 0; local7 < Static60.anInt1454; local7++) {
			Static26.aClass16Array1[local7] = null;
		}
		Static60.anInt1454 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static41.aClass16Array2.length; local69++) {
			Static41.aClass16Array2[local69] = null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZB)V")
	public static void method2071(@OriginalArg(0) boolean arg0) {
		if (Static47.aClass57_2 == null) {
			return;
		}
		try {
			@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(4);
			local11.method3024(arg0 ? 2 : 3);
			local11.method3025(0);
			Static47.aClass57_2.method1673(local11.aByteArray49, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				Static47.aClass57_2.method1672();
			} catch (@Pc(41) Exception local41) {
			}
			Static47.aClass57_2 = null;
			Static157.anInt3249++;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] method2072() {
		@Pc(9) Class1_Sub3_Sub1_Sub1[] local9 = new Class1_Sub3_Sub1_Sub1[Static77.anInt1714];
		for (@Pc(15) int local15 = 0; local15 < Static77.anInt1714; local15++) {
			@Pc(21) Class1_Sub3_Sub1_Sub1 local21 = new Class1_Sub3_Sub1_Sub1();
			local21.anInt451 = Static92.anInt1967;
			local21.anInt449 = Static197.anInt4330;
			local21.anInt453 = Static154.anIntArray285[local15];
			local21.anInt454 = Static193.anIntArray276[local15];
			local21.anInt452 = Static164.anIntArray302[local15];
			local21.anInt450 = Static76.anIntArray133[local15];
			@Pc(53) int local53 = local21.anInt450 * local21.anInt452;
			@Pc(57) byte[] local57 = Static143.aByteArrayArray6[local15];
			local21.anIntArray44 = new int[local53];
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				local21.anIntArray44[local63] = Static209.anIntArray365[local57[local63] & 0xFF];
			}
			local9[local15] = local21;
		}
		Static145.method2153();
		return local9;
	}
}
