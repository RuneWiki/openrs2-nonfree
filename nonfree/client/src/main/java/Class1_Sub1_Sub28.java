import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
	private int anInt4203 = 1;

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
	private int anInt4202 = 1;

	@OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
	private int anInt4207 = 204;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4203 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt4202 = arg0.method2199();
		} else if (arg1 == 2) {
			this.anInt4207 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			for (@Pc(20) int local20 = 0; local20 < Static62.anInt1350; local20++) {
				@Pc(31) int local31 = Static256.anIntArray474[arg0];
				@Pc(35) int local35 = Static3.anIntArray3[local20];
				@Pc(45) int local45 = this.anInt4202 * (local31 % (4096 / this.anInt4202));
				@Pc(52) int local52 = local35 * this.anInt4203 >> 12;
				@Pc(62) int local62 = local35 % (4096 / this.anInt4203) * this.anInt4203;
				@Pc(69) int local69 = local31 * this.anInt4202 >> 12;
				if (local45 < this.anInt4207) {
					for (local52 -= local69; local52 < 0; local52 += 4) {
					}
					while (local52 > 3) {
						local52 -= 4;
					}
					if (local52 != 1) {
						local13[local20] = 0;
						continue;
					}
					if (local62 < this.anInt4207) {
						local13[local20] = 0;
						continue;
					}
				}
				if (local62 < this.anInt4207) {
					for (local52 -= local69; local52 < 0; local52 += 4) {
					}
					while (local52 > 3) {
						local52 -= 4;
					}
					if (local52 > 0) {
						local13[local20] = 0;
						continue;
					}
				}
				local13[local20] = 4096;
			}
		}
		return local13;
	}
}
