import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class5_Sub2_Sub30 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIZ)I")
	private int method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(28) int local28 = Static61.anIntArray80[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static314.anInt6320; local30++) {
				local20[local30] = this.method7357(Static68.anIntArray94[local30], local28) % 4096;
			}
		}
		return local20;
	}
}
