import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "Lclient!sp;")
	public Class41_Sub3 aClass41_Sub3_9;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!sp;")
	public Class41_Sub3 aClass41_Sub3_10;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	public final void method4327() {
		if (this.aClass41_Sub3_10 != null) {
			this.aClass41_Sub3_10.aClass41_Sub3_9 = this.aClass41_Sub3_9;
			this.aClass41_Sub3_9.aClass41_Sub3_10 = this.aClass41_Sub3_10;
			this.aClass41_Sub3_9 = null;
			this.aClass41_Sub3_10 = null;
		}
	}
}
