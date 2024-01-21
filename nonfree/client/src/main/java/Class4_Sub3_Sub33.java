import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class4_Sub3_Sub33 extends Class4_Sub3 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(27) int local27 = Static148.anIntArray321[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static134.anInt3188; local29++) {
				local19[local29] = this.method2723(local27, Static67.anIntArray170[local29]) % 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)I")
	private int method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
