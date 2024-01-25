import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Lclient!hs;")
	public Class9_Sub1 aClass9_Sub1_7;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Lclient!hs;")
	public Class9_Sub1 aClass9_Sub1_8;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public final void method4383() {
		if (this.aClass9_Sub1_8 != null) {
			this.aClass9_Sub1_8.aClass9_Sub1_7 = this.aClass9_Sub1_7;
			this.aClass9_Sub1_7.aClass9_Sub1_8 = this.aClass9_Sub1_8;
			this.aClass9_Sub1_7 = null;
			this.aClass9_Sub1_8 = null;
		}
	}
}
