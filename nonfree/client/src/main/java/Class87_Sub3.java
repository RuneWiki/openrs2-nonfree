import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class87_Sub3 extends Class87 {

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "[I")
	public final int[] anIntArray509;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
	public final int[] anIntArray508;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(II[I[I)V")
	public Class87_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray509 = arg2;
		this.anIntArray508 = arg3;
	}
}
