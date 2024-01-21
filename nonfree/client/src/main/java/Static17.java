import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_23;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static int anInt654;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Lclient!ab;")
	public static Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array9;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_421 = Static107.method1838("Service unavailable)3");

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!gg;")
	private static Class28 aClass28_422 = Static107.method1838("No reply from loginserver)3");

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "[I")
	public static int[] anIntArray44 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_423 = aClass28_422;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Lclient!gg;")
	public static Class28 aClass28_424 = Static107.method1838("<)4col>");

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_425 = Static107.method1838("b12_full");

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Lclient!gg;")
	public static Class28 aClass28_426 = Static107.method1838("<col=c0ff00>");

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	public static int anInt658 = 0;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "Lclient!gg;")
	public static Class28 aClass28_427 = aClass28_421;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)I")
	public static int method420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(19) int local19 = arg2 & arg0 - 1;
		@Pc(23) int local23 = arg2 / arg0;
		@Pc(28) int local28 = Static38.method713(local23, local7);
		@Pc(40) int local40 = Static38.method713(local23, local7 + 1);
		@Pc(47) int local47 = Static38.method713(local23 + 1, local7);
		@Pc(56) int local56 = Static38.method713(local23 + 1, local7 + 1);
		@Pc(65) int local65 = Static162.method2499(local28, arg0, local13, local40);
		@Pc(72) int local72 = Static162.method2499(local47, arg0, local13, local56);
		return Static162.method2499(local65, arg0, local19, local72);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
	public static void method421(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method422() {
		aClass2_Sub2_2 = null;
		aClass28_422 = null;
		aClass28_425 = null;
		aClass28_427 = null;
		aClass28_421 = null;
		aClass28_423 = null;
		anIntArray44 = null;
		aClass28_426 = null;
		aClass28_424 = null;
		aClass28Array9 = null;
		aClass40_Sub1_23 = null;
	}
}
