import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
	public static int anInt5563 = 0;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "[I")
	public static final int[] anIntArray541 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "[I")
	public static final int[] anIntArray542 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BIIIII)V")
	public static void method4922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static161.method2842(arg3, Static346.anInt6668, Static75.anInt1447);
		@Pc(17) int local17 = Static161.method2842(arg1, Static346.anInt6668, Static75.anInt1447);
		@Pc(23) int local23 = Static161.method2842(arg2, Static353.anInt6760, Static163.anInt3234);
		@Pc(29) int local29 = Static161.method2842(arg0, Static353.anInt6760, Static163.anInt3234);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static160.method2840(arg4, local29, local23, Static129.anIntArrayArray46[local35]);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V")
	public static void method4923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static122.method2146(true, local35);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4924(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static104.aClass85_49.method2020(Static120.anInt2260) + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static144.aClass85_69.method2020(Static120.anInt2260) + "</col>";
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!vg;III)V")
	public static void method4926(@OriginalArg(0) Class201 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class46 local16 = arg0.method5811(Static236.aClass55_9);
		if (local16 == null) {
			return;
		}
		Static236.aClass55_9.method5258(arg1, arg2, arg0.anInt6505 + arg1, arg0.anInt6510 + arg2);
		if (Static271.anInt5299 < 3) {
			Static86.aClass95_6.method5495((float) arg1 + (float) arg0.anInt6505 / 2.0F, (float) arg2 + (float) arg0.anInt6510 / 2.0F, ((int) -Static164.aFloat24 & 0x3FFF) << 2, local16, arg1, arg2);
		} else {
			Static236.aClass55_9.method5185(local16, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIZIZII)V")
	public static void method4927(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= arg5) {
			return;
		}
		@Pc(11) int local11 = (arg5 + arg2) / 2;
		@Pc(13) int local13 = arg2;
		@Pc(17) Class6_Sub1 local17 = Static241.aClass6_Sub1Array2[local11];
		Static241.aClass6_Sub1Array2[local11] = Static241.aClass6_Sub1Array2[arg5];
		Static241.aClass6_Sub1Array2[arg5] = local17;
		for (@Pc(29) int local29 = arg2; local29 < arg5; local29++) {
			if (Static166.method3022(Static241.aClass6_Sub1Array2[local29], arg4, arg1, arg0, local17, arg3) <= 0) {
				@Pc(45) Class6_Sub1 local45 = Static241.aClass6_Sub1Array2[local29];
				Static241.aClass6_Sub1Array2[local29] = Static241.aClass6_Sub1Array2[local13];
				Static241.aClass6_Sub1Array2[local13++] = local45;
			}
		}
		Static241.aClass6_Sub1Array2[arg5] = Static241.aClass6_Sub1Array2[local13];
		Static241.aClass6_Sub1Array2[local13] = local17;
		method4927(arg0, arg1, arg2, arg3, arg4, local13 - 1);
		method4927(arg0, arg1, local13 + 1, arg3, arg4, arg5);
	}
}
