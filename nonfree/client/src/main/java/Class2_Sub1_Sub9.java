import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
	private int anInt2135 = 1;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
	private int anInt2130 = 204;

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
	private int anInt2133 = 1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2581; local22++) {
				@Pc(28) int local28 = Static252.anIntArray323[local22];
				@Pc(32) int local32 = Static373.anIntArray55[arg0];
				@Pc(39) int local39 = this.anInt2135 * local28 >> 12;
				@Pc(46) int local46 = local32 * this.anInt2133 >> 12;
				@Pc(56) int local56 = this.anInt2135 * (local28 % (4096 / this.anInt2135));
				@Pc(66) int local66 = this.anInt2133 * (local32 % (4096 / this.anInt2133));
				if (local66 < this.anInt2130) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt2130) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt2130 > local56) {
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

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2135 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt2133 = arg1.method3737();
		} else if (arg0 == 2) {
			this.anInt2130 = arg1.method3711();
		}
	}
}
