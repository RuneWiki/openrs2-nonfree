import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class4_Sub6_Sub15 extends Class4_Sub6 {

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(25) int local25 = Static273.anIntArray127[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static2.anInt19; local27++) {
				local17[local27] = this.method1728(Static192.anIntArray318[local27], local25) % 4096;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(BII)I")
	private int method1728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & (local16 * 15731 * local16 + 789221) * local16 + 1376312589) / 262144;
	}
}
