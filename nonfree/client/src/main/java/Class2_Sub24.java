import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	public final int anInt4520;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	private final int anInt4524;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "[I")
	public final int[] anIntArray636;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4520 = arg0;
		@Pc(9) Class2_Sub18 local9 = new Class2_Sub18(arg1);
		this.anInt4524 = local9.method2387();
		this.anIntArrayArray38 = new int[this.anInt4524][];
		this.anIntArray636 = new int[this.anInt4524];
		for (@Pc(26) int local26 = 0; local26 < this.anInt4524; local26++) {
			this.anIntArray636[local26] = local9.method2387();
		}
		for (@Pc(41) int local41 = 0; local41 < this.anInt4524; local41++) {
			this.anIntArrayArray38[local41] = new int[local9.method2387()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt4524; local61++) {
			for (@Pc(64) int local64 = 0; local64 < this.anIntArrayArray38[local61].length; local64++) {
				this.anIntArrayArray38[local61][local64] = local9.method2387();
			}
		}
	}
}
