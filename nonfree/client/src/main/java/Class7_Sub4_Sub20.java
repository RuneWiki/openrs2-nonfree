import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class7_Sub4_Sub20 extends Class7_Sub4 {

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)I")
	private int method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 + arg0 * 57;
		@Pc(23) int local23 = local17 ^ local17 << 1;
		return 4096 - ((local23 * local23 * 15731 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(27) int local27 = Static314.anIntArray756[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static201.anInt4174; local29++) {
				local19[local29] = this.method3565(local27, Static129.anIntArray375[local29]) % 4096;
			}
		}
		return local19;
	}
}
