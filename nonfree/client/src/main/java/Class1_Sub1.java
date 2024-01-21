import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!x")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!x", name = "e", descriptor = "Lclient!x;")
	public Class1_Sub1 aClass1_Sub1_33;

	@OriginalMember(owner = "client!x", name = "f", descriptor = "Lclient!x;")
	public Class1_Sub1 aClass1_Sub1_34;

	@OriginalMember(owner = "client!x", name = "b", descriptor = "()V")
	public final void method488() {
		if (this.aClass1_Sub1_34 != null) {
			this.aClass1_Sub1_34.aClass1_Sub1_33 = this.aClass1_Sub1_33;
			this.aClass1_Sub1_33.aClass1_Sub1_34 = this.aClass1_Sub1_34;
			this.aClass1_Sub1_33 = null;
			this.aClass1_Sub1_34 = null;
		}
	}
}
