import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!wb;")
	public Class6_Sub3 aClass6_Sub3_9;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!wb;")
	public Class6_Sub3 aClass6_Sub3_10;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public final void method6553() {
		if (this.aClass6_Sub3_9 != null) {
			this.aClass6_Sub3_9.aClass6_Sub3_10 = this.aClass6_Sub3_10;
			this.aClass6_Sub3_10.aClass6_Sub3_9 = this.aClass6_Sub3_9;
			this.aClass6_Sub3_9 = null;
			this.aClass6_Sub3_10 = null;
		}
	}
}
