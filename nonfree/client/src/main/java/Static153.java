import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
	public static int anInt5195;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
	public static int method3989(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local44 + local30);
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / ((2.0D - local44) - local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local21 == local44) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (local44 - local30) + 4.0D;
			}
		}
		local58 /= 6.0D;
		@Pc(158) int local158 = (int) (local58 * 256.0D);
		@Pc(163) int local163 = (int) (local60 * 256.0D);
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		@Pc(178) int local178 = (int) (local66 * 256.0D);
		if (local178 < 0) {
			local178 = 0;
		} else if (local178 > 255) {
			local178 = 255;
		}
		if (local178 > 243) {
			local163 >>= 0x4;
		} else if (local178 > 217) {
			local163 >>= 0x3;
		} else if (local178 > 192) {
			local163 >>= 0x2;
		} else if (local178 > 179) {
			local163 >>= 0x1;
		}
		return (local178 >> 1) + (local163 >> 5 << 7) + ((local158 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
	public static void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class30_Sub2 local13 = local7.aClass30_Sub2_2;
		@Pc(16) Class30_Sub2 local16 = local7.aClass30_Sub2_3;
		if (local13 != null) {
			local13.anInt7380 = local13.anInt7380 * arg3 / (0x10 << Static198.anInt7947 - 7);
			local13.anInt7381 = local13.anInt7381 * arg3 / (0x10 << Static198.anInt7947 - 7);
		}
		if (local16 != null) {
			local16.anInt7380 = local16.anInt7380 * arg3 / (0x10 << Static198.anInt7947 - 7);
			local16.anInt7381 = local16.anInt7381 * arg3 / (0x10 << Static198.anInt7947 - 7);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLclient!ec;)Ljava/lang/String;")
	public static String method3991(@OriginalArg(1) Class68 arg0) {
		if (Static55.method1059(arg0).method4026() == 0) {
			return null;
		} else if (arg0.aString21 == null || arg0.aString21.trim().length() == 0) {
			return Static226.aBoolean281 ? "Hidden-use" : null;
		} else {
			return arg0.aString21;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(CB)Z")
	public static boolean method3992(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static267.method3958(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static260.aCharArray4;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(28) char local28 = local16[local18];
				if (arg0 == local28) {
					return true;
				}
			}
			@Pc(44) char[] local44 = Static401.aCharArray6;
			for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
				@Pc(51) char local51 = local44[local46];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	public static void method3993() {
		@Pc(9) Class91 local9 = Static429.aClass91_97;
		synchronized (Static429.aClass91_97) {
			Static429.aClass91_97.method1999();
		}
	}
}
