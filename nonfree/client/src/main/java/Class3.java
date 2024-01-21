import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class Class3 {

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!n;")
	public Class3 aClass3_215;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "J")
	public long aLong154;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!n;")
	public Class3 aClass3_216;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Z")
	public final boolean method3157() {
		return this.aClass3_216 != null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public final void method3159() {
		if (this.aClass3_216 != null) {
			this.aClass3_216.aClass3_215 = this.aClass3_215;
			this.aClass3_215.aClass3_216 = this.aClass3_216;
			this.aClass3_215 = null;
			this.aClass3_216 = null;
		}
	}
}
