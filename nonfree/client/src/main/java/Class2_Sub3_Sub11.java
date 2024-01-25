import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
	private int anInt10831;

	@OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
	private int anInt10834;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt10831 = arg0.method5172();
		this.anInt10834 = arg0.method5172();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6027(this.anInt10834, this.anInt10831);
	}
}
