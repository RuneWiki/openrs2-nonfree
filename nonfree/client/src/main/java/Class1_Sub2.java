import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "[I")
	public final int[] anIntArray499;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "[I")
	public final int[] anIntArray500;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray499 = arg3;
		this.anIntArray500 = arg2;
	}
}
