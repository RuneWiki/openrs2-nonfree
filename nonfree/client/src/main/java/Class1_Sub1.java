import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!ad;")
	public Class1_Sub1 aClass1_Sub1_69;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "Lclient!ad;")
	public Class1_Sub1 aClass1_Sub1_70;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public final void method3149() {
		if (this.aClass1_Sub1_69 != null) {
			this.aClass1_Sub1_69.aClass1_Sub1_70 = this.aClass1_Sub1_70;
			this.aClass1_Sub1_70.aClass1_Sub1_69 = this.aClass1_Sub1_69;
			this.aClass1_Sub1_69 = null;
			this.aClass1_Sub1_70 = null;
		}
	}
}
