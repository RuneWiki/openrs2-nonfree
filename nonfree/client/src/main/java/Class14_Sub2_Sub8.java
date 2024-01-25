import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class14_Sub2_Sub8 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
	private int anInt8728;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	private int anInt8729;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
	private int anInt8732;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	private int anInt8733;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5426(this.anInt8733, this.anInt8728, this.anInt8729, this.anInt8732);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt8728 = arg0.method5878();
		this.anInt8733 = arg0.method5878();
		this.anInt8729 = arg0.method5866();
		this.anInt8732 = arg0.method5866();
	}
}
