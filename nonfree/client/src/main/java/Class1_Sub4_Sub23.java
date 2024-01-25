import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class1_Sub4_Sub23 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(19) int local19 = Static266.anIntArray628[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static66.anInt1511; local21++) {
				local11[local21] = this.method3828(local19, Static121.anIntArray197[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)I")
	private int method3828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - (local21 * (local21 * 15731 * local21 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
