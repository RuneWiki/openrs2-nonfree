import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "[I")
	public static final int[] anIntArray109 = new int[13];

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
	public static int anInt2570 = -50;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
	public static int anInt2572 = 0;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Z")
	public static boolean method2263() {
		return Static362.method5319("jaclib") ? Static362.method5319("hw3d") : false;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IZIZIBI)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 <= arg4) {
			return;
		}
		@Pc(26) int local26 = (arg4 + arg2) / 2;
		@Pc(28) int local28 = arg4;
		@Pc(32) Class248_Sub1 local32 = Static332.aClass248_Sub1Array1[local26];
		Static332.aClass248_Sub1Array1[local26] = Static332.aClass248_Sub1Array1[arg2];
		Static332.aClass248_Sub1Array1[arg2] = local32;
		for (@Pc(44) int local44 = arg4; local44 < arg2; local44++) {
			if (Static169.method2730(Static332.aClass248_Sub1Array1[local44], arg1, arg5, arg3, arg0, local32) <= 0) {
				@Pc(64) Class248_Sub1 local64 = Static332.aClass248_Sub1Array1[local44];
				Static332.aClass248_Sub1Array1[local44] = Static332.aClass248_Sub1Array1[local28];
				Static332.aClass248_Sub1Array1[local28++] = local64;
			}
		}
		Static332.aClass248_Sub1Array1[arg2] = Static332.aClass248_Sub1Array1[local28];
		Static332.aClass248_Sub1Array1[local28] = local32;
		method2264(arg0, arg1, local28 - 1, arg3, arg4, arg5);
		method2264(arg0, arg1, arg2, arg3, local28 + 1, arg5);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIBILclient!r;II)Lclient!da;")
	public static Class52 method2265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class78 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class52 local12 = (Class52) Static95.aClass207_6.method4390(local6);
		if (local12 == null) {
			@Pc(22) Class231 local22 = Static317.method7563(arg5, Static184.aClass308_76);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt6254 < 13) {
				local22.method5067();
			}
			local12 = arg3.method6817(local22, 2055, Static417.anInt7371, 64, 768);
			Static95.aClass207_6.method4391(local6, local12);
		}
		local12 = local12.method7412((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.M(arg4);
		}
		if (arg1 != 0) {
			local12.MA(arg1);
		}
		if (arg2 != 0) {
			local12.W(arg2);
		}
		if (arg0 != 0) {
			local12.oa(0, arg0, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!oj;")
	public static Class51 method2267(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class51 local13;
		try {
			local13 = (Class51) Class.forName("Class51_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class51_Sub1();
		}
		local13.anInt1804 = arg1;
		local13.aString21 = arg0;
		return local13;
	}
}
