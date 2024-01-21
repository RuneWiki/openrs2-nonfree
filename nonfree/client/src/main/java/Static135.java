import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!qh", name = "hb", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!qh", name = "ib", descriptor = "I")
	public static int anInt3166;

	@OriginalMember(owner = "client!qh", name = "yb", descriptor = "Lclient!h;")
	public static Class33 aClass33_13;

	@OriginalMember(owner = "client!qh", name = "Ab", descriptor = "Lclient!bb;")
	public static Class6 aClass6_5;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1093 = Static65.method1172("null");

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	public static int anInt3150 = 0;

	@OriginalMember(owner = "client!qh", name = "db", descriptor = "Lclient!nb;")
	public static Class57 aClass57_22 = new Class57(64);

	@OriginalMember(owner = "client!qh", name = "wb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1094 = Static65.method1172("Standort");

	@OriginalMember(owner = "client!qh", name = "Bb", descriptor = "[Lclient!me;")
	public static Class44_Sub1[] aClass44_Sub1Array1 = new Class44_Sub1[256];

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	public static void method2286() {
		Static8.aClass57_1.method1715();
		Static46.aClass57_12.method1715();
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(Z)V")
	public static void method2311() {
		Static147.aClass28_1.method2585();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static155.aLongArray4[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static162.aLongArray6[local29] = 0L;
		}
		Static64.anInt1665 = 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBIIIII)I")
	public static int method2316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg0;
			arg0 = arg5;
			arg5 = local6;
		}
		@Pc(14) int local14 = arg3 & 0x3;
		if (local14 == 0) {
			return arg2;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 + 1 - arg2 - arg0;
		} else {
			return 1 + 7 - arg5 - arg1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(B)V")
	public static void method2317() {
		aClass44_Sub1Array1 = null;
		aClass33_13 = null;
		aClass6_5 = null;
		aClass46_1094 = null;
		aClass46_1093 = null;
		aClass57_22 = null;
		anIntArray363 = null;
	}
}
