import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
	public final int[] anIntArray18;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "[I")
	public final int[] anIntArray19;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II[I[I)V")
	public Class8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray18 = arg2;
		this.anIntArray19 = arg3;
	}
}
