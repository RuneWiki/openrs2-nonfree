import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class8_Sub11 extends Class8 {

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
	public int anInt1867;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[B)V")
	public Class8_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1867 = arg0;
		@Pc(11) Class8_Sub2 local11 = new Class8_Sub2(arg1);
		this.anInt1866 = local11.method2334();
		this.anIntArray127 = new int[this.anInt1866];
		this.aBooleanArray5 = new boolean[this.anInt1866];
		this.anIntArray126 = new int[this.anInt1866];
		this.anIntArrayArray9 = new int[this.anInt1866][];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt1866; local38++) {
			this.anIntArray127[local38] = local11.method2334();
		}
		for (local38 = 0; local38 < this.anInt1866; local38++) {
			this.aBooleanArray5[local38] = local11.method2334() == 1;
		}
		for (local38 = 0; local38 < this.anInt1866; local38++) {
			this.anIntArray126[local38] = local11.method2375();
		}
		for (local38 = 0; local38 < this.anInt1866; local38++) {
			this.anIntArrayArray9[local38] = new int[local11.method2334()];
		}
		for (local38 = 0; local38 < this.anInt1866; local38++) {
			for (@Pc(128) int local128 = 0; local128 < this.anIntArrayArray9[local38].length; local128++) {
				this.anIntArrayArray9[local38][local128] = local11.method2334();
			}
		}
	}
}
