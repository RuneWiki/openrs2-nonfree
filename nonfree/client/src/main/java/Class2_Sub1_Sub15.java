import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	private int anInt1403;

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
	private int anInt1404;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
	private int anInt1413;

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1413 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt1403 = arg0.method1397();
		} else if (arg1 == 2) {
			this.anInt1409 = arg0.method1397();
		} else if (arg1 == 3) {
			this.anInt1404 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			for (@Pc(17) int local17 = 0; local17 < Static120.anInt2812; local17++) {
				@Pc(32) int local32 = (Static11.anIntArray8[arg0] << 12) / this.anInt1413 + this.anInt1404;
				@Pc(45) int local45 = (Static69.anIntArray117[local17] << 12) / this.anInt1413 + this.anInt1409;
				@Pc(49) int local49 = local45;
				@Pc(57) int local57 = local45 * local45 >> 12;
				@Pc(63) int local63 = local32 * local32 >> 12;
				@Pc(65) int local65 = 0;
				@Pc(67) int local67 = local32;
				while (local63 + local57 < 16384 && this.anInt1403 > local65) {
					local65++;
					local67 = local32 + (local67 * local49 >> 12) * 2;
					local49 = local57 + local45 - local63;
					local63 = local67 * local67 >> 12;
					local57 = local49 * local49 >> 12;
				}
				local11[local17] = local65 < this.anInt1403 - 1 ? (local65 << 12) / this.anInt1403 : 0;
			}
		}
		return local11;
	}
}
