import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!h", name = "y", descriptor = "I")
	public final int anInt870;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	private final int anInt876;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "[I")
	public final int[] anIntArray120;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "[[I")
	public final int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt870 = arg0;
		@Pc(11) Class1_Sub8 local11 = new Class1_Sub8(arg1);
		this.anInt876 = local11.method1186();
		this.anIntArray120 = new int[this.anInt876];
		this.anIntArrayArray10 = new int[this.anInt876][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt876; local28++) {
			this.anIntArray120[local28] = local11.method1186();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt876; local44++) {
			this.anIntArrayArray10[local44] = new int[local11.method1186()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt876; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray10[local61].length; local65++) {
				this.anIntArrayArray10[local61][local65] = local11.method1186();
			}
		}
	}
}
