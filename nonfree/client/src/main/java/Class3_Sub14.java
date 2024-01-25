import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
	public final int anInt1983;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
	public final int anInt1981;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "[Z")
	public final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "[I")
	public final int[] anIntArray122;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "[I")
	public final int[] anIntArray124;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1983 = arg0;
		@Pc(11) Class3_Sub11 local11 = new Class3_Sub11(arg1);
		this.anInt1981 = local11.method3118();
		this.aBooleanArray3 = new boolean[this.anInt1981];
		this.anIntArray122 = new int[this.anInt1981];
		this.anIntArray124 = new int[this.anInt1981];
		this.anIntArrayArray8 = new int[this.anInt1981][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1981; local38++) {
			this.anIntArray122[local38] = local11.method3118();
			if (this.anIntArray122[local38] == 6) {
				this.anIntArray122[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt1981; local67++) {
			this.aBooleanArray3[local67] = local11.method3118() == 1;
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt1981; local90++) {
			this.anIntArray124[local90] = local11.method3109();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt1981; local110++) {
			this.anIntArrayArray8[local110] = new int[local11.method3118()];
		}
		for (@Pc(131) int local131 = 0; local131 < this.anInt1981; local131++) {
			for (@Pc(135) int local135 = 0; local135 < this.anIntArrayArray8[local131].length; local135++) {
				this.anIntArrayArray8[local131][local135] = local11.method3118();
			}
		}
	}
}
