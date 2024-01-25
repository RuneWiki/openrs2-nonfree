import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
	public final int anInt5220;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
	public final int anInt5218;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "[I")
	public final int[] anIntArray331;

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "[I")
	public final int[] anIntArray332;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5220 = arg0;
		@Pc(11) Class6_Sub26 local11 = new Class6_Sub26(arg1);
		this.anInt5218 = local11.method4966();
		this.anIntArray331 = new int[this.anInt5218];
		this.anIntArray332 = new int[this.anInt5218];
		this.aBooleanArray16 = new boolean[this.anInt5218];
		this.anIntArrayArray36 = new int[this.anInt5218][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5218; local38++) {
			this.anIntArray331[local38] = local11.method4966();
			if (this.anIntArray331[local38] == 6) {
				this.anIntArray331[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt5218; local71++) {
			this.aBooleanArray16[local71] = local11.method4966() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt5218; local94++) {
			this.anIntArray332[local94] = local11.method4999();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt5218; local110++) {
			this.anIntArrayArray36[local110] = new int[local11.method4966()];
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt5218; local127++) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArrayArray36[local127].length; local131++) {
				this.anIntArrayArray36[local127][local131] = local11.method4966();
			}
		}
	}
}
