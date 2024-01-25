import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!np", name = "p", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "Lclient!np;")
	public Class3_Sub3 aClass3_Sub3_55;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Lclient!np;")
	public Class3_Sub3 aClass3_Sub3_56;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Z")
	public final boolean method4646() {
		return this.aClass3_Sub3_55 != null;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V")
	public final void method4647() {
		if (this.aClass3_Sub3_55 != null) {
			this.aClass3_Sub3_55.aClass3_Sub3_56 = this.aClass3_Sub3_56;
			this.aClass3_Sub3_56.aClass3_Sub3_55 = this.aClass3_Sub3_55;
			this.aClass3_Sub3_55 = null;
			this.aClass3_Sub3_56 = null;
		}
	}
}
