import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class3_Sub11_Sub6 extends Class3_Sub11 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aString63 = arg0.method5295();
		arg0.method5312();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.aString101 = this.aString63;
	}
}
