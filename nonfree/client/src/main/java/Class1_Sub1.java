import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "[I")
	public final int[] anIntArray213;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "[I")
	public final int[] anIntArray212;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray213 = arg3;
		this.anIntArray212 = arg2;
	}
}
