import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!v;")
	public Class14_Sub2 aClass14_Sub2_66;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!v;")
	public Class14_Sub2 aClass14_Sub2_67;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "J")
	public long aLong308;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public final void method9093() {
		if (this.aClass14_Sub2_66 != null) {
			this.aClass14_Sub2_66.aClass14_Sub2_67 = this.aClass14_Sub2_67;
			this.aClass14_Sub2_67.aClass14_Sub2_66 = this.aClass14_Sub2_66;
			this.aClass14_Sub2_66 = null;
			this.aClass14_Sub2_67 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Z")
	public final boolean method9094() {
		return this.aClass14_Sub2_66 != null;
	}
}
