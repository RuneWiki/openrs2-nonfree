import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class Class3 {

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!mb;")
	public Class3 aClass3_207;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "J")
	public long aLong144;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!mb;")
	public Class3 aClass3_208;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z")
	public final boolean method3165() {
		return this.aClass3_208 != null;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public final void method3167() {
		if (this.aClass3_208 != null) {
			this.aClass3_208.aClass3_207 = this.aClass3_207;
			this.aClass3_207.aClass3_208 = this.aClass3_208;
			this.aClass3_207 = null;
			this.aClass3_208 = null;
		}
	}
}
