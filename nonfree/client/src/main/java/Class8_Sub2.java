import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!np", name = "k", descriptor = "Lclient!np;")
	public Class8_Sub2 aClass8_Sub2_7;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Lclient!np;")
	public Class8_Sub2 aClass8_Sub2_8;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
	public final void method5786() {
		if (this.aClass8_Sub2_7 != null) {
			this.aClass8_Sub2_7.aClass8_Sub2_8 = this.aClass8_Sub2_8;
			this.aClass8_Sub2_8.aClass8_Sub2_7 = this.aClass8_Sub2_7;
			this.aClass8_Sub2_8 = null;
			this.aClass8_Sub2_7 = null;
		}
	}
}
