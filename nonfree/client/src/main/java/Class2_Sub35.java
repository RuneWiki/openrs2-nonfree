import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
	public final int anInt5875;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
	public final int anInt5879;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray44;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "[I")
	public final int[] anIntArray379;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "[I")
	public final int[] anIntArray380;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5875 = arg0;
		@Pc(11) Class2_Sub20 local11 = new Class2_Sub20(arg1);
		this.anInt5879 = local11.method3737();
		this.aBooleanArray44 = new boolean[this.anInt5879];
		this.anIntArray379 = new int[this.anInt5879];
		this.anIntArrayArray45 = new int[this.anInt5879][];
		this.anIntArray380 = new int[this.anInt5879];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5879; local38++) {
			this.anIntArray379[local38] = local11.method3737();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt5879; local58++) {
			this.aBooleanArray44[local58] = local11.method3737() == 1;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt5879; local83++) {
			this.anIntArray380[local83] = local11.method3711();
		}
		for (@Pc(103) int local103 = 0; local103 < this.anInt5879; local103++) {
			this.anIntArrayArray45[local103] = new int[local11.method3737()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt5879; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray45[local120].length; local124++) {
				this.anIntArrayArray45[local120][local124] = local11.method3737();
			}
		}
	}
}
