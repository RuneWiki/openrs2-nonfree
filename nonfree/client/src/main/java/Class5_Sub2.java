import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!ke;")
	public Class5_Sub2 aClass5_Sub2_59;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "J")
	public long aLong252;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!ke;")
	public Class5_Sub2 aClass5_Sub2_60;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Z")
	public final boolean method7321() {
		return this.aClass5_Sub2_59 != null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public final void method7323() {
		if (this.aClass5_Sub2_59 != null) {
			this.aClass5_Sub2_59.aClass5_Sub2_60 = this.aClass5_Sub2_60;
			this.aClass5_Sub2_60.aClass5_Sub2_59 = this.aClass5_Sub2_59;
			this.aClass5_Sub2_60 = null;
			this.aClass5_Sub2_59 = null;
		}
	}
}
