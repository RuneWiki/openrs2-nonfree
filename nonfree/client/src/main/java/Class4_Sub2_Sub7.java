import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class4_Sub2_Sub7 extends Class4_Sub2 {

	@OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
	private int anInt2542 = 0;

	@OriginalMember(owner = "client!eaa", name = "R", descriptor = "I")
	private int anInt2546 = 20;

	@OriginalMember(owner = "client!eaa", name = "L", descriptor = "I")
	private int anInt2543 = 1365;

	@OriginalMember(owner = "client!eaa", name = "T", descriptor = "I")
	private int anInt2548 = 0;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2543 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt2546 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt2542 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt2548 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			for (@Pc(17) int local17 = 0; local17 < Static417.anInt5248; local17++) {
				@Pc(31) int local31 = this.anInt2542 + (Static579.anIntArray585[local17] << 12) / this.anInt2543;
				@Pc(44) int local44 = (Static217.anIntArray501[arg0] << 12) / this.anInt2543 + this.anInt2548;
				@Pc(50) int local50 = local31;
				@Pc(52) int local52 = local44;
				@Pc(58) int local58 = local31 * local31 >> 12;
				@Pc(64) int local64 = local44 * local44 >> 12;
				@Pc(66) int local66 = 0;
				while (local58 + local64 < 16384 && this.anInt2546 > local66) {
					local52 = local44 + (local52 * local50 >> 12) * 2;
					local50 = local58 + local31 - local64;
					local66++;
					local58 = local50 * local50 >> 12;
					local64 = local52 * local52 >> 12;
				}
				local11[local17] = this.anInt2546 - 1 > local66 ? (local66 << 12) / this.anInt2546 : 0;
			}
		}
		return local11;
	}
}
