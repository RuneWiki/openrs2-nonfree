import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class14_Sub1_Sub12 extends Class14_Sub1 {

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(24) int local24 = Static336.anIntArray458[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static371.anInt6835; local26++) {
				local16[local26] = this.method2631(Static160.anIntArray258[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)I")
	private int method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local23 * (local23 * 15731 * local23 + 789221) + 1376312589) / 262144;
	}
}
