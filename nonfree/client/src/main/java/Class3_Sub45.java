import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	public final int anInt8245;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public final int anInt8243;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "[Z")
	public final boolean[] aBooleanArray41;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
	public final int[] anIntArray709;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "[I")
	public final int[] anIntArray708;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt8245 = arg0;
		@Pc(11) Class3_Sub27 local11 = new Class3_Sub27(arg1);
		this.anInt8243 = local11.method7548();
		this.aBooleanArray41 = new boolean[this.anInt8243];
		this.anIntArray709 = new int[this.anInt8243];
		this.anIntArrayArray79 = new int[this.anInt8243][];
		this.anIntArray708 = new int[this.anInt8243];
		for (@Pc(38) int local38 = 0; local38 < this.anInt8243; local38++) {
			this.anIntArray708[local38] = local11.method7548();
			if (this.anIntArray708[local38] == 6) {
				this.anIntArray708[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt8243; local67++) {
			this.aBooleanArray41[local67] = local11.method7548() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt8243; local94++) {
			this.anIntArray709[local94] = local11.method7591();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt8243; local110++) {
			this.anIntArrayArray79[local110] = new int[local11.method7548()];
		}
		for (@Pc(131) int local131 = 0; local131 < this.anInt8243; local131++) {
			for (@Pc(135) int local135 = 0; local135 < this.anIntArrayArray79[local131].length; local135++) {
				this.anIntArrayArray79[local131][local135] = local11.method7548();
			}
		}
	}
}
