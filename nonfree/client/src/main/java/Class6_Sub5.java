import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "J")
	public long aLong254;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!tm;")
	public Class6_Sub5 aClass6_Sub5_66;

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "Lclient!tm;")
	public Class6_Sub5 aClass6_Sub5_67;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)Z")
	public final boolean method7746() {
		return this.aClass6_Sub5_67 != null;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V")
	public final void method7748() {
		if (this.aClass6_Sub5_67 != null) {
			this.aClass6_Sub5_67.aClass6_Sub5_66 = this.aClass6_Sub5_66;
			this.aClass6_Sub5_66.aClass6_Sub5_67 = this.aClass6_Sub5_67;
			this.aClass6_Sub5_66 = null;
			this.aClass6_Sub5_67 = null;
		}
	}
}
