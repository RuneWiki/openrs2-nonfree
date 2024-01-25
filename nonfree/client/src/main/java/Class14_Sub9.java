import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class14_Sub9 extends Class14 {

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
	public final int anInt1543;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
	public final int anInt1540;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "[I")
	public final int[] anIntArray112;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "[I")
	public final int[] anIntArray113;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "[Z")
	public final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I[B)V")
	public Class14_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1543 = arg0;
		@Pc(11) Class14_Sub4 local11 = new Class14_Sub4(arg1);
		this.anInt1540 = local11.method2548();
		this.anIntArray112 = new int[this.anInt1540];
		this.anIntArray113 = new int[this.anInt1540];
		this.anIntArrayArray20 = new int[this.anInt1540][];
		this.aBooleanArray3 = new boolean[this.anInt1540];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1540; local38++) {
			this.anIntArray113[local38] = local11.method2548();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1540; local58++) {
			this.aBooleanArray3[local58] = local11.method2548() == 1;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt1540; local83++) {
			this.anIntArray112[local83] = local11.method2498();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt1540; local99++) {
			this.anIntArrayArray20[local99] = new int[local11.method2548()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt1540; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray20[local120].length; local124++) {
				this.anIntArrayArray20[local120][local124] = local11.method2548();
			}
		}
	}
}
