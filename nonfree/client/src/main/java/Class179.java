import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class179 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "J")
	public final long aLong148;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public final int anInt5392;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public final int anInt5390;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString57;

	static {
		new Class88("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
		new Class88("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong148 = arg4;
		this.anInt5392 = arg0;
		this.anInt5390 = arg2;
		this.aString58 = arg1;
		this.aString57 = arg3;
	}
}
