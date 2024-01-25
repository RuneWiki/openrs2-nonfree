import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "J")
	public long aLong297;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "Lclient!kh;")
	public Class5_Sub3 aClass5_Sub3_66;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "Lclient!kh;")
	public Class5_Sub3 aClass5_Sub3_67;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	public final void method8687() {
		if (this.aClass5_Sub3_67 != null) {
			this.aClass5_Sub3_67.aClass5_Sub3_66 = this.aClass5_Sub3_66;
			this.aClass5_Sub3_66.aClass5_Sub3_67 = this.aClass5_Sub3_67;
			this.aClass5_Sub3_66 = null;
			this.aClass5_Sub3_67 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)Z")
	public final boolean method8689() {
		return this.aClass5_Sub3_67 != null;
	}
}
