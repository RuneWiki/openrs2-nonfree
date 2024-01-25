import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class12_Sub11 extends Class12 {

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
	public final int anInt2274;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
	public final int anInt2271;

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "[Z")
	public final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "[I")
	public final int[] anIntArray200;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "[I")
	public final int[] anIntArray198;

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray22;

	static {
		new Class88("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I[B)V")
	public Class12_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2274 = arg0;
		@Pc(11) Class12_Sub8 local11 = new Class12_Sub8(arg1);
		this.anInt2271 = local11.method5216();
		this.aBooleanArray20 = new boolean[this.anInt2271];
		this.anIntArray200 = new int[this.anInt2271];
		this.anIntArray198 = new int[this.anInt2271];
		this.anIntArrayArray22 = new int[this.anInt2271][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2271; local38++) {
			this.anIntArray200[local38] = local11.method5216();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt2271; local54++) {
			this.aBooleanArray20[local54] = local11.method5216() == 1;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt2271; local77++) {
			this.anIntArray198[local77] = local11.method5199();
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt2271; local97++) {
			this.anIntArrayArray22[local97] = new int[local11.method5216()];
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt2271; local114++) {
			for (@Pc(118) int local118 = 0; local118 < this.anIntArrayArray22[local114].length; local118++) {
				this.anIntArrayArray22[local114][local118] = local11.method5216();
			}
		}
	}
}
