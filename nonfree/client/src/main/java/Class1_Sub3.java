import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "[I")
	public final int[] anIntArray606;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "[I")
	public final int[] anIntArray605;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray606 = arg2;
		this.anIntArray605 = arg3;
	}
}
