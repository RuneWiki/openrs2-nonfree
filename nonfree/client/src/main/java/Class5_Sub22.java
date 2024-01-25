import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class5_Sub22 extends Class5 {

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
	public final int anInt2588;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
	public final int anInt2593;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "[Z")
	public final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
	public final int[] anIntArray157;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "[I")
	public final int[] anIntArray158;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2588 = arg0;
		@Pc(11) Class5_Sub1 local11 = new Class5_Sub1(arg1);
		this.anInt2593 = local11.method1832();
		this.aBooleanArray10 = new boolean[this.anInt2593];
		this.anIntArray157 = new int[this.anInt2593];
		this.anIntArray158 = new int[this.anInt2593];
		this.anIntArrayArray15 = new int[this.anInt2593][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2593; local38++) {
			this.anIntArray157[local38] = local11.method1832();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2593; local58++) {
			this.aBooleanArray10[local58] = local11.method1832() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt2593; local79++) {
			this.anIntArray158[local79] = local11.method1845();
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt2593; local95++) {
			this.anIntArrayArray15[local95] = new int[local11.method1832()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt2593; local112++) {
			for (@Pc(116) int local116 = 0; local116 < this.anIntArrayArray15[local112].length; local116++) {
				this.anIntArrayArray15[local112][local116] = local11.method1832();
			}
		}
	}
}
