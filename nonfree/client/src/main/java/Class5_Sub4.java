import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public final int anInt216;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
	public final int anInt214;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "[I")
	public final int[] anIntArray43;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "[I")
	public final int[] anIntArray42;

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "[Z")
	public final boolean[] aBooleanArray3;

	static {
		new Class85("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt216 = arg0;
		@Pc(9) Class5_Sub12 local9 = new Class5_Sub12(arg1);
		this.anInt214 = local9.method5115();
		this.anIntArray43 = new int[this.anInt214];
		this.anIntArray42 = new int[this.anInt214];
		this.anIntArrayArray7 = new int[this.anInt214][];
		this.aBooleanArray3 = new boolean[this.anInt214];
		for (@Pc(36) int local36 = 0; local36 < this.anInt214; local36++) {
			this.anIntArray43[local36] = local9.method5115();
		}
		for (@Pc(51) int local51 = 0; local51 < this.anInt214; local51++) {
			this.aBooleanArray3[local51] = local9.method5115() == 1;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt214; local77++) {
			this.anIntArray42[local77] = local9.method5106();
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt214; local92++) {
			this.anIntArrayArray7[local92] = new int[local9.method5115()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt214; local112++) {
			for (@Pc(115) int local115 = 0; local115 < this.anIntArrayArray7[local112].length; local115++) {
				this.anIntArrayArray7[local112][local115] = local9.method5115();
			}
		}
	}
}
