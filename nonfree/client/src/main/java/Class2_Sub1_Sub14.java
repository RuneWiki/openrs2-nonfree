import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(III)I")
	private int method2043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - (local21 * (local21 * local21 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(25) int local25 = Static234.anIntArray435[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static114.anInt1359; local27++) {
				local17[local27] = this.method2043(local25, Static281.anIntArray506[local27]) % 4096;
			}
		}
		return local17;
	}
}
