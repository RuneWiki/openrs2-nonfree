import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class Class14 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!tf;")
	public Class14 aClass14_247;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!tf;")
	public Class14 aClass14_248;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "J")
	public long aLong217;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public final void method5986() {
		if (this.aClass14_247 != null) {
			this.aClass14_247.aClass14_248 = this.aClass14_248;
			this.aClass14_248.aClass14_247 = this.aClass14_247;
			this.aClass14_247 = null;
			this.aClass14_248 = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z")
	public final boolean method5989() {
		return this.aClass14_247 != null;
	}
}
