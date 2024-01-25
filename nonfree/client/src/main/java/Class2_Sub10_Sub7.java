import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class2_Sub10_Sub7 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
	private int anInt5355;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt5355 = arg0.method8555(-9372);
		this.aLong172 = arg0.method8590();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9389(this.anInt5355, this.aLong172);
	}
}
