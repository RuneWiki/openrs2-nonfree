import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!no", name = "t", descriptor = "J")
	public long aLong311;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "Lclient!no;")
	public Class2_Sub6 aClass2_Sub6_63;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "Lclient!no;")
	public Class2_Sub6 aClass2_Sub6_64;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Z")
	public final boolean method8696() {
		return this.aClass2_Sub6_63 != null;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	public final void method8698() {
		if (this.aClass2_Sub6_63 != null) {
			this.aClass2_Sub6_63.aClass2_Sub6_64 = this.aClass2_Sub6_64;
			this.aClass2_Sub6_64.aClass2_Sub6_63 = this.aClass2_Sub6_63;
			this.aClass2_Sub6_63 = null;
			this.aClass2_Sub6_64 = null;
		}
	}
}
