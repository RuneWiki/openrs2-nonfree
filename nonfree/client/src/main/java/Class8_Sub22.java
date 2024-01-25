import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class8_Sub22 extends Class8 {

	@OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
	public final int anInt3692;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
	public final int anInt3691;

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "[I")
	public final int[] anIntArray189;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "[I")
	public final int[] anIntArray190;

	@OriginalMember(owner = "client!fda", name = "u", descriptor = "[Z")
	public final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(I[B)V")
	public Class8_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3692 = arg0;
		@Pc(11) Class8_Sub8 local11 = new Class8_Sub8(arg1);
		this.anInt3691 = local11.method8525();
		this.anIntArray189 = new int[this.anInt3691];
		this.anIntArrayArray15 = new int[this.anInt3691][];
		this.anIntArray190 = new int[this.anInt3691];
		this.aBooleanArray7 = new boolean[this.anInt3691];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3691; local38++) {
			this.anIntArray190[local38] = local11.method8525();
			if (this.anIntArray190[local38] == 6) {
				this.anIntArray190[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt3691; local67++) {
			this.aBooleanArray7[local67] = local11.method8525() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt3691; local94++) {
			this.anIntArray189[local94] = local11.method8578();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt3691; local110++) {
			this.anIntArrayArray15[local110] = new int[local11.method8525()];
		}
		for (@Pc(131) int local131 = 0; local131 < this.anInt3691; local131++) {
			for (@Pc(135) int local135 = 0; local135 < this.anIntArrayArray15[local131].length; local135++) {
				this.anIntArrayArray15[local131][local135] = local11.method8525();
			}
		}
	}
}
