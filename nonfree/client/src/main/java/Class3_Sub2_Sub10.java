import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(III)I")
	private int method1159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 << 1 ^ local17;
		return 4096 - (Integer.MAX_VALUE & (local23 * local23 * 15731 + 789221) * local23 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(20) int local20 = Static205.anIntArray450[arg0];
			for (@Pc(22) int local22 = 0; local22 < Static22.anInt421; local22++) {
				local11[local22] = this.method1159(local20, Static185.anIntArray424[local22]) % 4096;
			}
		}
		return local11;
	}
}
