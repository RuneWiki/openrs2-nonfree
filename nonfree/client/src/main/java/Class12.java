import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class Class12 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!mm;")
	public Class12 aClass12_67;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!mm;")
	public Class12 aClass12_68;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V")
	public final void method7630() {
		if (this.aClass12_68 != null) {
			this.aClass12_68.aClass12_67 = this.aClass12_67;
			this.aClass12_67.aClass12_68 = this.aClass12_68;
			this.aClass12_67 = null;
			this.aClass12_68 = null;
		}
	}
}
