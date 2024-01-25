import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class10_Sub2_Sub31 extends Class10_Sub2 {

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(24) int local24 = Static67.anIntArray106[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static121.anInt2458; local26++) {
				local16[local26] = this.method5262(local24, Static182.anIntArray374[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZII)I")
	private int method5262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local18 << 1 ^ local18;
		return 4096 - (Integer.MAX_VALUE & (local24 * local24 * 15731 + 789221) * local24 + 1376312589) / 262144;
	}
}
