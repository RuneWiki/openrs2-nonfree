import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
	public final int anInt1796;

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
	private final int anInt1790;

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "[[I")
	public final int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "[I")
	public final int[] anIntArray298;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1796 = arg0;
		@Pc(11) Class1_Sub20 local11 = new Class1_Sub20(arg1);
		this.anInt1790 = local11.method2053();
		this.anIntArrayArray57 = new int[this.anInt1790][];
		this.anIntArray298 = new int[this.anInt1790];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1790; local28++) {
			this.anIntArray298[local28] = local11.method2053();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1790; local44++) {
			this.anIntArrayArray57[local44] = new int[local11.method2053()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1790; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray57[local61].length; local65++) {
				this.anIntArrayArray57[local61][local65] = local11.method2053();
			}
		}
	}
}
