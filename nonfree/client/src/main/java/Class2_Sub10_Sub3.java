import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class2_Sub10_Sub3 extends Class2_Sub10 {

	@OriginalMember(owner = "client!dia", name = "t", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.aString18 = arg0.method8553();
		arg0.method8555(-9372);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.aString126 = this.aString18;
	}
}
