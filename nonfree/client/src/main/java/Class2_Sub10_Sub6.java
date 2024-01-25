import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class2_Sub10_Sub6 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
	private int anInt5058;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Ljava/lang/String;")
	private String aString57;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9399(this.aString57, this.anInt5058);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt5058 = arg0.method8555(-9372);
		this.aString57 = arg0.method8553();
	}
}
