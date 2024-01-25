import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public final int anInt6681;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	public final int anInt6682;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "[I")
	public final int[] anIntArray470;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[I")
	public final int[] anIntArray469;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6681 = arg0;
		@Pc(11) Class6_Sub12 local11 = new Class6_Sub12(arg1);
		this.anInt6682 = local11.method6019();
		this.anIntArrayArray55 = new int[this.anInt6682][];
		this.anIntArray470 = new int[this.anInt6682];
		this.anIntArray469 = new int[this.anInt6682];
		this.aBooleanArray22 = new boolean[this.anInt6682];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6682; local38++) {
			this.anIntArray469[local38] = local11.method6019();
			if (this.anIntArray469[local38] == 6) {
				this.anIntArray469[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt6682; local71++) {
			this.aBooleanArray22[local71] = local11.method6019() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt6682; local92++) {
			this.anIntArray470[local92] = local11.method6044();
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt6682; local112++) {
			this.anIntArrayArray55[local112] = new int[local11.method6019()];
		}
		for (@Pc(129) int local129 = 0; local129 < this.anInt6682; local129++) {
			for (@Pc(133) int local133 = 0; local133 < this.anIntArrayArray55[local129].length; local133++) {
				this.anIntArrayArray55[local129][local133] = local11.method6019();
			}
		}
	}
}
