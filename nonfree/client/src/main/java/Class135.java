import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class135 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "[I")
	private final int[] anIntArray389;

	static {
		new Class85("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "([I)V")
	public Class135(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray389 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray389[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray389[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray389[local58 + local58] = arg0[local48];
			this.anIntArray389[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)I")
	public int method3710(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray389.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray389[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray389[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
