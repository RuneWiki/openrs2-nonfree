import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class Class8 {

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!mc;")
	public Class8 aClass8_299;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!mc;")
	public Class8 aClass8_300;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "J")
	public long aLong285;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Z")
	public final boolean method8639() {
		return this.aClass8_299 != null;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
	public final void method8640() {
		if (this.aClass8_299 != null) {
			this.aClass8_299.aClass8_300 = this.aClass8_300;
			this.aClass8_300.aClass8_299 = this.aClass8_299;
			this.aClass8_300 = null;
			this.aClass8_299 = null;
		}
	}
}
