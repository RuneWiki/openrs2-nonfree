import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "J")
	public long aLong219;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "Lclient!pg;")
	public Class4_Sub1 aClass4_Sub1_57;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Lclient!pg;")
	public Class4_Sub1 aClass4_Sub1_58;

	static {
		new Class21("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Z")
	public final boolean method5982() {
		return this.aClass4_Sub1_58 != null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public final void method5985() {
		if (this.aClass4_Sub1_58 != null) {
			this.aClass4_Sub1_58.aClass4_Sub1_57 = this.aClass4_Sub1_57;
			this.aClass4_Sub1_57.aClass4_Sub1_58 = this.aClass4_Sub1_58;
			this.aClass4_Sub1_58 = null;
			this.aClass4_Sub1_57 = null;
		}
	}
}
