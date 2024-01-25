import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "[I")
	public final int[] anIntArray34;

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "[I")
	public final int[] anIntArray35;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray34 = arg2;
		this.anIntArray35 = arg3;
	}
}
