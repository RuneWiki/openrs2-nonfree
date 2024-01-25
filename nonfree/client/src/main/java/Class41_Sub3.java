import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "Lclient!ku;")
	public Class41_Sub3 aClass41_Sub3_9;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!ku;")
	public Class41_Sub3 aClass41_Sub3_10;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	public final void method5762() {
		if (this.aClass41_Sub3_9 != null) {
			this.aClass41_Sub3_9.aClass41_Sub3_10 = this.aClass41_Sub3_10;
			this.aClass41_Sub3_10.aClass41_Sub3_9 = this.aClass41_Sub3_9;
			this.aClass41_Sub3_9 = null;
			this.aClass41_Sub3_10 = null;
		}
	}
}
