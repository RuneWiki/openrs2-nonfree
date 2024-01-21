import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!bd;")
	public Class1_Sub1 aClass1_Sub1_69;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!bd;")
	public Class1_Sub1 aClass1_Sub1_70;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
	public final void method3147() {
		if (this.aClass1_Sub1_70 != null) {
			this.aClass1_Sub1_70.aClass1_Sub1_69 = this.aClass1_Sub1_69;
			this.aClass1_Sub1_69.aClass1_Sub1_70 = this.aClass1_Sub1_70;
			this.aClass1_Sub1_70 = null;
			this.aClass1_Sub1_69 = null;
		}
	}
}
