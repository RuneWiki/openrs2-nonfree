import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class5_Sub1_Sub13_Sub1 extends Class5_Sub1_Sub13 {

	static {
		new Class40("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520 && this.method5836()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(47) int local47 = arg0 % super.anInt7204 * super.anInt7204;
			for (@Pc(49) int local49 = 0; local49 < Static147.anInt3075; local49++) {
				@Pc(62) int local62 = super.anIntArray558[local47 + local49 % super.anInt7202];
				local39[local49] = (local62 & 0xFF) << 4;
				local35[local49] = local62 >> 4 & 0xFF0;
				local31[local49] = local62 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
