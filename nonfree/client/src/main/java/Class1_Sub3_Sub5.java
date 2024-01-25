import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
	private int anInt841 = 204;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
	private int anInt838 = 1;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
	private int anInt843 = 1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt843 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt838 = arg0.method4130();
		} else if (arg1 == 2) {
			this.anInt841 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			for (@Pc(17) int local17 = 0; local17 < Static347.anInt5974; local17++) {
				@Pc(23) int local23 = Static384.anIntArray551[local17];
				@Pc(27) int local27 = Static342.anIntArray469[arg0];
				@Pc(34) int local34 = this.anInt843 * local23 >> 12;
				@Pc(41) int local41 = local27 * this.anInt838 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt843) * this.anInt843;
				@Pc(61) int local61 = this.anInt838 * (local27 % (4096 / this.anInt838));
				if (this.anInt841 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt841 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt841) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
