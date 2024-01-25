import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static600 {

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)I")
	public static int method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static565.aShortArrayArray14 == null ? 0 : Static565.aShortArrayArray14[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "()V")
	public static void method3512() {
		Static157.method2654(Static218.anInt4559);
	}
}
