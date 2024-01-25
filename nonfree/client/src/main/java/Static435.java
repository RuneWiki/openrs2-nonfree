import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public static int anInt7561 = 0;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
	public static final int[] anIntArray452 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!dc;)V")
	public static void method6599(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (Static367.aClass305_5 == null) {
			return;
		}
		try {
			Static367.aClass305_5.method7509(0L);
			Static367.aClass305_5.method7508(arg1.aByteArray51, arg0, 24);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public static void method6600() {
		if (!Static487.aBoolean596) {
			Static66.aBoolean84 = true;
			Static642.aFloat200 += (-12.0F - Static642.aFloat200) / 2.0F;
			Static487.aBoolean596 = true;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public static void method6602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static300.aClass133_17 == Static431.aClass133_11) {
			if (!Static276.method4535(arg1, false, arg0, 0, 1, 1, 0, -2)) {
				Static276.method4535(arg1, false, arg0, 0, 1, 1, 0, -3);
			}
		} else if (!Static276.method4535(arg1, false, arg0, 0, 1, 1, 0, -3)) {
			Static276.method4535(arg1, false, arg0, 0, 1, 1, 0, -2);
		}
	}
}
