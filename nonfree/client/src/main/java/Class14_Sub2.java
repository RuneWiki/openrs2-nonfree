import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
	public final int[] anIntArray405;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "[I")
	public final int[] anIntArray404;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(II[I[I)V")
	public Class14_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray405 = arg2;
		this.anIntArray404 = arg3;
	}
}
