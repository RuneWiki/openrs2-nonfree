import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class Class3 {

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!ns;")
	public Class3 aClass3_299;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!ns;")
	public Class3 aClass3_300;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "J")
	public long aLong277;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z")
	public final boolean method8670() {
		return this.aClass3_299 != null;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V")
	public final void method8671() {
		if (this.aClass3_299 != null) {
			this.aClass3_299.aClass3_300 = this.aClass3_300;
			this.aClass3_300.aClass3_299 = this.aClass3_299;
			this.aClass3_300 = null;
			this.aClass3_299 = null;
		}
	}
}
