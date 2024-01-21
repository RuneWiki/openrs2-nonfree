import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	public final int anInt724;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	private final int anInt723;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[Z")
	private final boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "[I")
	public final int[] anIntArray62;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt724 = arg0;
		@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(arg1);
		this.anInt723 = local11.method260();
		this.anIntArrayArray3 = new int[this.anInt723][];
		this.aBooleanArray2 = new boolean[this.anInt723];
		this.anIntArray62 = new int[this.anInt723];
		for (@Pc(33) int local33 = 0; local33 < this.anInt723; local33++) {
			this.anIntArray62[local33] = local11.method260();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt723; local49++) {
			this.aBooleanArray2[local49] = local11.method260() == 1;
		}
		for (@Pc(70) int local70 = 0; local70 < this.anInt723; local70++) {
			this.anIntArrayArray3[local70] = new int[local11.method260()];
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt723; local87++) {
			for (@Pc(91) int local91 = 0; local91 < this.anIntArrayArray3[local87].length; local91++) {
				this.anIntArrayArray3[local87][local91] = local11.method260();
			}
		}
	}
}
