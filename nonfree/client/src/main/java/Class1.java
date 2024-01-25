import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class Class1 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!kp;")
	public Class1 aClass1_283;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!kp;")
	public Class1 aClass1_284;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "J")
	public long aLong244;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)Z")
	public final boolean method7979() {
		return this.aClass1_284 != null;
	}

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)V")
	public final void method7983() {
		if (this.aClass1_284 != null) {
			this.aClass1_284.aClass1_283 = this.aClass1_283;
			this.aClass1_283.aClass1_284 = this.aClass1_284;
			this.aClass1_283 = null;
			this.aClass1_284 = null;
		}
	}
}
