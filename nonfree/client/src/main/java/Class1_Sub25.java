import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
	public final int anInt4732;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	private final int anInt4734;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray139;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "[I")
	public final int[] anIntArray431;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4732 = arg0;
		@Pc(11) Class1_Sub6 local11 = new Class1_Sub6(arg1);
		this.anInt4734 = local11.method544();
		this.anIntArrayArray139 = new int[this.anInt4734][];
		this.anIntArray431 = new int[this.anInt4734];
		for (@Pc(28) int local28 = 0; local28 < this.anInt4734; local28++) {
			this.anIntArray431[local28] = local11.method544();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt4734; local44++) {
			this.anIntArrayArray139[local44] = new int[local11.method544()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt4734; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray139[local61].length; local65++) {
				this.anIntArrayArray139[local61][local65] = local11.method544();
			}
		}
	}
}
