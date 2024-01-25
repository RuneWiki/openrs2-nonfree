import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "B")
	private byte aByte110;

	@OriginalMember(owner = "client!mha", name = "p", descriptor = "B")
	private byte aByte111;

	@OriginalMember(owner = "client!mha", name = "k", descriptor = "Ljava/lang/String;")
	private String aString102;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!wr;B)V")
	@Override
	public void method5915(@OriginalArg(0) Class3_Sub56 arg0) {
		if (this.aString102 != null) {
			arg0.aByte148 = this.aByte111;
			arg0.aByte149 = this.aByte110;
		}
		arg0.aString134 = this.aString102;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method5916(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aString102 = arg0.method5306();
		if (this.aString102 != null) {
			arg0.method5322(-108);
			this.aByte110 = arg0.method5288();
			this.aByte111 = arg0.method5288();
		}
	}
}
