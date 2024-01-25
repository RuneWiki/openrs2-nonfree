import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class Class1 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!oo;")
	public Class1 aClass1_261;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "J")
	public long aLong237;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Lclient!oo;")
	public Class1 aClass1_262;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public final void method5965() {
		if (this.aClass1_261 != null) {
			this.aClass1_261.aClass1_262 = this.aClass1_262;
			this.aClass1_262.aClass1_261 = this.aClass1_261;
			this.aClass1_262 = null;
			this.aClass1_261 = null;
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)Z")
	public final boolean method5966() {
		return this.aClass1_261 != null;
	}
}
