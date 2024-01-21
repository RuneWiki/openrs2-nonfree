import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	public final int anInt2400;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
	private final int anInt2410;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "[I")
	public final int[] anIntArray267;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2400 = arg0;
		@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(arg1);
		this.anInt2410 = local11.method218();
		this.aBooleanArray12 = new boolean[this.anInt2410];
		this.anIntArray267 = new int[this.anInt2410];
		this.anIntArrayArray15 = new int[this.anInt2410][];
		for (@Pc(33) int local33 = 0; local33 < this.anInt2410; local33++) {
			this.anIntArray267[local33] = local11.method218();
		}
		for (@Pc(53) int local53 = 0; local53 < this.anInt2410; local53++) {
			this.aBooleanArray12[local53] = local11.method218() == 1;
		}
		for (@Pc(78) int local78 = 0; local78 < this.anInt2410; local78++) {
			this.anIntArrayArray15[local78] = new int[local11.method218()];
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt2410; local99++) {
			for (@Pc(103) int local103 = 0; local103 < this.anIntArrayArray15[local99].length; local103++) {
				this.anIntArrayArray15[local99][local103] = local11.method218();
			}
		}
	}
}
