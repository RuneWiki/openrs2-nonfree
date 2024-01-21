import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_18;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_19;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray28;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
	public static final int[] anIntArray192 = new int[500];

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
	public static int anInt2552 = 0;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1177 = Static187.method3089("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Lclient!te;")
	public static Class1_Sub3_Sub21 method1754() {
		if (Static120.aClass1_Sub3_Sub21_1 == null) {
			Static120.aClass1_Sub3_Sub21_1 = new Class1_Sub3_Sub21();
		}
		return Static120.aClass1_Sub3_Sub21_1;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIIIIII)V")
	public static void method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 - arg3;
		@Pc(13) int local13 = arg6 - arg3;
		@Pc(17) int local17 = arg1 + arg3;
		@Pc(21) int local21 = arg3 + arg2;
		for (@Pc(27) int local27 = arg2; local27 < local21; local27++) {
			Static74.method1123(arg1, arg0, Static142.anIntArrayArray25[local27], arg6);
		}
		for (@Pc(47) int local47 = arg4; local47 > local9; local47--) {
			Static74.method1123(arg1, arg0, Static142.anIntArrayArray25[local47], arg6);
		}
		for (@Pc(63) int local63 = local21; local63 <= local9; local63++) {
			@Pc(69) int[] local69 = Static142.anIntArrayArray25[local63];
			Static74.method1123(arg1, arg0, local69, local17);
			Static74.method1123(local17, arg5, local69, local13);
			Static74.method1123(local13, arg0, local69, arg6);
		}
	}
}
