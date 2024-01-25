import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	public final int anInt6261;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
	public final int anInt6260;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class2_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6261 = arg0;
		this.anInt6260 = arg1;
	}
}
