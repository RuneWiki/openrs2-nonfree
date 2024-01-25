import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class12_Sub1_Sub21 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(III)I")
	private int method5652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(23) int local23 = Static353.anIntArray458[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static357.anInt6670; local25++) {
				local15[local25] = this.method5652(local23, Static347.anIntArray455[local25]) % 4096;
			}
		}
		return local15;
	}
}
