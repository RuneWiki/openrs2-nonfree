import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!af", name = "w", descriptor = "I")
	public final int anInt246;

	@OriginalMember(owner = "client!af", name = "y", descriptor = "I")
	private final int anInt247;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!af", name = "C", descriptor = "[[I")
	public final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
	public final int[] anIntArray27;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt246 = arg0;
		@Pc(11) Class1_Sub8 local11 = new Class1_Sub8(arg1);
		this.anInt247 = local11.method1607();
		this.aBooleanArray5 = new boolean[this.anInt247];
		this.anIntArrayArray2 = new int[this.anInt247][];
		this.anIntArray27 = new int[this.anInt247];
		for (@Pc(33) int local33 = 0; local33 < this.anInt247; local33++) {
			this.anIntArray27[local33] = local11.method1607();
		}
		for (@Pc(53) int local53 = 0; local53 < this.anInt247; local53++) {
			this.aBooleanArray5[local53] = local11.method1607() == 1;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt247; local76++) {
			this.anIntArrayArray2[local76] = new int[local11.method1607()];
		}
		for (@Pc(93) int local93 = 0; local93 < this.anInt247; local93++) {
			for (@Pc(97) int local97 = 0; local97 < this.anIntArrayArray2[local93].length; local97++) {
				this.anIntArrayArray2[local93][local97] = local11.method1607();
			}
		}
	}
}
