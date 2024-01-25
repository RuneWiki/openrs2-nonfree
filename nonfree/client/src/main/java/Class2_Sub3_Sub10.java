import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
	private int anInt9549 = -1;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6013(this.anInt9549);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt9549 = arg0.method5211();
	}
}
