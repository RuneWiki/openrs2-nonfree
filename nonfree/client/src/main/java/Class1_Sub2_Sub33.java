import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(24) int local24 = Static128.anIntArray362[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static105.anInt2391; local26++) {
				local16[local26] = this.method3053(Static63.anIntArray182[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)I")
	private int method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589) / 262144;
	}
}
