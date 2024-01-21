import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	public final int anInt1108;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	private final int anInt1107;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "[I")
	public final int[] anIntArray134;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1108 = arg0;
		@Pc(9) Class2_Sub4 local9 = new Class2_Sub4(arg1);
		this.anInt1107 = local9.method933();
		this.anIntArray134 = new int[this.anInt1107];
		this.anIntArrayArray11 = new int[this.anInt1107][];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1107; local26++) {
			this.anIntArray134[local26] = local9.method933();
		}
		for (@Pc(41) int local41 = 0; local41 < this.anInt1107; local41++) {
			this.anIntArrayArray11[local41] = new int[local9.method933()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1107; local61++) {
			for (@Pc(64) int local64 = 0; local64 < this.anIntArrayArray11[local61].length; local64++) {
				this.anIntArrayArray11[local61][local64] = local9.method933();
			}
		}
	}
}
