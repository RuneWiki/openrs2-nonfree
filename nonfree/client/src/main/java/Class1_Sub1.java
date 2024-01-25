import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "[I")
	public final int[] anIntArray379;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "[I")
	public final int[] anIntArray380;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray379 = arg2;
		this.anIntArray380 = arg3;
	}
}
