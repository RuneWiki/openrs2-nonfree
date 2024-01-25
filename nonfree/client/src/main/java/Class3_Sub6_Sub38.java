import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class3_Sub6_Sub38 extends Class3_Sub6 {

	@OriginalMember(owner = "client!wca", name = "M", descriptor = "I")
	private int anInt10036 = 204;

	@OriginalMember(owner = "client!wca", name = "P", descriptor = "I")
	private int anInt10039 = 1;

	@OriginalMember(owner = "client!wca", name = "S", descriptor = "I")
	private int anInt10042 = 1;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10042 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt10039 = arg0.method6814();
		} else if (arg1 == 2) {
			this.anInt10036 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			for (@Pc(22) int local22 = 0; local22 < Static481.anInt8358; local22++) {
				@Pc(28) int local28 = Static595.anIntArray600[local22];
				@Pc(32) int local32 = Static231.anIntArray217[arg0];
				@Pc(39) int local39 = local28 * this.anInt10042 >> 12;
				@Pc(46) int local46 = local32 * this.anInt10039 >> 12;
				@Pc(56) int local56 = this.anInt10042 * (local28 % (4096 / this.anInt10042));
				@Pc(66) int local66 = this.anInt10039 * (local32 % (4096 / this.anInt10039));
				if (local66 < this.anInt10036) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt10036 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt10036) {
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
}
