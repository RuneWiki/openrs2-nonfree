import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class Class1 {

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!lc;")
	public Class1 aClass1_95;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "J")
	public long aLong83;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Lclient!lc;")
	public Class1 aClass1_96;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public final void method1825() {
		if (this.aClass1_96 != null) {
			this.aClass1_96.aClass1_95 = this.aClass1_95;
			this.aClass1_95.aClass1_96 = this.aClass1_96;
			this.aClass1_96 = null;
			this.aClass1_95 = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	protected final boolean method1826() {
		return this.aClass1_96 != null;
	}
}
