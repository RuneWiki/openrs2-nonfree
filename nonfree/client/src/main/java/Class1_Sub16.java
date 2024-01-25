import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
	public final int anInt2342;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
	public final int anInt2345;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
	public final int[] anIntArray222;

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "[I")
	public final int[] anIntArray221;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2342 = arg0;
		@Pc(11) Class1_Sub1 local11 = new Class1_Sub1(arg1);
		this.anInt2345 = local11.method4130();
		this.anIntArrayArray68 = new int[this.anInt2345][];
		this.aBooleanArray9 = new boolean[this.anInt2345];
		this.anIntArray222 = new int[this.anInt2345];
		this.anIntArray221 = new int[this.anInt2345];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2345; local38++) {
			this.anIntArray221[local38] = local11.method4130();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2345; local58++) {
			this.aBooleanArray9[local58] = local11.method4130() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt2345; local85++) {
			this.anIntArray222[local85] = local11.method4093();
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt2345; local105++) {
			this.anIntArrayArray68[local105] = new int[local11.method4130()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt2345; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray68[local122].length; local126++) {
				this.anIntArrayArray68[local122][local126] = local11.method4130();
			}
		}
	}
}
