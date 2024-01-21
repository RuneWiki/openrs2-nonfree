import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HZZJZIMV")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!HZZJZIMV", name = "e", descriptor = "Lclient!HZZJZIMV;")
	public Class2_Sub1 aClass2_Sub1_36;

	@OriginalMember(owner = "client!HZZJZIMV", name = "f", descriptor = "Lclient!HZZJZIMV;")
	public Class2_Sub1 aClass2_Sub1_37;

	@OriginalMember(owner = "client!HZZJZIMV", name = "b", descriptor = "()V")
	public final void method508() {
		if (this.aClass2_Sub1_37 != null) {
			this.aClass2_Sub1_37.aClass2_Sub1_36 = this.aClass2_Sub1_36;
			this.aClass2_Sub1_36.aClass2_Sub1_37 = this.aClass2_Sub1_37;
			this.aClass2_Sub1_36 = null;
			this.aClass2_Sub1_37 = null;
		}
	}
}
