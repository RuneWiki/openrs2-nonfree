import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	public final int anInt4680;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public final int anInt4679;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "[I")
	public final int[] anIntArray315;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "[I")
	public final int[] anIntArray316;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4680 = arg0;
		@Pc(11) Class2_Sub15 local11 = new Class2_Sub15(arg1);
		this.anInt4679 = local11.method4325();
		this.anIntArray315 = new int[this.anInt4679];
		this.anIntArrayArray29 = new int[this.anInt4679][];
		this.aBooleanArray22 = new boolean[this.anInt4679];
		this.anIntArray316 = new int[this.anInt4679];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4679; local38++) {
			this.anIntArray315[local38] = local11.method4325();
			if (this.anIntArray315[local38] == 6) {
				this.anIntArray315[local38] = 2;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt4679; local65++) {
			this.aBooleanArray22[local65] = local11.method4325() == 1;
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt4679; local86++) {
			this.anIntArray316[local86] = local11.method4294();
		}
		for (@Pc(106) int local106 = 0; local106 < this.anInt4679; local106++) {
			this.anIntArrayArray29[local106] = new int[local11.method4325()];
		}
		for (@Pc(123) int local123 = 0; local123 < this.anInt4679; local123++) {
			for (@Pc(127) int local127 = 0; local127 < this.anIntArrayArray29[local123].length; local127++) {
				this.anIntArrayArray29[local123][local127] = local11.method4325();
			}
		}
	}
}
