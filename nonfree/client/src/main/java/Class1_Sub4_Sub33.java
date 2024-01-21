import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub4_Sub33 extends Class1_Sub4 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int local26 = Static150.anIntArray383[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static73.anInt1888; local28++) {
				local7[local28] = this.method3021(local26, Static171.anIntArray421[local28]) % 4096;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)I")
	private int method3021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local10 ^ local10 << 1;
		return 4096 - (local24 * (local24 * local24 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
