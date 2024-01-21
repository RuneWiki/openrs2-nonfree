import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!df", name = "K", descriptor = "I")
	public static int anInt864;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_276 = Static151.method2243("scrollen:");

	@OriginalMember(owner = "client!df", name = "D", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_279 = Static151.method2243("Please enter your password)3");

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Lclient!mb;")
	public static Class62 aClass62_277 = aClass62_279;

	@OriginalMember(owner = "client!df", name = "J", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_278 = Static151.method2243("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!df", name = "M", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_280 = Static151.method2243("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!df", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIZ)I")
	public static int method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(21) int local21 = arg2;
			arg2 = arg4;
			arg4 = local21;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 7 + 1 - arg5 - arg2;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg3;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIIII)V")
	public static void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static122.anInt2718 <= arg2 && Static153.anInt3279 >= arg2) {
			@Pc(19) int local19 = Static144.method2183(arg3, Static154.anInt3307, Static15.anInt353);
			@Pc(25) int local25 = Static144.method2183(arg1, Static154.anInt3307, Static15.anInt353);
			Static161.method2376(arg0, local19, local25, arg2);
		}
	}
}
