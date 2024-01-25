import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class194 {

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "[I")
	private final int[] anIntArray457;

	static {
		new Class84("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "([I)V")
	public Class194(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray457 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray457[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray457[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray457[local58 + local58] = arg0[local48];
			this.anIntArray457[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
	public int method4649(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = (this.anIntArray457.length >> 1) - 1;
		@Pc(25) int local25 = arg0 & local21;
		while (true) {
			@Pc(34) int local34 = this.anIntArray457[local25 + local25 + 1];
			if (local34 == -1) {
				return -1;
			}
			if (this.anIntArray457[local25 + local25] == arg0) {
				return local34;
			}
			local25 = local25 + 1 & local21;
		}
	}
}
