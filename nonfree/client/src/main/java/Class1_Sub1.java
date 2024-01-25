import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
	public final int[] anIntArray95;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "[I")
	public final int[] anIntArray97;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray95 = arg3;
		this.anIntArray97 = arg2;
	}
}
