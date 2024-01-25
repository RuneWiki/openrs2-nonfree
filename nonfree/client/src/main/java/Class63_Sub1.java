import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!g;")
	public Class63_Sub1 aClass63_Sub1_5;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!g;")
	public Class63_Sub1 aClass63_Sub1_6;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	public final void method4349() {
		if (this.aClass63_Sub1_5 != null) {
			this.aClass63_Sub1_5.aClass63_Sub1_6 = this.aClass63_Sub1_6;
			this.aClass63_Sub1_6.aClass63_Sub1_5 = this.aClass63_Sub1_5;
			this.aClass63_Sub1_6 = null;
			this.aClass63_Sub1_5 = null;
		}
	}
}
