import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!pc;")
	public Class32_Sub3 aClass32_Sub3_5;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!pc;")
	public Class32_Sub3 aClass32_Sub3_6;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public final void method2578() {
		if (this.aClass32_Sub3_6 != null) {
			this.aClass32_Sub3_6.aClass32_Sub3_5 = this.aClass32_Sub3_5;
			this.aClass32_Sub3_5.aClass32_Sub3_6 = this.aClass32_Sub3_6;
			this.aClass32_Sub3_6 = null;
			this.aClass32_Sub3_5 = null;
		}
	}
}
