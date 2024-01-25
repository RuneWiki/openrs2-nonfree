import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class Class4 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!nd;")
	public Class4 aClass4_261;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "J")
	public long aLong227;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!nd;")
	public Class4 aClass4_262;

	static {
		new Class15("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public final void method6059() {
		if (this.aClass4_262 != null) {
			this.aClass4_262.aClass4_261 = this.aClass4_261;
			this.aClass4_261.aClass4_262 = this.aClass4_262;
			this.aClass4_262 = null;
			this.aClass4_261 = null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z")
	public final boolean method6060() {
		return this.aClass4_262 != null;
	}
}
