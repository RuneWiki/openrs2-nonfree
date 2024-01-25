import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class14_Sub23 extends Class14 {

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public final int anInt4025;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	public final int anInt4026;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "[I")
	public final int[] anIntArray324;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[I")
	public final int[] anIntArray323;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[B)V")
	public Class14_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4025 = arg0;
		@Pc(11) Class14_Sub29 local11 = new Class14_Sub29(arg1);
		this.anInt4026 = local11.method5866();
		this.anIntArray324 = new int[this.anInt4026];
		this.aBooleanArray11 = new boolean[this.anInt4026];
		this.anIntArray323 = new int[this.anInt4026];
		this.anIntArrayArray29 = new int[this.anInt4026][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4026; local38++) {
			this.anIntArray324[local38] = local11.method5866();
			if (this.anIntArray324[local38] == 6) {
				this.anIntArray324[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt4026; local69++) {
			this.aBooleanArray11[local69] = local11.method5866() == 1;
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt4026; local96++) {
			this.anIntArray323[local96] = local11.method5900();
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt4026; local112++) {
			this.anIntArrayArray29[local112] = new int[local11.method5866()];
		}
		for (@Pc(133) int local133 = 0; local133 < this.anInt4026; local133++) {
			for (@Pc(137) int local137 = 0; local137 < this.anIntArrayArray29[local133].length; local137++) {
				this.anIntArrayArray29[local133][local137] = local11.method5866();
			}
		}
	}
}
