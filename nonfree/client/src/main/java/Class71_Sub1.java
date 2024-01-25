import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!gi;")
	public Class71_Sub1 aClass71_Sub1_9;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!gi;")
	public Class71_Sub1 aClass71_Sub1_10;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	public final void method3038() {
		if (this.aClass71_Sub1_10 != null) {
			this.aClass71_Sub1_10.aClass71_Sub1_9 = this.aClass71_Sub1_9;
			this.aClass71_Sub1_9.aClass71_Sub1_10 = this.aClass71_Sub1_10;
			this.aClass71_Sub1_10 = null;
			this.aClass71_Sub1_9 = null;
		}
	}
}
