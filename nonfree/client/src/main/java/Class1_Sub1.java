import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!lb;")
	public Class1_Sub1 aClass1_Sub1_63;

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "Lclient!lb;")
	public Class1_Sub1 aClass1_Sub1_64;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public final void method1855() {
		if (this.aClass1_Sub1_64 != null) {
			this.aClass1_Sub1_64.aClass1_Sub1_63 = this.aClass1_Sub1_63;
			this.aClass1_Sub1_63.aClass1_Sub1_64 = this.aClass1_Sub1_64;
			this.aClass1_Sub1_64 = null;
			this.aClass1_Sub1_63 = null;
		}
	}
}
