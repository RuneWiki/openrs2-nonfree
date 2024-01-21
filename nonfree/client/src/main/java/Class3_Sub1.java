import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OGGHOMII")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!OGGHOMII", name = "f", descriptor = "Lclient!OGGHOMII;")
	public Class3_Sub1 aClass3_Sub1_36;

	@OriginalMember(owner = "client!OGGHOMII", name = "g", descriptor = "Lclient!OGGHOMII;")
	public Class3_Sub1 aClass3_Sub1_37;

	@OriginalMember(owner = "client!OGGHOMII", name = "e", descriptor = "I")
	private int anInt741 = -7597;

	@OriginalMember(owner = "client!OGGHOMII", name = "b", descriptor = "()V")
	public final void method504() {
		if (this.aClass3_Sub1_37 != null) {
			this.aClass3_Sub1_37.aClass3_Sub1_36 = this.aClass3_Sub1_36;
			this.aClass3_Sub1_36.aClass3_Sub1_37 = this.aClass3_Sub1_37;
			this.aClass3_Sub1_36 = null;
			this.aClass3_Sub1_37 = null;
		}
	}
}
