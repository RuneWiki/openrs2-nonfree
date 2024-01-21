import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class5_Sub1_Sub21 extends Class5_Sub1 {

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	private int anInt2423 = 0;

	@OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
	private int anInt2427 = 0;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
	private int anInt2426 = 20;

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
	private int anInt2424 = 1365;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			for (@Pc(22) int local22 = 0; local22 < Static174.anInt3489; local22++) {
				@Pc(36) int local36 = this.anInt2427 + (Static117.anIntArray274[local22] << 12) / this.anInt2424;
				@Pc(49) int local49 = (Static147.anIntArray321[arg0] << 12) / this.anInt2424 + this.anInt2423;
				@Pc(51) int local51 = local36;
				@Pc(61) int local61 = local36 * local36 >> 12;
				@Pc(63) int local63 = local49;
				@Pc(65) int local65 = 0;
				@Pc(71) int local71 = local49 * local49 >> 12;
				while (local71 + local61 < 16384 && local65 < this.anInt2426) {
					local63 = local49 + (local63 * local51 >> 12) * 2;
					local65++;
					local51 = local36 + local61 - local71;
					local71 = local63 * local63 >> 12;
					local61 = local51 * local51 >> 12;
				}
				local16[local22] = local65 >= this.anInt2426 - 1 ? 0 : (local65 << 12) / this.anInt2426;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2424 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt2426 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt2427 = arg0.method3077();
		} else if (arg1 == 3) {
			this.anInt2423 = arg0.method3077();
		}
	}
}
