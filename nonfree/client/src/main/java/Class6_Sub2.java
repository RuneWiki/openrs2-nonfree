import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	public final int anInt555;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	public final int anInt552;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "[I")
	public final int[] anIntArray17;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "[I")
	public final int[] anIntArray16;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[Z")
	public final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt555 = arg0;
		@Pc(11) Class6_Sub8 local11 = new Class6_Sub8(arg1);
		this.anInt552 = local11.method8246();
		this.anIntArray17 = new int[this.anInt552];
		this.anIntArray16 = new int[this.anInt552];
		this.aBooleanArray1 = new boolean[this.anInt552];
		this.anIntArrayArray2 = new int[this.anInt552][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt552; local38++) {
			this.anIntArray16[local38] = local11.method8246();
			if (this.anIntArray16[local38] == 6) {
				this.anIntArray16[local38] = 2;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt552; local65++) {
			this.aBooleanArray1[local65] = local11.method8246() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt552; local92++) {
			this.anIntArray17[local92] = local11.method8220();
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt552; local112++) {
			this.anIntArrayArray2[local112] = new int[local11.method8246()];
		}
		for (@Pc(133) int local133 = 0; local133 < this.anInt552; local133++) {
			for (@Pc(137) int local137 = 0; local137 < this.anIntArrayArray2[local133].length; local137++) {
				this.anIntArrayArray2[local133][local137] = local11.method8246();
			}
		}
	}
}
