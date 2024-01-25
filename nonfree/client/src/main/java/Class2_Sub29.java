import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public final int anInt3907;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public final int anInt3905;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "[I")
	public final int[] anIntArray311;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "[I")
	public final int[] anIntArray312;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray114;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3907 = arg0;
		@Pc(11) Class2_Sub10 local11 = new Class2_Sub10(arg1);
		this.anInt3905 = local11.method4421();
		this.anIntArray311 = new int[this.anInt3905];
		this.anIntArray312 = new int[this.anInt3905];
		this.aBooleanArray19 = new boolean[this.anInt3905];
		this.anIntArrayArray114 = new int[this.anInt3905][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3905; local38++) {
			this.anIntArray312[local38] = local11.method4421();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt3905; local54++) {
			this.aBooleanArray19[local54] = local11.method4421() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt3905; local81++) {
			this.anIntArray311[local81] = local11.method4464();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt3905; local101++) {
			this.anIntArrayArray114[local101] = new int[local11.method4421()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt3905; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray114[local118].length; local122++) {
				this.anIntArrayArray114[local118][local122] = local11.method4421();
			}
		}
	}
}
