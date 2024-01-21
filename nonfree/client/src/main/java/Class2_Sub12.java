import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	public final int anInt2332;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	private final int anInt2325;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "[I")
	public final int[] anIntArray216;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "[[I")
	public final int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2332 = arg0;
		@Pc(11) Class2_Sub11 local11 = new Class2_Sub11(arg1);
		this.anInt2325 = local11.method1534();
		this.anIntArray216 = new int[this.anInt2325];
		this.aBooleanArray14 = new boolean[this.anInt2325];
		this.anIntArrayArray18 = new int[this.anInt2325][];
		for (@Pc(33) int local33 = 0; local33 < this.anInt2325; local33++) {
			this.anIntArray216[local33] = local11.method1534();
		}
		for (@Pc(53) int local53 = 0; local53 < this.anInt2325; local53++) {
			this.aBooleanArray14[local53] = local11.method1534() == 1;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt2325; local76++) {
			this.anIntArrayArray18[local76] = new int[local11.method1534()];
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt2325; local97++) {
			for (@Pc(101) int local101 = 0; local101 < this.anIntArrayArray18[local97].length; local101++) {
				this.anIntArrayArray18[local97][local101] = local11.method1534();
			}
		}
	}
}
