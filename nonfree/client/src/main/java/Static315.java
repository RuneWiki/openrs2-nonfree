import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
	public static int anInt5510;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
	public static int anInt5514 = 0;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
	public static int anInt5518 = 0;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
	public static void method4961(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 17);
		local8.method4132();
	}
}
