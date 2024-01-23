import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public int anInt1785;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	private int anInt1789;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[Z")
	private boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1785 = arg0;
		@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(arg1);
		this.anInt1789 = local11.method209();
		this.aBooleanArray11 = new boolean[this.anInt1789];
		this.anIntArray169 = new int[this.anInt1789];
		this.anIntArrayArray16 = new int[this.anInt1789][];
		for (@Pc(33) int local33 = 0; local33 < this.anInt1789; local33++) {
			this.anIntArray169[local33] = local11.method209();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt1789; local49++) {
			this.aBooleanArray11[local49] = local11.method209() == 1;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt1789; local76++) {
			this.anIntArrayArray16[local76] = new int[local11.method209()];
		}
		for (@Pc(93) int local93 = 0; local93 < this.anInt1789; local93++) {
			for (@Pc(97) int local97 = 0; local97 < this.anIntArrayArray16[local93].length; local97++) {
				this.anIntArrayArray16[local93][local97] = local11.method209();
			}
		}
	}
}
