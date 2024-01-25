import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class204_Sub2 extends Class204 {

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "[I")
	public final int[] anIntArray469;

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "[I")
	public final int[] anIntArray470;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(II[I[I)V")
	public Class204_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray469 = arg2;
		this.anIntArray470 = arg3;
	}
}
