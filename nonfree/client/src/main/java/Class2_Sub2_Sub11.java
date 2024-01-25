import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	private int anInt2048 = 0;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "I")
	private int anInt2050 = 20;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "I")
	private int anInt2044 = 0;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	private int anInt2053 = 1365;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2053 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt2050 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt2048 = arg0.method3555();
		} else if (arg1 == 3) {
			this.anInt2044 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			for (@Pc(17) int local17 = 0; local17 < Static217.anInt3574; local17++) {
				@Pc(31) int local31 = this.anInt2048 + (Static145.anIntArray199[local17] << 12) / this.anInt2053;
				@Pc(44) int local44 = (Static405.anIntArray555[arg0] << 12) / this.anInt2053 + this.anInt2044;
				@Pc(50) int local50 = local31;
				@Pc(52) int local52 = local44;
				@Pc(58) int local58 = local31 * local31 >> 12;
				@Pc(64) int local64 = local44 * local44 >> 12;
				@Pc(66) int local66 = 0;
				while (local64 + local58 < 16384 && this.anInt2050 > local66) {
					local52 = local44 + (local50 * local52 >> 12) * 2;
					local50 = local31 + local58 - local64;
					local66++;
					local58 = local50 * local50 >> 12;
					local64 = local52 * local52 >> 12;
				}
				local11[local17] = local66 < this.anInt2050 - 1 ? (local66 << 12) / this.anInt2050 : 0;
			}
		}
		return local11;
	}
}
