import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
	public final int anInt2707;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	private final int anInt2705;

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "[[I")
	public final int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "[I")
	public final int[] anIntArray291;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2707 = arg0;
		@Pc(11) Class6_Sub4 local11 = new Class6_Sub4(arg1);
		this.anInt2705 = local11.method1321();
		this.anIntArrayArray34 = new int[this.anInt2705][];
		this.anIntArray291 = new int[this.anInt2705];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2705; local28++) {
			this.anIntArray291[local28] = local11.method1321();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2705; local44++) {
			this.anIntArrayArray34[local44] = new int[local11.method1321()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt2705; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray34[local61].length; local65++) {
				this.anIntArrayArray34[local61][local65] = local11.method1321();
			}
		}
	}
}
