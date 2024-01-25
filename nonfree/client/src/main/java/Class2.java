import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class Class2 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!ri;")
	public Class2 aClass2_67;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!ri;")
	public Class2 aClass2_68;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public final void method8436() {
		if (this.aClass2_67 != null) {
			this.aClass2_67.aClass2_68 = this.aClass2_68;
			this.aClass2_68.aClass2_67 = this.aClass2_67;
			this.aClass2_67 = null;
			this.aClass2_68 = null;
		}
	}
}
