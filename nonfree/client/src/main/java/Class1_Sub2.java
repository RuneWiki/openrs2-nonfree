import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "[I")
	public final int[] anIntArray220;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "[I")
	public final int[] anIntArray221;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray220 = arg2;
		this.anIntArray221 = arg3;
	}
}
