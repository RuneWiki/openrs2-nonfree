import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZII)I")
	private int method1810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & (local16 * local16 * 15731 + 789221) * local16 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(24) int local24 = Static187.anIntArray362[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static115.anInt2578; local26++) {
				local7[local26] = this.method1810(Static45.anIntArray97[local26], local24) % 4096;
			}
		}
		return local7;
	}
}
