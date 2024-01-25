import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class Class1 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!pn;")
	public Class1 aClass1_251;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "Lclient!pn;")
	public Class1 aClass1_252;

	static {
		new Class34(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
	public final boolean method5627() {
		return this.aClass1_251 != null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	public final void method5628() {
		if (this.aClass1_251 != null) {
			this.aClass1_251.aClass1_252 = this.aClass1_252;
			this.aClass1_252.aClass1_251 = this.aClass1_251;
			this.aClass1_252 = null;
			this.aClass1_251 = null;
		}
	}
}
