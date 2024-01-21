import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class Class3 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ee;")
	public Class3 aClass3_209;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "J")
	public long aLong143;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!ee;")
	public Class3 aClass3_210;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public final void method2900() {
		if (this.aClass3_210 != null) {
			this.aClass3_210.aClass3_209 = this.aClass3_209;
			this.aClass3_209.aClass3_210 = this.aClass3_210;
			this.aClass3_210 = null;
			this.aClass3_209 = null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z")
	public final boolean method2903() {
		return this.aClass3_210 != null;
	}
}
