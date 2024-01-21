import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Lclient!ra;")
	public Class4_Sub4 aClass4_Sub4_64;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "Lclient!ra;")
	public Class4_Sub4 aClass4_Sub4_65;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public final void method1944() {
		if (this.aClass4_Sub4_64 != null) {
			this.aClass4_Sub4_64.aClass4_Sub4_65 = this.aClass4_Sub4_65;
			this.aClass4_Sub4_65.aClass4_Sub4_64 = this.aClass4_Sub4_64;
			this.aClass4_Sub4_64 = null;
			this.aClass4_Sub4_65 = null;
		}
	}
}
