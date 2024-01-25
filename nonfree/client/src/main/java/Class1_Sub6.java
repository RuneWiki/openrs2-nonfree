import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!bk;")
	public Class1_Sub6 aClass1_Sub6_53;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!bk;")
	public Class1_Sub6 aClass1_Sub6_54;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)Z")
	public final boolean method5579() {
		return this.aClass1_Sub6_53 != null;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
	public final void method5580() {
		if (this.aClass1_Sub6_53 != null) {
			this.aClass1_Sub6_53.aClass1_Sub6_54 = this.aClass1_Sub6_54;
			this.aClass1_Sub6_54.aClass1_Sub6_53 = this.aClass1_Sub6_53;
			this.aClass1_Sub6_53 = null;
			this.aClass1_Sub6_54 = null;
		}
	}
}
