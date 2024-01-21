import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
	public final int anInt1719;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	private final int anInt1715;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "[I")
	public final int[] anIntArray213;

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "[[I")
	public final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1719 = arg0;
		@Pc(11) Class5_Sub11 local11 = new Class5_Sub11(arg1);
		this.anInt1715 = local11.method1546();
		this.anIntArray213 = new int[this.anInt1715];
		this.anIntArrayArray21 = new int[this.anInt1715][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1715; local28++) {
			this.anIntArray213[local28] = local11.method1546();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1715; local44++) {
			this.anIntArrayArray21[local44] = new int[local11.method1546()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1715; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray21[local61].length; local65++) {
				this.anIntArrayArray21[local61][local65] = local11.method1546();
			}
		}
	}
}
