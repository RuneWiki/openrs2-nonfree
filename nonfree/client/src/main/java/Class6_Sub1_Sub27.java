import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class6_Sub1_Sub27 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(III)I")
	private int method6790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(30) int local30 = Static346.anIntArray472[arg0];
			for (@Pc(32) int local32 = 0; local32 < Static289.anInt5549; local32++) {
				local11[local32] = this.method6790(Static473.anIntArray730[local32], local30) % 4096;
			}
		}
		return local11;
	}
}
