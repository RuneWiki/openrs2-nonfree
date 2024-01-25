import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!qa;")
	public static Class109 aClass109_12;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_183 = new Class322(139, 12);

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_71 = new Class74(16);

	@OriginalMember(owner = "client!v", name = "g", descriptor = "I")
	public static volatile int anInt9910 = -1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZBLclient!lq;ILclient!lq;)I")
	public static int method8593(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class204_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class204_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local9 = arg3.anInt6024;
			local12 = arg1.anInt6024;
			if (!arg0) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static114.method2147(Static601.anInt9518, arg3.method5432().aString53, arg1.method5432().aString53);
		} else if (arg2 == 3) {
			if (arg3.aString69.equals("-")) {
				if (arg1.aString69.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString69.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static114.method2147(Static601.anInt9518, arg3.aString69, arg1.aString69);
			}
		} else if (arg2 == 4) {
			if (arg3.method5426()) {
				return arg1.method5426() ? 0 : 1;
			} else if (arg1.method5426()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg3.method5427()) {
				return arg1.method5427() ? 0 : 1;
			} else if (arg1.method5427()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg3.method5431()) {
				return arg1.method5431() ? 0 : 1;
			} else if (arg1.method5431()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg3.method5429()) {
				return arg1.method5429() ? 0 : 1;
			} else if (arg1.method5429()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local9 = arg3.anInt6032;
			local12 = arg1.anInt6032;
			if (arg0) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg3.anInt6031 - arg1.anInt6031;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Z")
	public static boolean method8594(@OriginalArg(1) int arg0) {
		if (arg0 == 50 || arg0 == 12 || arg0 == 9 || arg0 == 51 || arg0 == 1002 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 3;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZII)V")
	public static void method8595(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class6_Sub3 local10 = Static536.method7657(arg0, arg1);
		if (local10 != null) {
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray21.length; local23++) {
				local10.anIntArray21[local23] = -1;
				local10.anIntArray20[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	public static void method8596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class304 local9 = Static401.aClass304ArrayArray1[arg1][arg2];
		Static356.method5433(arg0, local9 == null ? Static167.aClass304_1 : local9);
	}
}
