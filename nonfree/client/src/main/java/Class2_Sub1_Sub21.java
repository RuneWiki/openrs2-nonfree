import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
	private int anInt2826 = 0;

	@OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
	private int anInt2825 = 1;

	@OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
	private int anInt2827 = 0;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2826 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt2827 = arg0.method209();
		} else if (arg1 == 3) {
			this.anInt2825 = arg0.method209();
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		Static94.method1641();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(20) int local20 = Static97.anIntArray240[arg0];
			@Pc(26) int local26 = local20 - 2048 >> 1;
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1675; local28++) {
				@Pc(34) int local34 = Static20.anIntArray45[local28];
				@Pc(40) int local40 = local34 - 2048 >> 1;
				@Pc(54) int local54;
				if (this.anInt2826 == 0) {
					local54 = (local34 - local20) * this.anInt2825;
				} else {
					@Pc(66) int local66 = local26 * local26 + local40 * local40 >> 12;
					local54 = (int) (Math.sqrt((double) ((float) local66 / 4096.0F)) * 4096.0D);
					local54 = (int) ((double) (local54 * this.anInt2825) * 3.141592653589793D);
				}
				local54 -= local54 & 0xFFFFF000;
				if (this.anInt2827 == 0) {
					local54 = Static80.anIntArray203[local54 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2827 == 2) {
					local54 -= 2048;
					if (local54 < 0) {
						local54 = -local54;
					}
					local54 = 2048 - local54 << 1;
				}
				local12[local28] = local54;
			}
		}
		return local12;
	}
}
