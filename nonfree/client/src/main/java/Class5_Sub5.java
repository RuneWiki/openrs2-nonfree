import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!cja", name = "n", descriptor = "Lclient!cja;")
	public Class5_Sub5 aClass5_Sub5_65;

	@OriginalMember(owner = "client!cja", name = "p", descriptor = "Lclient!cja;")
	public Class5_Sub5 aClass5_Sub5_66;

	@OriginalMember(owner = "client!cja", name = "m", descriptor = "J")
	public long aLong312;

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V")
	public final void method9186() {
		if (this.aClass5_Sub5_65 != null) {
			this.aClass5_Sub5_65.aClass5_Sub5_66 = this.aClass5_Sub5_66;
			this.aClass5_Sub5_66.aClass5_Sub5_65 = this.aClass5_Sub5_65;
			this.aClass5_Sub5_66 = null;
			this.aClass5_Sub5_65 = null;
		}
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(B)Z")
	public final boolean method9187() {
		return this.aClass5_Sub5_65 != null;
	}
}
