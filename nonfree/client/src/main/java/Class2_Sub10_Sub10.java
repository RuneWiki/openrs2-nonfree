import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class2_Sub10_Sub10 extends Class2_Sub10 {

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
	private int anInt9242 = -1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9391(this.anInt9242);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt9242 = arg0.method8575();
	}
}
