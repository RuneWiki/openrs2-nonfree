import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!op", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[200];

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "[I")
	public static final int[] anIntArray567 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5583(@OriginalArg(1) String arg0) {
		Static536.method7668("", 0, arg0, "", 4, "");
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(Z)V")
	public static void method5584() {
		Static308.method5029(false);
		if (Static484.anInt8684 >= 0 && Static484.anInt8684 != 0) {
			Static269.method4698(Static484.anInt8684);
			Static484.anInt8684 = -1;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
	public static void method5585() {
		Static421.aClass125_50.method3522(50);
		Static383.aClass125_39.method3522(50);
		Static527.aClass125_68.method3522(50);
		Static549.aClass125_72.method3522(50);
		Static103.aClass125_14.method3522(50);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method5586() {
		Static36.aClass245Array1 = null;
		Static214.method3929(Static412.anInt7547, 0, Static422.anInt8667, 0, Static480.anInt8652, -1, 0, 0);
		if (Static36.aClass245Array1 != null) {
			Static461.method6875(Static143.aClass245_6.anInt7253, Static265.anInt5513, -1412584499, 0, 0, Static480.anInt8652, Static412.anInt7547, Static447.anInt8186, Static36.aClass245Array1);
			Static36.aClass245Array1 = null;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZII)I")
	public static int method5588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return arg1;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}
