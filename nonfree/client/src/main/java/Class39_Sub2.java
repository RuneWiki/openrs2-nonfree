import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!di;")
	public Class39_Sub2 aClass39_Sub2_7;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Lclient!di;")
	public Class39_Sub2 aClass39_Sub2_8;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
	public final void method5576() {
		if (this.aClass39_Sub2_7 != null) {
			this.aClass39_Sub2_7.aClass39_Sub2_8 = this.aClass39_Sub2_8;
			this.aClass39_Sub2_8.aClass39_Sub2_7 = this.aClass39_Sub2_7;
			this.aClass39_Sub2_8 = null;
			this.aClass39_Sub2_7 = null;
		}
	}
}
