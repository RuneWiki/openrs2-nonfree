import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "Lclient!lk;")
	public Class1_Sub2 aClass1_Sub2_58;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Lclient!lk;")
	public Class1_Sub2 aClass1_Sub2_59;

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "J")
	public long aLong185;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	public final void method4198() {
		if (this.aClass1_Sub2_59 != null) {
			this.aClass1_Sub2_59.aClass1_Sub2_58 = this.aClass1_Sub2_58;
			this.aClass1_Sub2_58.aClass1_Sub2_59 = this.aClass1_Sub2_59;
			this.aClass1_Sub2_59 = null;
			this.aClass1_Sub2_58 = null;
		}
	}
}
