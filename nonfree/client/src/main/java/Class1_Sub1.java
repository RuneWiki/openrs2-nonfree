import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "Lclient!sr;")
	public Class1_Sub1 aClass1_Sub1_7;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Lclient!sr;")
	public Class1_Sub1 aClass1_Sub1_8;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
	public final void method5703() {
		if (this.aClass1_Sub1_8 != null) {
			this.aClass1_Sub1_8.aClass1_Sub1_7 = this.aClass1_Sub1_7;
			this.aClass1_Sub1_7.aClass1_Sub1_8 = this.aClass1_Sub1_8;
			this.aClass1_Sub1_7 = null;
			this.aClass1_Sub1_8 = null;
		}
	}
}
