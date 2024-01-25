import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
	public final int[] anIntArray78;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
	public final int[] anIntArray79;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II[I[I)V")
	public Class38_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray78 = arg2;
		this.anIntArray79 = arg3;
	}
}
