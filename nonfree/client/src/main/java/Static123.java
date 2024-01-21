import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!p", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_832 = Static38.method685("blinken2:");

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
	public static int anInt2876 = 0;

	@OriginalMember(owner = "client!p", name = "ab", descriptor = "[I")
	public static int[] anIntArray248 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!p", name = "mb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_833 = Static38.method685("Wordpack geladen)3");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	public static void method1925() {
		Static87.aClass17_12.method509();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub22 local7 = null;
		for (@Pc(16) Class2_Sub22 local16 = (Class2_Sub22) Static110.aClass84_6.method2694(); local16 != null; local16 = (Class2_Sub22) Static110.aClass84_6.method2697()) {
			if (local16.anInt3550 == arg1 && local16.anInt3545 == arg4 && arg7 == local16.anInt3557 && arg8 == local16.anInt3546) {
				local7 = local16;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub22();
			local7.anInt3545 = arg4;
			local7.anInt3550 = arg1;
			local7.anInt3557 = arg7;
			local7.anInt3546 = arg8;
			Static13.method210(local7);
			Static110.aClass84_6.method2701(local7);
		}
		local7.anInt3551 = arg3;
		local7.anInt3549 = arg5;
		local7.anInt3552 = arg6;
		local7.anInt3558 = arg0;
		local7.anInt3553 = arg2;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	public static void method1929() {
		aClass6_832 = null;
		aClass6_833 = null;
		anIntArray248 = null;
	}
}
