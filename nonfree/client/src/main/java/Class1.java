import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class Class1 {

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Lclient!tp;")
	public Class1 aClass1_23;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "Lclient!tp;")
	public Class1 aClass1_24;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
	public final void method5701() {
		if (this.aClass1_24 != null) {
			this.aClass1_24.aClass1_23 = this.aClass1_23;
			this.aClass1_23.aClass1_24 = this.aClass1_24;
			this.aClass1_24 = null;
			this.aClass1_23 = null;
		}
	}
}
