import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class Class4 {

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!gl;")
	public Class4 aClass4_247;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!gl;")
	public Class4 aClass4_248;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "J")
	public long aLong259;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public final void method5667() {
		if (this.aClass4_248 != null) {
			this.aClass4_248.aClass4_247 = this.aClass4_247;
			this.aClass4_247.aClass4_248 = this.aClass4_248;
			this.aClass4_248 = null;
			this.aClass4_247 = null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z")
	public final boolean method5670() {
		return this.aClass4_248 != null;
	}
}
