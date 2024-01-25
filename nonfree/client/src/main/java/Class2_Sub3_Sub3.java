import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
	private int anInt3384 = -1;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt3384 = arg0.method5211();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6020(this.anInt3384);
	}
}
