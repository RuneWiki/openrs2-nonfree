import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!qc;")
	public Class11_Sub5 aClass11_Sub5_9;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!qc;")
	public Class11_Sub5 aClass11_Sub5_10;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	public final void method4873() {
		if (this.aClass11_Sub5_9 != null) {
			this.aClass11_Sub5_9.aClass11_Sub5_10 = this.aClass11_Sub5_10;
			this.aClass11_Sub5_10.aClass11_Sub5_9 = this.aClass11_Sub5_9;
			this.aClass11_Sub5_9 = null;
			this.aClass11_Sub5_10 = null;
		}
	}
}
