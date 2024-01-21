import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	public final int anInt1317;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
	private final int anInt1321;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
	public final int[] anIntArray125;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "[[I")
	public final int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1317 = arg0;
		@Pc(11) Class5_Sub6 local11 = new Class5_Sub6(arg1);
		this.anInt1321 = local11.method3062();
		this.aBooleanArray16 = new boolean[this.anInt1321];
		this.anIntArray125 = new int[this.anInt1321];
		this.anIntArrayArray14 = new int[this.anInt1321][];
		for (@Pc(33) int local33 = 0; local33 < this.anInt1321; local33++) {
			this.anIntArray125[local33] = local11.method3062();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt1321; local49++) {
			this.aBooleanArray16[local49] = local11.method3062() == 1;
		}
		for (@Pc(70) int local70 = 0; local70 < this.anInt1321; local70++) {
			this.anIntArrayArray14[local70] = new int[local11.method3062()];
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt1321; local87++) {
			for (@Pc(91) int local91 = 0; local91 < this.anIntArrayArray14[local87].length; local91++) {
				this.anIntArrayArray14[local87][local91] = local11.method3062();
			}
		}
	}
}
