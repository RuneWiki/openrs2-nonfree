import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public final int anInt442;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	public final int anInt437;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "[I")
	public final int[] anIntArray28;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "[I")
	public final int[] anIntArray26;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt442 = arg0;
		@Pc(11) Class6_Sub15 local11 = new Class6_Sub15(arg1);
		this.anInt437 = local11.method3030();
		this.anIntArray28 = new int[this.anInt437];
		this.aBooleanArray3 = new boolean[this.anInt437];
		this.anIntArray26 = new int[this.anInt437];
		this.anIntArrayArray3 = new int[this.anInt437][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt437; local38++) {
			this.anIntArray28[local38] = local11.method3030();
			if (this.anIntArray28[local38] == 6) {
				this.anIntArray28[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt437; local71++) {
			this.aBooleanArray3[local71] = local11.method3030() == 1;
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt437; local101++) {
			this.anIntArray26[local101] = local11.method3018();
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt437; local121++) {
			this.anIntArrayArray3[local121] = new int[local11.method3030()];
		}
		for (@Pc(142) int local142 = 0; local142 < this.anInt437; local142++) {
			for (@Pc(148) int local148 = 0; local148 < this.anIntArrayArray3[local142].length; local148++) {
				this.anIntArrayArray3[local142][local148] = local11.method3030();
			}
		}
	}
}
