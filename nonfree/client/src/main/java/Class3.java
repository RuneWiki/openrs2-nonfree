import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class Class3 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!ib;")
	public Class3 aClass3_115;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "J")
	public long aLong94;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!ib;")
	public Class3 aClass3_116;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public final void method1962() {
		if (this.aClass3_115 != null) {
			this.aClass3_115.aClass3_116 = this.aClass3_116;
			this.aClass3_116.aClass3_115 = this.aClass3_115;
			this.aClass3_116 = null;
			this.aClass3_115 = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
	public final boolean method1964() {
		return this.aClass3_115 != null;
	}
}
