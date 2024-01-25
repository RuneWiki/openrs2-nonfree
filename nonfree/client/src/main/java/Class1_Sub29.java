import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
	public final int anInt5144;

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
	public final int anInt5145;

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "[I")
	public final int[] anIntArray365;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "[Z")
	public final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "[I")
	public final int[] anIntArray366;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5144 = arg0;
		@Pc(9) Class1_Sub13 local9 = new Class1_Sub13(arg1);
		this.anInt5145 = local9.method3043();
		this.anIntArrayArray35 = new int[this.anInt5145][];
		this.anIntArray365 = new int[this.anInt5145];
		this.aBooleanArray20 = new boolean[this.anInt5145];
		this.anIntArray366 = new int[this.anInt5145];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5145; local36++) {
			this.anIntArray366[local36] = local9.method3043();
		}
		for (@Pc(55) int local55 = 0; local55 < this.anInt5145; local55++) {
			this.aBooleanArray20[local55] = local9.method3043() == 1;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt5145; local77++) {
			this.anIntArray365[local77] = local9.method3056();
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt5145; local96++) {
			this.anIntArrayArray35[local96] = new int[local9.method3043()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt5145; local112++) {
			for (@Pc(115) int local115 = 0; local115 < this.anIntArrayArray35[local112].length; local115++) {
				this.anIntArrayArray35[local112][local115] = local9.method3043();
			}
		}
	}
}
