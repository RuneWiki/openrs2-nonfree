import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!tia", name = "n", descriptor = "J")
	public long aLong310;

	@OriginalMember(owner = "client!tia", name = "r", descriptor = "Lclient!tia;")
	public Class3_Sub11 aClass3_Sub11_66;

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "Lclient!tia;")
	public Class3_Sub11 aClass3_Sub11_67;

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V")
	public final void method9345() {
		if (this.aClass3_Sub11_66 != null) {
			this.aClass3_Sub11_66.aClass3_Sub11_67 = this.aClass3_Sub11_67;
			this.aClass3_Sub11_67.aClass3_Sub11_66 = this.aClass3_Sub11_66;
			this.aClass3_Sub11_67 = null;
			this.aClass3_Sub11_66 = null;
		}
	}

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "(I)Z")
	public final boolean method9346() {
		return this.aClass3_Sub11_66 != null;
	}
}
