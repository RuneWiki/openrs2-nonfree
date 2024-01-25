import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class6_Sub1_Sub8 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(24) int local24 = Static603.anIntArray549[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static53.anInt1787; local26++) {
				local16[local26] = this.method2691(Static12.anIntArray15[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI)I")
	private int method2691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local9 << 1 ^ local9;
		return 4096 - ((local23 * local23 * 15731 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
