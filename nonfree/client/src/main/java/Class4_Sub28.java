import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	public int anInt4088;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	public int anInt4084;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
	public int[] anIntArray342;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "[Z")
	public boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4088 = arg0;
		@Pc(11) Class4_Sub24 local11 = new Class4_Sub24(arg1);
		this.anInt4084 = local11.method3110();
		this.anIntArrayArray28 = new int[this.anInt4084][];
		this.anIntArray342 = new int[this.anInt4084];
		this.aBooleanArray28 = new boolean[this.anInt4084];
		this.anIntArray340 = new int[this.anInt4084];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt4084; local38++) {
			this.anIntArray340[local38] = local11.method3110();
		}
		for (local38 = 0; local38 < this.anInt4084; local38++) {
			this.aBooleanArray28[local38] = local11.method3110() == 1;
		}
		for (local38 = 0; local38 < this.anInt4084; local38++) {
			this.anIntArray342[local38] = local11.method3085();
		}
		for (local38 = 0; local38 < this.anInt4084; local38++) {
			this.anIntArrayArray28[local38] = new int[local11.method3110()];
		}
		for (local38 = 0; local38 < this.anInt4084; local38++) {
			for (@Pc(116) int local116 = 0; local116 < this.anIntArrayArray28[local38].length; local116++) {
				this.anIntArrayArray28[local38][local116] = local11.method3110();
			}
		}
	}
}
