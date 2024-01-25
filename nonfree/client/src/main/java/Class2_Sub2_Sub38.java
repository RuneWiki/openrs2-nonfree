import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class2_Sub2_Sub38 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	private int anInt7467 = 1;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
	private int anInt7469 = 204;

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
	private int anInt7470 = 1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			for (@Pc(22) int local22 = 0; local22 < Static398.anInt6955; local22++) {
				@Pc(28) int local28 = Static427.anIntArray587[local22];
				@Pc(32) int local32 = Static168.anIntArray524[arg0];
				@Pc(39) int local39 = this.anInt7467 * local28 >> 12;
				@Pc(46) int local46 = this.anInt7470 * local32 >> 12;
				@Pc(56) int local56 = this.anInt7467 * (local28 % (4096 / this.anInt7467));
				@Pc(66) int local66 = local32 % (4096 / this.anInt7470) * this.anInt7470;
				if (local66 < this.anInt7469) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt7469 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt7469) {
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

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7467 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt7470 = arg0.method6138();
		} else if (arg1 == 2) {
			this.anInt7469 = arg0.method6148();
		}
	}
}
