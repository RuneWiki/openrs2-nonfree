import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "[I")
	public final int[] anIntArray182;

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "[I")
	public final int[] anIntArray181;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(II[I[I)V")
	public Class73_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray182 = arg3;
		this.anIntArray181 = arg2;
	}
}
