import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "Lclient!dp;")
	public Class57_Sub1 aClass57_Sub1_7;

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "Lclient!dp;")
	public Class57_Sub1 aClass57_Sub1_8;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V")
	public final void method2539() {
		if (this.aClass57_Sub1_8 != null) {
			this.aClass57_Sub1_8.aClass57_Sub1_7 = this.aClass57_Sub1_7;
			this.aClass57_Sub1_7.aClass57_Sub1_8 = this.aClass57_Sub1_8;
			this.aClass57_Sub1_7 = null;
			this.aClass57_Sub1_8 = null;
		}
	}
}
