import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!lb;")
	public Class1_Sub1 aClass1_Sub1_69;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!lb;")
	public Class1_Sub1 aClass1_Sub1_70;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	public final void method3503() {
		if (this.aClass1_Sub1_70 != null) {
			this.aClass1_Sub1_70.aClass1_Sub1_69 = this.aClass1_Sub1_69;
			this.aClass1_Sub1_69.aClass1_Sub1_70 = this.aClass1_Sub1_70;
			this.aClass1_Sub1_69 = null;
			this.aClass1_Sub1_70 = null;
		}
	}
}
