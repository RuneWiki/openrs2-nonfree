import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!ob;")
	public Class1_Sub3 aClass1_Sub3_63;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "Lclient!ob;")
	public Class1_Sub3 aClass1_Sub3_64;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
	public final void method2235() {
		if (this.aClass1_Sub3_63 != null) {
			this.aClass1_Sub3_63.aClass1_Sub3_64 = this.aClass1_Sub3_64;
			this.aClass1_Sub3_64.aClass1_Sub3_63 = this.aClass1_Sub3_63;
			this.aClass1_Sub3_63 = null;
			this.aClass1_Sub3_64 = null;
		}
	}
}
