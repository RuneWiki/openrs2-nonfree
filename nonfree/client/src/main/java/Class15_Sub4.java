import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Lclient!gq;")
	public Class15_Sub4 aClass15_Sub4_5;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!gq;")
	public Class15_Sub4 aClass15_Sub4_6;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public final void method3711() {
		if (this.aClass15_Sub4_6 != null) {
			this.aClass15_Sub4_6.aClass15_Sub4_5 = this.aClass15_Sub4_5;
			this.aClass15_Sub4_5.aClass15_Sub4_6 = this.aClass15_Sub4_6;
			this.aClass15_Sub4_5 = null;
			this.aClass15_Sub4_6 = null;
		}
	}
}
