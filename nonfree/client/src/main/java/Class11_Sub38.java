import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class11_Sub38 extends Class11 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
	public final int anInt6048;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	public final int anInt6046;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class11_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6048 = arg0;
		this.anInt6046 = arg1;
	}
}
