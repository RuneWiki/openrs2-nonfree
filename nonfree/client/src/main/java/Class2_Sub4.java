import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
	public final int anInt580;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	public final int anInt579;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
	public final int[] anIntArray49;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[I")
	public final int[] anIntArray48;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt580 = arg0;
		@Pc(11) Class2_Sub13 local11 = new Class2_Sub13(arg1);
		this.anInt579 = local11.method3580();
		this.anIntArrayArray3 = new int[this.anInt579][];
		this.anIntArray49 = new int[this.anInt579];
		this.anIntArray48 = new int[this.anInt579];
		this.aBooleanArray2 = new boolean[this.anInt579];
		for (@Pc(38) int local38 = 0; local38 < this.anInt579; local38++) {
			this.anIntArray49[local38] = local11.method3580();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt579; local58++) {
			this.aBooleanArray2[local58] = local11.method3580() == 1;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt579; local83++) {
			this.anIntArray48[local83] = local11.method3555();
		}
		for (@Pc(103) int local103 = 0; local103 < this.anInt579; local103++) {
			this.anIntArrayArray3[local103] = new int[local11.method3580()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt579; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray3[local120].length; local124++) {
				this.anIntArrayArray3[local120][local124] = local11.method3580();
			}
		}
	}
}
