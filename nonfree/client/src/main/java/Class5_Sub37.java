import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class5_Sub37 extends Class5 {

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
	public final int anInt6586;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
	public final int anInt6584;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "[I")
	public final int[] anIntArray371;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "[I")
	public final int[] anIntArray370;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6586 = arg0;
		@Pc(9) Class5_Sub15 local9 = new Class5_Sub15(arg1);
		this.anInt6584 = local9.method3642();
		this.anIntArray371 = new int[this.anInt6584];
		this.anIntArray370 = new int[this.anInt6584];
		this.anIntArrayArray51 = new int[this.anInt6584][];
		this.aBooleanArray16 = new boolean[this.anInt6584];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6584; local36++) {
			this.anIntArray371[local36] = local9.method3642();
			if (this.anIntArray371[local36] == 6) {
				this.anIntArray371[local36] = 2;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < this.anInt6584; local68++) {
			this.aBooleanArray16[local68] = local9.method3642() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt6584; local94++) {
			this.anIntArray370[local94] = local9.method3698();
		}
		for (@Pc(113) int local113 = 0; local113 < this.anInt6584; local113++) {
			this.anIntArrayArray51[local113] = new int[local9.method3642()];
		}
		for (@Pc(133) int local133 = 0; local133 < this.anInt6584; local133++) {
			for (@Pc(136) int local136 = 0; local136 < this.anIntArrayArray51[local133].length; local136++) {
				this.anIntArrayArray51[local133][local136] = local9.method3642();
			}
		}
	}
}
