import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
	public final int[] anIntArray141;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
	public final int[] anIntArray142;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray141 = arg2;
		this.anIntArray142 = arg3;
	}
}
