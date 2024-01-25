import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class5_Sub2_Sub29 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	private int anInt8420 = 0;

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
	private int anInt8422 = 20;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
	private int anInt8419 = 1365;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
	private int anInt8425 = 0;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			for (@Pc(22) int local22 = 0; local22 < Static314.anInt6320; local22++) {
				@Pc(36) int local36 = (Static68.anIntArray94[local22] << 12) / this.anInt8419 + this.anInt8420;
				@Pc(49) int local49 = (Static61.anIntArray80[arg0] << 12) / this.anInt8419 + this.anInt8425;
				@Pc(55) int local55 = local36;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local36 * local36 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && local71 < this.anInt8422) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local36 + local63 - local69;
					local71++;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = this.anInt8422 - 1 <= local71 ? 0 : (local71 << 12) / this.anInt8422;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8419 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt8422 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt8420 = arg0.method8631();
		} else if (arg1 == 3) {
			this.anInt8425 = arg0.method8631();
		}
	}
}
