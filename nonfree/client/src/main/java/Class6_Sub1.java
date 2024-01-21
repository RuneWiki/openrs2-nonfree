import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YBEHHNFF")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!YBEHHNFF", name = "e", descriptor = "Lclient!YBEHHNFF;")
	public Class6_Sub1 aClass6_Sub1_36;

	@OriginalMember(owner = "client!YBEHHNFF", name = "f", descriptor = "Lclient!YBEHHNFF;")
	public Class6_Sub1 aClass6_Sub1_37;

	@OriginalMember(owner = "client!YBEHHNFF", name = "b", descriptor = "()V")
	public final void method543() {
		if (this.aClass6_Sub1_37 != null) {
			this.aClass6_Sub1_37.aClass6_Sub1_36 = this.aClass6_Sub1_36;
			this.aClass6_Sub1_36.aClass6_Sub1_37 = this.aClass6_Sub1_37;
			this.aClass6_Sub1_36 = null;
			this.aClass6_Sub1_37 = null;
		}
	}
}
