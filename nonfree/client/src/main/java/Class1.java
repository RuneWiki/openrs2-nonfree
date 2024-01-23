import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class Class1 {

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!im;")
	public Class1 aClass1_230;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "J")
	public long aLong205;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "Lclient!im;")
	public Class1 aClass1_231;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Z")
	public final boolean method4439() {
		return this.aClass1_230 != null;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	public final void method4441() {
		if (this.aClass1_230 != null) {
			this.aClass1_230.aClass1_231 = this.aClass1_231;
			this.aClass1_231.aClass1_230 = this.aClass1_230;
			this.aClass1_231 = null;
			this.aClass1_230 = null;
		}
	}
}
