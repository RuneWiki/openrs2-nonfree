import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	public final int anInt3837;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
	private final int anInt3835;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "[[I")
	public final int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
	public final int[] anIntArray362;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3837 = arg0;
		@Pc(11) Class1_Sub9 local11 = new Class1_Sub9(arg1);
		this.anInt3835 = local11.method1234();
		this.anIntArrayArray32 = new int[this.anInt3835][];
		this.anIntArray362 = new int[this.anInt3835];
		this.aBooleanArray17 = new boolean[this.anInt3835];
		for (@Pc(33) int local33 = 0; local33 < this.anInt3835; local33++) {
			this.anIntArray362[local33] = local11.method1234();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt3835; local49++) {
			this.aBooleanArray17[local49] = local11.method1234() == 1;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt3835; local76++) {
			this.anIntArrayArray32[local76] = new int[local11.method1234()];
		}
		for (@Pc(93) int local93 = 0; local93 < this.anInt3835; local93++) {
			for (@Pc(97) int local97 = 0; local97 < this.anIntArrayArray32[local93].length; local97++) {
				this.anIntArrayArray32[local93][local97] = local11.method1234();
			}
		}
	}
}
