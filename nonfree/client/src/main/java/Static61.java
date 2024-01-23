import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!ei;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!en;")
	public static Class44 aClass44_5 = new Class44();

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Please remove ";

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
	public static int[] anIntArray129 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "S")
	public static short aShort14 = 256;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString55 = "Hidden";

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString56 = "glow3:";

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method1171(@OriginalArg(0) Class42 arg0) {
		Static119.anInt5238 = arg0.method1254("titlebg");
		Static95.anInt2289 = arg0.method1254("logo");
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class2_Sub5 local7 = new Class2_Sub5();
		local7.anInt386 = arg9;
		local7.anInt391 = arg8;
		local7.anInt392 = arg4;
		local7.anInt385 = arg3;
		local7.anInt394 = arg5;
		local7.anInt390 = arg11;
		local7.anInt397 = arg2;
		local7.anInt396 = arg7;
		local7.anInt387 = arg6;
		local7.anInt395 = arg0;
		local7.anInt384 = arg1;
		local7.anInt393 = arg10;
		aClass44_5.method1358(local7);
	}
}
