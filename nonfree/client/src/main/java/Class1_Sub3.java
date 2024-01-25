import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "[I")
	public final int[] anIntArray453;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "[I")
	public final int[] anIntArray454;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray453 = arg2;
		this.anIntArray454 = arg3;
	}
}
