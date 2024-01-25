import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class Class4 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!fu;")
	public Class4 aClass4_67;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "Lclient!fu;")
	public Class4 aClass4_68;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
	public final void method8713() {
		if (this.aClass4_67 != null) {
			this.aClass4_67.aClass4_68 = this.aClass4_68;
			this.aClass4_68.aClass4_67 = this.aClass4_67;
			this.aClass4_68 = null;
			this.aClass4_67 = null;
		}
	}
}
