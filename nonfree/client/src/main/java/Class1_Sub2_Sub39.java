import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
	private int anInt5835 = 1365;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "I")
	private int anInt5833 = 0;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "I")
	private int anInt5832 = 0;

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
	private int anInt5840 = 20;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5835 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt5840 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt5833 = arg0.method2593();
		} else if (arg1 == 3) {
			this.anInt5832 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			for (@Pc(22) int local22 = 0; local22 < Static299.anInt5670; local22++) {
				@Pc(37) int local37 = this.anInt5833 + (Static310.anIntArray108[local22] << 12) / this.anInt5835;
				@Pc(50) int local50 = (Static7.anIntArray13[arg0] << 12) / this.anInt5835 + this.anInt5832;
				@Pc(56) int local56 = local37;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local37 * local37 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72 = 0;
				while (local64 + local70 < 16384 && local72 < this.anInt5840) {
					local72++;
					local58 = (local56 * local58 >> 12) * 2 + local50;
					local56 = local64 + local37 - local70;
					local70 = local58 * local58 >> 12;
					local64 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt5840 - 1 <= local72 ? 0 : (local72 << 12) / this.anInt5840;
			}
		}
		return local16;
	}
}
