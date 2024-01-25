import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
	public final int[] anIntArray365;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "[I")
	public final int[] anIntArray366;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II[I[I)V")
	public Class74_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray365 = arg3;
		this.anIntArray366 = arg2;
	}
}
