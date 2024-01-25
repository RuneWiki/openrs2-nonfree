import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Lclient!aq;")
	public Class20_Sub1 aClass20_Sub1_9;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "Lclient!aq;")
	public Class20_Sub1 aClass20_Sub1_10;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public final void method5273() {
		if (this.aClass20_Sub1_10 != null) {
			this.aClass20_Sub1_10.aClass20_Sub1_9 = this.aClass20_Sub1_9;
			this.aClass20_Sub1_9.aClass20_Sub1_10 = this.aClass20_Sub1_10;
			this.aClass20_Sub1_9 = null;
			this.aClass20_Sub1_10 = null;
		}
	}
}
