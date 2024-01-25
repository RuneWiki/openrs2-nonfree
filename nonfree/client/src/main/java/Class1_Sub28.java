import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public final int anInt4495;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "I")
	public int anInt4493;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(II)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4495 = arg0;
		this.anInt4493 = arg1;
	}
}
