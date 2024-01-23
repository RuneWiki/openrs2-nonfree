import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)I")
	private int method3486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 * 57 + arg1;
		@Pc(11) int local11 = local5 << 1 ^ local5;
		return 4096 - (Integer.MAX_VALUE & local11 * (local11 * 15731 * local11 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(24) int local24 = Static157.anIntArray604[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static54.anInt953; local26++) {
				local16[local26] = this.method3486(local24, Static179.anIntArray682[local26]) % 4096;
			}
		}
		return local16;
	}
}
