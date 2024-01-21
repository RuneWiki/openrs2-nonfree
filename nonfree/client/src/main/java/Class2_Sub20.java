import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
	public final int anInt3471;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	private final int anInt3473;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[Z")
	private final boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "[I")
	public final int[] anIntArray311;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3471 = arg0;
		@Pc(11) Class2_Sub13 local11 = new Class2_Sub13(arg1);
		this.anInt3473 = local11.method1402();
		this.aBooleanArray15 = new boolean[this.anInt3473];
		this.anIntArray311 = new int[this.anInt3473];
		this.anIntArrayArray61 = new int[this.anInt3473][];
		for (@Pc(33) int local33 = 0; local33 < this.anInt3473; local33++) {
			this.anIntArray311[local33] = local11.method1402();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt3473; local49++) {
			this.aBooleanArray15[local49] = local11.method1402() == 1;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt3473; local76++) {
			this.anIntArrayArray61[local76] = new int[local11.method1402()];
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt3473; local97++) {
			for (@Pc(101) int local101 = 0; local101 < this.anIntArrayArray61[local97].length; local101++) {
				this.anIntArrayArray61[local97][local101] = local11.method1402();
			}
		}
	}
}
