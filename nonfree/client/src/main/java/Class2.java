import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class Class2 {

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "J")
	public long aLong278;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!eh;")
	public Class2 aClass2_299;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!eh;")
	public Class2 aClass2_300;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)Z")
	public final boolean method9250() {
		return this.aClass2_300 != null;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)V")
	public final void method9253() {
		if (this.aClass2_300 != null) {
			this.aClass2_300.aClass2_299 = this.aClass2_299;
			this.aClass2_299.aClass2_300 = this.aClass2_300;
			this.aClass2_299 = null;
			this.aClass2_300 = null;
		}
	}
}
