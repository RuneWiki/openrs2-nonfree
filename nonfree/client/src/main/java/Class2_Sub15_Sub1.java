import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub15_Sub1 extends Class2_Sub15 {

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(24) int local24 = Static401.anIntArray357[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static329.anInt6017; local26++) {
				local16[local26] = this.method1293(Static537.anIntArray480[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)I")
	private int method1293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 + arg1 * 57;
		@Pc(24) int local24 = local18 << 1 ^ local18;
		return 4096 - (Integer.MAX_VALUE & local24 * (local24 * local24 * 15731 + 789221) + 1376312589) / 262144;
	}
}
