import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
	public final int anInt2109;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
	private final int anInt2105;

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "[I")
	public final int[] anIntArray185;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2109 = arg0;
		@Pc(11) Class3_Sub2 local11 = new Class3_Sub2(arg1);
		this.anInt2105 = local11.method270();
		this.anIntArrayArray20 = new int[this.anInt2105][];
		this.anIntArray185 = new int[this.anInt2105];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2105; local28++) {
			this.anIntArray185[local28] = local11.method270();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2105; local48++) {
			this.anIntArrayArray20[local48] = new int[local11.method270()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt2105; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray20[local65].length; local69++) {
				this.anIntArrayArray20[local65][local69] = local11.method270();
			}
		}
	}
}
