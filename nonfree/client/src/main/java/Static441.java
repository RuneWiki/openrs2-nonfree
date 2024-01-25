import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public static int anInt7086;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public static int anInt7087;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public static void method5782(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 1);
		local8.method6229();
	}
}
