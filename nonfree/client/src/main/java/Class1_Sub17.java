import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public final int anInt2782;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	private final int anInt2785;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "[I")
	public final int[] anIntArray223;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2782 = arg0;
		@Pc(9) Class1_Sub7 local9 = new Class1_Sub7(arg1);
		this.anInt2785 = local9.method2771();
		this.anIntArrayArray20 = new int[this.anInt2785][];
		this.aBooleanArray12 = new boolean[this.anInt2785];
		this.anIntArray223 = new int[this.anInt2785];
		for (@Pc(31) int local31 = 0; local31 < this.anInt2785; local31++) {
			this.anIntArray223[local31] = local9.method2771();
		}
		for (@Pc(46) int local46 = 0; local46 < this.anInt2785; local46++) {
			this.aBooleanArray12[local46] = local9.method2771() == 1;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt2785; local72++) {
			this.anIntArrayArray20[local72] = new int[local9.method2771()];
		}
		for (@Pc(88) int local88 = 0; local88 < this.anInt2785; local88++) {
			for (@Pc(91) int local91 = 0; local91 < this.anIntArrayArray20[local88].length; local91++) {
				this.anIntArrayArray20[local88][local91] = local9.method2771();
			}
		}
	}
}
