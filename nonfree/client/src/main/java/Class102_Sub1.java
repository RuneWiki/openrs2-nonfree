import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!uk;")
	public Class102_Sub1 aClass102_Sub1_9;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "Lclient!uk;")
	public Class102_Sub1 aClass102_Sub1_10;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public final void method6765() {
		if (this.aClass102_Sub1_10 != null) {
			this.aClass102_Sub1_10.aClass102_Sub1_9 = this.aClass102_Sub1_9;
			this.aClass102_Sub1_9.aClass102_Sub1_10 = this.aClass102_Sub1_10;
			this.aClass102_Sub1_10 = null;
			this.aClass102_Sub1_9 = null;
		}
	}
}
