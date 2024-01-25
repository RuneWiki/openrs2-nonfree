import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class Class5 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!mb;")
	public Class5 aClass5_25;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!mb;")
	public Class5 aClass5_26;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public final void method7282() {
		if (this.aClass5_26 != null) {
			this.aClass5_26.aClass5_25 = this.aClass5_25;
			this.aClass5_25.aClass5_26 = this.aClass5_26;
			this.aClass5_26 = null;
			this.aClass5_25 = null;
		}
	}
}
