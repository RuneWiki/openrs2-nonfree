import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class6_Sub4_Sub6 extends Class6_Sub4 {

	@OriginalMember(owner = "client!er", name = "G", descriptor = "I")
	private int anInt2611 = 1;

	@OriginalMember(owner = "client!er", name = "J", descriptor = "I")
	private int anInt2613 = 204;

	@OriginalMember(owner = "client!er", name = "M", descriptor = "I")
	private int anInt2614 = 1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt2614 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt2611 = arg1.method8604();
		} else if (arg0 == 2) {
			this.anInt2613 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			for (@Pc(22) int local22 = 0; local22 < Static6.anInt111; local22++) {
				@Pc(28) int local28 = Static284.anIntArray482[local22];
				@Pc(32) int local32 = Static629.anIntArray635[arg0];
				@Pc(39) int local39 = this.anInt2614 * local28 >> 12;
				@Pc(46) int local46 = this.anInt2611 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt2614) * this.anInt2614;
				@Pc(66) int local66 = this.anInt2611 * (local32 % (4096 / this.anInt2611));
				if (local66 < this.anInt2613) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt2613) {
						local11[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt2613) {
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
