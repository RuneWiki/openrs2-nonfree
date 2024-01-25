import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "J")
	public long aLong220;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Lclient!fs;")
	public Class2_Sub5 aClass2_Sub5_57;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!fs;")
	public Class2_Sub5 aClass2_Sub5_58;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public final void method5621() {
		if (this.aClass2_Sub5_58 != null) {
			this.aClass2_Sub5_58.aClass2_Sub5_57 = this.aClass2_Sub5_57;
			this.aClass2_Sub5_57.aClass2_Sub5_58 = this.aClass2_Sub5_58;
			this.aClass2_Sub5_57 = null;
			this.aClass2_Sub5_58 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)Z")
	public final boolean method5624() {
		return this.aClass2_Sub5_58 != null;
	}
}
