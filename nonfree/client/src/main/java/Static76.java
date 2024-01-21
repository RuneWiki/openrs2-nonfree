import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_27;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!cd;")
	public static Class10 aClass10_776 = Static51.method932("<)4col> x");

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Lclient!da;")
	public static Class2_Sub1_Sub5 method1260(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub1_Sub5 local12 = (Class2_Sub1_Sub5) Static144.aClass72_24.method2259((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(34) byte[] local34 = Static161.aClass29_66.method1030(arg0, 13);
		local12 = new Class2_Sub1_Sub5();
		local12.anInt780 = arg0;
		if (local34 != null) {
			local12.method611(new Class2_Sub11(local34));
		}
		Static144.aClass72_24.method2254(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)I")
	public static int method1261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 * (4096 - arg1) + arg1 * arg0 >> 12;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1262() {
		aClass10_776 = null;
		aClass29_Sub1_27 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Z")
	public static boolean method1263(@OriginalArg(0) int arg0) {
		if (Static115.aBooleanArray13[arg0]) {
			return true;
		} else if (Static96.aClass29_71.method1034(arg0)) {
			@Pc(25) int local25 = Static96.aClass29_71.method1039(arg0);
			if (local25 == 0) {
				Static115.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static90.aClass23ArrayArray1[arg0] == null) {
				Static90.aClass23ArrayArray1[arg0] = new Class23[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static90.aClass23ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static96.aClass29_71.method1030(local47, arg0);
					if (local61 != null) {
						Static90.aClass23ArrayArray1[arg0][local47] = new Class23();
						Static90.aClass23ArrayArray1[arg0][local47].anInt1057 = (arg0 << 16) + local47;
						if (local61[0] == -1) {
							Static90.aClass23ArrayArray1[arg0][local47].method842(new Class2_Sub11(local61));
						} else {
							Static90.aClass23ArrayArray1[arg0][local47].method852(new Class2_Sub11(local61));
						}
					}
				}
			}
			Static115.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!fa;IIIIII)V")
	public static void method1264(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static47.aBoolean51) {
			Static124.anInt2817 = 32;
		} else {
			Static124.anInt2817 = 0;
		}
		Static47.aBoolean51 = false;
		@Pc(122) int local122;
		if (Static95.anInt2252 != 0) {
			if (arg4 <= arg2 && arg4 + 16 > arg2 && arg5 <= arg0 && arg5 + 16 > arg0) {
				arg1.anInt1053 -= 4;
				Static3.method34(arg1);
			} else if (arg4 <= arg2 && arg4 + 16 > arg2 && arg0 >= arg5 + arg6 - 16 && arg0 < arg5 + arg6) {
				arg1.anInt1053 += 4;
				Static3.method34(arg1);
			} else if (arg2 >= arg4 - Static124.anInt2817 && arg2 < Static124.anInt2817 + arg4 + 16 && arg0 >= arg5 + 16 && arg0 < arg5 + arg6 - 16) {
				local122 = (arg6 - 32) * arg6 / arg3;
				if (local122 < 8) {
					local122 = 8;
				}
				@Pc(136) int local136 = arg6 - local122 - 32;
				@Pc(148) int local148 = arg0 - local122 / 2 - arg5 - 16;
				arg1.anInt1053 = (arg3 - arg6) * local148 / local136;
				Static3.method34(arg1);
				Static47.aBoolean51 = true;
			}
		}
		if (Static81.anInt1877 == 0) {
			return;
		}
		local122 = arg1.anInt1089;
		if (arg2 >= arg4 - local122 && arg0 >= arg5 && arg4 + 16 > arg2 && arg0 <= arg5 + arg6) {
			arg1.anInt1053 += Static81.anInt1877 * 45;
			Static3.method34(arg1);
			return;
		}
	}
}
