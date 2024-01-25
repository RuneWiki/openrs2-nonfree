import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub10_Sub39 extends Class2_Sub10 {

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	private int anInt10052 = 204;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	private int anInt10054 = 1;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	private int anInt10051 = 1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			for (@Pc(22) int local22 = 0; local22 < Static93.anInt1862; local22++) {
				@Pc(28) int local28 = Static561.anIntArray649[local22];
				@Pc(32) int local32 = Static353.anIntArray424[arg0];
				@Pc(39) int local39 = this.anInt10051 * local28 >> 12;
				@Pc(46) int local46 = this.anInt10054 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt10051) * this.anInt10051;
				@Pc(66) int local66 = local32 % (4096 / this.anInt10054) * this.anInt10054;
				if (this.anInt10052 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt10052 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt10052) {
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

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10051 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt10054 = arg0.method6904();
		} else if (arg1 == 2) {
			this.anInt10052 = arg0.method6884();
		}
	}
}
