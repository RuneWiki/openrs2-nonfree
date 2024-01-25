import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Lclient!jn;")
	public Class38_Sub2 aClass38_Sub2_5;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Lclient!jn;")
	public Class38_Sub2 aClass38_Sub2_6;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public final void method1237() {
		if (this.aClass38_Sub2_6 != null) {
			this.aClass38_Sub2_6.aClass38_Sub2_5 = this.aClass38_Sub2_5;
			this.aClass38_Sub2_5.aClass38_Sub2_6 = this.aClass38_Sub2_6;
			this.aClass38_Sub2_6 = null;
			this.aClass38_Sub2_5 = null;
		}
	}
}
