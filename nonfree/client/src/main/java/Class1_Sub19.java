import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "I")
	private int anInt2655;

	@OriginalMember(owner = "client!li", name = "y", descriptor = "[Z")
	public boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!li", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2652 = arg0;
		@Pc(11) Class1_Sub16 local11 = new Class1_Sub16(arg1);
		this.anInt2655 = local11.method3793();
		this.aBooleanArray16 = new boolean[this.anInt2655];
		this.anIntArrayArray12 = new int[this.anInt2655][];
		this.anIntArray158 = new int[this.anInt2655];
		for (@Pc(33) int local33 = 0; local33 < this.anInt2655; local33++) {
			this.anIntArray158[local33] = local11.method3793();
		}
		for (@Pc(53) int local53 = 0; local53 < this.anInt2655; local53++) {
			this.aBooleanArray16[local53] = local11.method3793() == 1;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt2655; local74++) {
			this.anIntArrayArray12[local74] = new int[local11.method3793()];
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt2655; local95++) {
			for (@Pc(99) int local99 = 0; local99 < this.anIntArrayArray12[local95].length; local99++) {
				this.anIntArrayArray12[local95][local99] = local11.method3793();
			}
		}
	}
}
