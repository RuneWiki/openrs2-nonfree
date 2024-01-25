import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ub", name = "Mc", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[5];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
	public static boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	public static void method5639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(6, arg0);
		local8.method1003();
		local8.anInt972 = arg1;
	}
}
