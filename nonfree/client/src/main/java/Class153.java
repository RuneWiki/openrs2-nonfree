import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class153 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_24;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "J")
	public final long aLong121;

	static {
		new Class151("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!od;JI)V")
	public Class153(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass128_Sub2_24 = arg0;
		this.aLong121 = arg1;
	}

	@OriginalMember(owner = "client!lv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass128_Sub2_24.method3662(this.aLong121);
		super.finalize();
	}
}
