import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!tca", name = "s", descriptor = "I")
	public final int anInt9295;

	@OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
	public final int anInt9296;

	@OriginalMember(owner = "client!tca", name = "r", descriptor = "[I")
	public final int[] anIntArray569;

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "[I")
	public final int[] anIntArray570;

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!tca", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray51;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt9295 = arg0;
		@Pc(11) Class6_Sub40 local11 = new Class6_Sub40(arg1);
		this.anInt9296 = local11.method8604();
		this.anIntArray569 = new int[this.anInt9296];
		this.anIntArray570 = new int[this.anInt9296];
		this.anIntArrayArray51 = new int[this.anInt9296][];
		this.aBooleanArray51 = new boolean[this.anInt9296];
		for (@Pc(38) int local38 = 0; local38 < this.anInt9296; local38++) {
			this.anIntArray570[local38] = local11.method8604();
			if (this.anIntArray570[local38] == 6) {
				this.anIntArray570[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt9296; local67++) {
			this.aBooleanArray51[local67] = local11.method8604() == 1;
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt9296; local90++) {
			this.anIntArray569[local90] = local11.method8571();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt9296; local110++) {
			this.anIntArrayArray51[local110] = new int[local11.method8604()];
		}
		for (@Pc(131) int local131 = 0; local131 < this.anInt9296; local131++) {
			for (@Pc(135) int local135 = 0; local135 < this.anIntArrayArray51[local131].length; local135++) {
				this.anIntArrayArray51[local131][local135] = local11.method8604();
			}
		}
	}
}
