import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class40_Sub3 extends Class40 {

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "[I")
	public final int[] anIntArray825;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "[I")
	public final int[] anIntArray824;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(II[I[I)V")
	public Class40_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray825 = arg2;
		this.anIntArray824 = arg3;
	}
}
