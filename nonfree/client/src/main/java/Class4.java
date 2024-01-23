import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class Class4 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "J")
	public long aLong200;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!si;")
	public Class4 aClass4_230;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "Lclient!si;")
	public Class4 aClass4_231;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
	public final boolean method4390() {
		return this.aClass4_230 != null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public final void method4391() {
		if (this.aClass4_230 != null) {
			this.aClass4_230.aClass4_231 = this.aClass4_231;
			this.aClass4_231.aClass4_230 = this.aClass4_230;
			this.aClass4_230 = null;
			this.aClass4_231 = null;
		}
	}
}
