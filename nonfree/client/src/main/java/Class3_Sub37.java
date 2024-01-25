import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!no", name = "r", descriptor = "I")
	public final int anInt6465;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public final int anInt6466;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "[Z")
	public final boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!no", name = "t", descriptor = "[I")
	public final int[] anIntArray359;

	@OriginalMember(owner = "client!no", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "[I")
	public final int[] anIntArray360;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6465 = arg0;
		@Pc(11) Class3_Sub26 local11 = new Class3_Sub26(arg1);
		this.anInt6466 = local11.method6814();
		this.aBooleanArray18 = new boolean[this.anInt6466];
		this.anIntArray359 = new int[this.anInt6466];
		this.anIntArrayArray70 = new int[this.anInt6466][];
		this.anIntArray360 = new int[this.anInt6466];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6466; local38++) {
			this.anIntArray359[local38] = local11.method6814();
			if (this.anIntArray359[local38] == 6) {
				this.anIntArray359[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt6466; local67++) {
			this.aBooleanArray18[local67] = local11.method6814() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt6466; local94++) {
			this.anIntArray360[local94] = local11.method6811();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt6466; local110++) {
			this.anIntArrayArray70[local110] = new int[local11.method6814()];
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt6466; local127++) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArrayArray70[local127].length; local131++) {
				this.anIntArrayArray70[local127][local131] = local11.method6814();
			}
		}
	}
}
