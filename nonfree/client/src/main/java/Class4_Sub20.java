import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!te", name = "u", descriptor = "I")
	public final int anInt2681;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	private final int anInt2684;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "[[I")
	public final int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "[I")
	public final int[] anIntArray335;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2681 = arg0;
		@Pc(11) Class4_Sub9 local11 = new Class4_Sub9(arg1);
		this.anInt2684 = local11.method773();
		this.anIntArrayArray82 = new int[this.anInt2684][];
		this.anIntArray335 = new int[this.anInt2684];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2684; local28++) {
			this.anIntArray335[local28] = local11.method773();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2684; local44++) {
			this.anIntArrayArray82[local44] = new int[local11.method773()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt2684; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray82[local61].length; local65++) {
				this.anIntArrayArray82[local61][local65] = local11.method773();
			}
		}
	}
}
