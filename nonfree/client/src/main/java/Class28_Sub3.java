import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "[I")
	public final int[] anIntArray630;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "[I")
	public final int[] anIntArray629;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(II[I[I)V")
	public Class28_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray630 = arg2;
		this.anIntArray629 = arg3;
	}
}
