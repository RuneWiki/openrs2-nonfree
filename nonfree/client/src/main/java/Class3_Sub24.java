import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public final int anInt3105;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public final int anInt3101;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "[Z")
	public final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "[I")
	public final int[] anIntArray159;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
	public final int[] anIntArray158;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3105 = arg0;
		@Pc(11) Class3_Sub25 local11 = new Class3_Sub25(arg1);
		this.anInt3101 = local11.method4096();
		this.aBooleanArray11 = new boolean[this.anInt3101];
		this.anIntArrayArray15 = new int[this.anInt3101][];
		this.anIntArray159 = new int[this.anInt3101];
		this.anIntArray158 = new int[this.anInt3101];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3101; local38++) {
			this.anIntArray158[local38] = local11.method4096();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt3101; local54++) {
			this.aBooleanArray11[local54] = local11.method4096() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt3101; local81++) {
			this.anIntArray159[local81] = local11.method4083();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt3101; local101++) {
			this.anIntArrayArray15[local101] = new int[local11.method4096()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt3101; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray15[local118].length; local122++) {
				this.anIntArrayArray15[local118][local122] = local11.method4096();
			}
		}
	}
}
