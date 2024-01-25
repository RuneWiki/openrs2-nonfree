import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "Lclient!wfa;")
	public Class3_Sub4 aClass3_Sub4_66;

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "Lclient!wfa;")
	public Class3_Sub4 aClass3_Sub4_67;

	@OriginalMember(owner = "client!wfa", name = "m", descriptor = "J")
	public long aLong274;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	public final void method8732() {
		if (this.aClass3_Sub4_67 != null) {
			this.aClass3_Sub4_67.aClass3_Sub4_66 = this.aClass3_Sub4_66;
			this.aClass3_Sub4_66.aClass3_Sub4_67 = this.aClass3_Sub4_67;
			this.aClass3_Sub4_67 = null;
			this.aClass3_Sub4_66 = null;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)Z")
	public final boolean method8736() {
		return this.aClass3_Sub4_67 != null;
	}
}
