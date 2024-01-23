import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public int anInt4903;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "I")
	public int anInt4906;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "[I")
	public int[] anIntArray429;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray45;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4903 = arg0;
		@Pc(11) Class1_Sub11 local11 = new Class1_Sub11(arg1);
		this.anInt4906 = local11.method2690();
		this.anIntArray431 = new int[this.anInt4906];
		this.anIntArray429 = new int[this.anInt4906];
		this.aBooleanArray45 = new boolean[this.anInt4906];
		this.anIntArrayArray32 = new int[this.anInt4906][];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt4906; local38++) {
			this.anIntArray429[local38] = local11.method2690();
		}
		for (local38 = 0; local38 < this.anInt4906; local38++) {
			this.aBooleanArray45[local38] = local11.method2690() == 1;
		}
		for (local38 = 0; local38 < this.anInt4906; local38++) {
			this.anIntArray431[local38] = local11.method2691();
		}
		for (local38 = 0; local38 < this.anInt4906; local38++) {
			this.anIntArrayArray32[local38] = new int[local11.method2690()];
		}
		for (local38 = 0; local38 < this.anInt4906; local38++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray32[local38].length; local122++) {
				this.anIntArrayArray32[local38][local122] = local11.method2690();
			}
		}
	}
}
