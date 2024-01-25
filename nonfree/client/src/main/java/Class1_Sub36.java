import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public final int anInt5703;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "I")
	public final int anInt5704;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray131;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "[Z")
	public final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "[I")
	public final int[] anIntArray461;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
	public final int[] anIntArray463;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5703 = arg0;
		@Pc(11) Class1_Sub35 local11 = new Class1_Sub35(arg1);
		this.anInt5704 = local11.method5750();
		this.anIntArrayArray131 = new int[this.anInt5704][];
		this.aBooleanArray12 = new boolean[this.anInt5704];
		this.anIntArray461 = new int[this.anInt5704];
		this.anIntArray463 = new int[this.anInt5704];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5704; local38++) {
			this.anIntArray463[local38] = local11.method5750();
			if (this.anIntArray463[local38] == 6) {
				this.anIntArray463[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt5704; local71++) {
			this.aBooleanArray12[local71] = local11.method5750() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt5704; local94++) {
			this.anIntArray461[local94] = local11.method5771();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt5704; local110++) {
			this.anIntArrayArray131[local110] = new int[local11.method5750()];
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt5704; local127++) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArrayArray131[local127].length; local131++) {
				this.anIntArrayArray131[local127][local131] = local11.method5750();
			}
		}
	}
}
