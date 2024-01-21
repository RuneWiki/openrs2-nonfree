import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Lclient!cc;")
	public Class4_Sub4 aClass4_Sub4_63;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "Lclient!cc;")
	public Class4_Sub4 aClass4_Sub4_64;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public final void method2094() {
		if (this.aClass4_Sub4_63 != null) {
			this.aClass4_Sub4_63.aClass4_Sub4_64 = this.aClass4_Sub4_64;
			this.aClass4_Sub4_64.aClass4_Sub4_63 = this.aClass4_Sub4_63;
			this.aClass4_Sub4_63 = null;
			this.aClass4_Sub4_64 = null;
		}
	}
}
