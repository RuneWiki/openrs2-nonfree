import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
	public final int anInt3990;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	public final int anInt3984;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "[Z")
	public final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "[I")
	public final int[] anIntArray382;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
	public final int[] anIntArray383;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3990 = arg0;
		@Pc(11) Class1_Sub21 local11 = new Class1_Sub21(arg1);
		this.anInt3984 = local11.method5720();
		this.aBooleanArray19 = new boolean[this.anInt3984];
		this.anIntArrayArray35 = new int[this.anInt3984][];
		this.anIntArray382 = new int[this.anInt3984];
		this.anIntArray383 = new int[this.anInt3984];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3984; local38++) {
			this.anIntArray382[local38] = local11.method5720();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt3984; local54++) {
			this.aBooleanArray19[local54] = local11.method5720() == 1;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt3984; local77++) {
			this.anIntArray383[local77] = local11.method5715();
		}
		for (@Pc(93) int local93 = 0; local93 < this.anInt3984; local93++) {
			this.anIntArrayArray35[local93] = new int[local11.method5720()];
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt3984; local110++) {
			for (@Pc(114) int local114 = 0; local114 < this.anIntArrayArray35[local110].length; local114++) {
				this.anIntArrayArray35[local110][local114] = local11.method5720();
			}
		}
	}
}
