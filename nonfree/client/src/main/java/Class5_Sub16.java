import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
	public final int anInt2796;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
	private final int anInt2793;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "[[I")
	public final int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "[I")
	public final int[] anIntArray428;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2796 = arg0;
		@Pc(9) Class5_Sub9 local9 = new Class5_Sub9(arg1);
		this.anInt2793 = local9.method1408();
		this.anIntArrayArray28 = new int[this.anInt2793][];
		this.anIntArray428 = new int[this.anInt2793];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2793; local26++) {
			this.anIntArray428[local26] = local9.method1408();
		}
		for (@Pc(41) int local41 = 0; local41 < this.anInt2793; local41++) {
			this.anIntArrayArray28[local41] = new int[local9.method1408()];
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt2793; local57++) {
			for (@Pc(60) int local60 = 0; local60 < this.anIntArrayArray28[local57].length; local60++) {
				this.anIntArrayArray28[local57][local60] = local9.method1408();
			}
		}
	}
}
