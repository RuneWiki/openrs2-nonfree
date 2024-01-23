import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static289 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString196 = "Loading wordpack - ";

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V")
	public static void method4261(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static220.method3435(0, arg1.length - 1, arg0, arg1);
	}
}
