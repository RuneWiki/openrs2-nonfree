import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
	public final int[] anIntArray246;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
	public final int[] anIntArray247;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II[I[I)V")
	public Class59_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray246 = arg3;
		this.anIntArray247 = arg2;
	}
}
