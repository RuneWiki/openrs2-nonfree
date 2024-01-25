import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public final class Class181_Sub3 extends Class181 {

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "[I")
	public final int[] anIntArray547;

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "[I")
	public final int[] anIntArray546;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(II[I[I)V")
	public Class181_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray547 = arg2;
		this.anIntArray546 = arg3;
	}
}
