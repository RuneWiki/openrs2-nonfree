import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class4_Sub2_Sub38 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(24) int local24 = Static293.anIntArray461[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static350.anInt6330; local26++) {
				local16[local26] = this.method5718(Static197.anIntArray566[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)I")
	private int method5718(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - (Integer.MAX_VALUE & (local21 * 15731 * local21 + 789221) * local21 + 1376312589) / 262144;
	}
}
