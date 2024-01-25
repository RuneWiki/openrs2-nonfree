import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class4_Sub4_Sub29 extends Class4_Sub4 {

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(19) int local19 = Static334.anIntArray437[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static419.anInt6404; local21++) {
				local11[local21] = this.method5118(Static226.anIntArray284[local21], local19) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(III)I")
	private int method5118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 1;
		return 4096 - (Integer.MAX_VALUE & (local16 * 15731 * local16 + 789221) * local16 + 1376312589) / 262144;
	}
}
