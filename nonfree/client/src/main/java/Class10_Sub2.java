import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
	private final int anInt2081;

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
	private final int anInt2078;

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
	private final int anInt2083;

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
	private final int anInt2087;

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
	private final int anInt2084;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
	private final int anInt2085;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
	private final int anInt2076;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
	private final int anInt2079;

	static {
		new Class306("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
		new Class306("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2081 = arg0;
		this.anInt2078 = arg1;
		this.anInt2083 = arg7;
		this.anInt2087 = arg2;
		this.anInt2084 = arg5;
		this.anInt2085 = arg3;
		this.anInt2076 = arg6;
		this.anInt2079 = arg4;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2081 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2078 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2087 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2085 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt2079 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt2084 >> 12;
		@Pc(52) int local52 = this.anInt2076 * arg1 >> 12;
		@Pc(59) int local59 = this.anInt2083 * arg0 >> 12;
		Static402.method6059(local31, local45, local10, local52, local17, super.anInt7906, local59, local24, local38);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(III)V")
	@Override
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V")
	@Override
	public void method6568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
