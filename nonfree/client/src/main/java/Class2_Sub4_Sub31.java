import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class2_Sub4_Sub31 extends Class2_Sub4 {

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(BII)I")
	private int method6668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(22) int[] local22 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(30) int local30 = Static13.anIntArray418[arg0];
			for (@Pc(32) int local32 = 0; local32 < Static143.anInt7434; local32++) {
				local22[local32] = this.method6668(local30, Static519.anIntArray155[local32]) % 4096;
			}
		}
		return local22;
	}
}
