import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public int anInt4206;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	private int anInt4205;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "[I")
	public int[] anIntArray483;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "[Z")
	public boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4206 = arg0;
		@Pc(11) Class1_Sub17 local11 = new Class1_Sub17(arg1);
		this.anInt4205 = local11.method2142();
		this.anIntArrayArray34 = new int[this.anInt4205][];
		this.anIntArray483 = new int[this.anInt4205];
		this.aBooleanArray25 = new boolean[this.anInt4205];
		for (@Pc(33) int local33 = 0; local33 < this.anInt4205; local33++) {
			this.anIntArray483[local33] = local11.method2142();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt4205; local49++) {
			this.aBooleanArray25[local49] = local11.method2142() == 1;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt4205; local72++) {
			this.anIntArrayArray34[local72] = new int[local11.method2142()];
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt4205; local89++) {
			for (@Pc(93) int local93 = 0; local93 < this.anIntArrayArray34[local89].length; local93++) {
				this.anIntArrayArray34[local89][local93] = local11.method2142();
			}
		}
	}
}
