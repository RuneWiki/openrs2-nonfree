import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(26) int local26 = Static86.anIntArray218[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static149.anInt3233; local28++) {
				local13[local28] = this.method2175(local26, Static154.anIntArray354[local28]) % 4096;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)I")
	private int method2175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589) / 262144;
	}
}
