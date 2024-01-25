import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	static {
		new Class93("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(21) int[] local21 = this.method5876(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static339.anInt6735; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(29) int[][] local29 = this.method5887(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static339.anInt6735; local55++) {
				local45[local55] = 4096 - local33[local55];
				local49[local55] = 4096 - local37[local55];
				local53[local55] = 4096 - local41[local55];
			}
		}
		return local19;
	}
}
