import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "[I")
	public static final int[] anIntArray409 = new int[100];

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[5];

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Ljava/lang/String;II)V")
	public static void method4995(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg1, 3);
		local8.method3248();
		local8.aString24 = arg0;
	}
}
