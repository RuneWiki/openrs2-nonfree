import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!cm;")
	public Class3_Sub3 aClass3_Sub3_61;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Lclient!cm;")
	public Class3_Sub3 aClass3_Sub3_62;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "J")
	public long aLong265;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
	public final void method7720() {
		if (this.aClass3_Sub3_62 != null) {
			this.aClass3_Sub3_62.aClass3_Sub3_61 = this.aClass3_Sub3_61;
			this.aClass3_Sub3_61.aClass3_Sub3_62 = this.aClass3_Sub3_62;
			this.aClass3_Sub3_62 = null;
			this.aClass3_Sub3_61 = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Z")
	public final boolean method7722() {
		return this.aClass3_Sub3_62 != null;
	}
}
