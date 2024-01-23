import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!nc;")
	public static Class1_Sub9 aClass1_Sub9_2;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt871;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!nc;")
	public static Class1_Sub9 aClass1_Sub9_3;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!kh;")
	private static Class60 aClass60_290 = Static200.method3116("Sorry invited players only)3");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_289 = aClass60_290;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
	public static int[] anIntArray129 = new int[500];

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public static int anInt870 = 0;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_291 = Static200.method3116("(U");

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	public static int anInt874 = 0;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
	public static int[] anIntArray131 = new int[5];

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_292 = Static200.method3116("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Lclient!kh;")
	private static Class60 aClass60_294 = Static200.method3116("Loading sprites )2 ");

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_293 = aClass60_294;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIB)I")
	public static int method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23 = 65536 - Class46.anIntArray225[arg3 * 1024 / arg2] >> 1;
		return (arg0 * (65536 - local23) >> 16) + (arg1 * local23 >> 16);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B[B)V")
	public static void method660(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub9 local10 = new Class1_Sub9(arg0);
		@Pc(14) int local14 = local10.method946();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(22) Class1_Sub10 local22 = new Class1_Sub10();
			@Pc(26) Class60 local26 = local10.method935();
			local22.anInt1611 = local10.method946();
			local22.anInt1614 = local10.method946();
			local22.anInt1609 = local10.method895();
			local22.aClass60_512 = local26.method1813();
			local22.aClass60Array11 = local26.method1807(47);
			Static39.aClass19_5.method620(local22);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)I")
	public static int method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static209.aByteArrayArrayArray13[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static209.aByteArrayArrayArray13[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZIIIII)V")
	public static void method663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 + arg2;
		@Pc(13) int local13 = arg3 - arg2;
		@Pc(23) int local23 = arg5 - arg2;
		@Pc(27) int local27 = arg2 + arg0;
		for (@Pc(29) int local29 = arg4; local29 < local9; local29++) {
			Static104.method1768(arg0, arg5, arg1, Static148.anIntArrayArray78[local29]);
		}
		for (@Pc(45) int local45 = arg3; local45 > local13; local45--) {
			Static104.method1768(arg0, arg5, arg1, Static148.anIntArrayArray78[local45]);
		}
		for (@Pc(61) int local61 = local9; local61 <= local13; local61++) {
			@Pc(67) int[] local67 = Static148.anIntArrayArray78[local61];
			Static104.method1768(arg0, local27, arg1, local67);
			Static104.method1768(local23, arg5, arg1, local67);
		}
	}
}
