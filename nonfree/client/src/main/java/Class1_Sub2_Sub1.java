import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
	private int anInt164 = 1;

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
	private int anInt169 = 204;

	@OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
	private int anInt168 = 1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt168 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt164 = arg0.method895();
		} else if (arg1 == 2) {
			this.anInt169 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			for (@Pc(22) int local22 = 0; local22 < Static105.anInt2391; local22++) {
				@Pc(28) int local28 = Static63.anIntArray182[local22];
				@Pc(35) int local35 = this.anInt168 * local28 >> 12;
				@Pc(45) int local45 = this.anInt168 * (local28 % (4096 / this.anInt168));
				@Pc(49) int local49 = Static128.anIntArray362[arg0];
				@Pc(59) int local59 = this.anInt164 * (local49 % (4096 / this.anInt164));
				@Pc(66) int local66 = this.anInt164 * local49 >> 12;
				if (this.anInt169 > local59) {
					for (local35 -= local66; local35 < 0; local35 += 4) {
					}
					while (local35 > 3) {
						local35 -= 4;
					}
					if (local35 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local45 < this.anInt169) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local45 < this.anInt169) {
					for (local35 -= local66; local35 < 0; local35 += 4) {
					}
					while (local35 > 3) {
						local35 -= 4;
					}
					if (local35 > 0) {
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
