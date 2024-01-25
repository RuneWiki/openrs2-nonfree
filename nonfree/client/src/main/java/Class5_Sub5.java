import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "J")
	public long aLong274;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!lh;")
	public Class5_Sub5 aClass5_Sub5_66;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Lclient!lh;")
	public Class5_Sub5 aClass5_Sub5_67;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)Z")
	public final boolean method8951() {
		return this.aClass5_Sub5_67 != null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public final void method8952() {
		if (this.aClass5_Sub5_67 != null) {
			this.aClass5_Sub5_67.aClass5_Sub5_66 = this.aClass5_Sub5_66;
			this.aClass5_Sub5_66.aClass5_Sub5_67 = this.aClass5_Sub5_67;
			this.aClass5_Sub5_66 = null;
			this.aClass5_Sub5_67 = null;
		}
	}
}
