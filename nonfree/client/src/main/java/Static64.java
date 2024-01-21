import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gh", name = "pb", descriptor = "J")
	public static long aLong59;

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_475 = Static158.method3034("Untersuchen");

	@OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
	public static int anInt1962 = 0;

	@OriginalMember(owner = "client!gh", name = "T", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_477 = Static158.method3034("Invalid username or password)3");

	@OriginalMember(owner = "client!gh", name = "S", descriptor = "Lclient!ob;")
	public static Class60 aClass60_476 = aClass60_477;

	@OriginalMember(owner = "client!gh", name = "W", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_479 = Static158.method3034("This world is full)3");

	@OriginalMember(owner = "client!gh", name = "U", descriptor = "Lclient!ob;")
	public static Class60 aClass60_478 = aClass60_479;

	@OriginalMember(owner = "client!gh", name = "X", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_480 = Static158.method3034("cross");

	@OriginalMember(owner = "client!gh", name = "ab", descriptor = "[I")
	public static final int[] anIntArray182 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!gh", name = "gb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_481 = Static158.method3034("hitmarks");

	@OriginalMember(owner = "client!gh", name = "hb", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!gh", name = "kb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_482 = Static158.method3034("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!gh", name = "lb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_483 = Static158.method3034("cookieprefix");

	@OriginalMember(owner = "client!gh", name = "mb", descriptor = "[I")
	public static final int[] anIntArray183 = new int[25];

	@OriginalMember(owner = "client!gh", name = "rb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_484 = Static158.method3034("::fps ");

	@OriginalMember(owner = "client!gh", name = "tb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_485 = Static158.method3034("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(BI)I")
	public static int method1471(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class38 local3 = new Class38();
		local3.anInt2373 = arg2 / 128;
		local3.anInt2370 = arg3 / 128;
		local3.anInt2376 = arg4 / 128;
		local3.anInt2377 = arg5 / 128;
		local3.anInt2378 = arg1;
		local3.anInt2369 = arg2;
		local3.anInt2374 = arg3;
		local3.anInt2368 = arg4;
		local3.anInt2382 = arg5;
		local3.anInt2367 = arg6;
		local3.anInt2390 = arg7;
		Static143.aClass38ArrayArray1[arg0][Static143.anIntArray416[arg0]++] = local3;
	}
}
