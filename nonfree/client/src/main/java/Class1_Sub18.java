import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!q", name = "y", descriptor = "I")
	public final int anInt3402;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "I")
	private final int anInt3401;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "[Z")
	private final boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!q", name = "E", descriptor = "[I")
	public final int[] anIntArray448;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3402 = arg0;
		@Pc(11) Class1_Sub8 local11 = new Class1_Sub8(arg1);
		this.anInt3401 = local11.method861();
		this.anIntArrayArray31 = new int[this.anInt3401][];
		this.aBooleanArray18 = new boolean[this.anInt3401];
		this.anIntArray448 = new int[this.anInt3401];
		for (@Pc(33) int local33 = 0; local33 < this.anInt3401; local33++) {
			this.anIntArray448[local33] = local11.method861();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt3401; local49++) {
			this.aBooleanArray18[local49] = local11.method861() == 1;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt3401; local72++) {
			this.anIntArrayArray31[local72] = new int[local11.method861()];
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt3401; local89++) {
			for (@Pc(93) int local93 = 0; local93 < this.anIntArrayArray31[local89].length; local93++) {
				this.anIntArrayArray31[local89][local93] = local11.method861();
			}
		}
	}
}
