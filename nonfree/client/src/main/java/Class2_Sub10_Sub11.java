import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class2_Sub10_Sub11 extends Class2_Sub10 {

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "Ljava/lang/String;")
	private String aString101 = null;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "J")
	private long aLong296 = -1L;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9392(this.aLong296, 0, this.aString101);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		if (arg0.method8581(-17416) != 255) {
			arg0.anInt9723--;
			this.aLong296 = arg0.method8590();
		}
		this.aString101 = arg0.method8569();
		if (Static479.aBoolean670) {
			System.out.println("memberhash:" + this.aLong296 + " membername:" + this.aString101);
		}
	}
}
