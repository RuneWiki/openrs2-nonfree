import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	private final int anInt3781;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	private final int anInt3778;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	private final int anInt3779;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	private final int anInt3782;

	static {
		new Class209("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
		new Class209("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIII)V")
	public Class104_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3781 = arg0;
		this.anInt3778 = arg1;
		this.anInt3779 = arg3;
		this.anInt3782 = arg2;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	@Override
	public void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt3781 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt3782 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt3778 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt3779 >> 12;
		Static312.method4390(local25, local39, local18, local32, super.anInt6746);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
