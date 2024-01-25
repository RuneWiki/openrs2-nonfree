import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class5_Sub2_Sub22 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(28) int local28 = Static369.anIntArray377[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static195.anInt3759; local30++) {
				local11[local30] = this.method5524(local28, Static554.anIntArray510[local30]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBI)I")
	private int method5524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local15 * (local15 * local15 * 15731 + 789221) + 1376312589) / 262144;
	}
}
