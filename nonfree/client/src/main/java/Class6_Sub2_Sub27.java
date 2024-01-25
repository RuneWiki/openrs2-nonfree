import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class6_Sub2_Sub27 extends Class6_Sub2 {

	static {
		new Class231("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(24) int local24 = Static168.anIntArray278[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static185.anInt4925; local26++) {
				local11[local26] = this.method4188(Static53.anIntArray95[local26], local24) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(III)I")
	private int method4188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - ((local20 * 15731 * local20 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
