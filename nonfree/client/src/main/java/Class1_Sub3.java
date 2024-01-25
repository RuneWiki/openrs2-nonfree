import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "Lclient!jq;")
	public Class1_Sub3 aClass1_Sub3_57;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "Lclient!jq;")
	public Class1_Sub3 aClass1_Sub3_58;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "J")
	public long aLong235;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)Z")
	public final boolean method5938() {
		return this.aClass1_Sub3_58 != null;
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
	public final void method5941() {
		if (this.aClass1_Sub3_58 != null) {
			this.aClass1_Sub3_58.aClass1_Sub3_57 = this.aClass1_Sub3_57;
			this.aClass1_Sub3_57.aClass1_Sub3_58 = this.aClass1_Sub3_58;
			this.aClass1_Sub3_58 = null;
			this.aClass1_Sub3_57 = null;
		}
	}
}
