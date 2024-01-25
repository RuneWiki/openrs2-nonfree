import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class Class4 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!kb;")
	public Class4 aClass4_25;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!kb;")
	public Class4 aClass4_26;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public final void method7407() {
		if (this.aClass4_26 != null) {
			this.aClass4_26.aClass4_25 = this.aClass4_25;
			this.aClass4_25.aClass4_26 = this.aClass4_26;
			this.aClass4_25 = null;
			this.aClass4_26 = null;
		}
	}
}
