import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!rg;")
	public Class2_Sub7 aClass2_Sub7_66;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "J")
	public long aLong260;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!rg;")
	public Class2_Sub7 aClass2_Sub7_67;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z")
	public final boolean method8503() {
		return this.aClass2_Sub7_67 != null;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public final void method8504() {
		if (this.aClass2_Sub7_67 != null) {
			this.aClass2_Sub7_67.aClass2_Sub7_66 = this.aClass2_Sub7_66;
			this.aClass2_Sub7_66.aClass2_Sub7_67 = this.aClass2_Sub7_67;
			this.aClass2_Sub7_66 = null;
			this.aClass2_Sub7_67 = null;
		}
	}
}
