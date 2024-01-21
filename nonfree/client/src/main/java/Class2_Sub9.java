import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	public final int anInt1364;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	private final int anInt1363;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "[I")
	public final int[] anIntArray166;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1364 = arg0;
		@Pc(11) Class2_Sub13 local11 = new Class2_Sub13(arg1);
		this.anInt1363 = local11.method2962();
		this.anIntArray166 = new int[this.anInt1363];
		this.aBooleanArray9 = new boolean[this.anInt1363];
		this.anIntArrayArray16 = new int[this.anInt1363][];
		for (@Pc(33) int local33 = 0; local33 < this.anInt1363; local33++) {
			this.anIntArray166[local33] = local11.method2962();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt1363; local49++) {
			this.aBooleanArray9[local49] = local11.method2962() == 1;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt1363; local72++) {
			this.anIntArrayArray16[local72] = new int[local11.method2962()];
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt1363; local89++) {
			for (@Pc(93) int local93 = 0; local93 < this.anIntArrayArray16[local89].length; local93++) {
				this.anIntArrayArray16[local89][local93] = local11.method2962();
			}
		}
	}
}
