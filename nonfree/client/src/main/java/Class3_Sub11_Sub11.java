import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public final class Class3_Sub11_Sub11 extends Class3_Sub11 {

	@OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
	private int anInt8774;

	@OriginalMember(owner = "client!qea", name = "p", descriptor = "Ljava/lang/String;")
	private String aString115;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5845(this.anInt8774, this.aString115);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt8774 = arg0.method5312();
		this.aString115 = arg0.method5295();
	}
}
