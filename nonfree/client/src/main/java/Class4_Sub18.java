import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
	public int anInt2706 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	public int anInt2714 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
	public int anInt2711 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
	public int anInt2710 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public int anInt2708 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
	public int anInt2712 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
	public int anInt2716 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
	public int anInt2715 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "Lclient!ak;")
	public final Class4_Sub3 aClass4_Sub3_1;

	static {
		new Class159("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!ak;)V")
	public Class4_Sub18(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z")
	public boolean method2379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt2714 && this.anInt2712 >= arg0 && this.anInt2715 <= arg1 && this.anInt2710 >= arg1) {
			return true;
		} else {
			return this.anInt2708 <= arg0 && arg0 <= this.anInt2711 && this.anInt2716 <= arg1 && this.anInt2706 >= arg1;
		}
	}
}
