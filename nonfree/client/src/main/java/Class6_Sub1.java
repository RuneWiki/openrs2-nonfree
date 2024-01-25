import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "Lclient!lj;")
	public Class6_Sub1 aClass6_Sub1_59;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "Lclient!lj;")
	public Class6_Sub1 aClass6_Sub1_60;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "J")
	public long aLong250;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
	public final void method7852() {
		if (this.aClass6_Sub1_59 != null) {
			this.aClass6_Sub1_59.aClass6_Sub1_60 = this.aClass6_Sub1_60;
			this.aClass6_Sub1_60.aClass6_Sub1_59 = this.aClass6_Sub1_59;
			this.aClass6_Sub1_60 = null;
			this.aClass6_Sub1_59 = null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Z")
	public final boolean method7853() {
		return this.aClass6_Sub1_59 != null;
	}
}
