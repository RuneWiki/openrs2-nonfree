import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class2_Sub13_Sub3_Sub1 extends Class2_Sub13_Sub3 {

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	static {
		new Class202("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!ws;Ljava/lang/Object;I)V")
	public Class2_Sub13_Sub3_Sub1(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3363() {
		return this.anObject5;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3362() {
		return false;
	}
}
