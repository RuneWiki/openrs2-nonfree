import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Class4 {

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!v;")
	public Class4 aClass4_123;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "Lclient!v;")
	public Class4 aClass4_124;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "J")
	public long aLong99;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public final void method1999() {
		if (this.aClass4_123 != null) {
			this.aClass4_123.aClass4_124 = this.aClass4_124;
			this.aClass4_124.aClass4_123 = this.aClass4_123;
			this.aClass4_123 = null;
			this.aClass4_124 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Z")
	public final boolean method2002() {
		return this.aClass4_123 != null;
	}
}
