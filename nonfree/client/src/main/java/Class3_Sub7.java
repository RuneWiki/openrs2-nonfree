import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "J")
	public long aLong263;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "Lclient!bm;")
	public Class3_Sub7 aClass3_Sub7_61;

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "Lclient!bm;")
	public Class3_Sub7 aClass3_Sub7_62;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)Z")
	public final boolean method8131() {
		return this.aClass3_Sub7_62 != null;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public final void method8136() {
		if (this.aClass3_Sub7_62 != null) {
			this.aClass3_Sub7_62.aClass3_Sub7_61 = this.aClass3_Sub7_61;
			this.aClass3_Sub7_61.aClass3_Sub7_62 = this.aClass3_Sub7_62;
			this.aClass3_Sub7_61 = null;
			this.aClass3_Sub7_62 = null;
		}
	}
}
