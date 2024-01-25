import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!br", name = "q", descriptor = "I")
	public static int anInt728;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	public static int anInt733;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString28 = null;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "[I")
	public static final int[] anIntArray47 = new int[1000];

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString29 = "Loading config - ";

	@OriginalMember(owner = "client!br", name = "v", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIILclient!fa;B)V")
	public static void method758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class59 arg3) {
		for (@Pc(15) Class14_Sub28 local15 = (Class14_Sub28) Static257.aClass18_24.method459(); local15 != null; local15 = (Class14_Sub28) Static257.aClass18_24.method453()) {
			if (arg2 == local15.anInt5300 && local15.anInt5307 == arg1 * 128 && arg0 * 128 == local15.anInt5298 && local15.aClass59_1.anInt1951 == arg3.anInt1951) {
				if (local15.aClass14_Sub19_Sub3_2 != null) {
					Static49.aClass14_Sub19_Sub2_1.method4245(local15.aClass14_Sub19_Sub3_2);
					local15.aClass14_Sub19_Sub3_2 = null;
				}
				if (local15.aClass14_Sub19_Sub3_1 != null) {
					Static49.aClass14_Sub19_Sub2_1.method4245(local15.aClass14_Sub19_Sub3_1);
					local15.aClass14_Sub19_Sub3_1 = null;
				}
				local15.method5986();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method759(@OriginalArg(1) Class143 arg0) {
		Static22.anInt452 = arg0.method3765("titlebg");
		Static164.anInt3460 = arg0.method3765("logo");
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Z")
	public static boolean method760(@OriginalArg(1) int arg0) {
		if (arg0 == 47 || arg0 == 3 || arg0 == 6 || arg0 == 57 || arg0 == 30) {
			return true;
		} else if (arg0 == 26 || arg0 == 5 || arg0 == 1012) {
			return true;
		} else if (arg0 == 45 || arg0 == 28 || arg0 == 58 || arg0 == 12 || arg0 == 8) {
			return true;
		} else {
			return arg0 == 43 || arg0 == 23 || arg0 == 1003 || arg0 == 7;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)I")
	public static int method762(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
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
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		local60 /= 6.0D;
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		@Pc(162) int local162 = (int) (local62 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		@Pc(188) int local188 = (int) (local68 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local188 > 243) {
			local162 >>= 0x4;
		} else if (local188 > 217) {
			local162 >>= 0x3;
		} else if (local188 > 192) {
			local162 >>= 0x2;
		} else if (local188 > 179) {
			local162 >>= 0x1;
		}
		return (local162 >> 5 << 7) + ((local157 >> 2 & 0x3F) << 10) + (local188 >> 1);
	}
}
