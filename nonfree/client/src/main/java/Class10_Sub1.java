import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!v", name = "F", descriptor = "Lclient!v;")
	public Class10_Sub1 aClass10_Sub1_59;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "Lclient!v;")
	public Class10_Sub1 aClass10_Sub1_60;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	public final void method1655() {
		if (this.aClass10_Sub1_60 != null) {
			this.aClass10_Sub1_60.aClass10_Sub1_59 = this.aClass10_Sub1_59;
			this.aClass10_Sub1_59.aClass10_Sub1_60 = this.aClass10_Sub1_60;
			this.aClass10_Sub1_60 = null;
			this.aClass10_Sub1_59 = null;
		}
	}
}
