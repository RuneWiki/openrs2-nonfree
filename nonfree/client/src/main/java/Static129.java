import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "Lclient!km;")
	public static Class91 aClass91_101;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Z")
	public static boolean aBoolean213 = true;

	@OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
	public static int anInt2878 = 0;

	@OriginalMember(owner = "client!jl", name = "P", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
	public static int anInt2881 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg2 - arg6;
		@Pc(16) int local16 = (arg7 - arg4 << 16) / local7;
		@Pc(28) int local28 = arg0 - arg3;
		@Pc(37) int local37 = (arg1 - arg5 << 16) / local28;
		Static54.method1029(arg0, arg5, arg2, local16, arg6, arg3, local37, arg4);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method2211(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local18) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)Lclient!kk;")
	public static Class1_Sub2_Sub14 method2214(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub14 local10 = (Class1_Sub2_Sub14) Static254.aClass49_10.method1381((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24;
		if (arg0 < 32768) {
			local24 = Static255.aClass91_183.method2495(0, arg0);
		} else {
			local24 = Static184.aClass91_147.method2495(0, arg0 & 0x7FFF);
		}
		local10 = new Class1_Sub2_Sub14();
		if (local24 != null) {
			local10.method2366(new Class1_Sub11(local24));
		}
		if (arg0 >= 32768) {
			local10.method2372();
		}
		Static254.aClass49_10.method1385(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
	public static void method2218() {
		Static254.aClass135_33.method3320(5);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(BI)Z")
	public static boolean method2220(@OriginalArg(1) int arg0) {
		Static61.anInt1305 = arg0 + 1 & 0xFFFF;
		Static179.aBoolean285 = true;
		return true;
	}
}
