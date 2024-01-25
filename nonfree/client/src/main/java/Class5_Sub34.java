import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	public final int anInt4605;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public final int anInt4609;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
	public Class5_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4605 = arg0;
		this.anInt4609 = arg1;
	}
}
