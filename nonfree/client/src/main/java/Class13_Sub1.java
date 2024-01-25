import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!nh;")
	public Class13_Sub1 aClass13_Sub1_7;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Lclient!nh;")
	public Class13_Sub1 aClass13_Sub1_8;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public final void method2724() {
		if (this.aClass13_Sub1_8 != null) {
			this.aClass13_Sub1_8.aClass13_Sub1_7 = this.aClass13_Sub1_7;
			this.aClass13_Sub1_7.aClass13_Sub1_8 = this.aClass13_Sub1_8;
			this.aClass13_Sub1_7 = null;
			this.aClass13_Sub1_8 = null;
		}
	}
}
