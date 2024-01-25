import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!al", name = "s", descriptor = "J")
	public long aLong302;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "Lclient!al;")
	public Class14_Sub3 aClass14_Sub3_66;

	@OriginalMember(owner = "client!al", name = "v", descriptor = "Lclient!al;")
	public Class14_Sub3 aClass14_Sub3_67;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public final void method9253() {
		if (this.aClass14_Sub3_66 != null) {
			this.aClass14_Sub3_66.aClass14_Sub3_67 = this.aClass14_Sub3_67;
			this.aClass14_Sub3_67.aClass14_Sub3_66 = this.aClass14_Sub3_66;
			this.aClass14_Sub3_67 = null;
			this.aClass14_Sub3_66 = null;
		}
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)Z")
	public final boolean method9256() {
		return this.aClass14_Sub3_66 != null;
	}
}
