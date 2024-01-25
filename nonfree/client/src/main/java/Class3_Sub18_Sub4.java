import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class3_Sub18_Sub4 extends Class3_Sub18 {

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
	private int anInt9105 = -1;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!hr;B)V")
	@Override
	public void method7415(@OriginalArg(0) Class3_Sub26 arg0) {
		arg0.method3524(this.anInt9105);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!dt;I)V")
	@Override
	public void method7416(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt9105 = arg0.method7951();
		arg0.method7954();
		if (arg0.method7954() != 255) {
			arg0.anInt9739--;
			arg0.method7946();
		}
	}
}
