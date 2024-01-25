import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class Class11 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!pl;")
	public Class11 aClass11_251;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "J")
	public long aLong215;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Lclient!pl;")
	public Class11 aClass11_252;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public final void method5701() {
		if (this.aClass11_252 != null) {
			this.aClass11_252.aClass11_251 = this.aClass11_251;
			this.aClass11_251.aClass11_252 = this.aClass11_252;
			this.aClass11_251 = null;
			this.aClass11_252 = null;
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)Z")
	public final boolean method5704() {
		return this.aClass11_252 != null;
	}
}
