import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	public static int anInt5463 = 0;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
	public static void method4704(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg0, 2);
		local8.method2580();
	}
}
