import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Lclient!ff;")
	public Class14_Sub2 aClass14_Sub2_61;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Lclient!ff;")
	public Class14_Sub2 aClass14_Sub2_62;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)Z")
	public final boolean method5757() {
		return this.aClass14_Sub2_62 != null;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	public final void method5760() {
		if (this.aClass14_Sub2_62 != null) {
			this.aClass14_Sub2_62.aClass14_Sub2_61 = this.aClass14_Sub2_61;
			this.aClass14_Sub2_61.aClass14_Sub2_62 = this.aClass14_Sub2_62;
			this.aClass14_Sub2_62 = null;
			this.aClass14_Sub2_61 = null;
		}
	}
}
