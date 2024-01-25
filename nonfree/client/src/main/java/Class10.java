import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class Class10 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!es;")
	public Class10 aClass10_263;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!es;")
	public Class10 aClass10_264;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "J")
	public long aLong264;

	static {
		new Class182("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public final void method6033() {
		if (this.aClass10_264 != null) {
			this.aClass10_264.aClass10_263 = this.aClass10_263;
			this.aClass10_263.aClass10_264 = this.aClass10_264;
			this.aClass10_264 = null;
			this.aClass10_263 = null;
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)Z")
	public final boolean method6034() {
		return this.aClass10_264 != null;
	}
}
