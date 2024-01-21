import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "Lclient!rf;")
	public Class5_Sub2 aClass5_Sub2_64;

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "Lclient!rf;")
	public Class5_Sub2 aClass5_Sub2_65;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public final void method2172() {
		if (this.aClass5_Sub2_64 != null) {
			this.aClass5_Sub2_64.aClass5_Sub2_65 = this.aClass5_Sub2_65;
			this.aClass5_Sub2_65.aClass5_Sub2_64 = this.aClass5_Sub2_64;
			this.aClass5_Sub2_64 = null;
			this.aClass5_Sub2_65 = null;
		}
	}
}
