import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class Class6 {

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!cg;")
	public Class6 aClass6_251;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "J")
	public long aLong229;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!cg;")
	public Class6 aClass6_252;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public final void method6525() {
		if (this.aClass6_251 != null) {
			this.aClass6_251.aClass6_252 = this.aClass6_252;
			this.aClass6_252.aClass6_251 = this.aClass6_251;
			this.aClass6_251 = null;
			this.aClass6_252 = null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
	public final boolean method6531() {
		return this.aClass6_251 != null;
	}
}
