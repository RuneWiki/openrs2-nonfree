import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ms", name = "K", descriptor = "I")
	private int anInt4659 = 1;

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	private int anInt4658 = 204;

	@OriginalMember(owner = "client!ms", name = "N", descriptor = "I")
	private int anInt4661 = 1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			for (@Pc(22) int local22 = 0; local22 < Static218.anInt3990; local22++) {
				@Pc(28) int local28 = Static434.anIntArray495[local22];
				@Pc(32) int local32 = Static258.anIntArray335[arg0];
				@Pc(39) int local39 = this.anInt4659 * local28 >> 12;
				@Pc(46) int local46 = this.anInt4661 * local32 >> 12;
				@Pc(56) int local56 = this.anInt4659 * (local28 % (4096 / this.anInt4659));
				@Pc(66) int local66 = this.anInt4661 * (local32 % (4096 / this.anInt4661));
				if (local66 < this.anInt4658) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt4658) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt4658 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4659 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt4661 = arg0.method2915();
		} else if (arg1 == 2) {
			this.anInt4658 = arg0.method2896();
		}
	}
}
