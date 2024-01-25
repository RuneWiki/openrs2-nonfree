import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Lclient!jq;")
	public Class2_Sub1 aClass2_Sub1_5;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Lclient!jq;")
	public Class2_Sub1 aClass2_Sub1_6;

	static {
		new Class124(64);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
	public final void method4516() {
		if (this.aClass2_Sub1_5 != null) {
			this.aClass2_Sub1_5.aClass2_Sub1_6 = this.aClass2_Sub1_6;
			this.aClass2_Sub1_6.aClass2_Sub1_5 = this.aClass2_Sub1_5;
			this.aClass2_Sub1_6 = null;
			this.aClass2_Sub1_5 = null;
		}
	}
}
