import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	public final int anInt2559;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	private final int anInt2564;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "[[I")
	public final int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "[I")
	public final int[] anIntArray266;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2559 = arg0;
		@Pc(11) Class3_Sub12 local11 = new Class3_Sub12(arg1);
		this.anInt2564 = local11.method1936();
		this.anIntArrayArray62 = new int[this.anInt2564][];
		this.anIntArray266 = new int[this.anInt2564];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2564; local28++) {
			this.anIntArray266[local28] = local11.method1936();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2564; local48++) {
			this.anIntArrayArray62[local48] = new int[local11.method1936()];
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt2564; local69++) {
			for (@Pc(73) int local73 = 0; local73 < this.anIntArrayArray62[local69].length; local73++) {
				this.anIntArrayArray62[local69][local73] = local11.method1936();
			}
		}
	}
}
