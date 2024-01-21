import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class Class6 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!kd;")
	public Class6 aClass6_115;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!kd;")
	public Class6 aClass6_116;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "J")
	public long aLong91;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public final void method2123() {
		if (this.aClass6_115 != null) {
			this.aClass6_115.aClass6_116 = this.aClass6_116;
			this.aClass6_116.aClass6_115 = this.aClass6_115;
			this.aClass6_115 = null;
			this.aClass6_116 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
	public final boolean method2124() {
		return this.aClass6_115 != null;
	}
}
