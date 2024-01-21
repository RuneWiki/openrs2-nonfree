import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub3_Sub35 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(19) int local19 = Static21.anIntArray50[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static54.anInt1423; local21++) {
				local11[local21] = this.method2719(local19, Static36.anIntArray74[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(BII)I")
	private int method2719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local9 ^ local9 << 1;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
