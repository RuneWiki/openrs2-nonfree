import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
	public static int[] anIntArray136 = new int[500];

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "[I")
	public static int[] anIntArray137 = new int[50];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method1014() {
		anIntArray137 = null;
		anIntArray136 = null;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ISJLjava/lang/String;IIILjava/lang/String;)V")
	public static void method1015(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) long arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		if (Static142.aBoolean192 || Static60.anInt1152 >= 500) {
			return;
		}
		Static261.aStringArray34[Static60.anInt1152] = arg6;
		Static35.aStringArray7[Static60.anInt1152] = arg3;
		Static196.anIntArray322[Static60.anInt1152] = arg5 == -1 ? Static240.anInt5014 : arg5;
		Static299.aShortArray93[Static60.anInt1152] = arg1;
		Static100.aLongArray4[Static60.anInt1152] = arg2;
		anIntArray136[Static60.anInt1152] = arg4;
		Static136.anIntArray251[Static60.anInt1152] = arg0;
		Static60.anInt1152++;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public static void method1016() {
		if (!Static26.aBoolean30) {
			return;
		}
		@Pc(12) Class22 local12 = Static172.method2702(Static52.anInt1044, Static161.anInt3204);
		if (local12 != null && local12.anObjectArray7 != null) {
			@Pc(21) Class4_Sub22 local21 = new Class4_Sub22();
			local21.aClass22_15 = local12;
			local21.anObjectArray32 = local12.anObjectArray7;
			Static125.method2089(local21);
		}
		Static26.aBoolean30 = false;
		Static240.anInt5014 = -1;
		Static81.method3274(local12);
	}
}
