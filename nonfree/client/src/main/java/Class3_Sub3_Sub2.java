import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	private int anInt4565 = -1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!gca;)V")
	@Override
	public void method5405(@OriginalArg(1) Class3_Sub20 arg0) {
		arg0.method3028(this.anInt4565);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!fca;Z)V")
	@Override
	public void method5404(@OriginalArg(0) Class3_Sub17 arg0) {
		this.anInt4565 = arg0.method4858();
		arg0.method4888();
		if (arg0.method4888() != 255) {
			arg0.lb--;
			arg0.method4865();
		}
	}
}
