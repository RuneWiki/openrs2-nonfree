import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "Lclient!mr;")
	public Class8_Sub2 aClass8_Sub2_5;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Lclient!mr;")
	public Class8_Sub2 aClass8_Sub2_6;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public final void method885() {
		if (this.aClass8_Sub2_6 != null) {
			this.aClass8_Sub2_6.aClass8_Sub2_5 = this.aClass8_Sub2_5;
			this.aClass8_Sub2_5.aClass8_Sub2_6 = this.aClass8_Sub2_6;
			this.aClass8_Sub2_5 = null;
			this.aClass8_Sub2_6 = null;
		}
	}
}
