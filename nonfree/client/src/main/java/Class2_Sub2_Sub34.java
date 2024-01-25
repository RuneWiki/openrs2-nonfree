import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI)I")
	private int method4902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - ((local16 * local16 * 15731 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(26) int local26 = Static405.anIntArray555[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static217.anInt3574; local28++) {
				local18[local28] = this.method4902(local26, Static145.anIntArray199[local28]) % 4096;
			}
		}
		return local18;
	}
}
