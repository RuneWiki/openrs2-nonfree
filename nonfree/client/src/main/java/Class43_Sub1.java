import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
	private final int anInt1072;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	private final int anInt1062;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
	private final int anInt1064;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
	private final int anInt1070;

	static {
		new Class169("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIII)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1072 = arg3;
		this.anInt1062 = arg0;
		this.anInt1064 = arg2;
		this.anInt1070 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
	@Override
	public void method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1062 >> 12;
		@Pc(17) int local17 = this.anInt1064 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1070 >> 12;
		@Pc(31) int local31 = this.anInt1072 * arg1 >> 12;
		Static181.method4752(local31, local10, local17, local24, super.anInt5750);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)V")
	@Override
	public void method4938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)V")
	@Override
	public void method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
