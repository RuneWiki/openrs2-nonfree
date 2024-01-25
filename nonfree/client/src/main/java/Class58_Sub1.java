import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "[I")
	public final int[] anIntArray146;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "[I")
	public final int[] anIntArray147;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(II[I[I)V")
	public Class58_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray146 = arg2;
		this.anIntArray147 = arg3;
	}
}
