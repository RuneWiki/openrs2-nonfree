import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class1_Sub4_Sub39 extends Class1_Sub4 {

	@OriginalMember(owner = "client!wp", name = "G", descriptor = "Z")
	private boolean aBoolean502 = true;

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
	private int anInt7292 = 4096;

	static {
		new Class7("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
		new Class7("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(33) int[] local33 = this.method5958(arg0 - 1 & Static67.anInt1514, 0);
			@Pc(39) int[] local39 = this.method5958(arg0, 0);
			@Pc(49) int[] local49 = this.method5958(arg0 + 1 & Static67.anInt1514, 0);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static66.anInt1511; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt7292;
				@Pc(96) int local96 = (local39[local63 + 1 & Static393.anInt6315] - local39[local63 - 1 & Static393.anInt6315]) * this.anInt7292;
				@Pc(100) int local100 = local96 >> 12;
				@Pc(104) int local104 = local77 >> 12;
				@Pc(110) int local110 = local100 * local100 >> 12;
				@Pc(116) int local116 = local104 * local104 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local110 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(147) int local147;
				@Pc(143) int local143;
				@Pc(139) int local139;
				if (local130 == 0) {
					local147 = 0;
					local139 = 0;
					local143 = 0;
				} else {
					local139 = 16777216 / local130;
					local143 = local77 / local130;
					local147 = local96 / local130;
				}
				if (this.aBoolean502) {
					local143 = (local143 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
				}
				local53[local63] = local147;
				local57[local63] = local143;
				local61[local63] = local139;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt7292 = arg1.method5362();
		} else if (arg0 == 1) {
			this.aBoolean502 = arg1.method5366() == 1;
		}
	}
}
