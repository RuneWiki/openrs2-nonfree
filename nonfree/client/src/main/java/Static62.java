import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!lc;")
	public static Class98 aClass98_34;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString32 = "Loading defaults - ";

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public static int anInt1168 = 0;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
	public static int[] anIntArray134 = new int[14];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Lclient!qa;")
	public static Class135 method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass135_1 == null ? null : local7.aClass135_1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method956() {
		aClass98_34 = null;
		aString32 = null;
		anIntArray134 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z")
	public static boolean method957() {
		return Static178.aBoolean216 ? true : Static2.aBoolean2;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!lc;)V")
	public static void method958(@OriginalArg(1) Class98 arg0) {
		Static95.aClass98_57 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method959() {
		Static92.aClass3_1.method2841();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static268.aLongArray14[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static236.aLongArray11[local10] = 0L;
		}
		Static63.anInt1189 = 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static142.method2311(arg4, Static141.anInt2889, Static171.anInt3392);
		@Pc(17) int local17 = Static142.method2311(arg0, Static141.anInt2889, Static171.anInt3392);
		@Pc(23) int local23 = Static142.method2311(arg3, Static154.anInt3126, Static211.anInt4200);
		@Pc(29) int local29 = Static142.method2311(arg2, Static154.anInt3126, Static211.anInt4200);
		@Pc(38) int local38 = Static142.method2311(arg4 + arg6, Static141.anInt2889, Static171.anInt3392);
		@Pc(47) int local47 = Static142.method2311(arg0 - arg6, Static141.anInt2889, Static171.anInt3392);
		@Pc(49) int local49;
		for (local49 = local11; local49 < local38; local49++) {
			Static129.method2127(local29, local23, arg1, Static234.anIntArrayArray40[local49]);
		}
		for (local49 = local17; local49 > local47; local49--) {
			Static129.method2127(local29, local23, arg1, Static234.anIntArrayArray40[local49]);
		}
		@Pc(95) int local95 = Static142.method2311(arg3 + arg6, Static154.anInt3126, Static211.anInt4200);
		@Pc(103) int local103 = Static142.method2311(arg2 - arg6, Static154.anInt3126, Static211.anInt4200);
		for (local49 = local38; local49 <= local47; local49++) {
			@Pc(124) int[] local124 = Static234.anIntArrayArray40[local49];
			Static129.method2127(local95, local23, arg1, local124);
			Static129.method2127(local103, local95, arg5, local124);
			Static129.method2127(local29, local103, arg1, local124);
		}
	}
}
