import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "[I")
	public static int[] anIntArray587 = new int[14];

	@OriginalMember(owner = "client!vg", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString212 = "flash3:";

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "[S")
	public static short[] aShortArray86 = new short[] { 15, 35, 19, 2, 36, 31, 44, 42 };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIILclient!km;IJIIII)Z")
	public static boolean method4442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static282.method4274(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(III)Ljava/lang/String;")
	public static String method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - arg1;
		if (local4 < -9) {
			return "<col=ff0000>";
		} else if (local4 < -6) {
			return "<col=ff3000>";
		} else if (local4 < -3) {
			return "<col=ff7000>";
		} else if (local4 < 0) {
			return "<col=ffb000>";
		} else if (local4 > 9) {
			return "<col=00ff00>";
		} else if (local4 > 6) {
			return "<col=40ff00>";
		} else if (local4 > 3) {
			return "<col=80ff00>";
		} else if (local4 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)Lclient!jc;")
	public static Class21 method4444() {
		try {
			return (Class21) Class.forName("Class21_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V")
	public static void method4447(@OriginalArg(1) boolean arg0) {
		Static65.method1149(Static142.anInt2787, Static292.aFloat96, Static105.aFloat50, Static112.aFloat98);
		Static65.method1145(Static250.anInt4601, Static79.anInt1737, arg0);
		Static65.method1146((float) Static284.anInt5151, (float) Static219.anInt4096, (float) Static44.anInt1026);
		Static65.method1150();
		Static70.aFloat38 = Static83.aFloat45;
		Static70.aFloat37 = Static315.aFloat102;
		Static70.aFloat36 = Static126.aFloat35;
		Static160.aClass1_Sub5_Sub18_5 = Static24.aClass1_Sub5_Sub18_1;
	}
}
