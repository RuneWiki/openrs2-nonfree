import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
	public final int anInt2697;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
	public final int anInt2698;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "[I")
	public final int[] anIntArray311;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "[I")
	public final int[] anIntArray310;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "[Z")
	public final boolean[] aBooleanArray61;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2697 = arg0;
		@Pc(11) Class2_Sub13 local11 = new Class2_Sub13(arg1);
		this.anInt2698 = local11.method4240();
		this.anIntArray311 = new int[this.anInt2698];
		this.anIntArrayArray10 = new int[this.anInt2698][];
		this.anIntArray310 = new int[this.anInt2698];
		this.aBooleanArray61 = new boolean[this.anInt2698];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2698; local38++) {
			this.anIntArray310[local38] = local11.method4240();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2698; local58++) {
			this.aBooleanArray61[local58] = local11.method4240() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt2698; local79++) {
			this.anIntArray311[local79] = local11.method4245();
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt2698; local95++) {
			this.anIntArrayArray10[local95] = new int[local11.method4240()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt2698; local112++) {
			for (@Pc(116) int local116 = 0; local116 < this.anIntArrayArray10[local112].length; local116++) {
				this.anIntArrayArray10[local112][local116] = local11.method4240();
			}
		}
	}
}
