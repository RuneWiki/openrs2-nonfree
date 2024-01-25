import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
	public final int anInt2900;

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
	public final int anInt2899;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "[I")
	public final int[] anIntArray276;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "[I")
	public final int[] anIntArray277;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2900 = arg0;
		@Pc(11) Class1_Sub6 local11 = new Class1_Sub6(arg1);
		this.anInt2899 = local11.method3922();
		this.aBooleanArray16 = new boolean[this.anInt2899];
		this.anIntArray276 = new int[this.anInt2899];
		this.anIntArrayArray34 = new int[this.anInt2899][];
		this.anIntArray277 = new int[this.anInt2899];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2899; local38++) {
			this.anIntArray276[local38] = local11.method3922();
			if (this.anIntArray276[local38] == 6) {
				this.anIntArray276[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt2899; local69++) {
			this.aBooleanArray16[local69] = local11.method3922() == 1;
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt2899; local90++) {
			this.anIntArray277[local90] = local11.method3967();
		}
		for (@Pc(106) int local106 = 0; local106 < this.anInt2899; local106++) {
			this.anIntArrayArray34[local106] = new int[local11.method3922()];
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt2899; local127++) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArrayArray34[local127].length; local131++) {
				this.anIntArrayArray34[local127][local131] = local11.method3922();
			}
		}
	}
}
