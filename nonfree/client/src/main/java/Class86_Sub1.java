import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
	public final int[] anIntArray566;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "[I")
	public final int[] anIntArray567;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(II[I[I)V")
	public Class86_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray566 = arg3;
		this.anIntArray567 = arg2;
	}
}
