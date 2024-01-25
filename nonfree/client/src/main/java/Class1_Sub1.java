import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "[I")
	public final int[] anIntArray101;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray102 = arg2;
		this.anIntArray101 = arg3;
	}
}
