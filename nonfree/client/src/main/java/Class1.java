import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class Class1 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!hl;")
	public Class1 aClass1_230;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "J")
	public long aLong201;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "Lclient!hl;")
	public Class1 aClass1_231;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public final void method4742() {
		if (this.aClass1_230 != null) {
			this.aClass1_230.aClass1_231 = this.aClass1_231;
			this.aClass1_231.aClass1_230 = this.aClass1_230;
			this.aClass1_230 = null;
			this.aClass1_231 = null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)Z")
	public final boolean method4743() {
		return this.aClass1_230 != null;
	}
}
