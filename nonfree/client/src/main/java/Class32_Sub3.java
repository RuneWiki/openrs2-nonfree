import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Lclient!hs;")
	public Class32_Sub3 aClass32_Sub3_7;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient!hs;")
	public Class32_Sub3 aClass32_Sub3_8;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)V")
	public final void method3392() {
		if (this.aClass32_Sub3_7 != null) {
			this.aClass32_Sub3_7.aClass32_Sub3_8 = this.aClass32_Sub3_8;
			this.aClass32_Sub3_8.aClass32_Sub3_7 = this.aClass32_Sub3_7;
			this.aClass32_Sub3_8 = null;
			this.aClass32_Sub3_7 = null;
		}
	}
}
