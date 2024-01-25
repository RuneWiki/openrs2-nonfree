import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	public final int anInt5961;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	public final int anInt5963;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "[I")
	public final int[] anIntArray404;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "[I")
	public final int[] anIntArray405;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5961 = arg0;
		@Pc(11) Class1_Sub20 local11 = new Class1_Sub20(arg1);
		this.anInt5963 = local11.method4393();
		this.aBooleanArray17 = new boolean[this.anInt5963];
		this.anIntArray404 = new int[this.anInt5963];
		this.anIntArray405 = new int[this.anInt5963];
		this.anIntArrayArray40 = new int[this.anInt5963][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5963; local38++) {
			this.anIntArray404[local38] = local11.method4393();
			if (this.anIntArray404[local38] == 6) {
				this.anIntArray404[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt5963; local71++) {
			this.aBooleanArray17[local71] = local11.method4393() == 1;
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt5963; local96++) {
			this.anIntArray405[local96] = local11.method4426();
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt5963; local112++) {
			this.anIntArrayArray40[local112] = new int[local11.method4393()];
		}
		for (@Pc(129) int local129 = 0; local129 < this.anInt5963; local129++) {
			for (@Pc(133) int local133 = 0; local133 < this.anIntArrayArray40[local129].length; local133++) {
				this.anIntArrayArray40[local129][local133] = local11.method4393();
			}
		}
	}
}
