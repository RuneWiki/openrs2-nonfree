import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class4_Sub4_Sub23 extends Class4_Sub4 {

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)I")
	private int method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - (local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(24) int local24 = Static450.anIntArray619[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static560.anInt9394; local26++) {
				local16[local26] = this.method4733(Static80.anIntArray212[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
