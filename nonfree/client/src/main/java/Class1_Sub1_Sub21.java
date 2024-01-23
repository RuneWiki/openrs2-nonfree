import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
	private int method2332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(24) int local24 = Static211.anIntArray334[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static157.anInt3431; local26++) {
				local16[local26] = this.method2332(Static73.anIntArray105[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
