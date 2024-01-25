import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!ea;")
	public Class10_Sub3 aClass10_Sub3_5;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!ea;")
	public Class10_Sub3 aClass10_Sub3_6;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public final void method1706() {
		if (this.aClass10_Sub3_5 != null) {
			this.aClass10_Sub3_5.aClass10_Sub3_6 = this.aClass10_Sub3_6;
			this.aClass10_Sub3_6.aClass10_Sub3_5 = this.aClass10_Sub3_5;
			this.aClass10_Sub3_6 = null;
			this.aClass10_Sub3_5 = null;
		}
	}
}
