import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class8_Sub3_Sub6 extends Class8_Sub3 {

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(26) int local26 = Static33.anIntArray50[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static239.anInt4789; local28++) {
				local11[local28] = this.method581(Static171.anIntArray258[local28], local26) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IBI)I")
	private int method581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(24) int local24 = local14 << 1 ^ local14;
		return 4096 - (Integer.MAX_VALUE & local24 * (local24 * 15731 * local24 + 789221) + 1376312589) / 262144;
	}
}
