import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class6_Sub3_Sub24 extends Class6_Sub3 {

	@OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
	private int anInt6048 = 1;

	@OriginalMember(owner = "client!mca", name = "M", descriptor = "I")
	private int anInt6053 = 1;

	@OriginalMember(owner = "client!mca", name = "N", descriptor = "I")
	private int anInt6054 = 204;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6053 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt6048 = arg1.method6019();
		} else if (arg0 == 2) {
			this.anInt6054 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			for (@Pc(22) int local22 = 0; local22 < Static35.anInt670; local22++) {
				@Pc(28) int local28 = Static372.anIntArray481[local22];
				@Pc(32) int local32 = Static77.anIntArray116[arg0];
				@Pc(39) int local39 = local28 * this.anInt6053 >> 12;
				@Pc(46) int local46 = this.anInt6048 * local32 >> 12;
				@Pc(56) int local56 = this.anInt6053 * (local28 % (4096 / this.anInt6053));
				@Pc(66) int local66 = local32 % (4096 / this.anInt6048) * this.anInt6048;
				if (local66 < this.anInt6054) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt6054) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt6054) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}
}
