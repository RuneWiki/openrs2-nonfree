import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class2_Sub10_Sub8 extends Class2_Sub10 {

	@OriginalMember(owner = "client!nea", name = "w", descriptor = "Ljava/lang/String;")
	private String aString71 = null;

	@OriginalMember(owner = "client!nea", name = "p", descriptor = "I")
	private int anInt6847 = 0;

	@OriginalMember(owner = "client!nea", name = "s", descriptor = "J")
	private long aLong200 = -1L;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9392(this.aLong200, this.anInt6847, this.aString71);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		if (arg0.method8581(-17416) != 255) {
			arg0.anInt9723--;
			this.aLong200 = arg0.method8590();
		}
		this.aString71 = arg0.method8569();
		this.anInt6847 = arg0.method8575();
		if (Static479.aBoolean670) {
			System.out.println("memberhash:" + this.aLong200 + " membername:" + this.aString71);
		}
	}
}
