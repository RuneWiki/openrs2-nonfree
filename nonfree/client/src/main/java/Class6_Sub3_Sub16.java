import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class6_Sub3_Sub16 extends Class6_Sub3 {

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(27) int local27 = Static564.anIntArray703[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static447.anInt8568; local29++) {
				local19[local29] = this.method3318(local27, Static157.anIntArray321[local29]) % 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBI)I")
	private int method3318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - ((local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
