import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!le;")
	public Class3_Sub4 aClass3_Sub4_57;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "J")
	public long aLong233;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!le;")
	public Class3_Sub4 aClass3_Sub4_58;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Z")
	public final boolean method5946() {
		return this.aClass3_Sub4_57 != null;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	public final void method5949() {
		if (this.aClass3_Sub4_57 != null) {
			this.aClass3_Sub4_57.aClass3_Sub4_58 = this.aClass3_Sub4_58;
			this.aClass3_Sub4_58.aClass3_Sub4_57 = this.aClass3_Sub4_57;
			this.aClass3_Sub4_58 = null;
			this.aClass3_Sub4_57 = null;
		}
	}
}
