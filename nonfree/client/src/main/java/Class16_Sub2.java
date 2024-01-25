import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
	public final int[] anIntArray434;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
	public final int[] anIntArray433;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(II[I[I)V")
	public Class16_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray434 = arg2;
		this.anIntArray433 = arg3;
	}
}
