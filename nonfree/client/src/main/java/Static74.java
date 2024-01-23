import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!gj", name = "Db", descriptor = "J")
	public static long aLong58;

	@OriginalMember(owner = "client!gj", name = "cc", descriptor = "Lclient!qg;")
	public static Class1_Sub24 aClass1_Sub24_1;

	@OriginalMember(owner = "client!gj", name = "Mb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_494 = Static186.method3527("<col=ff3000>");

	@OriginalMember(owner = "client!gj", name = "Nb", descriptor = "I")
	public static int anInt1501 = 0;

	@OriginalMember(owner = "client!gj", name = "Tb", descriptor = "Z")
	public static boolean aBoolean69 = true;

	@OriginalMember(owner = "client!gj", name = "ec", descriptor = "S")
	public static short aShort7 = 32767;

	@OriginalMember(owner = "client!gj", name = "gc", descriptor = "Lclient!hh;")
	public static Class50 aClass50_495 = Static186.method3527("null");

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIIIIII)V")
	public static void method1090(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = Static92.method1433(Static49.anInt1030, arg4, Static177.anInt3701);
		@Pc(22) int local22 = Static92.method1433(Static49.anInt1030, arg3, Static177.anInt3701);
		@Pc(28) int local28 = Static92.method1433(Static131.anInt2713, arg0, Static135.anInt2790);
		@Pc(34) int local34 = Static92.method1433(Static131.anInt2713, arg5, Static135.anInt2790);
		@Pc(43) int local43 = Static92.method1433(Static49.anInt1030, arg4 + arg2, Static177.anInt3701);
		@Pc(52) int local52 = Static92.method1433(Static49.anInt1030, arg3 - arg2, Static177.anInt3701);
		for (@Pc(54) int local54 = local16; local54 < local43; local54++) {
			Static107.method1641(local28, arg1, Static139.anIntArrayArray21[local54], local34);
		}
		for (@Pc(74) int local74 = local22; local74 > local52; local74--) {
			Static107.method1641(local28, arg1, Static139.anIntArrayArray21[local74], local34);
		}
		@Pc(96) int local96 = Static92.method1433(Static131.anInt2713, arg2 + arg0, Static135.anInt2790);
		@Pc(104) int local104 = Static92.method1433(Static131.anInt2713, arg5 - arg2, Static135.anInt2790);
		for (@Pc(106) int local106 = local43; local106 <= local52; local106++) {
			@Pc(112) int[] local112 = Static139.anIntArrayArray21[local106];
			Static107.method1641(local28, arg1, local112, local96);
			Static107.method1641(local96, arg6, local112, local104);
			Static107.method1641(local104, arg1, local112, local34);
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)Lclient!mj;")
	public static Class1_Sub1_Sub13 method1093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class1_Sub1_Sub13 local19 = (Class1_Sub1_Sub13) Static144.aClass90_13.method2819((long) arg0 << 32 | (long) arg1);
		if (local19 == null) {
			local19 = new Class1_Sub1_Sub13(arg0, arg1);
			Static144.aClass90_13.method2817(local19, local19.aLong173);
		}
		return local19;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIILclient!pa;III)V")
	public static void method1094(@OriginalArg(1) int arg0, @OriginalArg(3) Class86 arg1, @OriginalArg(6) int arg2) {
		Static109.anInt2171 = 2;
		Static92.aBoolean83 = false;
		Static85.anInt1755 = 0;
		Static19.anInt400 = 1;
		Static67.anInt1302 = arg0;
		Static63.anInt1254 = arg2;
		Static218.aClass86_68 = arg1;
	}
}
