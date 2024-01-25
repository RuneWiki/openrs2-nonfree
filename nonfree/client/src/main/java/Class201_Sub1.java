import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class201_Sub1 extends Class201 {

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "[I")
	public final int[] anIntArray685;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "[I")
	public final int[] anIntArray687;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(II[I[I)V")
	public Class201_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray685 = arg2;
		this.anIntArray687 = arg3;
	}
}
