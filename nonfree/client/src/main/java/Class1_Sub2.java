import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	public final int anInt80;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
	public final int anInt84;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "[Z")
	public final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
	public final int[] anIntArray7;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "[I")
	public final int[] anIntArray8;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt80 = arg0;
		@Pc(9) Class1_Sub3 local9 = new Class1_Sub3(arg1);
		this.anInt84 = local9.method1171();
		this.aBooleanArray1 = new boolean[this.anInt84];
		this.anIntArray7 = new int[this.anInt84];
		this.anIntArray8 = new int[this.anInt84];
		this.anIntArrayArray2 = new int[this.anInt84][];
		for (@Pc(36) int local36 = 0; local36 < this.anInt84; local36++) {
			this.anIntArray7[local36] = local9.method1171();
		}
		for (@Pc(51) int local51 = 0; local51 < this.anInt84; local51++) {
			this.aBooleanArray1[local51] = local9.method1171() == 1;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt84; local77++) {
			this.anIntArray8[local77] = local9.method1177();
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt84; local92++) {
			this.anIntArrayArray2[local92] = new int[local9.method1171()];
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt84; local108++) {
			for (@Pc(111) int local111 = 0; local111 < this.anIntArrayArray2[local108].length; local111++) {
				this.anIntArrayArray2[local108][local111] = local9.method1171();
			}
		}
	}
}
