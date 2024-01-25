import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class4_Sub42 extends Class4 {

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public final int anInt7813;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public final int anInt7814;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "[I")
	public final int[] anIntArray628;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "[Z")
	public final boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "[I")
	public final int[] anIntArray629;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt7813 = arg0;
		@Pc(11) Class4_Sub9 local11 = new Class4_Sub9(arg1);
		this.anInt7814 = local11.method6015();
		this.anIntArrayArray68 = new int[this.anInt7814][];
		this.anIntArray628 = new int[this.anInt7814];
		this.aBooleanArray33 = new boolean[this.anInt7814];
		this.anIntArray629 = new int[this.anInt7814];
		for (@Pc(38) int local38 = 0; local38 < this.anInt7814; local38++) {
			this.anIntArray629[local38] = local11.method6015();
			if (this.anIntArray629[local38] == 6) {
				this.anIntArray629[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt7814; local67++) {
			this.aBooleanArray33[local67] = local11.method6015() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt7814; local94++) {
			this.anIntArray628[local94] = local11.method5982();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt7814; local110++) {
			this.anIntArrayArray68[local110] = new int[local11.method6015()];
		}
		for (@Pc(131) int local131 = 0; local131 < this.anInt7814; local131++) {
			for (@Pc(135) int local135 = 0; local135 < this.anIntArrayArray68[local131].length; local135++) {
				this.anIntArrayArray68[local131][local135] = local11.method6015();
			}
		}
	}
}
