import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!mc;")
	public Class22_Sub1 aClass22_Sub1_3;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!mc;")
	public Class22_Sub1 aClass22_Sub1_4;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public final void method599() {
		if (this.aClass22_Sub1_4 != null) {
			this.aClass22_Sub1_4.aClass22_Sub1_3 = this.aClass22_Sub1_3;
			this.aClass22_Sub1_3.aClass22_Sub1_4 = this.aClass22_Sub1_4;
			this.aClass22_Sub1_4 = null;
			this.aClass22_Sub1_3 = null;
		}
	}
}
