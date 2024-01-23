import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
	public int anInt5017;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	public int anInt5012;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "[Z")
	public boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "[I")
	public int[] anIntArray585;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5017 = arg0;
		@Pc(11) Class1_Sub18 local11 = new Class1_Sub18(arg1);
		this.anInt5012 = local11.method3122();
		this.aBooleanArray22 = new boolean[this.anInt5012];
		this.anIntArray585 = new int[this.anInt5012];
		this.anIntArray586 = new int[this.anInt5012];
		this.anIntArrayArray40 = new int[this.anInt5012][];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt5012; local38++) {
			this.anIntArray585[local38] = local11.method3122();
		}
		for (local38 = 0; local38 < this.anInt5012; local38++) {
			this.aBooleanArray22[local38] = local11.method3122() == 1;
		}
		for (local38 = 0; local38 < this.anInt5012; local38++) {
			this.anIntArray586[local38] = local11.method3107();
		}
		for (local38 = 0; local38 < this.anInt5012; local38++) {
			this.anIntArrayArray40[local38] = new int[local11.method3122()];
		}
		for (local38 = 0; local38 < this.anInt5012; local38++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray40[local38].length; local122++) {
				this.anIntArrayArray40[local38][local122] = local11.method3122();
			}
		}
	}
}
