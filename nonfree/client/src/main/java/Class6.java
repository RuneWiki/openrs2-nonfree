import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class Class6 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Lclient!on;")
	public Class6 aClass6_247;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!on;")
	public Class6 aClass6_248;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "J")
	public long aLong218;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public final void method5756() {
		if (this.aClass6_247 != null) {
			this.aClass6_247.aClass6_248 = this.aClass6_248;
			this.aClass6_248.aClass6_247 = this.aClass6_247;
			this.aClass6_248 = null;
			this.aClass6_247 = null;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
	public final boolean method5757() {
		return this.aClass6_247 != null;
	}
}
