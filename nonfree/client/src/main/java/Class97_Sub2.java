import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class97_Sub2 extends Class97 {

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[I")
	public final int[] anIntArray608;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "[I")
	public final int[] anIntArray609;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(II[I[I)V")
	public Class97_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray608 = arg3;
		this.anIntArray609 = arg2;
	}
}
