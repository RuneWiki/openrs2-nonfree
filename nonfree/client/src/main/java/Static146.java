import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!ff;")
	public static Class24 aClass24_10;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!jc;")
	public static Class40 aClass40_33;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!id;")
	public static Class35 aClass35_38 = new Class35(4096);

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!ch;")
	public static Class14 aClass14_165 = new Class14(64);

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public static int anInt3297 = 1;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1935 = Static107.method1838("leuchten2:");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method2281() {
		Static35.aClass14_52.method596();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZII[B)Z")
	public static boolean method2283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(17) Class2_Sub2 local17 = new Class2_Sub2(arg2);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method1679();
			if (local23 == 0) {
				return local3;
			}
			local19 += local23;
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(71) int local71;
				@Pc(93) Class2_Sub4_Sub6 local93;
				do {
					@Pc(65) int local65;
					@Pc(75) int local75;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local31) {
										local39 = local17.method1679();
										if (local39 == 0) {
											continue label70;
										}
										local17.method1698();
									}
									local39 = local17.method1679();
									if (local39 == 0) {
										continue label70;
									}
									local33 += local39 - 1;
									@Pc(54) int local54 = local33 & 0x3F;
									@Pc(60) int local60 = local33 >> 6 & 0x3F;
									local65 = local60 + arg0;
									local71 = local17.method1698() >> 2;
									local75 = local54 + arg1;
								} while (local65 <= 0);
							} while (local75 <= 0);
						} while (local65 >= 103);
					} while (local75 >= 103);
					local93 = Static151.method2339(local19);
				} while (local71 == 22 && Static177.aBoolean170 && local93.anInt1051 == 0 && local93.anInt1027 != 1 && !local93.aBoolean46);
				if (!local93.method710()) {
					local3 = false;
					Static14.anInt601++;
				}
				local31 = true;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIIZBI)Z")
	public static boolean method2284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static74.anIntArrayArray14[local3][local7] = 0;
				Static172.anIntArrayArray36[local3][local7] = 99999999;
			}
		}
		Static74.anIntArrayArray14[arg1][arg7] = 99;
		Static172.anIntArrayArray36[arg1][arg7] = 0;
		local7 = arg1;
		@Pc(51) int local51 = arg7;
		@Pc(53) byte local53 = 0;
		Static128.anIntArray273[0] = arg1;
		@Pc(59) int local59 = 0;
		@Pc(62) int local62 = local53 + 1;
		Static78.anIntArray191[0] = arg7;
		@Pc(66) boolean local66 = false;
		@Pc(69) int local69 = Static128.anIntArray273.length;
		@Pc(74) int[][] local74 = Static141.aClass36Array1[Static103.anInt2568].anIntArrayArray15;
		@Pc(192) int local192;
		while (local62 != local59) {
			local7 = Static128.anIntArray273[local59];
			local51 = Static78.anIntArray191[local59];
			local59 = (local59 + 1) % local69;
			if (local7 == arg6 && arg8 == local51) {
				local66 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static141.aClass36Array1[Static103.anInt2568].method1373(arg10, arg0 - 1, local7, arg8, local51, arg6)) {
					local66 = true;
					break;
				}
				if (arg0 < 10 && Static141.aClass36Array1[Static103.anInt2568].method1370(arg10, local7, arg8, local51, arg0 - 1, arg6)) {
					local66 = true;
					break;
				}
			}
			if (arg4 != 0 && arg3 != 0 && Static141.aClass36Array1[Static103.anInt2568].method1377(arg6, local7, local51, arg3, arg4, arg8, arg2)) {
				local66 = true;
				break;
			}
			local192 = Static172.anIntArrayArray36[local7][local51] + 1;
			if (local7 > 0 && Static74.anIntArrayArray14[local7 - 1][local51] == 0 && (local74[local7 - 1][local51] & 0x12C0108) == 0) {
				Static128.anIntArray273[local62] = local7 - 1;
				Static78.anIntArray191[local62] = local51;
				local62 = (local62 + 1) % local69;
				Static74.anIntArrayArray14[local7 - 1][local51] = 2;
				Static172.anIntArrayArray36[local7 - 1][local51] = local192;
			}
			if (local7 < 103 && Static74.anIntArrayArray14[local7 + 1][local51] == 0 && (local74[local7 + 1][local51] & 0x12C0180) == 0) {
				Static128.anIntArray273[local62] = local7 + 1;
				Static78.anIntArray191[local62] = local51;
				Static74.anIntArrayArray14[local7 + 1][local51] = 8;
				Static172.anIntArrayArray36[local7 + 1][local51] = local192;
				local62 = (local62 + 1) % local69;
			}
			if (local51 > 0 && Static74.anIntArrayArray14[local7][local51 - 1] == 0 && (local74[local7][local51 - 1] & 0x12C0102) == 0) {
				Static128.anIntArray273[local62] = local7;
				Static78.anIntArray191[local62] = local51 - 1;
				local62 = (local62 + 1) % local69;
				Static74.anIntArrayArray14[local7][local51 - 1] = 1;
				Static172.anIntArrayArray36[local7][local51 - 1] = local192;
			}
			if (local51 < 103 && Static74.anIntArrayArray14[local7][local51 + 1] == 0 && (local74[local7][local51 + 1] & 0x12C0120) == 0) {
				Static128.anIntArray273[local62] = local7;
				Static78.anIntArray191[local62] = local51 + 1;
				Static74.anIntArrayArray14[local7][local51 + 1] = 4;
				local62 = (local62 + 1) % local69;
				Static172.anIntArrayArray36[local7][local51 + 1] = local192;
			}
			if (local7 > 0 && local51 > 0 && Static74.anIntArrayArray14[local7 - 1][local51 - 1] == 0 && (local74[local7 - 1][local51 - 1] & 0x12C010E) == 0 && (local74[local7 - 1][local51] & 0x12C0108) == 0 && (local74[local7][local51 - 1] & 0x12C0102) == 0) {
				Static128.anIntArray273[local62] = local7 - 1;
				Static78.anIntArray191[local62] = local51 - 1;
				local62 = (local62 + 1) % local69;
				Static74.anIntArrayArray14[local7 - 1][local51 - 1] = 3;
				Static172.anIntArrayArray36[local7 - 1][local51 - 1] = local192;
			}
			if (local7 < 103 && local51 > 0 && Static74.anIntArrayArray14[local7 + 1][local51 - 1] == 0 && (local74[local7 + 1][local51 - 1] & 0x12C0183) == 0 && (local74[local7 + 1][local51] & 0x12C0180) == 0 && (local74[local7][local51 - 1] & 0x12C0102) == 0) {
				Static128.anIntArray273[local62] = local7 + 1;
				Static78.anIntArray191[local62] = local51 - 1;
				Static74.anIntArrayArray14[local7 + 1][local51 - 1] = 9;
				local62 = (local62 + 1) % local69;
				Static172.anIntArrayArray36[local7 + 1][local51 - 1] = local192;
			}
			if (local7 > 0 && local51 < 103 && Static74.anIntArrayArray14[local7 - 1][local51 + 1] == 0 && (local74[local7 - 1][local51 + 1] & 0x12C0138) == 0 && (local74[local7 - 1][local51] & 0x12C0108) == 0 && (local74[local7][local51 + 1] & 0x12C0120) == 0) {
				Static128.anIntArray273[local62] = local7 - 1;
				Static78.anIntArray191[local62] = local51 + 1;
				local62 = (local62 + 1) % local69;
				Static74.anIntArrayArray14[local7 - 1][local51 + 1] = 6;
				Static172.anIntArrayArray36[local7 - 1][local51 + 1] = local192;
			}
			if (local7 < 103 && local51 < 103 && Static74.anIntArrayArray14[local7 + 1][local51 + 1] == 0 && (local74[local7 + 1][local51 + 1] & 0x12C01E0) == 0 && (local74[local7 + 1][local51] & 0x12C0180) == 0 && (local74[local7][local51 + 1] & 0x12C0120) == 0) {
				Static128.anIntArray273[local62] = local7 + 1;
				Static78.anIntArray191[local62] = local51 + 1;
				Static74.anIntArrayArray14[local7 + 1][local51 + 1] = 12;
				local62 = (local62 + 1) % local69;
				Static172.anIntArrayArray36[local7 + 1][local51 + 1] = local192;
			}
		}
		Static135.anInt3098 = 0;
		@Pc(819) int local819;
		@Pc(826) int local826;
		@Pc(832) int local832;
		if (!local66) {
			if (!arg9) {
				return false;
			}
			local192 = 1000;
			local819 = 100;
			for (local826 = arg6 - 10; local826 <= arg6 + 10; local826++) {
				for (local832 = arg8 - 10; local832 <= arg8 + 10; local832++) {
					if (local826 >= 0 && local832 >= 0 && local826 < 104 && local832 < 104 && Static172.anIntArrayArray36[local826][local832] < 100) {
						@Pc(858) int local858 = 0;
						if (local826 < arg6) {
							local858 = arg6 - local826;
						} else if (arg4 + arg6 - 1 < local826) {
							local858 = local826 + 1 - arg6 - arg4;
						}
						@Pc(886) int local886 = 0;
						if (local832 < arg8) {
							local886 = arg8 - local832;
						} else if (local832 > arg3 + arg8 - 1) {
							local886 = local832 + 1 - arg8 - arg3;
						}
						@Pc(924) int local924 = local858 * local858 + local886 * local886;
						if (local924 < local192 || local192 == local924 && local819 > Static172.anIntArrayArray36[local826][local832]) {
							local192 = local924;
							local819 = Static172.anIntArrayArray36[local826][local832];
							local7 = local826;
							local51 = local832;
						}
					}
				}
			}
			if (local192 == 1000) {
				return false;
			}
			if (local7 == arg1 && arg7 == local51) {
				return false;
			}
			Static135.anInt3098 = 1;
		}
		@Pc(996) byte local996 = 0;
		Static128.anIntArray273[0] = local7;
		local59 = local996 + 1;
		Static78.anIntArray191[0] = local51;
		local192 = local819 = Static74.anIntArrayArray14[local7][local51];
		while (arg1 != local7 || local51 != arg7) {
			if (local192 != local819) {
				local819 = local192;
				Static128.anIntArray273[local59] = local7;
				Static78.anIntArray191[local59++] = local51;
			}
			if ((local192 & 0x2) != 0) {
				local7++;
			} else if ((local192 & 0x8) != 0) {
				local7--;
			}
			if ((local192 & 0x1) != 0) {
				local51++;
			} else if ((local192 & 0x4) != 0) {
				local51--;
			}
			local192 = Static74.anIntArrayArray14[local7][local51];
		}
		if (local59 > 0) {
			local69 = local59;
			if (local59 > 25) {
				local69 = 25;
			}
			local59--;
			@Pc(1101) int local1101 = Static128.anIntArray273[local59];
			local826 = Static78.anIntArray191[local59];
			if (arg5 == 0) {
				Static128.aClass2_Sub2_Sub1_2.method1711(48);
				Static128.aClass2_Sub2_Sub1_2.method1700(local69 + local69 + 3);
			}
			if (arg5 == 1) {
				Static128.aClass2_Sub2_Sub1_2.method1711(120);
				Static128.aClass2_Sub2_Sub1_2.method1700(local69 + local69 + 17);
			}
			if (arg5 == 2) {
				Static128.aClass2_Sub2_Sub1_2.method1711(46);
				Static128.aClass2_Sub2_Sub1_2.method1700(local69 + local69 + 3);
			}
			Static128.aClass2_Sub2_Sub1_2.method1702(Static9.aBooleanArray6[82] ? 1 : 0);
			Static128.aClass2_Sub2_Sub1_2.method1658(Static3.anInt2434 + local1101);
			Static128.aClass2_Sub2_Sub1_2.method1696(Static39.anInt1055 + local826);
			Static109.anInt2643 = Static78.anIntArray191[0];
			Static98.anInt2452 = Static128.anIntArray273[0];
			for (local832 = 1; local832 < local69; local832++) {
				local59--;
				Static128.aClass2_Sub2_Sub1_2.method1685(Static128.anIntArray273[local59] - local1101);
				Static128.aClass2_Sub2_Sub1_2.method1685(Static78.anIntArray191[local59] - local826);
			}
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method2285() {
		Static154.aClass14_174.method596();
		Static49.aClass14_75.method596();
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	public static void method2286() {
		aClass40_33 = null;
		aFontMetrics1 = null;
		aClass14_165 = null;
		aClass28_1935 = null;
		aClass35_38 = null;
		aClass24_10 = null;
	}
}
