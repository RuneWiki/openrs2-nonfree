import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class4_Sub6_Sub15 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(27) int local27 = Static165.anIntArray209[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static80.anInt1616; local29++) {
				local11[local29] = this.method2979(local27, Static341.anIntArray504[local29]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)I")
	private int method2979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589) / 262144;
	}
}
