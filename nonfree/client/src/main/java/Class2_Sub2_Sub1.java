import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(24) int local24 = Static168.anIntArray524[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static398.anInt6955; local26++) {
				local11[local26] = this.method226(local24, Static427.anIntArray587[local26]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(III)I")
	private int method226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589) / 262144;
	}
}
