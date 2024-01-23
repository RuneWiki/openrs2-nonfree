import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!o;")
	public Class21_Sub2 aClass21_Sub2_5;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Lclient!o;")
	public Class21_Sub2 aClass21_Sub2_6;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public final void method4642() {
		if (this.aClass21_Sub2_6 != null) {
			this.aClass21_Sub2_6.aClass21_Sub2_5 = this.aClass21_Sub2_5;
			this.aClass21_Sub2_5.aClass21_Sub2_6 = this.aClass21_Sub2_6;
			this.aClass21_Sub2_6 = null;
			this.aClass21_Sub2_5 = null;
		}
	}
}
