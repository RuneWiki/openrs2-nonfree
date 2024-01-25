import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "J")
	public long aLong267;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "Lclient!vl;")
	public Class2_Sub6 aClass2_Sub6_65;

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "Lclient!vl;")
	public Class2_Sub6 aClass2_Sub6_66;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public final void method8933() {
		if (this.aClass2_Sub6_65 != null) {
			this.aClass2_Sub6_65.aClass2_Sub6_66 = this.aClass2_Sub6_66;
			this.aClass2_Sub6_66.aClass2_Sub6_65 = this.aClass2_Sub6_65;
			this.aClass2_Sub6_65 = null;
			this.aClass2_Sub6_66 = null;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
	public final boolean method8935() {
		return this.aClass2_Sub6_65 != null;
	}
}
