import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class8_Sub3_Sub14 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(28) int[][] local28 = this.method4224(arg0, 0);
			@Pc(32) int[] local32 = local28[1];
			@Pc(36) int[] local36 = local28[2];
			@Pc(40) int[] local40 = local28[0];
			for (@Pc(42) int local42 = 0; local42 < Static239.anInt4789; local42++) {
				local18[local42] = (local36[local42] + local40[local42] + local32[local42]) / 3;
			}
		}
		return local18;
	}
}
