import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Lclient!fi;")
	public Class13_Sub3 aClass13_Sub3_5;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "Lclient!fi;")
	public Class13_Sub3 aClass13_Sub3_6;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
	public final void method5342() {
		if (this.aClass13_Sub3_6 != null) {
			this.aClass13_Sub3_6.aClass13_Sub3_5 = this.aClass13_Sub3_5;
			this.aClass13_Sub3_5.aClass13_Sub3_6 = this.aClass13_Sub3_6;
			this.aClass13_Sub3_5 = null;
			this.aClass13_Sub3_6 = null;
		}
	}
}
