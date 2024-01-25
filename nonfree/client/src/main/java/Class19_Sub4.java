import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "Lclient!lga;")
	public Class19_Sub4 aClass19_Sub4_7;

	@OriginalMember(owner = "client!lga", name = "j", descriptor = "Lclient!lga;")
	public Class19_Sub4 aClass19_Sub4_8;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
	public final void method7253() {
		if (this.aClass19_Sub4_8 != null) {
			this.aClass19_Sub4_8.aClass19_Sub4_7 = this.aClass19_Sub4_7;
			this.aClass19_Sub4_7.aClass19_Sub4_8 = this.aClass19_Sub4_8;
			this.aClass19_Sub4_8 = null;
			this.aClass19_Sub4_7 = null;
		}
	}
}
