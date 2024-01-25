import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!at", name = "i", descriptor = "Lclient!at;")
	public Class5_Sub1 aClass5_Sub1_7;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!at;")
	public Class5_Sub1 aClass5_Sub1_8;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
	public final void method5138() {
		if (this.aClass5_Sub1_7 != null) {
			this.aClass5_Sub1_7.aClass5_Sub1_8 = this.aClass5_Sub1_8;
			this.aClass5_Sub1_8.aClass5_Sub1_7 = this.aClass5_Sub1_7;
			this.aClass5_Sub1_7 = null;
			this.aClass5_Sub1_8 = null;
		}
	}
}
