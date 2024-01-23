import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class4_Sub1_Sub30 extends Class4_Sub1 {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)I")
	private int method3987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & local16 * (local16 * 15731 * local16 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(21) int local21 = Static237.anIntArray478[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static73.anInt1626; local23++) {
				local9[local23] = this.method3987(local21, Static138.anIntArray231[local23]) % 4096;
			}
		}
		return local9;
	}
}
