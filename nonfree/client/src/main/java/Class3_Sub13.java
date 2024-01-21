import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
	public final int anInt2858;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
	private final int anInt2859;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "[I")
	public final int[] anIntArray338;

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "[[I")
	public final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2858 = arg0;
		@Pc(11) Class3_Sub4 local11 = new Class3_Sub4(arg1);
		this.anInt2859 = local11.method446();
		this.anIntArray338 = new int[this.anInt2859];
		this.anIntArrayArray26 = new int[this.anInt2859][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2859; local28++) {
			this.anIntArray338[local28] = local11.method446();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2859; local44++) {
			this.anIntArrayArray26[local44] = new int[local11.method446()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt2859; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray26[local61].length; local65++) {
				this.anIntArrayArray26[local61][local65] = local11.method446();
			}
		}
	}
}
