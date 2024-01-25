import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class4_Sub6_Sub24 extends Class4_Sub6 {

	@OriginalMember(owner = "client!on", name = "N", descriptor = "I")
	private int anInt4665 = 0;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "I")
	private int anInt4666 = 0;

	@OriginalMember(owner = "client!on", name = "T", descriptor = "I")
	private int anInt4670 = 20;

	@OriginalMember(owner = "client!on", name = "V", descriptor = "I")
	private int anInt4672 = 1365;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			for (@Pc(24) int local24 = 0; local24 < Static31.anInt797; local24++) {
				@Pc(38) int local38 = this.anInt4666 + (Static339.anIntArray4[local24] << 12) / this.anInt4672;
				@Pc(50) int local50 = this.anInt4665 + (Static128.anIntArray265[arg0] << 12) / this.anInt4672;
				@Pc(56) int local56 = local38;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local38 * local38 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72 = 0;
				while (local64 + local70 < 16384 && local72 < this.anInt4670) {
					local58 = (local58 * local56 >> 12) * 2 + local50;
					local56 = local38 + local64 - local70;
					local72++;
					local70 = local58 * local58 >> 12;
					local64 = local56 * local56 >> 12;
				}
				local18[local24] = this.anInt4670 - 1 > local72 ? (local72 << 12) / this.anInt4670 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4672 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt4670 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt4666 = arg1.method3401();
		} else if (arg0 == 3) {
			this.anInt4665 = arg1.method3401();
		}
	}
}
