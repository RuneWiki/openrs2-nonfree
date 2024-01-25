import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class Class9_Sub8 extends Class9 {

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "Lclient!ku;")
	public Class9_Sub8 aClass9_Sub8_7;

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!ku;")
	public Class9_Sub8 aClass9_Sub8_8;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public final void method5336() {
		if (this.aClass9_Sub8_7 != null) {
			this.aClass9_Sub8_7.aClass9_Sub8_8 = this.aClass9_Sub8_8;
			this.aClass9_Sub8_8.aClass9_Sub8_7 = this.aClass9_Sub8_7;
			this.aClass9_Sub8_7 = null;
			this.aClass9_Sub8_8 = null;
		}
	}
}
