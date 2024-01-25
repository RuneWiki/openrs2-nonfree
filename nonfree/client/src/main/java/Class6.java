import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class Class6 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!kd;")
	public Class6 aClass6_285;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!kd;")
	public Class6 aClass6_286;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "J")
	public long aLong263;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)Z")
	public final boolean method7803() {
		return this.aClass6_285 != null;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public final void method7804() {
		if (this.aClass6_285 != null) {
			this.aClass6_285.aClass6_286 = this.aClass6_286;
			this.aClass6_286.aClass6_285 = this.aClass6_285;
			this.aClass6_285 = null;
			this.aClass6_286 = null;
		}
	}
}
