import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(24) int local24 = Static258.anIntArray335[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static218.anInt3990; local26++) {
				local11[local26] = this.method5480(local24, Static434.anIntArray495[local26]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(III)I")
	private int method5480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & (local15 * 15731 * local15 + 789221) * local15 + 1376312589) / 262144;
	}
}
