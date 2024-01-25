import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
	private int anInt3496 = 204;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
	private int anInt3500 = 1;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
	private int anInt3495 = 1;

	static {
		new Class93(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt3500 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt3495 = arg1.method4421();
		} else if (arg0 == 2) {
			this.anInt3496 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			for (@Pc(22) int local22 = 0; local22 < Static339.anInt6735; local22++) {
				@Pc(28) int local28 = Static212.anIntArray325[local22];
				@Pc(32) int local32 = Class208.lb[arg0];
				@Pc(39) int local39 = this.anInt3500 * local28 >> 12;
				@Pc(46) int local46 = this.anInt3495 * local32 >> 12;
				@Pc(56) int local56 = this.anInt3500 * (local28 % (4096 / this.anInt3500));
				@Pc(66) int local66 = local32 % (4096 / this.anInt3495) * this.anInt3495;
				if (this.anInt3496 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt3496 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt3496 > local56) {
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
