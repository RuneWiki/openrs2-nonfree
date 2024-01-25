import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class Class1 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Lclient!um;")
	public Class1 aClass1_283;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "J")
	public long aLong392;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!um;")
	public Class1 aClass1_284;

	static {
		new Class306(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	public final void method7525() {
		if (this.aClass1_283 != null) {
			this.aClass1_283.aClass1_284 = this.aClass1_284;
			this.aClass1_284.aClass1_283 = this.aClass1_283;
			this.aClass1_283 = null;
			this.aClass1_284 = null;
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Z")
	public final boolean method7527() {
		return this.aClass1_283 != null;
	}
}
