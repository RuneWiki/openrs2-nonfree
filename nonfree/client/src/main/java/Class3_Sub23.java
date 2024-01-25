import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!go", name = "t", descriptor = "I")
	public final int anInt3478;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	public final int anInt3475;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!go", name = "v", descriptor = "[I")
	public final int[] anIntArray181;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "[I")
	public final int[] anIntArray179;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "[Z")
	public final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3478 = arg0;
		@Pc(11) Class3_Sub11 local11 = new Class3_Sub11(arg1);
		this.anInt3475 = local11.method5175();
		this.anIntArrayArray76 = new int[this.anInt3475][];
		this.anIntArray181 = new int[this.anInt3475];
		this.anIntArray179 = new int[this.anInt3475];
		this.aBooleanArray12 = new boolean[this.anInt3475];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3475; local38++) {
			this.anIntArray179[local38] = local11.method5175();
			if (this.anIntArray179[local38] == 6) {
				this.anIntArray179[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt3475; local69++) {
			this.aBooleanArray12[local69] = local11.method5175() == 1;
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt3475; local90++) {
			this.anIntArray181[local90] = local11.method5198();
		}
		for (@Pc(106) int local106 = 0; local106 < this.anInt3475; local106++) {
			this.anIntArrayArray76[local106] = new int[local11.method5175()];
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt3475; local127++) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArrayArray76[local127].length; local131++) {
				this.anIntArrayArray76[local127][local131] = local11.method5175();
			}
		}
	}
}
