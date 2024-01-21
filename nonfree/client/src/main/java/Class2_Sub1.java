import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Lclient!u;")
	public Class2_Sub1 aClass2_Sub1_63;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!u;")
	public Class2_Sub1 aClass2_Sub1_64;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public final void method1934() {
		if (this.aClass2_Sub1_63 != null) {
			this.aClass2_Sub1_63.aClass2_Sub1_64 = this.aClass2_Sub1_64;
			this.aClass2_Sub1_64.aClass2_Sub1_63 = this.aClass2_Sub1_63;
			this.aClass2_Sub1_63 = null;
			this.aClass2_Sub1_64 = null;
		}
	}
}
