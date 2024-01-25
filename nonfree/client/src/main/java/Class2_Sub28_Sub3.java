import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class2_Sub28_Sub3 extends Class2_Sub28 {

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
	private int anInt11122 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!hi;B)V")
	@Override
	public void method9518(@OriginalArg(0) Class2_Sub30 arg0) {
		arg0.method4113(this.anInt11122);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ol;I)V")
	@Override
	public void method9519(@OriginalArg(0) Class2_Sub8 arg0) {
		this.anInt11122 = arg0.method5211();
		arg0.method5203();
		if (arg0.method5203() != 255) {
			arg0.anInt5725--;
			arg0.method5213();
		}
	}
}
