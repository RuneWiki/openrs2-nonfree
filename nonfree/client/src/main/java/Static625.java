import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static625 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method8446(@OriginalArg(0) int arg0) {
		Static258.anInt4526 = 100;
		Static329.anInt5459 = arg0;
		Static28.anInt691 = -1;
		Static270.anInt4659 = 3;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)Z")
	public static boolean method8447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static204.method3066(arg1, arg0) || Static316.method4540(arg0, arg1);
	}
}
