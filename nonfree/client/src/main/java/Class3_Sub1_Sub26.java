import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class3_Sub1_Sub26 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(24) int local24 = Static351.anIntArray371[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static238.anInt4221; local26++) {
				local16[local26] = this.method3707(Static187.anIntArray379[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)I")
	private int method3707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 << 1 ^ local17;
		return 4096 - (local23 * (local23 * local23 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
