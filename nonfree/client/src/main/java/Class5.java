import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class Class5 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!pb;")
	public Class5 aClass5_299;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "J")
	public long aLong282;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!pb;")
	public Class5 aClass5_300;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public final void method8911() {
		if (this.aClass5_300 != null) {
			this.aClass5_300.aClass5_299 = this.aClass5_299;
			this.aClass5_299.aClass5_300 = this.aClass5_300;
			this.aClass5_299 = null;
			this.aClass5_300 = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z")
	public final boolean method8913() {
		return this.aClass5_300 != null;
	}
}
