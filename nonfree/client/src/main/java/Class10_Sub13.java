import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class10_Sub13 extends Class10 {

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public final int anInt1843;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public final int anInt1841;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
	public final int[] anIntArray148;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[I")
	public final int[] anIntArray149;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[B)V")
	public Class10_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1843 = arg0;
		@Pc(11) Class10_Sub8 local11 = new Class10_Sub8(arg1);
		this.anInt1841 = local11.method2502();
		this.anIntArray148 = new int[this.anInt1841];
		this.aBooleanArray2 = new boolean[this.anInt1841];
		this.anIntArray149 = new int[this.anInt1841];
		this.anIntArrayArray15 = new int[this.anInt1841][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1841; local38++) {
			this.anIntArray148[local38] = local11.method2502();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1841; local58++) {
			this.aBooleanArray2[local58] = local11.method2502() == 1;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt1841; local83++) {
			this.anIntArray149[local83] = local11.method2485();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt1841; local99++) {
			this.anIntArrayArray15[local99] = new int[local11.method2502()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt1841; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray15[local120].length; local124++) {
				this.anIntArrayArray15[local120][local124] = local11.method2502();
			}
		}
	}
}
