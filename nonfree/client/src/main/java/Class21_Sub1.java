import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!hq;")
	public Class21_Sub1 aClass21_Sub1_7;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Lclient!hq;")
	public Class21_Sub1 aClass21_Sub1_8;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(B)V")
	public final void method2008() {
		if (this.aClass21_Sub1_8 != null) {
			this.aClass21_Sub1_8.aClass21_Sub1_7 = this.aClass21_Sub1_7;
			this.aClass21_Sub1_7.aClass21_Sub1_8 = this.aClass21_Sub1_8;
			this.aClass21_Sub1_8 = null;
			this.aClass21_Sub1_7 = null;
		}
	}
}
