import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class Class4 {

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Lclient!hga;")
	public Class4 aClass4_65;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "Lclient!hga;")
	public Class4 aClass4_66;

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V")
	public final void method8570() {
		if (this.aClass4_65 != null) {
			this.aClass4_65.aClass4_66 = this.aClass4_66;
			this.aClass4_66.aClass4_65 = this.aClass4_65;
			this.aClass4_65 = null;
			this.aClass4_66 = null;
		}
	}
}
