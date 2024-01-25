import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
	public final int anInt10883;

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
	public final int anInt10880;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "[I")
	public final int[] anIntArray564;

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "[I")
	public final int[] anIntArray563;

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray64;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt10883 = arg0;
		@Pc(11) Class2_Sub8 local11 = new Class2_Sub8(arg1);
		this.anInt10880 = local11.method5203();
		this.anIntArray564 = new int[this.anInt10880];
		this.anIntArrayArray58 = new int[this.anInt10880][];
		this.anIntArray563 = new int[this.anInt10880];
		this.aBooleanArray64 = new boolean[this.anInt10880];
		for (@Pc(38) int local38 = 0; local38 < this.anInt10880; local38++) {
			this.anIntArray564[local38] = local11.method5203();
			if (this.anIntArray564[local38] == 6) {
				this.anIntArray564[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt10880; local71++) {
			this.aBooleanArray64[local71] = local11.method5203() == 1;
		}
		for (@Pc(98) int local98 = 0; local98 < this.anInt10880; local98++) {
			this.anIntArray563[local98] = local11.method5211();
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt10880; local118++) {
			this.anIntArrayArray58[local118] = new int[local11.method5203()];
		}
		for (@Pc(139) int local139 = 0; local139 < this.anInt10880; local139++) {
			for (@Pc(143) int local143 = 0; local143 < this.anIntArrayArray58[local139].length; local143++) {
				this.anIntArrayArray58[local139][local143] = local11.method5203();
			}
		}
	}
}
