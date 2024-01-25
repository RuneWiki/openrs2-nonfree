import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(19) int local19 = Static285.anIntArray17[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static410.anInt7198; local21++) {
				local11[local21] = this.method949(Static400.anIntArray525[local21], local19) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(IBI)I")
	private int method949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & (local23 * local23 * 15731 + 789221) * local23 + 1376312589) / 262144;
	}
}
