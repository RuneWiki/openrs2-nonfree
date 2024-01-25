import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class211 {

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public final int anInt5432;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	private final int anInt5437;

	static {
		new Class169("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(II)V")
	public Class211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5432 = arg1;
		this.anInt5437 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)I")
	public int method4707() {
		return this.anInt5437;
	}
}
