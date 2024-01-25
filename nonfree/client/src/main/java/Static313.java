import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Z")
	public static boolean aBoolean387 = false;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "[I")
	public static final int[] anIntArray465 = new int[2];

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
	public static int anInt5409 = 0;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
	public static int anInt5410 = 0;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZII)V")
	public static void method4457(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static164.anInt3043 = 3;
		Static134.anInt2694 = arg1;
		Static379.method3570(Static438.aClass209_4.aString60, Static438.aClass209_4.anInt5815);
		if (arg0) {
			Static228.method3481("", "");
		} else {
			Static215.method3371();
			Static228.method3481(Static372.aString64, Static329.aString54);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public static void method4459() {
		Static201.aClass39_6.UA(Static200.anInt3837, Static38.aClass135_Sub1_1.aBoolean360 ? Static432.anInt7011 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4460(@OriginalArg(1) String arg0) {
		return Static342.method4812(10, arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIII)Z")
	public static boolean method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static255.method3829(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static31.anInt665;
			@Pc(14) int local14 = arg2 << Static31.anInt665;
			return Static316.method4482(local10 + 1, Static105.aClass149Array1[arg0].l(arg1, arg2) + arg3, local14 + 1) && Static316.method4482(local10 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1 + 1, arg2) + arg3, local14 + 1) && Static316.method4482(local10 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1 + 1, arg2 + 1) + arg3, local14 + Static186.anInt3374 - 1) && Static316.method4482(local10 + 1, Static105.aClass149Array1[arg0].l(arg1, arg2 + 1) + arg3, local14 + Static186.anInt3374 - 1);
		} else {
			return false;
		}
	}
}
