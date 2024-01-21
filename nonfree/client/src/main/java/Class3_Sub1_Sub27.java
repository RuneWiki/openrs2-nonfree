import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(24) int local24 = Static22.anIntArray152[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static129.anInt3285; local26++) {
				local16[local26] = this.method2591(local24, Static146.anIntArray618[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I")
	private int method2591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(19) int local19 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & (local19 * local19 * 15731 + 789221) * local19 + 1376312589) / 262144;
	}
}
