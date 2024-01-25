import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Lclient!pp;")
	public Class6_Sub4 aClass6_Sub4_59;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Lclient!pp;")
	public Class6_Sub4 aClass6_Sub4_60;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "J")
	public long aLong247;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Z")
	public final boolean method8033() {
		return this.aClass6_Sub4_60 != null;
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
	public final void method8035() {
		if (this.aClass6_Sub4_60 != null) {
			this.aClass6_Sub4_60.aClass6_Sub4_59 = this.aClass6_Sub4_59;
			this.aClass6_Sub4_59.aClass6_Sub4_60 = this.aClass6_Sub4_60;
			this.aClass6_Sub4_59 = null;
			this.aClass6_Sub4_60 = null;
		}
	}
}
