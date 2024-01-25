import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Lclient!dv;")
	public Class72_Sub1 aClass72_Sub1_9;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "Lclient!dv;")
	public Class72_Sub1 aClass72_Sub1_10;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public final void method6723() {
		if (this.aClass72_Sub1_9 != null) {
			this.aClass72_Sub1_9.aClass72_Sub1_10 = this.aClass72_Sub1_10;
			this.aClass72_Sub1_10.aClass72_Sub1_9 = this.aClass72_Sub1_9;
			this.aClass72_Sub1_10 = null;
			this.aClass72_Sub1_9 = null;
		}
	}
}
