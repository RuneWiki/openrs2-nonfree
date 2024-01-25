import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public final int anInt5525;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
	public final int anInt5527;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[I")
	public final int[] anIntArray511;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "[I")
	public final int[] anIntArray510;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5525 = arg0;
		@Pc(11) Class6_Sub14 local11 = new Class6_Sub14(arg1);
		this.anInt5527 = local11.method6041();
		this.aBooleanArray31 = new boolean[this.anInt5527];
		this.anIntArray511 = new int[this.anInt5527];
		this.anIntArrayArray65 = new int[this.anInt5527][];
		this.anIntArray510 = new int[this.anInt5527];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5527; local38++) {
			this.anIntArray510[local38] = local11.method6041();
			if (this.anIntArray510[local38] == 6) {
				this.anIntArray510[local38] = 2;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt5527; local65++) {
			this.aBooleanArray31[local65] = local11.method6041() == 1;
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt5527; local90++) {
			this.anIntArray511[local90] = local11.method6006();
		}
		for (@Pc(106) int local106 = 0; local106 < this.anInt5527; local106++) {
			this.anIntArrayArray65[local106] = new int[local11.method6041()];
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt5527; local127++) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArrayArray65[local127].length; local131++) {
				this.anIntArrayArray65[local127][local131] = local11.method6041();
			}
		}
	}
}
