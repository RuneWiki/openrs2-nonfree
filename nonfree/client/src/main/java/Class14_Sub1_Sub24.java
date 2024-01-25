import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class14_Sub1_Sub24 extends Class14_Sub1 {

	@OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
	private int anInt6901 = 1;

	@OriginalMember(owner = "client!mr", name = "L", descriptor = "I")
	private int anInt6905 = 1;

	@OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
	private int anInt6904 = 204;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			for (@Pc(25) int local25 = 0; local25 < Static371.anInt6835; local25++) {
				@Pc(31) int local31 = Static160.anIntArray258[local25];
				@Pc(35) int local35 = Static336.anIntArray458[arg0];
				@Pc(42) int local42 = local31 * this.anInt6905 >> 12;
				@Pc(49) int local49 = this.anInt6901 * local35 >> 12;
				@Pc(59) int local59 = this.anInt6905 * (local31 % (4096 / this.anInt6905));
				@Pc(69) int local69 = this.anInt6901 * (local35 % (4096 / this.anInt6901));
				if (this.anInt6904 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (this.anInt6904 > local59) {
						local11[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt6904) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6905 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt6901 = arg0.method5866();
		} else if (arg1 == 2) {
			this.anInt6904 = arg0.method5900();
		}
	}
}
