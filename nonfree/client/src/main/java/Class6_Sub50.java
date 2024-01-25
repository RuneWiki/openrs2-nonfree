import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class6_Sub50 extends Class6 {

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
	public int anInt9643;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
	public final int anInt9642;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(II)V")
	public Class6_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9643 = arg1;
		this.anInt9642 = arg0;
	}
}
