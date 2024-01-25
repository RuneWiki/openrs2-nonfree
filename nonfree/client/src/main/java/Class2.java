import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class Class2 {

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!tq;")
	public Class2 aClass2_299;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Lclient!tq;")
	public Class2 aClass2_300;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "J")
	public long aLong280;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)Z")
	public final boolean method8652() {
		return this.aClass2_299 != null;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
	public final void method8653() {
		if (this.aClass2_299 != null) {
			this.aClass2_299.aClass2_300 = this.aClass2_300;
			this.aClass2_300.aClass2_299 = this.aClass2_299;
			this.aClass2_299 = null;
			this.aClass2_300 = null;
		}
	}
}
