import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class Class1 {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!gk;")
	public Class1 aClass1_251;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "J")
	public long aLong217;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Lclient!gk;")
	public Class1 aClass1_252;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public final void method6045() {
		if (this.aClass1_252 != null) {
			this.aClass1_252.aClass1_251 = this.aClass1_251;
			this.aClass1_251.aClass1_252 = this.aClass1_252;
			this.aClass1_251 = null;
			this.aClass1_252 = null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Z")
	public final boolean method6047() {
		return this.aClass1_252 != null;
	}
}
