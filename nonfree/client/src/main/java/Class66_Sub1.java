import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
	public final int[] anIntArray303;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "[I")
	public final int[] anIntArray305;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II[I[I)V")
	public Class66_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray303 = arg3;
		this.anIntArray305 = arg2;
	}
}
