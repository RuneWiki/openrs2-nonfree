import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DPPNUUMQ")
public class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!DPPNUUMQ", name = "e", descriptor = "Lclient!DPPNUUMQ;")
	public Class10_Sub1 aClass10_Sub1_36;

	@OriginalMember(owner = "client!DPPNUUMQ", name = "f", descriptor = "Lclient!DPPNUUMQ;")
	public Class10_Sub1 aClass10_Sub1_37;

	@OriginalMember(owner = "client!DPPNUUMQ", name = "b", descriptor = "()V")
	public final void method535() {
		if (this.aClass10_Sub1_37 != null) {
			this.aClass10_Sub1_37.aClass10_Sub1_36 = this.aClass10_Sub1_36;
			this.aClass10_Sub1_36.aClass10_Sub1_37 = this.aClass10_Sub1_37;
			this.aClass10_Sub1_36 = null;
			this.aClass10_Sub1_37 = null;
		}
	}
}
