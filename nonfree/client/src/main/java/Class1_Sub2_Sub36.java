import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(24) int local24 = Static66.anIntArray158[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static251.anInt6509; local26++) {
				local16[local26] = this.method5281(local24, Static7.anIntArray23[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIB)I")
	private int method5281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
