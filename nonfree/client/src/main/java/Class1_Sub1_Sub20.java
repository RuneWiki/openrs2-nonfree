import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(23) int local23 = Static193.anIntArray277[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static107.anInt2321; local25++) {
				local15[local25] = this.method1551(local23, Static204.anIntArray179[local25]) % 4096;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)I")
	private int method1551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - ((local16 * local16 * 15731 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
