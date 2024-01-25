import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class Class1 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!kp;")
	public Class1 aClass1_261;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "J")
	public long aLong226;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!kp;")
	public Class1 aClass1_262;

	static {
		new Class151("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	public final void method5617() {
		if (this.aClass1_261 != null) {
			this.aClass1_261.aClass1_262 = this.aClass1_262;
			this.aClass1_262.aClass1_261 = this.aClass1_261;
			this.aClass1_261 = null;
			this.aClass1_262 = null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)Z")
	public final boolean method5618() {
		return this.aClass1_261 != null;
	}
}
