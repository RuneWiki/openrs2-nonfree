import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!db", name = "r", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt1684 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt1684 = arg0.method5211();
		this.aByte13 = arg0.method5175();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6023(this.anInt1684, this.aByte13);
	}
}
