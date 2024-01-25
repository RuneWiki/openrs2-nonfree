import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public final class Class2_Sub34_Sub2 extends Class2_Sub34 {

	@OriginalMember(owner = "client!pea", name = "v", descriptor = "B")
	private byte aByte108;

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "B")
	private byte aByte109;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!nw;B)V")
	@Override
	public void method8955(@OriginalArg(0) Class2_Sub43 arg0) {
		if (this.aString89 != null) {
			arg0.aByte101 = this.aByte109;
			arg0.aByte100 = this.aByte108;
		}
		arg0.aString77 = this.aString89;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!et;Z)V")
	@Override
	public void method8952(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aString89 = arg0.method8569();
		if (this.aString89 != null) {
			arg0.method8581(-17416);
			this.aByte109 = arg0.method8536();
			this.aByte108 = arg0.method8536();
		}
	}
}
