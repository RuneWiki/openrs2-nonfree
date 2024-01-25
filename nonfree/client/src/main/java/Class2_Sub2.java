import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "J")
	public long aLong223;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!ge;")
	public Class2_Sub2 aClass2_Sub2_57;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!ge;")
	public Class2_Sub2 aClass2_Sub2_58;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public final void method5934() {
		if (this.aClass2_Sub2_57 != null) {
			this.aClass2_Sub2_57.aClass2_Sub2_58 = this.aClass2_Sub2_58;
			this.aClass2_Sub2_58.aClass2_Sub2_57 = this.aClass2_Sub2_57;
			this.aClass2_Sub2_58 = null;
			this.aClass2_Sub2_57 = null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Z")
	public final boolean method5936() {
		return this.aClass2_Sub2_57 != null;
	}
}
