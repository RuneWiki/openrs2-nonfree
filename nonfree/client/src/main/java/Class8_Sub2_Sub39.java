import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class8_Sub2_Sub39 extends Class8_Sub2 {

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)I")
	private int method8512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local18 ^ local18 << 1;
		return 4096 - (local24 * (local24 * 15731 * local24 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(24) int local24 = Static426.anIntArray424[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static538.anInt9297; local26++) {
				local11[local26] = this.method8512(local24, Static93.anIntArray111[local26]) % 4096;
			}
		}
		return local11;
	}
}
