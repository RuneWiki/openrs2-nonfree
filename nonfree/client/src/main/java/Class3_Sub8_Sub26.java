import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class3_Sub8_Sub26 extends Class3_Sub8 {

	@OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
	private int anInt7743 = 204;

	@OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
	private int anInt7744 = 1;

	@OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
	private int anInt7745 = 1;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			for (@Pc(22) int local22 = 0; local22 < Static91.anInt1849; local22++) {
				@Pc(28) int local28 = Static13.anIntArray11[local22];
				@Pc(32) int local32 = Static510.anIntArray172[arg0];
				@Pc(39) int local39 = local28 * this.anInt7744 >> 12;
				@Pc(46) int local46 = this.anInt7745 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt7744) * this.anInt7744;
				@Pc(66) int local66 = local32 % (4096 / this.anInt7745) * this.anInt7745;
				if (this.anInt7743 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt7743) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt7743 > local56) {
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

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt7744 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt7745 = arg1.method7954();
		} else if (arg0 == 2) {
			this.anInt7743 = arg1.method7951();
		}
	}
}
