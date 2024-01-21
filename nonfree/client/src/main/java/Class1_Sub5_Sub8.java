import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class1_Sub5_Sub8 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BII)I")
	private int method846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * 57 + arg0;
		@Pc(24) int local24 = local18 ^ local18 << 1;
		return 4096 - ((local24 * 15731 * local24 + 789221) * local24 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(24) int local24 = Static34.anIntArray75[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static177.anInt4018; local26++) {
				local16[local26] = this.method846(Static116.anIntArray275[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
