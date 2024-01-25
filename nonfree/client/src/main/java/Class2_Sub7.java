import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Lclient!rj;")
	public Class2_Sub7 aClass2_Sub7_53;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "J")
	public long aLong209;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Lclient!rj;")
	public Class2_Sub7 aClass2_Sub7_54;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)Z")
	public final boolean method6083() {
		return this.aClass2_Sub7_54 != null;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)V")
	public final void method6085() {
		if (this.aClass2_Sub7_54 != null) {
			this.aClass2_Sub7_54.aClass2_Sub7_53 = this.aClass2_Sub7_53;
			this.aClass2_Sub7_53.aClass2_Sub7_54 = this.aClass2_Sub7_54;
			this.aClass2_Sub7_53 = null;
			this.aClass2_Sub7_54 = null;
		}
	}
}
