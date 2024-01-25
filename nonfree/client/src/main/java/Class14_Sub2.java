import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "Lclient!fda;")
	public Class14_Sub2 aClass14_Sub2_9;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "Lclient!fda;")
	public Class14_Sub2 aClass14_Sub2_10;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public final void method3776() {
		if (this.aClass14_Sub2_10 != null) {
			this.aClass14_Sub2_10.aClass14_Sub2_9 = this.aClass14_Sub2_9;
			this.aClass14_Sub2_9.aClass14_Sub2_10 = this.aClass14_Sub2_10;
			this.aClass14_Sub2_9 = null;
			this.aClass14_Sub2_10 = null;
		}
	}
}
