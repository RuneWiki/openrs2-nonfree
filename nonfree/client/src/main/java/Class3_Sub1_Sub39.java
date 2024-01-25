import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class3_Sub1_Sub39 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(19) int local19 = Static9.anIntArray15[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static206.anInt4182; local21++) {
				local11[local21] = this.method7775(local19, Static329.anIntArray456[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(III)I")
	private int method7775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589) / 262144;
	}
}
