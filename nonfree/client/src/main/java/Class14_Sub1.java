import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "[I")
	public final int[] anIntArray23;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "[I")
	public final int[] anIntArray24;

	static {
		new Class256("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II[I[I)V")
	public Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray23 = arg2;
		this.anIntArray24 = arg3;
	}
}
