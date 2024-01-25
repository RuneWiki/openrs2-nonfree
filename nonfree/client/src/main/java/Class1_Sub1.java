import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "[I")
	public final int[] anIntArray343;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
	public final int[] anIntArray345;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray343 = arg3;
		this.anIntArray345 = arg2;
	}
}
