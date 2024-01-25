import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt4746 = 0;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!lc;")
	public static final Class126 aClass126_5 = new Class126();

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIII)V")
	public static void method4276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg4) {
			Static94.method2175(arg2, arg1, arg3, arg0);
		} else if (Static6.anInt136 <= arg0 - arg2 && Static275.anInt5244 >= arg0 + arg2 && arg3 - arg4 >= Static32.anInt750 && arg4 + arg3 <= Static112.anInt2485) {
			Static289.method4969(arg1, arg0, arg3, arg2, arg4);
		} else {
			Static229.method4045(arg0, arg2, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Lclient!aq;")
	public static Class10_Sub2 method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub2_2;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method4278() {
		@Pc(5) Class11 local5 = Static190.aClass11_84;
		synchronized (Static190.aClass11_84) {
			Static190.aClass11_84.method214();
		}
		local5 = Static328.aClass11_139;
		synchronized (Static328.aClass11_139) {
			Static328.aClass11_139.method214();
		}
		@Pc(31) Class139 local31 = Static92.aClass139_1;
		synchronized (Static92.aClass139_1) {
			Static92.aClass139_1.method3708();
		}
	}
}
