import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class Class2 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "J")
	public long aLong209;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!rs;")
	public Class2 aClass2_243;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!rs;")
	public Class2 aClass2_244;

	static {
		new Class32("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public final void method5617() {
		if (this.aClass2_244 != null) {
			this.aClass2_244.aClass2_243 = this.aClass2_243;
			this.aClass2_243.aClass2_244 = this.aClass2_244;
			this.aClass2_243 = null;
			this.aClass2_244 = null;
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)Z")
	public final boolean method5618() {
		return this.aClass2_244 != null;
	}
}
