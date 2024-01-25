import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "Lclient!ef;")
	public Class46_Sub3 aClass46_Sub3_9;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!ef;")
	public Class46_Sub3 aClass46_Sub3_10;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
	public final void method8232() {
		if (this.aClass46_Sub3_10 != null) {
			this.aClass46_Sub3_10.aClass46_Sub3_9 = this.aClass46_Sub3_9;
			this.aClass46_Sub3_9.aClass46_Sub3_10 = this.aClass46_Sub3_10;
			this.aClass46_Sub3_9 = null;
			this.aClass46_Sub3_10 = null;
		}
	}
}
