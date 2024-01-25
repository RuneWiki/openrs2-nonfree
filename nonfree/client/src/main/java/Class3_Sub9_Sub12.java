import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class3_Sub9_Sub12 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
	private int anInt3165 = 20;

	@OriginalMember(owner = "client!ffa", name = "C", descriptor = "I")
	private int anInt3164 = 1365;

	@OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
	private int anInt3166 = 0;

	@OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
	private int anInt3170 = 0;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3164 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt3165 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt3170 = arg0.method8593();
		} else if (arg1 == 3) {
			this.anInt3166 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			for (@Pc(23) int local23 = 0; local23 < Static62.anInt1251; local23++) {
				@Pc(37) int local37 = (Static239.anIntArray394[local23] << 12) / this.anInt3164 + this.anInt3170;
				@Pc(49) int local49 = (Static147.anIntArray259[arg0] << 12) / this.anInt3164 + this.anInt3166;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71;
				for (local71 = 0; local69 + local63 < 16384 && this.anInt3165 > local71; local71++) {
					local57 = (local55 * local57 >> 12) * 2 + local49;
					local55 = local37 + local63 - local69;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local11[local23] = this.anInt3165 - 1 <= local71 ? 0 : (local71 << 12) / this.anInt3165;
			}
		}
		return local11;
	}
}
