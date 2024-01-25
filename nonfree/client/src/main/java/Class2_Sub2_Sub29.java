import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	private int anInt5932 = 4096;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	private int anInt5934 = 4096;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
	private int anInt5937 = 4096;

	static {
		new Class231("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
		new Class231("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(28) int[][] local28 = this.method6276(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static398.anInt6955; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local60 == local64 && local64 == local68) {
					local44[local54] = local60 * this.anInt5932 >> 12;
					local48[local54] = this.anInt5937 * local64 >> 12;
					local52[local54] = local68 * this.anInt5934 >> 12;
				} else {
					local44[local54] = this.anInt5932;
					local48[local54] = this.anInt5937;
					local52[local54] = this.anInt5934;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5932 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt5937 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt5934 = arg0.method6148();
		}
	}
}
