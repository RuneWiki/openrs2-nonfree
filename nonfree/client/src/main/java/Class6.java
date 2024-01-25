import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class Class6 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Lclient!ol;")
	public Class6 aClass6_251;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "J")
	public long aLong217;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Lclient!ol;")
	public Class6 aClass6_252;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	public final void method5977() {
		if (this.aClass6_251 != null) {
			this.aClass6_251.aClass6_252 = this.aClass6_252;
			this.aClass6_252.aClass6_251 = this.aClass6_251;
			this.aClass6_251 = null;
			this.aClass6_252 = null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)Z")
	public final boolean method5980() {
		return this.aClass6_251 != null;
	}
}
