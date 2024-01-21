import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class5_Sub24 extends Class5 {

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	public final int anInt3390;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	private final int anInt3396;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "[I")
	public final int[] anIntArray447;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3390 = arg0;
		@Pc(11) Class5_Sub14 local11 = new Class5_Sub14(arg1);
		this.anInt3396 = local11.method1471();
		this.anIntArrayArray30 = new int[this.anInt3396][];
		this.anIntArray447 = new int[this.anInt3396];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3396; local28++) {
			this.anIntArray447[local28] = local11.method1471();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt3396; local48++) {
			this.anIntArrayArray30[local48] = new int[local11.method1471()];
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt3396; local69++) {
			for (@Pc(73) int local73 = 0; local73 < this.anIntArrayArray30[local69].length; local73++) {
				this.anIntArrayArray30[local69][local73] = local11.method1471();
			}
		}
	}
}
