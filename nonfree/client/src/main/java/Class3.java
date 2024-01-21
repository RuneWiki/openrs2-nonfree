import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class Class3 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!id;")
	public Class3 aClass3_213;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "J")
	public long aLong147;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!id;")
	public Class3 aClass3_214;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public final void method3320() {
		if (this.aClass3_214 != null) {
			this.aClass3_214.aClass3_213 = this.aClass3_213;
			this.aClass3_213.aClass3_214 = this.aClass3_214;
			this.aClass3_213 = null;
			this.aClass3_214 = null;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Z")
	public final boolean method3321() {
		return this.aClass3_214 != null;
	}
}
