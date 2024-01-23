import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt2665 = 0;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString160 = "Allocating memory";

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString161 = "K";

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V")
	public static void method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static31.anInt525 = arg3;
		Static195.anInt3731 = arg4;
		Static240.anInt4559 = arg2;
		Static230.anInt4404 = arg0;
		Static164.anInt3258 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2080(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class4_Sub3_Sub9 local13 = Static43.method2329(3, arg0);
		local13.method1520();
		local13.aString109 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V")
	public static void method2082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class189 local4 = Static152.method2432(arg5, arg3);
		if (local4 != null && local4.anObjectArray13 != null) {
			@Pc(15) Class4_Sub13 local15 = new Class4_Sub13();
			local15.anObjectArray2 = local4.anObjectArray13;
			local15.aClass189_7 = local4;
			Static135.method2020(local15);
		}
		Static135.aBoolean177 = true;
		Static313.anInt6054 = arg2;
		Static218.anInt4225 = arg1;
		Static71.anInt1367 = arg3;
		Static237.anInt4467 = arg4;
		Static21.anInt1053 = arg5;
		Static187.anInt3560 = arg0;
		Static205.method3283(local4);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public static void method2083() {
		Static293.aClass26_56.method517(5);
	}
}
