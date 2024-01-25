import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!jda", name = "l", descriptor = "Lclient!jda;")
	public Class2_Sub5 aClass2_Sub5_66;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "Lclient!jda;")
	public Class2_Sub5 aClass2_Sub5_67;

	@OriginalMember(owner = "client!jda", name = "v", descriptor = "J")
	public long aLong283;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)Z")
	public final boolean method8462() {
		return this.aClass2_Sub5_67 != null;
	}

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)V")
	public final void method8464() {
		if (this.aClass2_Sub5_67 != null) {
			this.aClass2_Sub5_67.aClass2_Sub5_66 = this.aClass2_Sub5_66;
			this.aClass2_Sub5_66.aClass2_Sub5_67 = this.aClass2_Sub5_67;
			this.aClass2_Sub5_66 = null;
			this.aClass2_Sub5_67 = null;
		}
	}
}
