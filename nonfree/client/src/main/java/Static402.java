import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static int anInt7653 = 0;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "[I")
	public static final int[] anIntArray491 = new int[4];

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_157 = new Class215(68, 6);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)Z")
	public static boolean method6560(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!mi;ILclient!at;Lclient!aa;III)V")
	public static void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static496.anInt9165 == 4) {
			local17 = (int) Static72.aFloat68 & 0x3FFF;
		} else {
			local17 = (int) Static72.aFloat68 + Static563.anInt10146 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg3.anInt441 / 2, arg3.anInt488 / 2) + 10;
		@Pc(45) int local45 = arg6 * arg6 + arg5 * arg5;
		if (local36 * local36 < local45) {
			return;
		}
		@Pc(55) int local55 = Class177.anIntArray361[local17];
		@Pc(59) int local59 = Class177.anIntArray360[local17];
		if (Static496.anInt9165 != 4) {
			local59 = local59 * 256 / (Static183.anInt4411 + 256);
			local55 = local55 * 256 / (Static183.anInt4411 + 256);
		}
		@Pc(88) int local88 = arg6 * local59 + arg5 * local55 >> 14;
		@Pc(99) int local99 = arg5 * local59 - local55 * arg6 >> 14;
		arg1.method6202(local88 + arg3.anInt441 / 2 + arg2 - arg1.method6205() / 2, arg0 - -(arg3.anInt488 / 2) + -local99 + -(arg1.method6219() / 2), arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
	public static void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223() * arg0 >> 8;
		if (arg1 == -1 && !Static301.aBoolean468) {
			Static348.method5947();
		} else if (arg1 != -1 && (arg1 != Static580.anInt10350 || !Static425.method6833()) && local12 != 0 && !Static301.aBoolean468) {
			Static239.method4462(local12, arg1, Static100.aClass157_64, arg2);
			Static75.method2188();
		}
		if (Static580.anInt10350 != arg1) {
			Static490.aClass2_Sub8_Sub3_6 = null;
		}
		Static580.anInt10350 = arg1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method6563(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static291.anInt6172 = -1;
		Static26.anInt543 = 1;
		Static380.method6293(arg0, false, arg1);
	}
}
