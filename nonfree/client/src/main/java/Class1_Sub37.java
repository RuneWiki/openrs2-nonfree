import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public final int anInt5835;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public final int anInt5830;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "[Z")
	public final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "[I")
	public final int[] anIntArray402;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "[I")
	public final int[] anIntArray401;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5835 = arg0;
		@Pc(11) Class1_Sub28 local11 = new Class1_Sub28(arg1);
		this.anInt5830 = local11.method5337();
		this.aBooleanArray20 = new boolean[this.anInt5830];
		this.anIntArray402 = new int[this.anInt5830];
		this.anIntArrayArray51 = new int[this.anInt5830][];
		this.anIntArray401 = new int[this.anInt5830];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5830; local38++) {
			this.anIntArray401[local38] = local11.method5337();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt5830; local58++) {
			this.aBooleanArray20[local58] = local11.method5337() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt5830; local85++) {
			this.anIntArray402[local85] = local11.method5335();
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt5830; local105++) {
			this.anIntArrayArray51[local105] = new int[local11.method5337()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt5830; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray51[local122].length; local126++) {
				this.anIntArrayArray51[local122][local126] = local11.method5337();
			}
		}
	}
}
