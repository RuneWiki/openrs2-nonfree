import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray13;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "[I")
	public static final int[] anIntArray313 = new int[50];

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIB)V")
	public static void method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(6, arg1);
		local8.method168();
		local8.anInt85 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method2597() {
		@Pc(12) Class140 local12 = Static122.aClass140_66;
		synchronized (Static122.aClass140_66) {
			Static122.aClass140_66.method3813();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)V")
	public static void method2598(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static51.method4583(arg0 - 1L);
			Static51.method4583(1L);
		} else {
			Static51.method4583(arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILclient!ti;Lclient!ti;)V")
	public static void method2605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub1 arg3, @OriginalArg(4) Class5_Sub1 arg4) {
		if (Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static148.method4534(arg0, arg1, arg2);
		}
		Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2].aClass5_Sub1_1 = arg3;
		Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2].aClass5_Sub1_2 = arg4;
	}
}
