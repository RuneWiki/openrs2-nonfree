import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class Class4 {

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!ha;")
	public Class4 aClass4_269;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!ha;")
	public Class4 aClass4_270;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "J")
	public long aLong228;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)Z")
	public final boolean method6325() {
		return this.aClass4_270 != null;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public final void method6330() {
		if (this.aClass4_270 != null) {
			this.aClass4_270.aClass4_269 = this.aClass4_269;
			this.aClass4_269.aClass4_270 = this.aClass4_270;
			this.aClass4_270 = null;
			this.aClass4_269 = null;
		}
	}
}
