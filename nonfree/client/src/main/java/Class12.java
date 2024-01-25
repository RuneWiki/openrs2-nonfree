import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Class12 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!ea;")
	public Class12 aClass12_67;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!ea;")
	public Class12 aClass12_68;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public final void method9143() {
		if (this.aClass12_67 != null) {
			this.aClass12_67.aClass12_68 = this.aClass12_68;
			this.aClass12_68.aClass12_67 = this.aClass12_67;
			this.aClass12_67 = null;
			this.aClass12_68 = null;
		}
	}
}
