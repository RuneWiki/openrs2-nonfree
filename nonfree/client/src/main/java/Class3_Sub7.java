import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Lclient!lo;")
	public Class3_Sub7 aClass3_Sub7_61;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "J")
	public long aLong198;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!lo;")
	public Class3_Sub7 aClass3_Sub7_62;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public final void method5385() {
		if (this.aClass3_Sub7_61 != null) {
			this.aClass3_Sub7_61.aClass3_Sub7_62 = this.aClass3_Sub7_62;
			this.aClass3_Sub7_62.aClass3_Sub7_61 = this.aClass3_Sub7_61;
			this.aClass3_Sub7_62 = null;
			this.aClass3_Sub7_61 = null;
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(B)Z")
	public final boolean method5388() {
		return this.aClass3_Sub7_61 != null;
	}
}
