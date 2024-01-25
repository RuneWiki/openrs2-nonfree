import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class146_Sub1 extends Class146 {

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "[I")
	public final int[] anIntArray345;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "[I")
	public final int[] anIntArray344;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(II[I[I)V")
	public Class146_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray345 = arg2;
		this.anIntArray344 = arg3;
	}
}
