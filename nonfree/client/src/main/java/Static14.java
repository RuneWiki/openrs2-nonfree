import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ao", name = "U", descriptor = "Lclient!ne;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "[I")
	public static final int[] anIntArray51 = new int[14];

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "Lclient!vg;")
	public static Class201 aClass201_1 = null;

	@OriginalMember(owner = "client!ao", name = "fb", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V")
	public static void method276() {
		for (@Pc(10) Class5_Sub22 local10 = (Class5_Sub22) Static28.aClass103_21.method2756(); local10 != null; local10 = (Class5_Sub22) Static28.aClass103_21.method2748()) {
			if (local10.anInt2663 == -1) {
				local10.anInt2670 = 0;
				Static148.method2695(local10);
			} else {
				local10.method6005();
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V")
	public static void method277(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 1);
		local8.method856();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)Z")
	public static boolean method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static318.anIntArrayArrayArray10[arg0][arg1][arg2];
		if (local7 == -Static197.anInt3912) {
			return false;
		} else if (local7 == Static197.anInt3912) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static72.method1326(local22 + 1, Static8.aClass51Array1[arg0].method1856(arg1, arg2), local26 + 1) && Static72.method1326(local22 + 128 - 1, Static8.aClass51Array1[arg0].method1856(arg1 + 1, arg2), local26 + 1) && Static72.method1326(local22 + 128 - 1, Static8.aClass51Array1[arg0].method1856(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static72.method1326(local22 + 1, Static8.aClass51Array1[arg0].method1856(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static318.anIntArrayArrayArray10[arg0][arg1][arg2] = Static197.anInt3912;
				return true;
			} else {
				Static318.anIntArrayArrayArray10[arg0][arg1][arg2] = -Static197.anInt3912;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	public static void method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(14) int local14 = arg2 + arg3;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static160.method2840(arg1, arg0, arg5, Static129.anIntArrayArray46[local16]);
		}
		for (@Pc(38) int local38 = arg4; local38 > local10; local38--) {
			Static160.method2840(arg1, arg0, arg5, Static129.anIntArrayArray46[local38]);
		}
		@Pc(57) int local57 = arg0 - arg2;
		@Pc(62) int local62 = arg5 + arg2;
		for (@Pc(64) int local64 = local14; local64 <= local10; local64++) {
			@Pc(70) int[] local70 = Static129.anIntArrayArray46[local64];
			Static160.method2840(arg1, local62, arg5, local70);
			Static160.method2840(arg1, arg0, local57, local70);
		}
	}

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V")
	public static void method280() {
		if (Static210.anInt4168 != 3) {
			Static48.anInt918 = -1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(B)V")
	public static void method282() {
		@Pc(8) int[] local8 = new int[Static102.anInt1937];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static102.anInt1937; local12++) {
			@Pc(18) Class130 local18 = Static322.method544(local12);
			if (local18.anInt3840 >= 0 || local18.anInt3838 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static47.anIntArray85 = new int[local10];
		for (@Pc(48) int local48 = 0; local48 < local10; local48++) {
			Static47.anIntArray85[local48] = local8[local48];
		}
	}

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "(I)V")
	public static void method283() {
		Static291.aClass55_11.method5235(Static234.aFloat57, Static5.aFloat1, Static316.aFloat59);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!ij;)V")
	public static void method284(@OriginalArg(1) Class93 arg0) {
		Static242.aClass93_91 = arg0;
		Static242.aClass93_91.method2418(35);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Lclient!ae;")
	public static Class6_Sub1 method286(@OriginalArg(1) int arg0) {
		return Static244.aBoolean410 && Static84.anInt4253 <= arg0 && arg0 <= Static284.anInt5595 ? Static1.aClass6_Sub1Array1[arg0 - Static84.anInt4253] : null;
	}
}
