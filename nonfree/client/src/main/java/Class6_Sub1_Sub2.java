import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(III)I")
	private int method190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - ((local20 * 15731 * local20 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(24) int local24 = Static273.anIntArray703[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static299.anInt5659; local26++) {
				local11[local26] = this.method190(local24, Static18.anIntArray32[local26]) % 4096;
			}
		}
		return local11;
	}
}
