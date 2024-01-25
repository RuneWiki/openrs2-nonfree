import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
	public final int anInt6961;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
	public final int anInt6958;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "[I")
	public final int[] anIntArray482;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "[I")
	public final int[] anIntArray483;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "[Z")
	public final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6961 = arg0;
		@Pc(11) Class4_Sub11 local11 = new Class4_Sub11(arg1);
		this.anInt6958 = local11.method8865();
		this.anIntArray482 = new int[this.anInt6958];
		this.anIntArray483 = new int[this.anInt6958];
		this.aBooleanArray14 = new boolean[this.anInt6958];
		this.anIntArrayArray42 = new int[this.anInt6958][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6958; local38++) {
			this.anIntArray483[local38] = local11.method8865();
			if (this.anIntArray483[local38] == 6) {
				this.anIntArray483[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt6958; local71++) {
			this.aBooleanArray14[local71] = local11.method8865() == 1;
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt6958; local96++) {
			this.anIntArray482[local96] = local11.method8859();
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt6958; local116++) {
			this.anIntArrayArray42[local116] = new int[local11.method8865()];
		}
		for (@Pc(133) int local133 = 0; local133 < this.anInt6958; local133++) {
			for (@Pc(137) int local137 = 0; local137 < this.anIntArrayArray42[local133].length; local137++) {
				this.anIntArrayArray42[local133][local137] = local11.method8865();
			}
		}
	}
}
