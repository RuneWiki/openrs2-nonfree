import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class Class2 {

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "Lclient!cca;")
	public Class2 aClass2_65;

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "Lclient!cca;")
	public Class2 aClass2_66;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	public final void method8558() {
		if (this.aClass2_66 != null) {
			this.aClass2_66.aClass2_65 = this.aClass2_65;
			this.aClass2_65.aClass2_66 = this.aClass2_66;
			this.aClass2_65 = null;
			this.aClass2_66 = null;
		}
	}
}
