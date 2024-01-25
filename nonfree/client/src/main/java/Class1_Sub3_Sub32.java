import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	private int anInt6525 = 0;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "I")
	private int anInt6532 = 1365;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	private int anInt6531 = 0;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "I")
	private int anInt6533 = 20;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			for (@Pc(17) int local17 = 0; local17 < Static347.anInt5974; local17++) {
				@Pc(31) int local31 = this.anInt6525 + (Static384.anIntArray551[local17] << 12) / this.anInt6532;
				@Pc(43) int local43 = this.anInt6531 + (Static342.anIntArray469[arg0] << 12) / this.anInt6532;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65;
				for (local65 = 0; local63 + local57 < 16384 && this.anInt6533 > local65; local65++) {
					local51 = (local49 * local51 >> 12) * 2 + local43;
					local49 = local57 + local31 - local63;
					local57 = local49 * local49 >> 12;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = this.anInt6533 - 1 > local65 ? (local65 << 12) / this.anInt6533 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6532 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt6533 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt6525 = arg0.method4093();
		} else if (arg1 == 3) {
			this.anInt6531 = arg0.method4093();
		}
	}
}
