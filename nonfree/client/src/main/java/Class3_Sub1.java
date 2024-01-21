import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Lclient!wb;")
	public Class3_Sub1 aClass3_Sub1_59;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "Lclient!wb;")
	public Class3_Sub1 aClass3_Sub1_60;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public final void method1839() {
		if (this.aClass3_Sub1_60 != null) {
			this.aClass3_Sub1_60.aClass3_Sub1_59 = this.aClass3_Sub1_59;
			this.aClass3_Sub1_59.aClass3_Sub1_60 = this.aClass3_Sub1_60;
			this.aClass3_Sub1_60 = null;
			this.aClass3_Sub1_59 = null;
		}
	}
}
