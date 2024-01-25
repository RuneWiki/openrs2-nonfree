import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!ss", name = "J", descriptor = "F")
	public static float aFloat169;

	@OriginalMember(owner = "client!ss", name = "A", descriptor = "[I")
	public static final int[] anIntArray492 = new int[1];

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "[I")
	public static final int[] anIntArray493 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ss", name = "E", descriptor = "Z")
	public static boolean aBoolean649 = true;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!cb;IZIII)V")
	public static void method7596(@OriginalArg(0) Class50 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static57.method861(arg2, arg0, arg1, (long) 0);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V")
	public static void method7597() {
		if (Static459.aClass204_1 != null) {
			Static459.aClass204_1.method4779();
		}
		if (Static405.aThread6 == null) {
			return;
		}
		while (true) {
			try {
				Static405.aThread6.join();
				return;
			} catch (@Pc(18) InterruptedException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(Z)V")
	public static void method7599() {
		@Pc(20) byte[] local20;
		if (Static631.anObject22 == null) {
			@Pc(13) Class15_Sub1_Sub2 local13 = new Class15_Sub1_Sub2();
			local20 = local13.method3208();
			Static631.anObject22 = Static280.method3887(local20);
		}
		if (Static320.anObject23 == null) {
			@Pc(31) Class15_Sub2_Sub2 local31 = new Class15_Sub2_Sub2();
			local20 = local31.method8211();
			Static320.anObject23 = Static280.method3887(local20);
		}
	}
}
