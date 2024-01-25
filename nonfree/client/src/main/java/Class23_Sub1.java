import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Lclient!pi;")
	public Class23_Sub1 aClass23_Sub1_9;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!pi;")
	public Class23_Sub1 aClass23_Sub1_10;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public final void method6583() {
		if (this.aClass23_Sub1_10 != null) {
			this.aClass23_Sub1_10.aClass23_Sub1_9 = this.aClass23_Sub1_9;
			this.aClass23_Sub1_9.aClass23_Sub1_10 = this.aClass23_Sub1_10;
			this.aClass23_Sub1_10 = null;
			this.aClass23_Sub1_9 = null;
		}
	}
}
