import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Lclient!js;")
	public Class2_Sub1 aClass2_Sub1_53;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "Lclient!js;")
	public Class2_Sub1 aClass2_Sub1_54;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "J")
	public long aLong209;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)Z")
	public final boolean method5747() {
		return this.aClass2_Sub1_53 != null;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
	public final void method5748() {
		if (this.aClass2_Sub1_53 != null) {
			this.aClass2_Sub1_53.aClass2_Sub1_54 = this.aClass2_Sub1_54;
			this.aClass2_Sub1_54.aClass2_Sub1_53 = this.aClass2_Sub1_53;
			this.aClass2_Sub1_53 = null;
			this.aClass2_Sub1_54 = null;
		}
	}
}
