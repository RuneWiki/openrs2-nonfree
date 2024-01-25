import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
	public final int[] anIntArray663;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "[I")
	public final int[] anIntArray662;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II[I[I)V")
	public Class74_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray663 = arg3;
		this.anIntArray662 = arg2;
	}
}
