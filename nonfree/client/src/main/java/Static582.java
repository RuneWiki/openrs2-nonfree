import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	public static int anInt8001;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	public static int anInt8003;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "F")
	public static float aFloat171;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLclient!jr;)Lclient!uba;")
	public static Class19_Sub4 method6360(@OriginalArg(1) Class6_Sub12 arg0) {
		return new Class19_Sub4(arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6037(), arg0.method6037(), arg0.method6019());
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)V")
	public static void method6363() {
		@Pc(5) Class330 local5 = Static129.aClass330_17;
		synchronized (Static129.aClass330_17) {
			Static129.aClass330_17.method7680(5);
		}
	}
}
