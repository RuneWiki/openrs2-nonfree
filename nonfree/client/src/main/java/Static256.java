import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt4945;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
	public static int anInt4948;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Z")
	public static boolean aBoolean362;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	public static int anInt4950 = -1;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString313 = "Use";

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)Z")
	public static boolean method4311(@OriginalArg(0) int arg0) {
		Static262.aBoolean373 = true;
		Static168.anInt3502 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public static void method4312() {
		@Pc(5) Class103 local5 = Static192.aClass103_35;
		synchronized (Static192.aClass103_35) {
			Static192.aClass103_35.method2678();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = Static270.method4496(Static314.anInt6030, arg4, Static142.anInt3103);
		@Pc(22) int local22 = Static270.method4496(Static314.anInt6030, arg6, Static142.anInt3103);
		@Pc(28) int local28 = Static270.method4496(Static168.anInt3509, arg3, Static61.anInt1534);
		@Pc(34) int local34 = Static270.method4496(Static168.anInt3509, arg0, Static61.anInt1534);
		@Pc(42) int local42 = Static270.method4496(Static314.anInt6030, arg4 + arg1, Static142.anInt3103);
		@Pc(51) int local51 = Static270.method4496(Static314.anInt6030, arg6 - arg1, Static142.anInt3103);
		for (@Pc(53) int local53 = local16; local53 < local42; local53++) {
			Static282.method4681(arg2, local28, Static323.anIntArrayArray55[local53], local34);
		}
		for (@Pc(69) int local69 = local22; local69 > local51; local69--) {
			Static282.method4681(arg2, local28, Static323.anIntArrayArray55[local69], local34);
		}
		@Pc(96) int local96 = Static270.method4496(Static168.anInt3509, arg3 + arg1, Static61.anInt1534);
		@Pc(105) int local105 = Static270.method4496(Static168.anInt3509, arg0 - arg1, Static61.anInt1534);
		for (@Pc(107) int local107 = local42; local107 <= local51; local107++) {
			@Pc(113) int[] local113 = Static323.anIntArrayArray55[local107];
			Static282.method4681(arg2, local28, local113, local96);
			Static282.method4681(arg5, local96, local113, local105);
			Static282.method4681(arg2, local105, local113, local34);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public static void method4314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 * Static254.anInt4943 >> 8;
		if (arg0 == -1 && !Static85.aBoolean152) {
			Static79.method1632();
		} else if (arg0 != -1 && (arg0 != Static149.anInt3231 || !Static5.method66()) && local5 != 0 && !Static85.aBoolean152) {
			Static184.method3379(local5, Static226.aClass180_57, arg0);
		}
		Static149.anInt3231 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
	public static int method4315(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
	public static void method4316(@OriginalArg(0) int arg0) {
		Static169.anInt3517 = arg0;
		@Pc(15) Class103 local15 = Static192.aClass103_35;
		synchronized (Static192.aClass103_35) {
			Static192.aClass103_35.method2678();
		}
	}
}
