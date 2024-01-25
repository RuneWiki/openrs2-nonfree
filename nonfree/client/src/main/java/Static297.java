import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	public static int anInt6012;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!t", name = "q", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!tq;Lclient!tq;)V")
	public static void method5243(@OriginalArg(1) Class191 arg0, @OriginalArg(2) Class191 arg1) {
		Static182.aClass191_114 = arg1;
		Static342.aClass191_220 = arg0;
		Static123.anInt2653 = Static342.aClass191_220.method5443(3);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)I")
	public static int method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static70.method1573(arg1 - 1, arg0 + -1) + Static70.method1573(arg1 + 1, arg0 + -1) + Static70.method1573(arg1 + -1, arg0 + 1) + Static70.method1573(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static70.method1573(arg1 - 1, arg0) + Static70.method1573(arg1 + 1, arg0) + Static70.method1573(arg1, arg0 - 1) + Static70.method1573(arg1, arg0 + 1);
		@Pc(81) int local81 = Static70.method1573(arg1, arg0);
		return local46 / 16 + local76 / 8 + local81 / 4;
	}
}
