import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class Class1 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!ev;")
	public Class1 aClass1_267;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Lclient!ev;")
	public Class1 aClass1_268;

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "J")
	public long aLong236;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
	public final void method5953() {
		if (this.aClass1_268 != null) {
			this.aClass1_268.aClass1_267 = this.aClass1_267;
			this.aClass1_267.aClass1_268 = this.aClass1_268;
			this.aClass1_268 = null;
			this.aClass1_267 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)Z")
	public final boolean method5956() {
		return this.aClass1_268 != null;
	}
}
