import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class Class1 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "J")
	public long aLong202;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!tf;")
	public Class1 aClass1_230;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!tf;")
	public Class1 aClass1_231;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public final void method4534() {
		if (this.aClass1_231 != null) {
			this.aClass1_231.aClass1_230 = this.aClass1_230;
			this.aClass1_230.aClass1_231 = this.aClass1_231;
			this.aClass1_231 = null;
			this.aClass1_230 = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Z")
	public final boolean method4536() {
		return this.aClass1_231 != null;
	}
}
