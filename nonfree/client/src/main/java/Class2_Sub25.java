import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	public final int anInt4860;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	public final int anInt4863;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray79;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
	public final int[] anIntArray328;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
	public final int[] anIntArray327;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4860 = arg0;
		@Pc(11) Class2_Sub22 local11 = new Class2_Sub22(arg1);
		this.anInt4863 = local11.method8547();
		this.anIntArrayArray24 = new int[this.anInt4863][];
		this.aBooleanArray79 = new boolean[this.anInt4863];
		this.anIntArray328 = new int[this.anInt4863];
		this.anIntArray327 = new int[this.anInt4863];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4863; local38++) {
			this.anIntArray327[local38] = local11.method8547();
			if (this.anIntArray327[local38] == 6) {
				this.anIntArray327[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt4863; local69++) {
			this.aBooleanArray79[local69] = local11.method8547() == 1;
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt4863; local96++) {
			this.anIntArray328[local96] = local11.method8546();
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt4863; local116++) {
			this.anIntArrayArray24[local116] = new int[local11.method8547()];
		}
		for (@Pc(137) int local137 = 0; local137 < this.anInt4863; local137++) {
			for (@Pc(141) int local141 = 0; local141 < this.anIntArrayArray24[local137].length; local141++) {
				this.anIntArrayArray24[local137][local141] = local11.method8547();
			}
		}
	}
}
