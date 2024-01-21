import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	public final int anInt1987;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
	private final int anInt1988;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "[I")
	public final int[] anIntArray275;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1987 = arg0;
		@Pc(11) Class3_Sub17 local11 = new Class3_Sub17(arg1);
		this.anInt1988 = local11.method2107();
		this.anIntArrayArray26 = new int[this.anInt1988][];
		this.anIntArray275 = new int[this.anInt1988];
		this.aBooleanArray12 = new boolean[this.anInt1988];
		for (@Pc(33) int local33 = 0; local33 < this.anInt1988; local33++) {
			this.anIntArray275[local33] = local11.method2107();
		}
		for (@Pc(53) int local53 = 0; local53 < this.anInt1988; local53++) {
			this.aBooleanArray12[local53] = local11.method2107() == 1;
		}
		for (@Pc(78) int local78 = 0; local78 < this.anInt1988; local78++) {
			this.anIntArrayArray26[local78] = new int[local11.method2107()];
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt1988; local99++) {
			for (@Pc(103) int local103 = 0; local103 < this.anIntArrayArray26[local99].length; local103++) {
				this.anIntArrayArray26[local99][local103] = local11.method2107();
			}
		}
	}
}
