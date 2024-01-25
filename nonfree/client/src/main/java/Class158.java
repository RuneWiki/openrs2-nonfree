import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class158 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public final int anInt4732;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public final int anInt4734;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public final int anInt4733;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public final int anInt4729;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIII)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4732 = arg0;
		this.anInt4734 = arg3;
		this.anInt4733 = arg2;
		this.anInt4729 = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Lclient!mf;")
	public Class158 method4030(@OriginalArg(0) int arg0) {
		return new Class158(this.anInt4732, arg0, this.anInt4733, this.anInt4734);
	}
}
