import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
	public static int anInt798;

	@OriginalMember(owner = "client!cm", name = "eb", descriptor = "[[Lclient!hk;")
	public static Class74[][] aClass74ArrayArray1;

	@OriginalMember(owner = "client!cm", name = "gb", descriptor = "I")
	public static int anInt812;

	@OriginalMember(owner = "client!cm", name = "hb", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!cm", name = "fb", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!cm", name = "ib", descriptor = "Ljava/lang/String;")
	public static String aString31 = "Opened title screen";

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(IB)V")
	public static void method654(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static245.method4932(arg0)) {
			return;
		}
		@Pc(21) Class151[] local21 = Static96.aClass151ArrayArray1[arg0];
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) Class151 local35 = local21[local23];
			if (local35.anObjectArray23 != null) {
				@Pc(43) Class3_Sub24 local43 = new Class3_Sub24();
				local43.aClass151_13 = local35;
				local43.anObjectArray1 = local35.anObjectArray23;
				Static239.method4066(local43, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)V")
	public static void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static167.method2786(arg4, Static111.anInt2039, Static245.anInt6027);
		@Pc(17) int local17 = Static167.method2786(arg0, Static111.anInt2039, Static245.anInt6027);
		@Pc(28) int local28 = Static167.method2786(arg3, Static204.anInt4020, Static175.anInt3267);
		@Pc(34) int local34 = Static167.method2786(arg1, Static204.anInt4020, Static175.anInt3267);
		@Pc(42) int local42 = Static167.method2786(arg2 + arg4, Static111.anInt2039, Static245.anInt6027);
		@Pc(53) int local53 = Static167.method2786(arg0 - arg2, Static111.anInt2039, Static245.anInt6027);
		@Pc(55) int local55;
		for (local55 = local11; local55 < local42; local55++) {
			Static235.method3988(arg5, Static129.anIntArrayArray40[local55], local34, local28);
		}
		for (local55 = local17; local55 > local53; local55--) {
			Static235.method3988(arg5, Static129.anIntArrayArray40[local55], local34, local28);
		}
		@Pc(97) int local97 = Static167.method2786(arg3 + arg2, Static204.anInt4020, Static175.anInt3267);
		@Pc(108) int local108 = Static167.method2786(arg1 - arg2, Static204.anInt4020, Static175.anInt3267);
		for (local55 = local42; local55 <= local53; local55++) {
			@Pc(121) int[] local121 = Static129.anIntArrayArray40[local55];
			Static235.method3988(arg5, local121, local97, local28);
			Static235.method3988(arg5, local121, local34, local108);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V")
	public static void method658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg3, 8);
		local8.method971();
		local8.anInt1132 = arg0;
		local8.anInt1140 = arg1;
		local8.anInt1136 = arg2;
	}
}
