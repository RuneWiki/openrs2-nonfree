import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class Class1 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!fb;")
	public Class1 aClass1_247;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "J")
	public long aLong214;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!fb;")
	public Class1 aClass1_248;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public final void method5796() {
		if (this.aClass1_248 != null) {
			this.aClass1_248.aClass1_247 = this.aClass1_247;
			this.aClass1_247.aClass1_248 = this.aClass1_248;
			this.aClass1_247 = null;
			this.aClass1_248 = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Z")
	public final boolean method5797() {
		return this.aClass1_248 != null;
	}
}
