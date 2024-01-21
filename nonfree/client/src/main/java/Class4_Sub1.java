import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CYIKEZWP")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!CYIKEZWP", name = "f", descriptor = "Lclient!CYIKEZWP;")
	public Class4_Sub1 aClass4_Sub1_36;

	@OriginalMember(owner = "client!CYIKEZWP", name = "g", descriptor = "Lclient!CYIKEZWP;")
	public Class4_Sub1 aClass4_Sub1_37;

	@OriginalMember(owner = "client!CYIKEZWP", name = "b", descriptor = "()V")
	public final void method529() {
		if (this.aClass4_Sub1_37 != null) {
			this.aClass4_Sub1_37.aClass4_Sub1_36 = this.aClass4_Sub1_36;
			this.aClass4_Sub1_36.aClass4_Sub1_37 = this.aClass4_Sub1_37;
			this.aClass4_Sub1_36 = null;
			this.aClass4_Sub1_37 = null;
		}
	}
}
