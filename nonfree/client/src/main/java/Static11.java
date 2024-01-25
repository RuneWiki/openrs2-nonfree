import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
	public static void method7280(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static540.method7397(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZLclient!pba;)V")
	public static void method7288(@OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub1 arg0) {
		@Pc(11) Class3_Sub30 local11 = (Class3_Sub30) Static66.aClass297_3.method6531((long) arg0.anInt8529);
		if (local11 == null) {
			Static138.method2725(arg0.anIntArray513[0], null, null, arg0.anIntArray512[0], 0, arg0.aByte117, arg0);
		} else {
			local11.method4156();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIII)V")
	public static void method7289(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static191.anInt4134 = arg1;
		Static333.anInt6022 = arg0;
		Static112.anInt2687 = 0;
		Static384.anInt6641 = 0;
	}
}
