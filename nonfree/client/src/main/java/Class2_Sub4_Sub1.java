import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)I")
	private int method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - ((local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(19) int local19 = Static2.anIntArray5[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static118.anInt2608; local21++) {
				local11[local21] = this.method217(Static141.anIntArray130[local21], local19) % 4096;
			}
		}
		return local11;
	}
}
