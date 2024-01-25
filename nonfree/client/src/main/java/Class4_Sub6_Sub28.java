import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class4_Sub6_Sub28 extends Class4_Sub6 {

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
	private int anInt5133 = 1;

	@OriginalMember(owner = "client!q", name = "S", descriptor = "I")
	private int anInt5135 = 204;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "I")
	private int anInt5130 = 1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5130 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt5133 = arg1.method3440();
		} else if (arg0 == 2) {
			this.anInt5135 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			for (@Pc(22) int local22 = 0; local22 < Static31.anInt797; local22++) {
				@Pc(28) int local28 = Static339.anIntArray4[local22];
				@Pc(32) int local32 = Static128.anIntArray265[arg0];
				@Pc(39) int local39 = local28 * this.anInt5130 >> 12;
				@Pc(46) int local46 = this.anInt5133 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt5130) * this.anInt5130;
				@Pc(66) int local66 = this.anInt5133 * (local32 % (4096 / this.anInt5133));
				if (this.anInt5135 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt5135 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt5135 > local56) {
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
