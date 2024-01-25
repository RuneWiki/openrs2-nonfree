import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!su", name = "l", descriptor = "J")
	public long aLong319;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "Lclient!su;")
	public Class5_Sub2 aClass5_Sub2_66;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "Lclient!su;")
	public Class5_Sub2 aClass5_Sub2_67;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
	public final void method8569() {
		if (this.aClass5_Sub2_66 != null) {
			this.aClass5_Sub2_66.aClass5_Sub2_67 = this.aClass5_Sub2_67;
			this.aClass5_Sub2_67.aClass5_Sub2_66 = this.aClass5_Sub2_66;
			this.aClass5_Sub2_67 = null;
			this.aClass5_Sub2_66 = null;
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
	public final boolean method8572() {
		return this.aClass5_Sub2_66 != null;
	}
}
