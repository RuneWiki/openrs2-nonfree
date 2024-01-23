import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class Class2 {

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Lclient!qk;")
	public Class2 aClass2_232;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "J")
	public long aLong214;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!qk;")
	public Class2 aClass2_233;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
	public final boolean method4742() {
		return this.aClass2_233 != null;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public final void method4743() {
		if (this.aClass2_233 != null) {
			this.aClass2_233.aClass2_232 = this.aClass2_232;
			this.aClass2_232.aClass2_233 = this.aClass2_233;
			this.aClass2_232 = null;
			this.aClass2_233 = null;
		}
	}
}
