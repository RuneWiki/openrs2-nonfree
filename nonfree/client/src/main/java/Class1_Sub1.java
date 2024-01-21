import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "Lclient!wb;")
	public Class1_Sub1 aClass1_Sub1_59;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "Lclient!wb;")
	public Class1_Sub1 aClass1_Sub1_60;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public final void method1828() {
		if (this.aClass1_Sub1_59 != null) {
			this.aClass1_Sub1_59.aClass1_Sub1_60 = this.aClass1_Sub1_60;
			this.aClass1_Sub1_60.aClass1_Sub1_59 = this.aClass1_Sub1_59;
			this.aClass1_Sub1_59 = null;
			this.aClass1_Sub1_60 = null;
		}
	}
}
