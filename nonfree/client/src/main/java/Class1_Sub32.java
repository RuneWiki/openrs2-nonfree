import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	public int anInt5294;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	public int anInt5295;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	public int[] anIntArray579;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5294 = arg0;
		@Pc(11) Class1_Sub13 local11 = new Class1_Sub13(arg1);
		this.anInt5295 = local11.method1853();
		this.aBooleanArray23 = new boolean[this.anInt5295];
		this.anIntArray579 = new int[this.anInt5295];
		this.anIntArray581 = new int[this.anInt5295];
		this.anIntArrayArray40 = new int[this.anInt5295][];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt5295; local38++) {
			this.anIntArray581[local38] = local11.method1853();
		}
		for (local38 = 0; local38 < this.anInt5295; local38++) {
			this.aBooleanArray23[local38] = local11.method1853() == 1;
		}
		for (local38 = 0; local38 < this.anInt5295; local38++) {
			this.anIntArray579[local38] = local11.method1879();
		}
		for (local38 = 0; local38 < this.anInt5295; local38++) {
			this.anIntArrayArray40[local38] = new int[local11.method1853()];
		}
		for (local38 = 0; local38 < this.anInt5295; local38++) {
			for (@Pc(136) int local136 = 0; local136 < this.anIntArrayArray40[local38].length; local136++) {
				this.anIntArrayArray40[local38][local136] = local11.method1853();
			}
		}
	}
}
