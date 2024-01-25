import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	public static int anInt7108 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method5984(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static492.method7383(arg0, 0, arg1.length - 1, arg1);
	}
}
