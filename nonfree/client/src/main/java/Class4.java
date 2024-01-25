import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class Class4 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "Lclient!cda;")
	public Class4 aClass4_67;

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "Lclient!cda;")
	public Class4 aClass4_68;

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
	public final void method7841() {
		if (this.aClass4_67 != null) {
			this.aClass4_67.aClass4_68 = this.aClass4_68;
			this.aClass4_68.aClass4_67 = this.aClass4_67;
			this.aClass4_67 = null;
			this.aClass4_68 = null;
		}
	}
}
