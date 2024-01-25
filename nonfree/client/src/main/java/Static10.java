import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "[I")
	public static int[] anIntArray385;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "Lclient!vo;")
	public static final Class265 aClass265_5 = new Class265("", 16);

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "[I")
	public static final int[] anIntArray386 = new int[2048];

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLclient!jp;)I")
	public static int method4083(@OriginalArg(1) Class1_Sub19_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method2946(2);
		@Pc(19) int local19;
		if (local15 == 0) {
			local19 = 0;
		} else if (local15 == 1) {
			local19 = arg0.method2946(5);
		} else if (local15 == 2) {
			local19 = arg0.method2946(8);
		} else {
			local19 = arg0.method2946(11);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!hm;III)V")
	public static void method4084(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static290.aBoolean449) {
			@Pc(178) Class45 local178 = Static228.anInt5703 == -1 ? null : Static256.aClass136_1.method3016(Static228.anInt5703);
			if (Static55.method767(arg0).method3030() && (Static226.anInt4102 & 0x20) != 0 && (local178 == null || arg0.method2114(Static228.anInt5703, local178.anInt953) != local178.anInt953)) {
				Static213.method3090(0L, Static28.aString5, Static392.aString62 + " -> " + arg0.aString23, arg0.anInt2643, Static313.anInt5165, false, arg0.anInt2660, 10, true, arg0.anInt2631);
			}
			return;
		}
		@Pc(17) String local17;
		for (@Pc(10) int local10 = 9; local10 >= 5; local10--) {
			local17 = Static372.method4834(local10, arg0);
			if (local17 != null) {
				Static213.method3090((long) (local10 + 1), local17, arg0.aString23, arg0.anInt2643, Static447.method5751(local10, arg0), false, arg0.anInt2660, 1004, true, arg0.anInt2631);
			}
		}
		local17 = Static210.method5855(arg0);
		if (local17 != null) {
			Static213.method3090(0L, local17, arg0.aString23, arg0.anInt2643, arg0.anInt2623, false, arg0.anInt2660, 11, true, arg0.anInt2631);
		}
		for (@Pc(80) int local80 = 4; local80 >= 0; local80--) {
			@Pc(87) String local87 = Static372.method4834(local80, arg0);
			if (local87 != null) {
				Static213.method3090((long) (local80 + 1), local87, arg0.aString23, arg0.anInt2643, Static447.method5751(local80, arg0), false, arg0.anInt2660, 20, true, arg0.anInt2631);
			}
		}
		if (!Static55.method767(arg0).method3031()) {
			return;
		}
		if (arg0.aString22 == null) {
			Static213.method3090(0L, Static282.aClass142_69.method3118(Static63.anInt981), "", arg0.anInt2643, -1, false, arg0.anInt2660, 51, true, arg0.anInt2631);
		} else {
			Static213.method3090(0L, arg0.aString22, "", arg0.anInt2643, -1, false, arg0.anInt2660, 51, true, arg0.anInt2631);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I")
	public static int method4089(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IFIFF)F")
	public static float method4094(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static218.aFloatArrayArray5[arg1];
		return local7[2] * arg0 + arg3 * local7[1] + local7[0] * arg2;
	}
}
