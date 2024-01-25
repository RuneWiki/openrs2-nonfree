import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "Lclient!oia;")
	public static Class251 aClass251_2;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIILclient!ha;IIII)V")
	public static void method3948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		Static366.aClass82_11 = arg2;
		Static376.aClass31_44 = Static366.aClass82_11.method6170();
		Static122.aClass31_11 = Static366.aClass82_11.method6170();
		Static133.aClass31_43 = Static366.aClass82_11.method6170();
		Static38.anInt732 = 0;
		Static557.anInt9256 = arg3;
		Static424.anInt7715 = 1;
		Static126.anInt2688 = arg0;
		Static370.anInt6779 = 2;
		Static605.anInt9788 = 2;
		Static229.anInt4626 = 0;
		Static115.anInterface7_2 = null;
		Static438.method6621(arg4, arg1);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!uu;ILclient!uu;)V")
	public static void method3949(@OriginalArg(1) Class343 arg0, @OriginalArg(3) Class343 arg1) {
		Static226.aClass343_114 = arg0;
		Static12.aClass343_14 = arg1;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)Z")
	public static boolean method3950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static7.method111(arg1, arg0) | (arg0 & 0x800) != 0 || Static354.method5710(arg1, arg0);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I")
	public static int method3951() {
		return Static17.method255(false);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)V")
	public static void method3952(@OriginalArg(0) boolean arg0) {
		Static459.method6810(Static330.anInt6254, Static190.anInt3576, Static528.anInt8950, arg0);
	}
}
