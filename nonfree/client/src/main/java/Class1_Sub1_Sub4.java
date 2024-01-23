import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)I")
	private int method721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * 57 + arg1;
		@Pc(16) int local16 = local10 ^ local10 << 1;
		return 4096 - (Integer.MAX_VALUE & (local16 * 15731 * local16 + 789221) * local16 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(15) int local15 = Static98.anIntArray221[arg0];
			for (@Pc(17) int local17 = 0; local17 < Static75.anInt1848; local17++) {
				local7[local17] = this.method721(local15, Static157.anIntArray331[local17]) % 4096;
			}
		}
		return local7;
	}
}
