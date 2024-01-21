import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	public final int anInt613;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	private final int anInt617;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[I")
	public final int[] anIntArray66;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I[B)V")
	public Class8_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt613 = arg0;
		@Pc(11) Class8_Sub20 local11 = new Class8_Sub20(arg1);
		this.anInt617 = local11.method1872();
		this.anIntArrayArray2 = new int[this.anInt617][];
		this.anIntArray66 = new int[this.anInt617];
		for (@Pc(28) int local28 = 0; local28 < this.anInt617; local28++) {
			this.anIntArray66[local28] = local11.method1872();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt617; local48++) {
			this.anIntArrayArray2[local48] = new int[local11.method1872()];
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt617; local69++) {
			for (@Pc(73) int local73 = 0; local73 < this.anIntArrayArray2[local69].length; local73++) {
				this.anIntArrayArray2[local69][local73] = local11.method1872();
			}
		}
	}
}
