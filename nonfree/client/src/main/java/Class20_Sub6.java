import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class Class20_Sub6 extends Class20 {

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!vh;")
	public Class20_Sub6 aClass20_Sub6_9;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Lclient!vh;")
	public Class20_Sub6 aClass20_Sub6_10;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public final void method7454() {
		if (this.aClass20_Sub6_10 != null) {
			this.aClass20_Sub6_10.aClass20_Sub6_9 = this.aClass20_Sub6_9;
			this.aClass20_Sub6_9.aClass20_Sub6_10 = this.aClass20_Sub6_10;
			this.aClass20_Sub6_9 = null;
			this.aClass20_Sub6_10 = null;
		}
	}
}
