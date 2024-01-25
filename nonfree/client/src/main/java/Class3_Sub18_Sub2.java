import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class3_Sub18_Sub2 extends Class3_Sub18 {

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "B")
	private byte aByte63;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "B")
	private byte aByte64;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Ljava/lang/String;")
	private String aString50;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!hr;B)V")
	@Override
	public void method7415(@OriginalArg(0) Class3_Sub26 arg0) {
		if (this.aString50 != null) {
			arg0.aByte66 = this.aByte63;
			arg0.aByte65 = this.aByte64;
		}
		arg0.aString53 = this.aString50;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!dt;I)V")
	@Override
	public void method7416(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aString50 = arg0.method7917();
		if (this.aString50 != null) {
			arg0.method7954();
			this.aByte64 = arg0.method7960();
			this.aByte63 = arg0.method7960();
		}
	}
}
