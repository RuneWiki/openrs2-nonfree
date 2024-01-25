import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class2_Sub10_Sub4 extends Class2_Sub10 {

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Ljava/lang/String;")
	private String aString44 = null;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "J")
	private long aLong128 = -1L;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		if (arg0.method8581(-17416) != 255) {
			arg0.anInt9723--;
			this.aLong128 = arg0.method8590();
		}
		this.aString44 = arg0.method8569();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9407(this.aString44, this.aLong128);
	}
}
