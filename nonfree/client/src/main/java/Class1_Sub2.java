import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "[I")
	public final int[] anIntArray367;

	@OriginalMember(owner = "client!mja", name = "e", descriptor = "[I")
	public final int[] anIntArray366;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray367 = arg2;
		this.anIntArray366 = arg3;
	}
}
