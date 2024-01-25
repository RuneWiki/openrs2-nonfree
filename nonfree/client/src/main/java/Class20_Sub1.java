import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!ed;")
	public Class20_Sub1 aClass20_Sub1_5;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Lclient!ed;")
	public Class20_Sub1 aClass20_Sub1_6;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public final void method418() {
		if (this.aClass20_Sub1_6 != null) {
			this.aClass20_Sub1_6.aClass20_Sub1_5 = this.aClass20_Sub1_5;
			this.aClass20_Sub1_5.aClass20_Sub1_6 = this.aClass20_Sub1_6;
			this.aClass20_Sub1_6 = null;
			this.aClass20_Sub1_5 = null;
		}
	}
}
