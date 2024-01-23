import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!rh", name = "nb", descriptor = "I")
	public static int anInt4559;

	@OriginalMember(owner = "client!rh", name = "ob", descriptor = "Lclient!ma;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString282 = "Checking for updates - ";

	@OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
	public static int anInt4547 = 0;

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lclient!cc;")
	public static Class26 aClass26_46 = new Class26(2);

	@OriginalMember(owner = "client!rh", name = "ib", descriptor = "Z")
	public static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "[I")
	public static int[] anIntArray487 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
	public static int anInt4556 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
	public static volatile int anInt4557 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	public static void method3753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub3_Sub9 local12 = Static43.method2329(9, arg1);
		local12.method1520();
		local12.anInt2001 = arg0;
		local12.anInt1993 = arg2;
	}
}
