import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class Class4 {

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "Lclient!uo;")
	public Class4 aClass4_67;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Lclient!uo;")
	public Class4 aClass4_68;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
	public final void method9473() {
		if (this.aClass4_68 != null) {
			this.aClass4_68.aClass4_67 = this.aClass4_67;
			this.aClass4_67.aClass4_68 = this.aClass4_68;
			this.aClass4_68 = null;
			this.aClass4_67 = null;
		}
	}
}
