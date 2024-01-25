import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class Class2 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!cs;")
	public Class2 aClass2_25;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!cs;")
	public Class2 aClass2_26;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public final void method7890() {
		if (this.aClass2_25 != null) {
			this.aClass2_25.aClass2_26 = this.aClass2_26;
			this.aClass2_26.aClass2_25 = this.aClass2_25;
			this.aClass2_25 = null;
			this.aClass2_26 = null;
		}
	}
}
