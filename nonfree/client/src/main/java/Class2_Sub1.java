import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NFNHZJTP")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!NFNHZJTP", name = "f", descriptor = "Lclient!NFNHZJTP;")
	public Class2_Sub1 aClass2_Sub1_36;

	@OriginalMember(owner = "client!NFNHZJTP", name = "g", descriptor = "Lclient!NFNHZJTP;")
	public Class2_Sub1 aClass2_Sub1_37;

	@OriginalMember(owner = "client!NFNHZJTP", name = "b", descriptor = "()V")
	public final void method559() {
		if (this.aClass2_Sub1_37 != null) {
			this.aClass2_Sub1_37.aClass2_Sub1_36 = this.aClass2_Sub1_36;
			this.aClass2_Sub1_36.aClass2_Sub1_37 = this.aClass2_Sub1_37;
			this.aClass2_Sub1_36 = null;
			this.aClass2_Sub1_37 = null;
		}
	}
}
