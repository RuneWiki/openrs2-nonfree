import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "[I")
	public static int[] anIntArray265 = new int[99];

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
	public final int anInt1915;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	private final int anInt1916;

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "[I")
	public final int[] anIntArray266;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	static {
		@Pc(278) int local278 = 0;
		for (@Pc(280) int local280 = 0; local280 < 99; local280++) {
			@Pc(285) int local285 = local280 + 1;
			@Pc(298) int local298 = (int) ((double) local285 + Math.pow(2.0D, (double) local285 / 7.0D) * 300.0D);
			local278 += local298;
			anIntArray265[local280] = local278 / 4;
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1915 = arg0;
		@Pc(11) Class1_Sub18 local11 = new Class1_Sub18(arg1);
		this.anInt1916 = local11.method2169();
		this.anIntArray266 = new int[this.anInt1916];
		this.anIntArrayArray15 = new int[this.anInt1916][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1916; local28++) {
			this.anIntArray266[local28] = local11.method2169();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt1916; local48++) {
			this.anIntArrayArray15[local48] = new int[local11.method2169()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt1916; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray15[local65].length; local69++) {
				this.anIntArrayArray15[local65][local69] = local11.method2169();
			}
		}
	}
}
