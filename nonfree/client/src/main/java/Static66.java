import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "Lclient!nd;")
	public static Class59 aClass59_15 = new Class59(30);

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Lclient!tg;")
	public static Class81 aClass81_555 = Static120.method2057("Registrierter Benutzer");

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "[I")
	public static int[] anIntArray137 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
	public static int anInt1658 = 0;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
	public static int anInt1659 = -1;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_556 = Static120.method2057("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Lclient!tg;")
	public static Class81 aClass81_557 = Static120.method2057("Fertigkeit)2");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!vb;II)Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 method1195(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2) {
		return Static83.method1391(arg1, arg0, arg2) ? Static72.method1260() : null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIII)I")
	public static int method1196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(18) int local18 = arg0 & arg2 - 1;
		@Pc(24) int local24 = arg1 & arg2 - 1;
		@Pc(28) int local28 = arg1 / arg2;
		@Pc(33) int local33 = Static99.method2682(local7, local28);
		@Pc(40) int local40 = Static99.method2682(local7 + 1, local28);
		@Pc(47) int local47 = Static99.method2682(local7, local28 + 1);
		@Pc(56) int local56 = Static99.method2682(local7 + 1, local28 + 1);
		@Pc(63) int local63 = Static96.method1614(local18, local33, local40, arg2);
		@Pc(70) int local70 = Static96.method1614(local18, local47, local56, arg2);
		return Static96.method1614(local24, local63, local70, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!vb;ILclient!vb;)I")
	public static int method1197(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method2965(Static63.anInt1550)) {
			local10++;
		}
		if (arg0.method2965(Static14.anInt291)) {
			local10++;
		}
		if (arg0.method2965(Static107.anInt2357)) {
			local10++;
		}
		if (arg0.method2965(Static19.anInt490)) {
			local10++;
		}
		if (arg0.method2965(Static31.anInt839)) {
			local10++;
		}
		if (arg0.method2965(Static122.anInt2745)) {
			local10++;
		}
		arg0.method2965(Static33.anInt928);
		arg0.method2965(Static72.anInt1734);
		arg0.method2965(Static18.anInt476);
		arg0.method2965(Static85.anInt399);
		arg0.method2965(Static160.anInt3656);
		return local10;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIILclient!fb;IJIIII)Z")
	public static boolean method1198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static122.method2151(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method1199() {
		for (@Pc(10) Class1_Sub2_Sub1_Sub7 local10 = (Class1_Sub2_Sub1_Sub7) Static47.aClass30_8.method1115(); local10 != null; local10 = (Class1_Sub2_Sub1_Sub7) Static47.aClass30_8.method1125()) {
			if (Static44.anInt1086 != local10.anInt3653 || local10.aBoolean153) {
				local10.method3134();
			} else if (local10.anInt3655 <= Static142.anInt3104) {
				local10.method2789(Static149.anInt3336);
				if (local10.aBoolean153) {
					local10.method3134();
				} else {
					Static110.method1957(local10.anInt3653, local10.anInt3646, local10.anInt3651, local10.anInt3658, 60, local10, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public static void method1200() {
		aClass81_555 = null;
		aClass81_556 = null;
		aClass81_557 = null;
		aClass59_15 = null;
		anIntArray137 = null;
	}
}
