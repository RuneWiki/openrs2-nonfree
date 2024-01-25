import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
	public final int[] anIntArray237;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
	public final int[] anIntArray238;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray237 = arg3;
		this.anIntArray238 = arg2;
	}
}
