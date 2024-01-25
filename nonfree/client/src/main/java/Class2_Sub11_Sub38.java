import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public final class Class2_Sub11_Sub38 extends Class2_Sub11 {

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(III)I")
	private int method9498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg0 + arg1 * 57;
		@Pc(25) int local25 = local19 << 1 ^ local19;
		return 4096 - (Integer.MAX_VALUE & (local25 * local25 * 15731 + 789221) * local25 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(19) int local19 = Static137.anIntArray170[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static301.anInt10214; local21++) {
				local11[local21] = this.method9498(Static523.anIntArray461[local21], local19) % 4096;
			}
		}
		return local11;
	}
}
