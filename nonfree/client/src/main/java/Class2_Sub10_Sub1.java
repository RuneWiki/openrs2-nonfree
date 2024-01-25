import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
	private int anInt1135;

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
	private int anInt1137;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt1135 = arg0.method8555(-9372);
		this.anInt1137 = arg0.method8555(-9372);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9397(this.anInt1135, this.anInt1137);
	}
}
