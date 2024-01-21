import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class Class5 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!cb;")
	public Class5 aClass5_115;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "J")
	public long aLong146;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!cb;")
	public Class5 aClass5_116;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
	public final boolean method2143() {
		return this.aClass5_116 != null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
	public final void method2144() {
		if (this.aClass5_116 != null) {
			this.aClass5_116.aClass5_115 = this.aClass5_115;
			this.aClass5_115.aClass5_116 = this.aClass5_116;
			this.aClass5_116 = null;
			this.aClass5_115 = null;
		}
	}
}
