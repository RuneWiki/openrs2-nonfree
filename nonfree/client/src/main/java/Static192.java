import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "Lclient!tq;")
	public static Class191 aClass191_122;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "Lclient!rr;")
	public static Class173 aClass173_4;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	public static int anInt3750;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)I")
	public static int method3450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
	public static void method3451() {
		Static71.aClass146Array1 = null;
		Static339.method5843(-1, Static198.anInt3876, Static136.anInt2829, 0, Static111.anInt2471, 0, 0, 0);
		if (Static71.aClass146Array1 != null) {
			Static303.method5321(-1412584499, Static218.anInt4223, Static71.aClass146Array1, Static163.aClass146_5.anInt4428, Static136.anInt2829, 0, Static339.anInt6733, 0, Static198.anInt3876);
			Static71.aClass146Array1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	public static void method3452() {
		@Pc(1) Class119 local1 = Static287.aClass119_173;
		synchronized (Static287.aClass119_173) {
			Static287.aClass119_173.method3312();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BC)C")
	public static char method3453(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
