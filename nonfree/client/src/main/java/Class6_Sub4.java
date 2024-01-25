import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public final int anInt305;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	public final int anInt306;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
	public final int[] anIntArray31;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[Z")
	public final boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "[I")
	public final int[] anIntArray29;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt305 = arg0;
		@Pc(11) Class6_Sub10 local11 = new Class6_Sub10(arg1);
		this.anInt306 = local11.method3972();
		this.anIntArray31 = new int[this.anInt306];
		this.anIntArrayArray19 = new int[this.anInt306][];
		this.aBooleanArray2 = new boolean[this.anInt306];
		this.anIntArray29 = new int[this.anInt306];
		for (@Pc(38) int local38 = 0; local38 < this.anInt306; local38++) {
			this.anIntArray31[local38] = local11.method3972();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt306; local58++) {
			this.aBooleanArray2[local58] = local11.method3972() == 1;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt306; local83++) {
			this.anIntArray29[local83] = local11.method4021();
		}
		for (@Pc(103) int local103 = 0; local103 < this.anInt306; local103++) {
			this.anIntArrayArray19[local103] = new int[local11.method3972()];
		}
		for (@Pc(124) int local124 = 0; local124 < this.anInt306; local124++) {
			for (@Pc(128) int local128 = 0; local128 < this.anIntArrayArray19[local124].length; local128++) {
				this.anIntArrayArray19[local124][local128] = local11.method3972();
			}
		}
	}
}
