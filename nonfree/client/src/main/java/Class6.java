import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class Class6 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "J")
	public long aLong278;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!gda;")
	public Class6 aClass6_299;

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "Lclient!gda;")
	public Class6 aClass6_300;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
	public final boolean method8791() {
		return this.aClass6_299 != null;
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)V")
	public final void method8792() {
		if (this.aClass6_299 != null) {
			this.aClass6_299.aClass6_300 = this.aClass6_300;
			this.aClass6_300.aClass6_299 = this.aClass6_299;
			this.aClass6_299 = null;
			this.aClass6_300 = null;
		}
	}
}
