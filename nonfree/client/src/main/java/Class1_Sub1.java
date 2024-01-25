import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "[I")
	public final int[] anIntArray73;

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "[I")
	public final int[] anIntArray74;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray73 = arg2;
		this.anIntArray74 = arg3;
	}
}
