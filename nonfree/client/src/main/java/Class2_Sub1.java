import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!bd;")
	public Class2_Sub1 aClass2_Sub1_57;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "J")
	public long aLong378;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!bd;")
	public Class2_Sub1 aClass2_Sub1_58;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public final void method5838() {
		if (this.aClass2_Sub1_58 != null) {
			this.aClass2_Sub1_58.aClass2_Sub1_57 = this.aClass2_Sub1_57;
			this.aClass2_Sub1_57.aClass2_Sub1_58 = this.aClass2_Sub1_58;
			this.aClass2_Sub1_58 = null;
			this.aClass2_Sub1_57 = null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
	public final boolean method5840() {
		return this.aClass2_Sub1_58 != null;
	}
}
