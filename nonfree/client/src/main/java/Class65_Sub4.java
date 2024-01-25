import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class65_Sub4 extends Class65 {

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	private final int anInt5518;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
	private final int anInt5526;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	private final int anInt5515;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
	private final int anInt5528;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	private final int anInt5523;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	private final int anInt5525;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	private final int anInt5519;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	private final int anInt5522;

	static {
		new Class32("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
		new Class32("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
		new Class32("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class65_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5518 = arg2;
		this.anInt5526 = arg0;
		this.anInt5515 = arg6;
		this.anInt5528 = arg7;
		this.anInt5523 = arg3;
		this.anInt5525 = arg1;
		this.anInt5519 = arg5;
		this.anInt5522 = arg4;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	@Override
	public void method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V")
	@Override
	public void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5526 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5525 >> 12;
		@Pc(24) int local24 = this.anInt5518 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5523 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt5522 >> 12;
		@Pc(51) int local51 = this.anInt5519 * arg0 >> 12;
		@Pc(58) int local58 = this.anInt5515 * arg1 >> 12;
		@Pc(65) int local65 = this.anInt5528 * arg0 >> 12;
		Static388.method5656(local58, local24, local31, local51, super.anInt5514, local38, local17, local65, local10);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
