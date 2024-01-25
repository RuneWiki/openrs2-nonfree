import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "Lclient!vba;")
	public Class3_Sub10 aClass3_Sub10_59;

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "J")
	public long aLong277;

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "Lclient!vba;")
	public Class3_Sub10 aClass3_Sub10_60;

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)V")
	public final void method7643() {
		if (this.aClass3_Sub10_60 != null) {
			this.aClass3_Sub10_60.aClass3_Sub10_59 = this.aClass3_Sub10_59;
			this.aClass3_Sub10_59.aClass3_Sub10_60 = this.aClass3_Sub10_60;
			this.aClass3_Sub10_60 = null;
			this.aClass3_Sub10_59 = null;
		}
	}

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)Z")
	public final boolean method7644() {
		return this.aClass3_Sub10_60 != null;
	}
}
