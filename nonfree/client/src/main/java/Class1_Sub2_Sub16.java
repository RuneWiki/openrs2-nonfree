import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!i", name = "H", descriptor = "I")
	private int anInt2561 = 0;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "I")
	private int anInt2564 = 0;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "I")
	private int anInt2566 = 1365;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
	private int anInt2567 = 20;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2566 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt2567 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt2564 = arg1.method3115();
		} else if (arg0 == 3) {
			this.anInt2561 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			for (@Pc(22) int local22 = 0; local22 < Static251.anInt6509; local22++) {
				@Pc(36) int local36 = this.anInt2564 + (Static7.anIntArray23[local22] << 12) / this.anInt2566;
				@Pc(49) int local49 = (Static66.anIntArray158[arg0] << 12) / this.anInt2566 + this.anInt2561;
				@Pc(55) int local55 = local36;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local36 * local36 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && this.anInt2567 > local71) {
					local57 = (local57 * local55 >> 12) * 2 + local49;
					local55 = local36 + local63 - local69;
					local63 = local55 * local55 >> 12;
					local71++;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = this.anInt2567 - 1 > local71 ? (local71 << 12) / this.anInt2567 : 0;
			}
		}
		return local16;
	}
}
