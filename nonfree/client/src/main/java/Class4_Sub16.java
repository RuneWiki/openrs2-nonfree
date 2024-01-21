import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public final int anInt2018;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	private final int anInt2021;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
	public final int[] anIntArray200;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2018 = arg0;
		@Pc(11) Class4_Sub11 local11 = new Class4_Sub11(arg1);
		this.anInt2021 = local11.method719();
		this.anIntArrayArray19 = new int[this.anInt2021][];
		this.anIntArray200 = new int[this.anInt2021];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2021; local28++) {
			this.anIntArray200[local28] = local11.method719();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2021; local44++) {
			this.anIntArrayArray19[local44] = new int[local11.method719()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt2021; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray19[local61].length; local65++) {
				this.anIntArrayArray19[local61][local65] = local11.method719();
			}
		}
	}
}
