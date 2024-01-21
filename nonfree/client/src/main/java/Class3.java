import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class Class3 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "J")
	public long aLong94;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!sa;")
	public Class3 aClass3_115;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!sa;")
	public Class3 aClass3_116;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public final void method2055() {
		if (this.aClass3_115 != null) {
			this.aClass3_115.aClass3_116 = this.aClass3_116;
			this.aClass3_116.aClass3_115 = this.aClass3_115;
			this.aClass3_116 = null;
			this.aClass3_115 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Z")
	public final boolean method2056() {
		return this.aClass3_115 != null;
	}
}
