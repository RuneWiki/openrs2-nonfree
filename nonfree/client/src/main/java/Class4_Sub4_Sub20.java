import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class4_Sub4_Sub20 extends Class4_Sub4 {

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
	private int anInt4578 = 1;

	@OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
	private int anInt4583 = 1;

	@OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
	private int anInt4584 = 204;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4578 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt4583 = arg1.method5007();
		} else if (arg0 == 2) {
			this.anInt4584 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			for (@Pc(22) int local22 = 0; local22 < Static419.anInt6404; local22++) {
				@Pc(28) int local28 = Static226.anIntArray284[local22];
				@Pc(32) int local32 = Static334.anIntArray437[arg0];
				@Pc(39) int local39 = local28 * this.anInt4578 >> 12;
				@Pc(46) int local46 = this.anInt4583 * local32 >> 12;
				@Pc(56) int local56 = this.anInt4578 * (local28 % (4096 / this.anInt4578));
				@Pc(66) int local66 = local32 % (4096 / this.anInt4583) * this.anInt4583;
				if (this.anInt4584 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt4584 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt4584) {
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
