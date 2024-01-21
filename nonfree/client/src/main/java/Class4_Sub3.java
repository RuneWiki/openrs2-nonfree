import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public final int anInt153;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	private final int anInt155;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
	public final int[] anIntArray15;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt153 = arg0;
		@Pc(11) Class4_Sub13 local11 = new Class4_Sub13(arg1);
		this.anInt155 = local11.method1223();
		this.anIntArray15 = new int[this.anInt155];
		this.anIntArrayArray1 = new int[this.anInt155][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt155; local28++) {
			this.anIntArray15[local28] = local11.method1223();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt155; local44++) {
			this.anIntArrayArray1[local44] = new int[local11.method1223()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt155; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray1[local61].length; local65++) {
				this.anIntArrayArray1[local61][local65] = local11.method1223();
			}
		}
	}
}
