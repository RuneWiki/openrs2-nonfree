import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!se;")
	public Class20_Sub1 aClass20_Sub1_5;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!se;")
	public Class20_Sub1 aClass20_Sub1_6;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public final void method514() {
		if (this.aClass20_Sub1_6 != null) {
			this.aClass20_Sub1_6.aClass20_Sub1_5 = this.aClass20_Sub1_5;
			this.aClass20_Sub1_5.aClass20_Sub1_6 = this.aClass20_Sub1_6;
			this.aClass20_Sub1_5 = null;
			this.aClass20_Sub1_6 = null;
		}
	}
}
