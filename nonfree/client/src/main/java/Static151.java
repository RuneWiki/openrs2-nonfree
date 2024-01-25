import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "[I")
	public static int[] anIntArray211;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Hidden";

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
	public static final int anInt2965 = 0;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	public static int anInt2968 = -1;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "[I")
	public static final int[] anIntArray212 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
	public static void method2439(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(14) Class184 local14 = Static58.aClass184ArrayArray1[arg1][arg0];
		Static50.method852(local14 == null ? Static168.aClass184_1 : local14, 5000);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public static void method2440() {
		@Pc(16) int[] local16 = new int[Static106.anInt2240];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static106.anInt2240; local20++) {
			@Pc(26) Class41 local26 = Static230.method5537(local20);
			if (local26.anInt1220 >= 0 || local26.anInt1178 >= 0) {
				local16[local18++] = local20;
			}
		}
		Static97.anIntArray120 = new int[local18];
		for (@Pc(53) int local53 = 0; local53 < local18; local53++) {
			Static97.anIntArray120[local53] = local16[local53];
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V")
	public static void method2441(@OriginalArg(1) int arg0) {
		if (arg0 == Static181.anInt1027) {
			return;
		}
		Static162.anInt2152 = Static122.anInt2632 = Static295.anIntArray478[arg0];
		Static212.aClass122_2.method4738(50, (int) ((double) Static162.anInt2152 * 34.46D));
		Static72.anIntArrayArray8 = new int[Static162.anInt2152][Static122.anInt2632];
		Static149.anIntArrayArray19 = new int[Static162.anInt2152][Static122.anInt2632];
		Static94.anIntArrayArrayArray1 = new int[4][Static162.anInt2152 >> 3][Static122.anInt2632 >> 3];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static34.aClass13Array1[local42] = Static289.method4948(Static162.anInt2152, Static122.anInt2632);
		}
		Static219.aByteArrayArrayArray10 = new byte[4][Static162.anInt2152][Static122.anInt2632];
		Static1.method4(Static162.anInt2152, Static122.anInt2632);
		Static23.method437(Static162.anInt2152 >> 3, Static122.anInt2632 >> 3, Static212.aClass122_2);
		Static181.anInt1027 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2442(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static179.anInt3793 > 0) {
			local18 = Static47.aByteArrayArray5[--Static179.anInt3793];
			Static47.aByteArrayArray5[Static179.anInt3793] = null;
			return local18;
		} else if (arg0 == 5000 && Static283.anInt4483 > 0) {
			local18 = Static72.aByteArrayArray6[--Static283.anInt4483];
			Static72.aByteArrayArray6[Static283.anInt4483] = null;
			return local18;
		} else if (arg0 == 30000 && Static166.anInt3412 > 0) {
			local18 = Static86.aByteArrayArray15[--Static166.anInt3412];
			Static86.aByteArrayArray15[Static166.anInt3412] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
	public static void method2444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int local10;
		if (arg3 < arg1) {
			for (local10 = arg3; local10 < arg1; local10++) {
				Static196.anIntArrayArray37[local10][arg0] = arg2;
			}
		} else {
			for (local10 = arg1; local10 < arg3; local10++) {
				Static196.anIntArrayArray37[local10][arg0] = arg2;
			}
		}
	}
}
