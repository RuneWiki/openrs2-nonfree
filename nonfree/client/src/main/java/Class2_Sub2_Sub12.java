import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(BII)I")
	private int method1230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(24) int local24 = Static160.anIntArray187[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static106.anInt3045; local26++) {
				local16[local26] = this.method1230(local24, Static15.anIntArray41[local26]) % 4096;
			}
		}
		return local16;
	}
}
