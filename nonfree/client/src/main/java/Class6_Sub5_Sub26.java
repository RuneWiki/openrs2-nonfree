import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class6_Sub5_Sub26 extends Class6_Sub5 {

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)I")
	private int method4475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(26) int local26 = Static247.anIntArray318[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static240.anInt4386; local28++) {
				local18[local28] = this.method4475(local26, Static80.anIntArray117[local28]) % 4096;
			}
		}
		return local18;
	}
}
