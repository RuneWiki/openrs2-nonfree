import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	public final int anInt6268;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	public final int anInt6267;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(II)V")
	public Class6_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6268 = arg1;
		this.anInt6267 = arg0;
	}
}
