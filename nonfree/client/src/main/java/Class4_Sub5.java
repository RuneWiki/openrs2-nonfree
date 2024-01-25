import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!hc;")
	public Class4_Sub5 aClass4_Sub5_66;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "J")
	public long aLong306;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!hc;")
	public Class4_Sub5 aClass4_Sub5_67;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public final void method8990() {
		if (this.aClass4_Sub5_66 != null) {
			this.aClass4_Sub5_66.aClass4_Sub5_67 = this.aClass4_Sub5_67;
			this.aClass4_Sub5_67.aClass4_Sub5_66 = this.aClass4_Sub5_66;
			this.aClass4_Sub5_66 = null;
			this.aClass4_Sub5_67 = null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z")
	public final boolean method8994() {
		return this.aClass4_Sub5_66 != null;
	}
}
