import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class Class4 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "J")
	public long aLong223;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!ge;")
	public Class4 aClass4_251;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!ge;")
	public Class4 aClass4_252;

	static {
		new Class159("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
	public final void method5687() {
		if (this.aClass4_251 != null) {
			this.aClass4_251.aClass4_252 = this.aClass4_252;
			this.aClass4_252.aClass4_251 = this.aClass4_251;
			this.aClass4_252 = null;
			this.aClass4_251 = null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Z")
	public final boolean method5689() {
		return this.aClass4_251 != null;
	}
}
