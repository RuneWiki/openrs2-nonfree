import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class10_Sub2_Sub33 extends Class10_Sub2 {

	@OriginalMember(owner = "client!up", name = "J", descriptor = "I")
	private int anInt6962 = 0;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "I")
	private int anInt6963 = 4096;

	static {
		new Class182("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6962 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt6963 = arg1.method2485();
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(26) int[] local26 = this.method6041(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static121.anInt2458; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = this.anInt6962 <= local34 && this.anInt6963 >= local34 ? 4096 : 0;
			}
		}
		return local11;
	}
}
