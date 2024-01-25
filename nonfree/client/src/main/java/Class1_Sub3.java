import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
	public final int[] anIntArray548;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
	public final int[] anIntArray549;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray548 = arg3;
		this.anIntArray549 = arg2;
	}
}
