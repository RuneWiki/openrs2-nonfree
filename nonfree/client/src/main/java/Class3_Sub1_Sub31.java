import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
	private int anInt7239 = 0;

	@OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
	private int anInt7238 = 1365;

	@OriginalMember(owner = "client!qp", name = "S", descriptor = "I")
	private int anInt7245 = 0;

	@OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
	private int anInt7243 = 20;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7238 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt7243 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt7239 = arg0.method3109();
		} else if (arg1 == 3) {
			this.anInt7245 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			for (@Pc(23) int local23 = 0; local23 < Static206.anInt4182; local23++) {
				@Pc(37) int local37 = this.anInt7239 + (Static329.anIntArray456[local23] << 12) / this.anInt7238;
				@Pc(49) int local49 = this.anInt7245 + (Static9.anIntArray15[arg0] << 12) / this.anInt7238;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && this.anInt7243 > local71) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local37 + local63 - local69;
					local69 = local57 * local57 >> 12;
					local71++;
					local63 = local55 * local55 >> 12;
				}
				local17[local23] = this.anInt7243 - 1 <= local71 ? 0 : (local71 << 12) / this.anInt7243;
			}
		}
		return local17;
	}
}
