import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "Lclient!wca;")
	public Class98_Sub1 aClass98_Sub1_9;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "Lclient!wca;")
	public Class98_Sub1 aClass98_Sub1_10;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
	public final void method7764() {
		if (this.aClass98_Sub1_9 != null) {
			this.aClass98_Sub1_9.aClass98_Sub1_10 = this.aClass98_Sub1_10;
			this.aClass98_Sub1_10.aClass98_Sub1_9 = this.aClass98_Sub1_9;
			this.aClass98_Sub1_9 = null;
			this.aClass98_Sub1_10 = null;
		}
	}
}
