import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class Class5 {

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!vi;")
	public Class5 aClass5_251;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!vi;")
	public Class5 aClass5_252;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "J")
	public long aLong235;

	static {
		new Class85(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public final void method6005() {
		if (this.aClass5_252 != null) {
			this.aClass5_252.aClass5_251 = this.aClass5_251;
			this.aClass5_251.aClass5_252 = this.aClass5_252;
			this.aClass5_251 = null;
			this.aClass5_252 = null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z")
	public final boolean method6008() {
		return this.aClass5_252 != null;
	}
}
