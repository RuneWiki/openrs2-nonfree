import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "J")
	public long aLong363;

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "Lclient!ffa;")
	public Class3_Sub4 aClass3_Sub4_66;

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "Lclient!ffa;")
	public Class3_Sub4 aClass3_Sub4_67;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)Z")
	public final boolean method8847() {
		return this.aClass3_Sub4_67 != null;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	public final void method8848() {
		if (this.aClass3_Sub4_67 != null) {
			this.aClass3_Sub4_67.aClass3_Sub4_66 = this.aClass3_Sub4_66;
			this.aClass3_Sub4_66.aClass3_Sub4_67 = this.aClass3_Sub4_67;
			this.aClass3_Sub4_66 = null;
			this.aClass3_Sub4_67 = null;
		}
	}
}
