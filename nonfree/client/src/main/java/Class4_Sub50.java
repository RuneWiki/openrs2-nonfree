import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class4_Sub50 extends Class4 {

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
	public final int anInt9986;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	public final int anInt9983;

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "[I")
	public final int[] anIntArray558;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "[I")
	public final int[] anIntArray559;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt9986 = arg0;
		@Pc(11) Class4_Sub13 local11 = new Class4_Sub13(arg1);
		this.anInt9983 = local11.method7004();
		this.anIntArrayArray59 = new int[this.anInt9983][];
		this.anIntArray558 = new int[this.anInt9983];
		this.aBooleanArray26 = new boolean[this.anInt9983];
		this.anIntArray559 = new int[this.anInt9983];
		for (@Pc(38) int local38 = 0; local38 < this.anInt9983; local38++) {
			this.anIntArray558[local38] = local11.method7004();
			if (this.anIntArray558[local38] == 6) {
				this.anIntArray558[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt9983; local71++) {
			this.aBooleanArray26[local71] = local11.method7004() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt9983; local94++) {
			this.anIntArray559[local94] = local11.method7054();
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt9983; local114++) {
			this.anIntArrayArray59[local114] = new int[local11.method7004()];
		}
		for (@Pc(135) int local135 = 0; local135 < this.anInt9983; local135++) {
			for (@Pc(139) int local139 = 0; local139 < this.anIntArrayArray59[local135].length; local139++) {
				this.anIntArrayArray59[local135][local139] = local11.method7004();
			}
		}
	}
}
