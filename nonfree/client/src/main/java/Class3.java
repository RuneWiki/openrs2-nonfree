import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class Class3 {

	@OriginalMember(owner = "client!od", name = "d", descriptor = "J")
	public long aLong183;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!od;")
	public Class3 aClass3_209;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!od;")
	public Class3 aClass3_210;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public final void method2783() {
		if (this.aClass3_209 != null) {
			this.aClass3_209.aClass3_210 = this.aClass3_210;
			this.aClass3_210.aClass3_209 = this.aClass3_209;
			this.aClass3_209 = null;
			this.aClass3_210 = null;
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z")
	public final boolean method2784() {
		return this.aClass3_209 != null;
	}
}
