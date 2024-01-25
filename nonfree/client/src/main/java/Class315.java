import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class315 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
	public int anInt9110;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
	public int anInt9111;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "B")
	private byte aByte107;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	public int anInt9116;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	public int anInt9118;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	public int anInt9119;

	static {
		new Class40("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class315() {
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class315(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aByte107 = arg0.method4196();
		this.anInt9116 = arg0.method4227();
		this.anInt9110 = arg0.method4230();
		this.anInt9119 = arg0.method4230();
		this.anInt9111 = arg0.method4230();
		this.anInt9118 = arg0.method4230();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I")
	public int method7395() {
		return this.aByte107 & 0x7;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
	public int method7397() {
		return (this.aByte107 & 0x8) == 8 ? 1 : 0;
	}
}
