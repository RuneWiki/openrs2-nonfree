import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!u", name = "L", descriptor = "I")
	public final int anInt2684;

	@OriginalMember(owner = "client!u", name = "S", descriptor = "I")
	private final int anInt2686;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "[[I")
	public final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "[I")
	public final int[] anIntArray314;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2684 = arg0;
		@Pc(11) Class3_Sub6 local11 = new Class3_Sub6(arg1);
		this.anInt2686 = local11.method1587();
		this.anIntArrayArray21 = new int[this.anInt2686][];
		this.anIntArray314 = new int[this.anInt2686];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2686; local28++) {
			this.anIntArray314[local28] = local11.method1587();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2686; local48++) {
			this.anIntArrayArray21[local48] = new int[local11.method1587()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt2686; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray21[local65].length; local69++) {
				this.anIntArrayArray21[local65][local69] = local11.method1587();
			}
		}
	}
}
