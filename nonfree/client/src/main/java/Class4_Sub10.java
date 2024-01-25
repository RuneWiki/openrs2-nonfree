import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	public final int anInt1945;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	public final int anInt1941;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "[I")
	public final int[] anIntArray198;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
	public final int[] anIntArray199;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1945 = arg0;
		@Pc(11) Class4_Sub7 local11 = new Class4_Sub7(arg1);
		this.anInt1941 = local11.method2380();
		this.anIntArrayArray23 = new int[this.anInt1941][];
		this.anIntArray198 = new int[this.anInt1941];
		this.anIntArray199 = new int[this.anInt1941];
		this.aBooleanArray14 = new boolean[this.anInt1941];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1941; local38++) {
			this.anIntArray198[local38] = local11.method2380();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1941; local58++) {
			this.aBooleanArray14[local58] = local11.method2380() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt1941; local85++) {
			this.anIntArray199[local85] = local11.method2404();
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt1941; local105++) {
			this.anIntArrayArray23[local105] = new int[local11.method2380()];
		}
		for (@Pc(126) int local126 = 0; local126 < this.anInt1941; local126++) {
			for (@Pc(130) int local130 = 0; local130 < this.anIntArrayArray23[local126].length; local130++) {
				this.anIntArrayArray23[local126][local130] = local11.method2380();
			}
		}
	}
}
