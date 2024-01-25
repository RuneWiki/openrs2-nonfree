import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
	public final int anInt4506;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
	public final int anInt4507;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "[I")
	public final int[] anIntArray359;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray84;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "[I")
	public final int[] anIntArray360;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4506 = arg0;
		@Pc(11) Class4_Sub20 local11 = new Class4_Sub20(arg1);
		this.anInt4507 = local11.method4614();
		this.anIntArrayArray31 = new int[this.anInt4507][];
		this.anIntArray359 = new int[this.anInt4507];
		this.aBooleanArray84 = new boolean[this.anInt4507];
		this.anIntArray360 = new int[this.anInt4507];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4507; local38++) {
			this.anIntArray359[local38] = local11.method4614();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt4507; local58++) {
			this.aBooleanArray84[local58] = local11.method4614() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt4507; local85++) {
			this.anIntArray360[local85] = local11.method4560();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt4507; local101++) {
			this.anIntArrayArray31[local101] = new int[local11.method4614()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt4507; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray31[local122].length; local126++) {
				this.anIntArrayArray31[local122][local126] = local11.method4614();
			}
		}
	}
}
