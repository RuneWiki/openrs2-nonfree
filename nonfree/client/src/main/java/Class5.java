import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class Class5 {

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "J")
	public long aLong278;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Lclient!ds;")
	public Class5 aClass5_299;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Lclient!ds;")
	public Class5 aClass5_300;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
	public final void method9047() {
		if (this.aClass5_299 != null) {
			this.aClass5_299.aClass5_300 = this.aClass5_300;
			this.aClass5_300.aClass5_299 = this.aClass5_299;
			this.aClass5_299 = null;
			this.aClass5_300 = null;
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)Z")
	public final boolean method9048() {
		return this.aClass5_299 != null;
	}
}
