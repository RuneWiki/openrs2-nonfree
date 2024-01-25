import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class Class57 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!sh;")
	public Class57 aClass57_23;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!sh;")
	public Class57 aClass57_24;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public final void method5452() {
		if (this.aClass57_23 != null) {
			this.aClass57_23.aClass57_24 = this.aClass57_24;
			this.aClass57_24.aClass57_23 = this.aClass57_23;
			this.aClass57_24 = null;
			this.aClass57_23 = null;
		}
	}
}
