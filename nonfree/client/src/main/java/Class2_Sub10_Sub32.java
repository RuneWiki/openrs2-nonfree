import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class2_Sub10_Sub32 extends Class2_Sub10 {

	@OriginalMember(owner = "client!te", name = "C", descriptor = "I")
	private int anInt8981 = 20;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "I")
	private int anInt8983 = 0;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "I")
	private int anInt8982 = 0;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "I")
	private int anInt8986 = 1365;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			for (@Pc(22) int local22 = 0; local22 < Static93.anInt1862; local22++) {
				@Pc(37) int local37 = (Static561.anIntArray649[local22] << 12) / this.anInt8986 + this.anInt8982;
				@Pc(50) int local50 = (Static353.anIntArray424[arg0] << 12) / this.anInt8986 + this.anInt8983;
				@Pc(56) int local56 = local37;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local37 * local37 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72;
				for (local72 = 0; local70 + local64 < 16384 && this.anInt8981 > local72; local72++) {
					local58 = local50 + (local56 * local58 >> 12) * 2;
					local56 = local37 + local64 - local70;
					local70 = local58 * local58 >> 12;
					local64 = local56 * local56 >> 12;
				}
				local11[local22] = local72 >= this.anInt8981 - 1 ? 0 : (local72 << 12) / this.anInt8981;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8986 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt8981 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt8982 = arg0.method6884();
		} else if (arg1 == 3) {
			this.anInt8983 = arg0.method6884();
		}
	}
}
